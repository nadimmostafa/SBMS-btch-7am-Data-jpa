package org.nadim.runner;

import java.util.List;

import org.nadim.entity.Employee;
import org.nadim.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class PaginationRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		// Method-01 using PageRequest
		int pageNumber = 5;
		int pageSize = 3;
		/*
		PageRequest page = PageRequest.of(pageNumber-1,pageSize);
		Page<Employee> pages = repo.findAll(page);
		List<Employee> content = pages.getContent();
		content.forEach(System.out::println);
		
		//Method-02 using Pageable interface
		Pageable p = PageRequest.of(pageNumber-1, pageSize);
		repo.findAll(p).forEach(System.out::println);
		
		// Method-03 Pagination with Sorting
		Sort s = Sort.by("empId").descending();
		repo.findAll(s).forEach(System.out::println);
		*/
		PageRequest pr = PageRequest.of(pageNumber-1, pageSize);
		Page<Employee> findAll = repo.findAll(pr);
		List<Employee> content2 = findAll.getContent();
		content2.forEach(System.out::println);
		
		// Meta data
		System.out.println(findAll.isEmpty());
		System.out.println(findAll.isLast());
		System.out.println(findAll.isFirst());
		System.out.println(findAll.hasNext());
		System.out.println(findAll.hasPrevious());
		System.out.println(findAll.getTotalElements());
		System.out.println(findAll.getTotalPages());
		System.out.println(findAll.getSize());
		System.out.println(findAll.hasContent());
		System.out.println(findAll.getNumberOfElements());
		
	}

}

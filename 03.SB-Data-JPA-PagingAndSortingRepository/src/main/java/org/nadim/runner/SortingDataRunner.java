package org.nadim.runner;

import org.nadim.entity.Employee;
import org.nadim.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Order(11)
//@Component
public class SortingDataRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		/*
		Sort d = Sort.by("empId").descending();
		Iterable<Employee> sort = repo.findAll(d);
		sort.forEach(System.out::println);
		*/
		
		// Sorting Data
		
		//case-01 default sorting order ascending
		Iterable<Employee> findAll = repo.findAll(Sort.by("empId"));
		findAll.forEach(System.out::println);
		
		//case-02 fetch data in Descending Order
		Sort s = Sort.by(Direction.DESC,"empId");
		repo.findAll(s).forEach(System.out::println);
		
		//case-3 fetch data in Descending order based on multiple column
		
		repo.findAll(Sort.by(
					Direction.DESC,"empId","empSalary"
				)).forEach(System.out::println);
		
		//case-04 fetch data in mixed order based on multiple column
		
		repo.findAll(Sort.by(
				org.springframework.data.domain.Sort.Order.asc("empDept"),
				org.springframework.data.domain.Sort.Order.desc("empSalary")
				)).forEach(System.out::println);
	}

}

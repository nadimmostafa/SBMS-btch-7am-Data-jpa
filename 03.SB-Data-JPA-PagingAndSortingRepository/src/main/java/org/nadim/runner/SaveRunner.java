package org.nadim.runner;

import java.util.Arrays;

import org.nadim.entity.Employee;
import org.nadim.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class SaveRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList(
				new Employee(101,"Jonh",54000.00,"QA"),
				new Employee(102,"Smith",65000.00,"DevOps"),
				new Employee(103,"Mostafa",125500.00,"Dev"),
				new Employee(104,"Nadim",55000.00,"Web Dev"),
				new Employee(105,"Ketty",62000.00,"QA"),
				new Employee(106,"Zamppa",75000.00,"DevOps"),
				new Employee(107,"Asif",45000.00,"Web Dev"),
				new Employee(108,"Sadia",65000.00,"BA"),
				new Employee(109,"Raihan",33000.00,"Dev"),
				new Employee(110,"Sajib",45000.00,"Dev"),
				new Employee(111,"Shekhar",54000.00,"Web Dev")
				));
	}

}

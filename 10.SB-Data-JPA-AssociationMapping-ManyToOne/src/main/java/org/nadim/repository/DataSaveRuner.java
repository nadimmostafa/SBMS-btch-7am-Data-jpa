package org.nadim.repository;

import java.util.List;

import org.nadim.entity.Department;
import org.nadim.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSaveRuner implements CommandLineRunner{

	@Autowired
	private DepartmentRepoI dRepo;
	
	@Autowired
	private EmployeeRepoI eRepo;
	@Override
	public void run(String... args) throws Exception {
		
		Department d = new Department(101,"Development","Nadim");
		Department d2 = new Department(102,"QA","Rabbai");
		Department d3 = new Department(103,"DevOps","Mostafa");
		
		dRepo.saveAll(List.of(d,d2,d3));

		// insert employee data
		eRepo.saveAll(List.of(
				new Employee(1001,"Mustak","Male",d),
				new Employee(1002,"Ahmed","Male",d3),
				new Employee(1003,"Sadia","Female",d),
				new Employee(1004,"Asif","Male",d2),
				new Employee(1005,"Smith","Male",d),
				new Employee(1006,"Jakia","Female",d3)
				));
	}

}

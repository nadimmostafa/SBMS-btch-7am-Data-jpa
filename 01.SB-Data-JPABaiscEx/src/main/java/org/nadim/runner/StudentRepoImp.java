package org.nadim.runner;

import org.nadim.entity.Student;
import org.nadim.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRepoImp implements CommandLineRunner {
	
	@Autowired
	private StudentRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student std = new Student();
		std.setId(01);
		std.setName("Nadim");
		std.setGender("Male");
		repo.save(std);

	}

}

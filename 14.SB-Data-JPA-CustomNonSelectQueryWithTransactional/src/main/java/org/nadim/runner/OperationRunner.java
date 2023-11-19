package org.nadim.runner;

import java.util.List;

import org.nadim.entity.Teacher;
import org.nadim.repository.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OperationRunner implements CommandLineRunner {

	@Autowired
	private ITeacherRepo tRepo;
	@Override
	public void run(String... args) throws Exception {
		tRepo.saveAll(List.of(
				new Teacher(101,"Raghu","r45@gmail.com","Male"),
				new Teacher(102,"Durga","d32@gmail.com","Male"),
				new Teacher(103,"Ashok","a35@gmail.com","Male")
				));
		
		System.out.println("==============================================");
		
		int count=tRepo.updateNameById("Mr.Raghu", 101);
		System.out.println(count);
		
		System.out.println("==============================================");
		
		int count2 = tRepo.removeById(101);
		System.out.println(count2);
		System.out.println("==============================================");
		
		tRepo.findAll().forEach(System.out::println);
		System.out.println("==============================================");
		
	}

}

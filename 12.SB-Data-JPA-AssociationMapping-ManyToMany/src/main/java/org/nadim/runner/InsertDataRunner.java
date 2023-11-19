package org.nadim.runner;

import java.util.Arrays;
import java.util.List;

import org.nadim.entity.Course;
import org.nadim.entity.Student;
import org.nadim.repository.CourseRepoI;
import org.nadim.repository.StudentRepoI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepoI sRepo;
	@Autowired
	private CourseRepoI cRepo;
	@Override
	public void run(String... args) throws Exception {
		
		Course c = new Course(101,"Spring Boot",5000.00,"Mr.Raghu");
		Course c2 = new Course(102,"Core Java",4000.00,"Mr.Durga");
		Course c3 = new Course(103,"React Js",3000.00,"Mr.Shudhkar");
		Course c4 = new Course(104,"Angular",4500.00,"Mr.Ashok");
		Course c5 = new Course(105,"DevOps",5500.00,"Mr.Raghu");
		Course c6 = new Course(106,"Selenium",4500.00,"Mr.Karim");
		
		cRepo.saveAll(List.of(c,c2,c3,c4));
		
		sRepo.saveAll(Arrays.asList(
				new Student(1001,"Nadim Mostafa","nadim26@gmail.com",List.of(c,c4)),
				new Student(1002,"Rabbai","rabbai35@gmail.com",List.of(c4)),
				new Student(1003,"Mustak","mustak2@gmail.com",List.of(c3,c4)),
				new Student(1004,"Asif","asif6@gmail.com",List.of(c,c2)),
				new Student(1005,"smith","smith55@gmail.com",List.of(c,c2,c4)),
				new Student(1006,"John","John99@gmail.com",null),
				new Student(1007,"Aditi","Aditi42@gmail.com",null)
				));
		
	}

}

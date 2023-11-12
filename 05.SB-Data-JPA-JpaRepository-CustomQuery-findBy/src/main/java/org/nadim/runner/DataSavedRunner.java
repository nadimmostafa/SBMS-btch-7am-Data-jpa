package org.nadim.runner;

import java.time.LocalDate;
import java.util.Arrays;

import org.nadim.entity.BookInfo;
import org.nadim.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataSavedRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(
				new BookInfo("Core Java","Durga",2300.00,"Programming Language",LocalDate.of(2023, 2, 20)),
				new BookInfo("Spring Boot","Raghu",1550.00,"Framework",LocalDate.parse("2022-10-26")),
				new BookInfo("Advance Java","Ashok",850.00,"Backend",LocalDate.parse("2022-11-06")),
				new BookInfo("DJango",null,3100.00,"Framework",LocalDate.parse("2022-09-09")),
				new BookInfo("Microservices","Natraj",1050.00,"Backend",LocalDate.of(2022, 11, 28)),
				new BookInfo("React js","Shudhakar",950.00,"Front-end",LocalDate.of(2022, 8, 27)),
				new BookInfo("DevOps","Raghu",2300.00,"Operation",LocalDate.parse("2023-02-06")),
				new BookInfo("AWS","Ashok",1000.00,"Cloud",LocalDate.parse("2023-04-06")),
				new BookInfo(".Net",null,1400.00,null,LocalDate.parse("2022-01-11")),
				new BookInfo("DevOps","Ashok",1200.00,"Operation",LocalDate.parse("2022-11-17")),
				new BookInfo("Software Testing","Karim",2600.00,"Testing",LocalDate.parse("2023-08-11")),
				new BookInfo("Spring Boot","Durga",950.00,"Backend",LocalDate.parse("2023-07-27")),
				new BookInfo("Angular","Shudhakar",1300.00,"Frontend",LocalDate.parse("2023-05-23")),
				new BookInfo("DevOps","Srikanth",1700.00,"Operation",LocalDate.parse("2022-09-03")),
				new BookInfo("Software Testing","Imran",1300.00,"Testing",LocalDate.parse("2021-05-11")),
				new BookInfo("Linux","Imran",1900.00,"OS",LocalDate.parse("2022-11-11")),
				new BookInfo("Android",null,5600.00,"OS",LocalDate.parse("2023-10-11")),
				new BookInfo("Python","Durga",3300.00,null,LocalDate.parse("2022-12-30")),
				new BookInfo("Linux",null,1230.00,"OS",LocalDate.parse("2023-09-11"))
				));
	}

}

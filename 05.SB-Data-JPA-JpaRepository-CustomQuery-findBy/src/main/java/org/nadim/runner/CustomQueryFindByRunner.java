package org.nadim.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.nadim.entity.BookInfo;
import org.nadim.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomQueryFindByRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		List<BookInfo> findByAuthorName = repo.findByAuthorNameIs("Durga");
		//hello
		findByAuthorName.forEach(System.out::println);
		
		
		List<BookInfo> books = repo.findByBookPriceLessThan(1500.00);
		books.forEach(System.out::println);
		
		repo.findByAuthorNameIsNull()
		.forEach(System.out::println);
		
		
		repo.findByAuthorNameIsNotNull()
		.forEach(System.out::println);
		*/
		repo.findByAuthorNameLike("%k")
		.forEach(System.out::println);
		
		repo.findByAuthorNameEndingWith("u")
		.forEach(System.out::println);
		
		repo.findByBookNameLike("%Java%")
		.forEach(System.out::println);
	}

}

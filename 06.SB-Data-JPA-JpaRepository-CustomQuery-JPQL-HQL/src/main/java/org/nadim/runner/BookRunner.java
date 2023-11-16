package org.nadim.runner;

import java.util.Arrays;
import java.util.Optional;

import org.nadim.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRunner implements CommandLineRunner {
	
	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.findAllBooks("Raghu")
		.forEach(System.out::println);
		
		repo.fetchAllAuthorNames()
		.forEach(System.out::println);
		
		repo.fetchBooks()
		.stream().map(obj-> obj[0]+":"+obj[1])
		.forEach(System.out::println);
		
		Optional<Object[]> book = repo.fetchBookById(2);
		if(book.isPresent()) {
			Object[] obj = book.get();
		}
		
	}

}

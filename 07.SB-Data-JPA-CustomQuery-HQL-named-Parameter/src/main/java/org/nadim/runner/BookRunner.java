package org.nadim.runner;

import java.util.Arrays;
import java.util.List;

import org.nadim.entity.BookInfo;
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
		List<BookInfo> books = repo.getBookSByAuthorName("Raghu");
		books.forEach(System.out::println);
		
		//repo.getBooks("%k", "%Java%").forEach(System.out::println);
		
		repo.getBooksByPrice(1400.00).forEach(System.out::println);
		
		//repo.getBooksById(Arrays.asList(1,4,3,6)).forEach(System.out::println);	
		
	}

}

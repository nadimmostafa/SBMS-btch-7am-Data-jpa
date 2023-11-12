package org.nadim.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.nadim.entity.Customer;
import org.nadim.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

@Component
public class CustomerRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepository repo;

	@Override
	public void run(String... args) throws Exception {

		//Customer c = new Customer("Jonh", "Jonh25@gmail.com", new Date());
		Customer c1 = new Customer("Smith", "Jonh25@gmail.com", new Date());
		Customer c2 = new Customer("Mostafa", "Jonh25@gmail.com", new Date());
		Customer c3 = new Customer("Nadim", "Jonh25@gmail.com", new Date());
		Customer c4 = new Customer("Ketty", "Jonh25@gmail.com", new Date());
		Customer c5 = new Customer("Zamppa", "Jonh25@gmail.com", new Date());
		Customer c6 = new Customer("Asif", "Jonh25@gmail.com", new Date());
		Customer c7 = new Customer("Sadia", "Jonh25@gmail.com", new Date());
		Customer c8 = new Customer("Raihan", "Jonh25@gmail.com", new Date());
		Customer c9 = new Customer("Sajib", "Jonh25@gmail.com", new Date());
		Customer c10 = new Customer("Shekhar", "Jonh25@gmail.com", new Date());
		
		//repo.saveAll(Arrays.asList(c,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10));
		
		
		// query by Example
		Customer c = new Customer();
		c.setCname("Nadim");
		Example<Customer> example = Example.of(c);
		repo.findAll(example).forEach(System.out::println);;
		

	}

}

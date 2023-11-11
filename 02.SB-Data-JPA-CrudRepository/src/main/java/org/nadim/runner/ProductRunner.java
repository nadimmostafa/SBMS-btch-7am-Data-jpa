package org.nadim.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.nadim.customExceptionHandler.ProductNotFoundException;
import org.nadim.entity.Product;
import org.nadim.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		/*
		Product p = new Product(101,"t-Shirt",999.20,true);
		Product p1 = new Product(102,"Jeans",2150.00,true);
		Product p2 = new Product(103,"Polo",1250.00,true);
		Product p3 = new Product(104,"Jacket",3399.20,true);
		
		//repo.save(p);
		
		repo.saveAll(Arrays.asList(p1,p2,p3));
		
		*/
		System.out.println(repo.existsById(102));
		
		Iterable<Product> products =repo.findAll();
		
		/*
		 * for(Product p:products) { System.out.println(p); }
		 */
		
		products.forEach(System.out::println);
		
		//fetch one row based on id
		
		/*
		Product p =repo.findById(102)
				.orElseThrow(()->new ProductNotFoundException("Product Not Found"));
				*/
		
		Optional<Product> findById = repo.findById(102);
		
		if(findById.isPresent()) {
			System.out.println(findById);
		}else {
			System.out.println("Not Found");
		}
		//==================================================
		
		Iterable<Product> findAllById = repo.findAllById(Arrays.asList(101,103));
		findAllById.forEach(System.out::println);
		
		//========================================================
		
		//repo.deleteById(103);
		 //(or)
		repo.delete(
				repo.findById(102)
				.orElseThrow(()-> new ProductNotFoundException(
						String.format("%s not having %d", Product.class.getName(),102))));
		
		
		List<Integer> id = new ArrayList<Integer>();
		repo.deleteAllById(id);
		// (or)
		repo.deleteAllById(Arrays.asList(101,102));
	}

}

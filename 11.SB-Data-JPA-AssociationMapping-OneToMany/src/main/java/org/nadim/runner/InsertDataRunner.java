package org.nadim.runner;

import java.util.Arrays;
import java.util.List;

import org.nadim.entity.Model;
import org.nadim.entity.Product;
import org.nadim.repo.ModelRepositoryI;
import org.nadim.repo.ProductRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertDataRunner implements CommandLineRunner {

	@Autowired
	private ProductRepositoryI pRepo;
	@Autowired
	private ModelRepositoryI mRepo;
	@Override
	public void run(String... args) throws Exception {
		
		Model m = new Model(101,"4GB-128GB","Red");
		Model m2 = new Model(102,"6GB-256GB","Black");
		Model m3 = new Model(103,"8GB-512GB","Blue");
		Model m4 = new Model(104,"4GB-64GB","Golden");
		
		mRepo.saveAll(Arrays.asList(m,m2,m3,m4));
		
		Product p = new Product(10,"iPhone 14",true, List.of(m));
		Product p2 = new Product(11,"Mi-f12",true, List.of(m4,m2));
		Product p3 = new Product(12,"Sumsung F51",true, List.of(m3));

		
		pRepo.saveAll(Arrays.asList(p,p2,p3));

	}

}

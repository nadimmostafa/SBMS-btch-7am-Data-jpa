package org.nadim.runner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.nadim.entity.Product;
import org.nadim.repo.ProductRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepositoryI repo;
	@Override
	public void run(String... args) throws Exception {
		Product p = new Product();
		p.setProductId(102);
		p.setProductCode("peper");
		
		List<String> ls = new ArrayList<String>();
		ls.add("White");
		ls.add("black");
		ls.add("Blue");
		
		p.setColors(ls);
		
		Set<String> s = new LinkedHashSet<String>();
		s.add("large");
		s.add("xl");
		s.add("m");
		p.setModels(s);
		
		Map<String, String> m = new LinkedHashMap<String,String>();
		m.put("d1", "writen peper");
		m.put("d2", "Exam peper");
		
		p.setDetails(m);
		
		repo.save(p);
	}

}

package org.nadim;

import org.nadim.entity.OrderDetails;
import org.nadim.repository.OrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(Application.class, args);
		OrderRepository ord=cxt.getBean(OrderRepository.class);
		
		OrderDetails odd = new OrderDetails();
		odd.setOrderBy("Nadim");
		
		
		ord.save(odd);
	}

}

package org.nadim.runner;

import java.util.List;

import org.nadim.entity.User;
import org.nadim.repo.UserRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunner implements CommandLineRunner {

	@Autowired
	private UserRepositoryI repo;
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setUserId(101);
		user.setUserName("Ajoy");
		
		user.setRoles(List.of("Admin","Manager"));
		
		repo.save(user);

	}

}

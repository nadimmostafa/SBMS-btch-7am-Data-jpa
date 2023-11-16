package org.nadim.repo;

import org.nadim.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryI extends JpaRepository<User,Integer> {

}

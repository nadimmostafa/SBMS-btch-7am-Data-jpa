package org.nadim.repo;

import org.nadim.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepositoryI extends JpaRepository<Model, Integer> {

}

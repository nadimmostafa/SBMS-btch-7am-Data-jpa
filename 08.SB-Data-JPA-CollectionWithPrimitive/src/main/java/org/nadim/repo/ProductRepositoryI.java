package org.nadim.repo;

import org.nadim.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryI extends JpaRepository<Product, Integer> {

}

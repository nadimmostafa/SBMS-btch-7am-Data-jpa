package org.nadim.repository;

import org.nadim.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetails,String>{

}

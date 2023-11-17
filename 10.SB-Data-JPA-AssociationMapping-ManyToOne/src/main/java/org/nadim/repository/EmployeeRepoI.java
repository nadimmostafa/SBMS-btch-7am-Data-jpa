package org.nadim.repository;

import org.nadim.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepoI extends JpaRepository<Employee, Integer> {

}

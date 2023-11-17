package org.nadim.repository;

import org.nadim.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepoI extends JpaRepository<Department, Integer> {

}

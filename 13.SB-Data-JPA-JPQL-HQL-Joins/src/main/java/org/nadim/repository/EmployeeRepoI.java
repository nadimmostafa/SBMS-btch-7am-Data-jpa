package org.nadim.repository;

import java.util.List;

import org.nadim.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepoI extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT em.empId,em.empName,dt.deptName,dt.deptHead FROM Employee em INNER JOIN em.dept dt")
	//@Query("SELECT em.empId,em.empName,dt.deptName,dt.deptHead FROM Employee em LEFT JOIN em.dept dt")
	//@Query("SELECT em.empId,em.empName,dt.deptName,dt.deptHead FROM Employee em Right JOIN em.dept dt")
	List<Object[]> fetchEmpDeptData();
}

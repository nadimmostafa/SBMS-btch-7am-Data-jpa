package org.nadim.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="emp_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empDept;
}

package org.nadim.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="emp_dtls")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private String gender;
	
	@ManyToOne
	@JoinColumn(name="deptFk")
	private Department dept;
}

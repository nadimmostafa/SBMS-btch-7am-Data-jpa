package org.nadim.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="dept_dtls")
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
	private Integer deptId;
	private String deptName;
	private String deptHead;
}

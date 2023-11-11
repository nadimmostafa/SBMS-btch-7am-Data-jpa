package org.nadim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stdTbl")
public class Student {
	@Id
	@Column(name = "sId")
	private Integer id;
	@Column(name = "sName")
	private String name;
	@Column(name="sGender")
	private String gender;
	
}

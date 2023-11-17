package org.nadim.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="student_dtls")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private String email;
	
	@ManyToMany
	@JoinTable(name="stdAndCourse", joinColumns=@JoinColumn(name="sid_fk"), 
		inverseJoinColumns=@JoinColumn(name="cid_fk"))
	private List<Course> course;
}

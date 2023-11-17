package org.nadim.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="course_dtls")
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	@Id
	private Integer cid;
	private String cname;
	private Double cfees;
	private String takenBy;
}

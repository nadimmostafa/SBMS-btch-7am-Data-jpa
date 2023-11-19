package org.nadim.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	@Id
	private Integer tId;
	private String tname;
	private String email;
	private String genger;
}

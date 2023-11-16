package org.nadim.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_dtls")
public class User {
	
	@Id
	private Integer userId;
	private String userName;
	
	@ElementCollection
	@CollectionTable(name="user_roles", joinColumns=@JoinColumn(name="rolesFK"))
	@OrderColumn(name="roleIndex")
	private List<String> roles;

}

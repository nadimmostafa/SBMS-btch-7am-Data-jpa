package org.nadim.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="product_dtls")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private Integer pId;
	private String pName;
	private boolean stock;
	
	@OneToMany
	@JoinColumn(name="pid_fk")
	private List<Model> model;
}

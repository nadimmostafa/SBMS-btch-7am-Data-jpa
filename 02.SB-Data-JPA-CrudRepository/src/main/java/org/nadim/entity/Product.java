package org.nadim.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="product_dtls")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private Integer pid;
	private String pname;
	private Double price;
	private boolean stock;
}

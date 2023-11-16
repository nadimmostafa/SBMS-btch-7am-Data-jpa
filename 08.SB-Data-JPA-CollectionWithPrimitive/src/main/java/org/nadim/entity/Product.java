package org.nadim.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "product_tbl")
public class Product {
	@Id
	@Column(name="pid")
	private Integer productId;
	@Column(name="pcode")
	private String productCode;
	
	@ElementCollection
	@CollectionTable(name="product_colors",joinColumns=@JoinColumn(name="pidfk"))
	@OrderColumn(name="colors_index")
	private List<String> colors;
	@ElementCollection
	@CollectionTable(name="product_model",joinColumns=@JoinColumn(name="modelFK"))
	private Set<String> models;
	@ElementCollection
	@CollectionTable(name="product_details",joinColumns=@JoinColumn(name="detailsFK"))
	@MapKeyColumn(name="detailsIndex")
	private Map<String,String> details;
	
}

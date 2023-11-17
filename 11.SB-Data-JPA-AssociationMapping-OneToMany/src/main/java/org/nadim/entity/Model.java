package org.nadim.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="model_dtls")
@AllArgsConstructor
@NoArgsConstructor
public class Model {
	@Id
	private Integer modelId;
	private String storage;
	private String color;
}

package org.nadim.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="cust_tab")
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private Integer cId;
	@NonNull
	private String cname;
	@NonNull
	private String mail;
	
	//@Temporal(value = TemporalType.TIMESTAMP) // default store both time and date
	//@Temporal(value = TemporalType.TIME) // store only date
	@NonNull
	@Temporal(value = TemporalType.DATE) // store only date
	private Date doj;
}

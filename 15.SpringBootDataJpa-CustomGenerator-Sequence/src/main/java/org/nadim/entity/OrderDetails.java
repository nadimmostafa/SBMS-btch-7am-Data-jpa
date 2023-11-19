package org.nadim.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ord_Dtls")
public class OrderDetails {
	@Id
	@Column(name="ORDER_ID")
	@GeneratedValue(generator="order_id")
	@GenericGenerator(name="order_id",strategy="org.nadim.generator.OrderIdGenerator")
	private String orderId;
	@Column(name="ORDER_BY")
	private String orderBy;
	@Column(name="ORDER_PLACED_DATE", updatable=false)
	@CreationTimestamp
	private LocalDate orderPlaceDate;
	
	
	public OrderDetails() {
		super();
	}
	public OrderDetails(String orderId, String orderBy, LocalDate orderPlaceDate) {
		super();
		this.orderId = orderId;
		this.orderBy = orderBy;
		this.orderPlaceDate = orderPlaceDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public LocalDate getOrderPlaceDate() {
		return orderPlaceDate;
	}
	public void setOrderPlaceDate(LocalDate orderPlaceDate) {
		this.orderPlaceDate = orderPlaceDate;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderBy=" + orderBy + ", orderPlaceDate=" + orderPlaceDate + "]";
	}
	
	
	
}

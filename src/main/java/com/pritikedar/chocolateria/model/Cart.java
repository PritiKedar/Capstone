package com.pritikedar.chocolateria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cart_items")/*, uniqueConstraints = @UniqueConstraint(columnNames = "id"))*/
public class Cart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public double getSubtotal() {
	return subtotal;
}
public void setSubtotal(double subtotal) {
	this.subtotal = subtotal;
}
	private long userId;
	private long productId;
	private int quantity;
	private double subtotal;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	}
	
	



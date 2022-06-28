package com.pritikedar.chocolateria.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "userId"))
public class Cart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    private long userId;
	private long productId;
	private int quantity;
	private double subtotal;
	static final double tax = 0.07;
	
	 @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	   @JoinTable(
	           name = "user",
	           joinColumns = @JoinColumn(
	                   name = "user_id", referencedColumnName = "id"),
	           inverseJoinColumns = @JoinColumn(
	                   name = "products_id", referencedColumnName = "id"))
	   private Collection<Product> products;
	
	
    public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	public long getId() {
	return id;
}
public Cart() {
		super();
	}
public Cart(long id, long userId, long productId, int quantity, double subtotal, Collection<Product> products) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
		this.subtotal = subtotal;
		this.products = products;
	}
public void setId(long id) {
	this.id = id;
}
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
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getSubtotal() {
	return subtotal;
}
public void setSubtotal(double subtotal) {
	this.subtotal = subtotal;
}
public static double getTax() {
	return tax;
}
	
	

	
	}
	
	



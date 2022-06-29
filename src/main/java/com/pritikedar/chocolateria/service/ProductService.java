package com.pritikedar.chocolateria.service;

import java.util.List;

import com.pritikedar.chocolateria.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	void saveProduct(Product product);
	Product getProductById(long id);
	void deleteProductById(long id);
	void viewCart();
	List<Product> sortProducts(float price);
	List<Product> sortProducts_desc(float price);
	
	//return (List<Product>) productRepository.findAll(Sort.by(Sort.Direction.ASC, "price"));
}

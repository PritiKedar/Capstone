package com.pritikedar.chocolateria.service;

import java.util.List;

import com.pritikedar.chocolateria.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	void saveProduct(Product product);
	Product getProductById(long id);
	//	List<Product> findByNameContaining(String name);
	

}

package com.pritikedar.chocolateria.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pritikedar.chocolateria.model.Product;
import com.pritikedar.chocolateria.repository.ProductRepository;
import com.pritikedar.chocolateria.service.ProductService;

@Service

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

}

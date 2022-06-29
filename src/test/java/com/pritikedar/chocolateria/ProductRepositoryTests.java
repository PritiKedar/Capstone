package com.pritikedar.chocolateria;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pritikedar.chocolateria.model.Product;
import com.pritikedar.chocolateria.repository.ProductRepository;

@SpringBootTest

public class ProductRepositoryTests {
	
	@Autowired
	private ProductRepository productRepository;
	
	//Junit test for saveProduct
	
	@Test
	public void getProductTest() {
	
		Product product = productRepository.findById(1L).get();
		Assertions.assertThat(product.getId()).isEqualTo(1L);
		
	}
	
	@Test
	public void getListOfProductsTest() {
		List<Product> products = productRepository.findAll();
		Assertions.assertThat(products.size()).isGreaterThan(0);
	}

}

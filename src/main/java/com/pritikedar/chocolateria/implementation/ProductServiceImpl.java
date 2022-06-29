package com.pritikedar.chocolateria.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

	@Override
	public void saveProduct(Product product) {

		this.productRepository.save(product);
	}

	@Override
	public Product getProductById(long id) {
		Optional<Product> optional = productRepository.findById(id);
		Product product = null;
		if (optional.isPresent()) {
			product = optional.get();
		} else {
			throw new RuntimeException("Chocolate with product id: " + id + "not found");
		}
		return product;
	}

	@Override
	public void deleteProductById(long id) {
		this.productRepository.deleteById(id);
		
	}

	@Override
	public void viewCart() {
		
		
	}

	@Override
	public List<Product> sortProducts(float price) {
		
		return (List<Product>) productRepository.findAll(Sort.by(Sort.Direction.ASC, "price"));
	}

	@Override
	public List<Product> sortProducts_desc(float price) {
		
		return (List<Product>) productRepository.findAll(Sort.by(Sort.Direction.DESC, "price"));
	}


//	@Override
//	public List<Product> findProductByName(String name) {
//		List<Product> products = productRepository.findByNameContaining(String infix);
//		return productRepository.findBy
//	}

}

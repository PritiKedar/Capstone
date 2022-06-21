package com.pritikedar.chocolateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pritikedar.chocolateria.model.Product;
import com.pritikedar.chocolateria.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	//display list of products
	@GetMapping("/products")
	public String viewHomePage(Model model) {
		model.addAttribute("listProducts", productService.getAllProducts());
		return "products";
	}
	@GetMapping("/showNewProductForm")
  public String showNewProductForm(Model model) {
		//create model attribute to bind form data
	  Product product = new Product();
	  model.addAttribute("product", product);
	  return "new_product";
	 }
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product")Product product) {
		//save product to the database
		productService.saveProduct(product);
		return "redirect:/products";
		
	}
//	@GetMapping("/showCart")
//	public String showCart(@PathVariable (value = "id") long id, Model model) {
//		return null;
//		//get product from the service
//		
//	
//	}
}

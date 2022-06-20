package com.pritikedar.chocolateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pritikedar.chocolateria.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	//display list of products
	@GetMapping("/home")
	public String viewHomePage(Model model) {
		model.addAttribute("listProducts", productService.getAllProducts());
		return "home";
	}

}

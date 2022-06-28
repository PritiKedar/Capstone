//package com.pritikedar.chocolateria.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.pritikedar.chocolateria.model.Cart;
//import com.pritikedar.chocolateria.service.CartService;
//
//@Controller
//public class CartController {
//	
//	@Autowired
//	private CartService cartService;
//	//display list of products
//	@GetMapping("/cart")
//	public String viewCartPage(Model model) {
//		model.addAttribute("listCart_items", cartService.getAllCartItems());
//		return "cart";
//	}
//	
//	@GetMapping("/addToCart")
//	  public String addToCart(Model model) {
//			//create model attribute to bind form data
//		  Cart cart = new Cart();
//		  model.addAttribute("cart_item", saveCart(null));
//		  return "cart";
//		 }
//
//	private Object saveCart(Object object) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//		
//		
//		}
//


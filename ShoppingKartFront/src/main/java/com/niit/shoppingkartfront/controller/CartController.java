package com.niit.shoppingkartfront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.ShoppingCartBackend.DAO.CartDAO;
import com.niit.ShoppingCartBackend.DAO.ProductDAO;
import com.niit.ShoppingCartBackend.Model.Cart;
import com.niit.ShoppingCartBackend.Model.Product;



@Controller
public class CartController {

	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("addCart")
	public String addCart(@ModelAttribute Cart cart){
		cartDAO.saveOrUpdate(cart);
		return "ViewCart";
		
	}
	@RequestMapping("productDescription")
	public String productDescription(@RequestParam("productId") int productId, Model model){
		Product product = productDAO.getByProductId(productId);
		model.addAttribute("product", product);
		model.addAttribute("productDescClicked", true);
		return "home";
		
	}
	
}
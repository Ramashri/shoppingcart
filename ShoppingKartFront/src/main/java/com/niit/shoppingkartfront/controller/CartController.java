package com.niit.shoppingkartfront.controller;

import java.security.Principal;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.ShoppingCartBackend.DAO.CartDAO;
import com.niit.ShoppingCartBackend.DAO.ProductDAO;
import com.niit.ShoppingCartBackend.DAO.UserDAO;
import com.niit.ShoppingCartBackend.Model.Cart;
import com.niit.ShoppingCartBackend.Model.Product;
import com.niit.ShoppingCartBackend.Model.User;



@Controller
public class CartController {

	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private Cart cart;
	
	@RequestMapping("myCart")
	public String myCart(Model model, Principal p){
	String email =	p.getName();
	User user = userDAO.getByEmailId(email);
	 List<Cart> cartList = cartDAO.getByEmailId(email);
	Long GrandTotal = cartDAO.getTotalAmount(user.getUserId());
	
	
	 model.addAttribute("cartList", cartList);
	 model.addAttribute("myCartClicked", true);
	 model.addAttribute("GrandTotal", GrandTotal);
		
		return "UserLogin";
		
		
	}
	@RequestMapping("addtocart")
	public String addCart(@RequestParam("productId") int productId, Principal p, Model model){
		Product product = productDAO.getByProductId(productId);
		String email = p.getName();
		User user = userDAO.getByEmailId(email);
		
		Random t = new Random();
		int day = 2 + t.nextInt(7);
		
		cart.setEmailId(email);
		cart.setPrice(product.getPrice());
		cart.setProductId(productId);
		cart.setProductName(product.getProductName());
		cart.setQty(1);
		cart.setStatus("N");
		cart.setUserId(user.getUserId());
		cart.setUserName(user.getUserName());
		cart.setDays(day);
		cart.setTotal(product.getPrice()*cart.getQty());
		cartDAO.saveOrUpdate(cart);
		
		return "redirect:myCart";
		
	}
	@RequestMapping("productDescription")
	public String productDescription(@RequestParam("productId") int productId, Model model){
		Product product = productDAO.getByProductId(productId);
		model.addAttribute("product", product);
		model.addAttribute("productDescClicked", true);
		return "home";
		
	}
	
}

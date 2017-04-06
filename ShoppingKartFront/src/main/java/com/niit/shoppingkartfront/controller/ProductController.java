package com.niit.shoppingkartfront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.ShoppingCartBackend.DAO.ProductDAO;
import com.niit.ShoppingCartBackend.Model.Product;


@Controller
public class ProductController {

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("addProduct")
	public String addProduct(@ModelAttribute Product product, Model model){
		productDAO.saveOrUpdate(product);
		model.addAttribute("ViewProductButtonClicked", true);
		
		return "redirect:viewProduct";
		
	}
	@RequestMapping("viewProduct")
	public String viewProducts(Model model){
		
		List<Product> productList = productDAO.list();
		model.addAttribute("productList", productList);
		model.addAttribute("ViewProductButtonClicked", true);
		return "AdminLogin";
		
		
	}
	
	@RequestMapping("deleteProduct")
	public String deleteProducts(@RequestParam("productId") int productid, Model model){
		
		productDAO.delete(productid);
		return "redirect:viewProduct";
	}
	
	@RequestMapping("editProduct")
	public String editProduct(@RequestParam ("productId") int productId, Model model){
		Product product = productDAO.getByProductId(productId);
		model.addAttribute("product", product);
		model.addAttribute("editProductClicked", true);
		return "AdminLogin";
		
	}
	@RequestMapping("productEdited")
	public String productEdited(@ModelAttribute Product product){
		
		productDAO.saveOrUpdate(product);
		return "redirect:viewProduct";
	}

}

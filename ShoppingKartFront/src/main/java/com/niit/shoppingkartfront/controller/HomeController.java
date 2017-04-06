package com.niit.shoppingkartfront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShoppingCartBackend.DAO.CategoryDAO;
import com.niit.ShoppingCartBackend.DAO.SupplierDAO;
import com.niit.ShoppingCartBackend.Model.Category;
import com.niit.ShoppingCartBackend.Model.Supplier;

@Controller
public class HomeController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;

	@RequestMapping("/")
	public String homePage(){
		
		return "home";
	}
	@RequestMapping("categoryPage")
	public String NewCategory(Model model)	{
		
		model.addAttribute("AddCategoryButtonClicked", true);
		return "AdminLogin";
		
	}
	
	@RequestMapping("signupPage")
	public ModelAndView newSignup(){
		
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("signupButtonClicked", true);
		return mv;
	}
	
	
	@RequestMapping("productPage")
	public ModelAndView newProduct(){
		
		ModelAndView mv = new ModelAndView("AdminLogin");
		List<Category> categoryList = categoryDAO.list();
		List<Supplier> supplierList = supplierDAO.list();
		mv.addObject("supplierList", supplierList);
		mv.addObject("categoryList", categoryList);
		mv.addObject("AddProductButtonClicked", true);
		return mv;
	}
	
	@RequestMapping("ViewProduct")
	public String ViewProduct(){
		
		return "ViewProduct";
	}
	
	@RequestMapping("supplierPage")
	public ModelAndView newSupplier(){
		
		ModelAndView mv = new ModelAndView("AdminLogin");
		mv.addObject("AddSupplierButtonClicked", true);
		return mv;
	}
	
	@RequestMapping("ViewSupplier")
	public String ViewSupplier() {
		
		return "ViewSupplier";
	}
	
	@RequestMapping("cartPage")
	public ModelAndView newCart(){
		
		ModelAndView mv = new ModelAndView("NewCart");
		return mv;
	}
	
	@RequestMapping("billingaddressPage")
	public ModelAndView newBillingaddress(){
		
		ModelAndView mv = new ModelAndView("NewBillingaddress");
		return mv;
	}
	
	@RequestMapping("shippingaddressPage")
	public ModelAndView newShippingaddress(){
		
		ModelAndView mv = new ModelAndView("NewShippingaddress");
		return mv;
	}
	
	
	
	@RequestMapping("loginPage")
	public ModelAndView newLogin(){
		
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("loginButtonClicked", true);
		return mv;
	}

}

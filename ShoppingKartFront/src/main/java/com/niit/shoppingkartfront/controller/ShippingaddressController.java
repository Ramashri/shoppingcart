package com.niit.shoppingkartfront.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ShoppingCartBackend.DAO.ShippingaddressDAO;
import com.niit.ShoppingCartBackend.Model.Shippingaddress;



@Controller
public class ShippingaddressController {
	@Autowired
	private ShippingaddressDAO shippingaddressDAO;
	
	@RequestMapping("addShippingaddress")
	public String addShippingaddress(@ModelAttribute Shippingaddress shippingaddress){
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		return "ViewShippingaddress";
		
	}
	@RequestMapping("proceed")
	public String Proceed(Principal p, Model model){
		String email = 	p.getName();
		List<Shippingaddress> shippingList = shippingaddressDAO.list(email);
		model.addAttribute("shippingList", shippingList);
		model.addAttribute("viewShippingAddressClicked", true);
	 return "UserLogin";
	}
}

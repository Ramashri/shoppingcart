package com.niit.shoppingkartfront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

}

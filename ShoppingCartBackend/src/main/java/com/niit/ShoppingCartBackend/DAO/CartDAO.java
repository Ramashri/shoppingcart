package com.niit.ShoppingCartBackend.DAO;

import java.util.List;

import com.niit.ShoppingCartBackend.Model.Cart;
import com.niit.ShoppingCartBackend.Model.Category;
import com.niit.ShoppingCartBackend.Model.User;

public interface CartDAO {
	
public List<Cart> list();

public Cart getByCartId(int cartid);

public Cart getByProductId(int productid);		

public Cart getByProductName(String productname);	

public void saveOrUpdate(Cart productid);
	
public void delete(int productid);




}

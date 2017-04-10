package com.niit.ShoppingCartBackend.DAO;

import java.util.List;

import com.niit.ShoppingCartBackend.Model.Cart;


public interface CartDAO {
	
public List<Cart> list();

public Cart getByCartId(int cartid);

public Cart getByProductId(int productid);		

public  List<Cart> getByEmailId(String email);

public Cart getByProductName(String productname);	

public void saveOrUpdate(Cart cart);
	
public void delete(int productid);

public Long getTotalAmount(int id);

}

package com.niit.ShoppingCartBackend.DAO;

import java.util.List;

import com.niit.ShoppingCartBackend.Model.User;

public interface UserDAO {
	
		public List<User> list();
		
		public User getByUserName(String username);		
		
		public User getByUserId(int userid);	
		
	    public User getByPassword(String password);
	    
	    public User getByContactNumber(int contactnumber);
	    
	    public User getByAddress(String address);
		
		public void saveOrUpdate(User user);
			
		public void delete(int UserId);

		}


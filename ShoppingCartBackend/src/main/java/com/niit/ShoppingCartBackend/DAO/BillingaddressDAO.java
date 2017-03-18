package com.niit.ShoppingCartBackend.DAO;

import java.util.List;

import com.niit.ShoppingCartBackend.Model.Billingaddress;
import com.niit.ShoppingCartBackend.Model.Category;

public interface BillingaddressDAO {
	
	public List<Billingaddress> list();
	
	public Billingaddress getByBillId(int billid);		
	
	public Billingaddress getByBilllingAddress(String billingaddress);	
	
    public Billingaddress getByContactNumber(int contactnumber);
    
	public void saveOrUpdate(Billingaddress billingaddress);
		
	public void delete(String BillingAddress);
	
	public void editBillingAddress(Billingaddress billingaddress);


}

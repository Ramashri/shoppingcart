package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Table(name = "Shippingaddress")
@Entity
@Component
public class Shippingaddress {
	
	
@Id
@GeneratedValue
	private int ShippingId;

	private String UserName;
    private String ShippingAddress;
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}
	/**
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return ShippingAddress;
	}
	/**
	 * @param shippingaddress the shippingAddress to set
	 */
	public void setShippingAddress(String shippingaddress) {
		ShippingAddress = shippingaddress;
	}
	
	
	
	
}
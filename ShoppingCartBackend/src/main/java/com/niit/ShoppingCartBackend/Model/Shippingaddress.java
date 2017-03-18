package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Table(name = "ShippingAddress")
@Entity
@Component
public class Shippingaddress {
	
	
@Id
@GeneratedValue
	private int ShippingId;
	private String UserName;
	private String UserId;
    private String ShippingAddress;
	/**
	 * @return the shippingId
	 */
	public int getShippingid() {
		return ShippingId;
	}
	/**
	 * @param shippingid the shippingid to set
	 */
	public void setShippingid(int shippingid) {
		ShippingId = shippingid;
	}
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
	 * @return the userId
	 */
	public String getUserId() {
		return UserId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		UserId = userId;
	}
	/**
	 * @return the shippingAddress
	 */
	public String getShippingaddress() {
		return ShippingAddress;
	}
	/**
	 * @param shippingaddress the shippingAddress to set
	 */
	public void setShippingaddress(String shippingaddress) {
		ShippingAddress = shippingaddress;
	}
	
	
	
	
}
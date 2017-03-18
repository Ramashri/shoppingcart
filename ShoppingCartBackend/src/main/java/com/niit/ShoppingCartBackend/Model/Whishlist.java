package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "Wishlist")
@Entity
@Component

public class Whishlist {
	@Id
	@GeneratedValue
	private int Productid;
	private String Productname;
	private int Price;
	/**
	 * @return the productid
	 */
	public int getProductid() {
		return Productid;
	}
	/**
	 * @param productid the productid to set
	 */
	public void setProductid(int productid) {
		Productid = productid;
	}
	/**
	 * @return the productname
	 */
	public String getProductname() {
		return Productname;
	}
	/**
	 * @param productname the productname to set
	 */
	public void setProductname(String productname) {
		Productname = productname;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return Price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		Price = price;
	}
	
}

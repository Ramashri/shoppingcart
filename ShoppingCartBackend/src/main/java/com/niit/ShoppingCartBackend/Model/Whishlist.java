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
	private int ProductId;
	private String ProductName;
	private int Price;
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return ProductId;
	}
	/**
	 * @param productid the productId to set
	 */
	public void setProductid(int productid) {
		ProductId = productid;
	}
	/**
	 * @return the productname
	 */
	public String getProductName() {
		return ProductName;
	}
	/**
	 * @param productname the productname to set
	 */
	public void setProductName(String productname) {
		ProductName = productname;
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

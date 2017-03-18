package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "category")
@Entity
@Component
public class Category {
	@Id
	@GeneratedValue
	private int CategoryId;
	private String CategoryName;
	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return CategoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return CategoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
}

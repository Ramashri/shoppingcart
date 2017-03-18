package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "Product")
@Entity
@Component
public class Product {
	
@Id
@GeneratedValue
private int ProductId;

private String ProductName;

/**
 * @return the productId
 */
public int getProductId() {
	return ProductId;
}

/**
 * @param productId the productId to set
 */
public void setProductId(int productId) {
	ProductId = productId;
}

/**
 * @return the productName
 */
public String getProductName() {
	return ProductName;
}

/**
 * @param productName the productName to set
 */
public void setProductName(String productName) {
	ProductName = productName;
}


}

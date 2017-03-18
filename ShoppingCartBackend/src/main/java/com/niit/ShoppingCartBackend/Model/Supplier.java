package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "Supplier")
@Entity
@Component

public class Supplier {
	@Id
	@GeneratedValue
	private int SupplierId;
	private String SupplierName;
	private int ContactNumber;
	
	/**
	 * @return the contactNumber
	 */
	public int getContactNumber() {
		return ContactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}
	/**
	 * @return the supplierId
	 */
	public int getSupplierId() {
		return SupplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return SupplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	

}

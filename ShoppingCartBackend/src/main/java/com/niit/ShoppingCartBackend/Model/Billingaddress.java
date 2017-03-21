package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "Billingaddress")
@Entity
@Component
public class Billingaddress {
	
@Id
@GeneratedValue
	private int BillId;
	private String BillingAddress;
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
	 * @return the billId
	 */
	public int getBillId() {
		return BillId;
	}
	/**
	 * @param billId the billId to set
	 */
	public void setBillId(int billId) {
		BillId = billId;
	}
	/**
	 * @return the billingAddress
	 */
	public String getBillingAddress() {
		return BillingAddress;
	}
	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(String billingAddress) {
		BillingAddress = billingAddress;
	}
	

}

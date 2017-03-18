package com.niit.ShoppingCartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "User")
@Entity
@Component
public class User {

@Id
@GeneratedValue
private int UserId;

private String UserName;

private String Password;

private int ContactNumber;

private int Address;

/**
 * @return the userId
 */
public int getUserId() {
	return UserId;
}

/**
 * @param userId the userId to set
 */
public void setUserId(int userId) {
	UserId = userId;
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
 * @return the password
 */
public String getPassword() {
	return Password;
}

/**
 * @param password the password to set
 */
public void setPassword(String password) {
	Password = password;
}

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
 * @return the address
 */
public int getAddress() {
	return Address;
}

/**
 * @param address the address to set
 */
public void setAddress(int address) {
	Address = address;
}


}
package com.niit.ShoppingCartBackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "user")
@Entity
@Component
public class User {

@Id
@Column(name="UserId")
@GeneratedValue
private int UserId;

private String UserName;
private String EmailId;

private String Password;

private String ConformPassword;

private int ContactNumber;

private String Address;

private int Zipcode;

private boolean enabled;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="UserId")
private Role role;

public Role getRole()
{
	return role;
}

public void setRole(Role role)
{
	this.role=role;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}




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
public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

/**
 * @return the firstName
 */

/**
 * @return the emailId
 */
public String getEmailId() {
	return EmailId;
}

/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	EmailId = emailId;
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
 * @return the conformPassword
 */
public String getConformPassword() {
	return ConformPassword;
}

/**
 * @param conformPassword the conformPassword to set
 */
public void setConformPassword(String conformPassword) {
	ConformPassword = conformPassword;
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
public String getAddress() {
	return Address;
}

/**
 * @param address the address to set
 */
public void setAddress(String address) {
	Address = address;
}

/**
 * @return the zipcode
 */
public int getZipcode() {
	return Zipcode;
}

/**
 * @param zipcode the zipcode to set
 */
public void setZipcode(int zipcode) {
	Zipcode = zipcode;
}


/**
 * @return the role
 */



}


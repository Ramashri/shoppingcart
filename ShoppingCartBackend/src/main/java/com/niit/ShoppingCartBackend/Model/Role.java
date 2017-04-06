package com.niit.ShoppingCartBackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Component;
@Entity
@Table(name = "role")
@Component
public class Role {

	@Id
	@GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator",strategy="foreign",parameters={
    @Parameter(value="user",name="property")})	
	private int UserId;
	
	private String role;	
	private String UserName;
	private String EmailId;
	private int ContactNumber;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="UserId")
private User user;
	
	
	

	
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public long getContactNumber() {
		return ContactNumber;
	}
	
	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	
		
	}
}

package com.bookinventory.entity;
 
import java.util.Set;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
 
@Entity

public class User {

	    @Id

	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @Column(name = "UserID")

	    private Integer userID;

	    @Column(name = "LastName")

	    private String lastName;

	    @Column(name = "FirstName")

	    private String firstName;

	    @Column(name = "PhoneNumber")

	    private String phoneNumber;

	    @Column(name = "UserName")

	    private String userName;

	    @Column(name = "Password")

	    private String password;

	    @ManyToOne

	    @JoinColumn(name = "RoleNumber")

	    private PermRole roleNumber;
	   

	    @OneToMany(mappedBy = "user")
	    private Set<PurchaseLog> purchaseLog;
	    
	    @OneToMany(mappedBy = "user")
	    private Set<ShoppingCart> shoppingCart;

		public Integer getUserID() {
			return userID;
		}

		public void setUserID(Integer userID) {
			this.userID = userID;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public PermRole getRoleNumber() {
			return roleNumber;
		}

		public void setRoleNumber(PermRole roleNumber) {
			this.roleNumber = roleNumber;
		}

		public Set<PurchaseLog> getPurchaseLog() {
			return purchaseLog;
		}

		public void setPurchaseLog(Set<PurchaseLog> purchaseLog) {
			this.purchaseLog = purchaseLog;
		}

		public Set<ShoppingCart> getShoppingCart() {
			return shoppingCart;
		}

		public void setShoppingCart(Set<ShoppingCart> shoppingCart) {
			this.shoppingCart = shoppingCart;
		}

		

	}
 
 
 
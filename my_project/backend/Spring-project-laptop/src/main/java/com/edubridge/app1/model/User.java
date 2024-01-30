package com.edubridge.app1.model;



import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="customerRegistration_details")

public class User {
	@Id
	@GeneratedValue
	private Integer customerId;
	private String customerName;
	private String customerEmail;
	private String gender;
	private String customerPassword;
	private long mobileNumber;
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param customerId
	 * @param customerName
	 * @param customerEmail
	 * @param gender
	 * @param customerPassword
	 * @param mobileNumber
	 */
	public User(Integer customerId, String customerName, String customerEmail, String gender,
			String customerPassword, long mobileNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.gender = gender;
		this.customerPassword = customerPassword;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "CustomerRegistration [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", gender=" + gender + ", customerPassword=" + customerPassword + ", mobileNumber="
				+ mobileNumber + "]";
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	
	

}

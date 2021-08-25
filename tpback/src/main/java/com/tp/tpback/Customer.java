package com.tp.tpback;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerID;
	
	@Embedded
	private Name customerName;
	
	@Embedded
	private Address address;
	
	private String gender;
	private String password;
	private String username;
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Calendar dateOfBirth;
	private int phone;
	
	public Customer() {
		super();
	}

	public Customer(int customerID, Name customerName, Address address, String gender, String password, String username,
			String email, Calendar dateOfBirth, int phone) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.username = username;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Name getCustomerName() {
		return customerName;
	}

	public void setCustomerName(Name customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", address=" + address
				+ ", gender=" + gender + ", password=" + password + ", username=" + username + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + "]";
	}
	
}

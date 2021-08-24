package com.tp.tpback;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Address {

	@Id
	@GeneratedValue
	private int addrId;

	private int doorno;
	private String street;
	private String city;
	private int pincode;
	
	@ManyToOne
	@JoinColumn(name = "customerID",referencedColumnName = "CUSTOMERID")
	private Customer customer;

	public Address() {
		super();
	}

	public Address(int addrId, int doorno, String street, String city, int pincode, Customer customer) {
		super();
		this.addrId = addrId;
		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.customer = customer;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", doorno=" + doorno + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}

}
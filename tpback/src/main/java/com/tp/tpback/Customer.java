package com.tp.tpback;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Embedded;


@Entity
@DiscriminatorValue("customer")
public class Customer extends User {

	
	private String email;
	private String gender;
	private String phone;
	private Date dob;
	
	@Embedded
	private Address address;
	@Embedded
	private Name name;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Name name, String email, String gender, String phone, Date dob, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.dob = dob;
		this.address = address;
	}
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", gender=" + gender + ", phone=" + phone + ", dob="
				+ dob + ", address=" + address + "]";
	}
	

}








package com.tp.tpback;

import javax.persistence.*;

@Entity
public class Employee {
	
	private String name;
	private int phone;
	private String gender;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, int phone, String gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", gender=" + gender + "]";
	}

	
}

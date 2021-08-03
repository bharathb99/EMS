package com.tp.tpback;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends User{
	@Embedded
	private Name name;
	
	private int phone;
	private String gender;
	
	@OneToOne
	@JoinColumn(name = "dno")
	private Department dept;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Name name, int phone, String gender, Department dept) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.dept = dept;
	}

	public Name getName() {
		return name;
	}
	public void setName(Name name) {
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
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [phone=" + phone + ", gender=" + gender + ", dept=" + dept + "]";
	}
	
		
}

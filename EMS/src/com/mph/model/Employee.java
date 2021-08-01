package com.mph.model;

import java.io.Serializable;
import java.util.Comparator;


public class Employee  implements Serializable,Comparable<Employee> {

	private int empno;
	private String empname;
	private String dept;
	private Salary sal;

	public Employee() {
		super();
		System.out.println("From Emp Constr...");
	}

	public Employee(int empno, String empname, String dept, Salary sal) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.dept = dept;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "\nEmployee ID=" + empno + ",Employee Name=" + empname + ",Employee Department=" + dept + ", " + sal;
	}
	
	public int compareTo(Employee e1) {
		return this.empno - e1.empno;
	}
	
	//Anonymous inner class
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee  e1,Employee  e2) {
			return (e1.getEmpname().compareTo(e2.getEmpname()));
		}	
		
	};
}

package com.mph.model;
import java.util.Comparator;
public class Employee {
	
	private int temp;
	private int empno;
	private String empname;
	private Salary sal;
	private String dept;
	
	
	public Employee()
	{
		System.out.println("employee constructor..");
	}
	
	public Employee(int empno, String empname,Salary sal ,String dept)
	{
		System.out.println("from parameterised constructor");
		this.empno = empno;
		this.empname = empname;
		this.sal = sal;
		this.dept = dept;
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
	
	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", sal=" + sal + ", dept=" + dept + "]";
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

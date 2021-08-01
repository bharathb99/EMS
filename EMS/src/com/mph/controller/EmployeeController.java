package com.mph.controller;

import java.io.*;
import java.util.*;
import com.mph.model.Employee;
import com.mph.model.Salary;


public  class EmployeeController implements EmployeeInterface {

	Employee emp;
	List<Object> empList = new ArrayList<Object>();

	public List<Object> addEmployee() {
				
		emp = new Employee();
		Salary sal = new Salary();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the name");
		String ename = sc.next();
		emp.setEmpname(ename);

		System.out.println("enter the number");
		emp.setEmpno(sc.nextInt());

		System.out.println("enter the basic salary");
		int basic = sc.nextInt();
		
		System.out.println("enter the department");
		String dept = sc.next();
		
		sal.setBasic(basic);

		sal.setPf(basic);
		sal.setDa(basic);
		sal.setHrf(basic);
		sal.setGrossSalary();
		sal.setNetSalary();
		emp.setSal(sal);
		emp.setDept(dept);
		
		empList.add(emp);

		System.out.println("Employee added sucessfully");

		return empList;

	}


	public void viewEmployee(List<Object> elist) {	
		
			elist.forEach(li -> System.out.println(li));
	}
	
	
	
	
	
}

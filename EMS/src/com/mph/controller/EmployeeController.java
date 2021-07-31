package com.mph.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.mph.daoimpl.EmployeeDao;
//import com.mph.daoimpl.EmployeeDaoImpl;
import com.mph.model.Employee;
import com.mph.model.Salary;

public class EmployeeController implements EmployeeInterface {

	Employee emp;
//	EmployeeDao dao = new EmployeeDaoImpl();
	List elist = new ArrayList();

	public List addEmployee() {

		emp = new Employee();

		System.out.println("\nAdd an Employee");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Employee Number:");
		int eno = sc.nextInt();
		//emp.setEmpno(eno);

		System.out.println("Enter Employee Name :");
		//emp.setEmpname(sc.next());
		System.out.println("Enter Employee Department :");
		//emp.setDept(sc.next());

		Salary sal = new Salary();
		System.out.println("Enter Basic:");
		int basic = sc.nextInt();
		sal.setBasic(basic);
		sal.setDa(basic);
		//sal.setHra(basic);
		sal.setPf(basic);
		//sal.setGrossSalary(basic);
		//sal.setNetSalary(basic);
		//emp.setSal(sal);
		elist.add(emp);
		System.out.println("Employee Added Sucessfully !!!");
		//dao.createEmployee(emp);
		//dao.createEmployee(sal);
		return elist;

	}

	@Override
	public void viewEmployee(List emlist) {
		// TODO Auto-generated method stub
		
	}
	
}
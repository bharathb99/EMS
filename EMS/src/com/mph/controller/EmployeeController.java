package com.mph.controller;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.util.function.Predicate;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mph.daoimpl.EmployeeDao;
import com.mph.daoimpl.EmployeeDaoImpl;
import com.mph.model.Employee;
import com.mph.model.Salary;

public class EmployeeController implements EmployeeInterface {

	Employee emp;
	List elist = new ArrayList();
	EmployeeDao dao = new EmployeeDaoImpl();

	public List addEmployee() {

		emp = new Employee();

		System.out.println("\nAdd an Employee");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter your name :");
		emp.setEmpname(sc.next());

		Salary sal = new Salary();
		System.out.println("Enter Basic:");
		int basic = sc.nextInt();
		
		System.out.println("Enter your Department :");
		emp.setDept(sc.next());
		
		sal.setBasic(basic);
		sal.setDa(basic);
		sal.setHra(basic);
		sal.setPf(basic);
		sal.setGrossSalary(basic);
		sal.setNetSalary(basic);
		emp.setSal(sal);
		elist.add(emp);
		dao.createEmployee(emp,sal);
		System.out.println("Employee Added Sucessfully !!!");
		return elist;

	}

	public void viewEmployee(List emlist) {

		System.out.println("\nView an Employee");
		//System.out.println(emlist);

		//System.out.println("Pre-defined Functional Interface");
		//elist.forEach(li->System.out.println(li));
		dao.listEmployee();

	}

	public void serializeEmployee(List emlist) throws IOException {

		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		try {

			fout = new FileOutputStream("serialemp.txt");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(emlist);
			System.out.println("Emp Serialized ");
		} catch (Exception ex) {
			System.out.println("Serialization raising exception" + ex);
		}
		oos.close();
		fout.close();

	}

	public void deSerializeEmployee(List emlist) throws IOException {

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {

			fin = new FileInputStream("serialemp.txt");
			ois = new ObjectInputStream(fin);

			List<Employee> emp1 = (List<Employee>) ois.readObject();

			System.out.println("Deserialized...");
			Iterator<Employee> i = emp1.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
			}
		} catch (Exception ex) {
			System.out.println("Serialization raising exception" + ex);
		}
		ois.close();
		fin.close();

	}
	
	public void sortEmployee(List emlist) {
		
		Collections.sort(emlist);
		System.out.println("Sorted List : " + emlist);
		
		
		emlist.sort(Employee.nameComparator);
		System.out.println("Sorted Employee List :" + emlist.toString());
		
	}
	
	public void groupByDeptartment(List<Employee> emlist) {
		
		Map<String,List<Employee>> groupByDept =emlist.stream().collect(Collectors.groupingBy(Employee::getDept));
		//System.out.println(groupByDept);
		
		groupByDept.forEach((dep,empInDept)->{
			System.out.println(dep);			
			empInDept.forEach(System.out::println);
			
		});
		
	}

	@Override
	public void insertUsingProc() {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		e.setEmpno(eno);

		System.out.println("Enter your name :");
		e.setEmpname(sc.next());
		
		Salary s = new Salary();
		System.out.println("Enter Basic:");
		int basic = sc.nextInt();
		
		System.out.println("Enter your Department :");
		e.setDept(sc.next());
		
		s.setBasic(basic);
		s.setDa(basic);
		s.setHra(basic);
		s.setPf(basic);
		s.setGrossSalary(basic);
		s.setNetSalary(basic);
		
		dao.insertUsingProcedure(e,s);
		System.out.println("Done");
	}
	
	@Override
	public void rsmd() {
		dao.rsmd();
		
	}

	public void type_forward_only_rs()
	{
		dao.type_forward_only_rs();
	}

	@Override
	public void type_scroll_insensitive_rs() {
		dao.type_scroll_insensitive_rs();
		
	}

	@Override
	public void type_scroll_sensitive_rs() {
		dao.type_scroll_sensitive_rs();
		
	}
	

	@Override
	public void type_scroll_sensitive_update_rs() {
		dao.type_scroll_sensitive_update_rs();
		
	}
	
}
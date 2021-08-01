package com.mph.controller;
import com.mph.model.Employee;

import java.util.List;
import java.io.*;

public interface EmployeeInterface {
	
	public List addEmployee();

	public void viewEmployee(List emlist);
	
	public void serializeEmployee(List emlist)throws IOException ;
	
	public void deSerializeEmployee(List emlist)throws IOException ;
	
	public void sortEmployee(List emlist);
	
	public void groupByDeptartment(List<Employee> emlist);

	public void insertUsingProc();
	
	public void rsmd();
	
	public void type_forward_only_rs();
	
	public void type_scroll_insensitive_rs();
	
	public void type_scroll_sensitive_rs();
	
	public void type_scroll_sensitive_update_rs();
}
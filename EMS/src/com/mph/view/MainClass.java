package com.mph.view;

import com.mph.exception.*;

import java.io.*;
import java.util.*;

import com.mph.controller.*;
import com.mph.exception.UserNotFoundException;

public class MainClass {

	public static boolean userValidation()  throws IOException{
		String uname = "tour", pass = "1234",un,pw;
		

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter Username");
			un = br.readLine();

			System.out.println("Enter password");
			pw = br.readLine();

		
		if (un.equals(uname) && pw.equals(pass)) {
				System.out.println("Please wait...");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			System.out.println("Logged in Successfully...\n Welcome " + uname);
			return true;
		} else
			return false;
	}
	
	public static void login() throws IOException, UserNotFoundException {
		EmployeeInterface ec = new EmployeeController();

		Scanner sc = new Scanner(System.in);
		String input = null;
		List elist = null;

		if (userValidation()) {
			try {
				do {

					System.out.println("What do you want to do? \n Enter your Choice:");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					
					int choice = sc.nextInt();

					switch (choice) {
					case 1: {
						elist = ec.addEmployee();
						break;
					}
					case 2: {
						ec.viewEmployee(elist);
						break;
					}
					
					default:
						System.out.println("plz enter a valid choice");
					}
					System.out.println("Do you want to continue? Y or y");
					input = sc.next();
				} while (input.equals("Y") || input.equals("y"));
				System.out.println("System Exited. Thanks You !");
				System.exit(0);
				
			} catch (InputMismatchException im) {
				System.out.println(im);
				login();
			}
		} else {
			throw new UserNotFoundException();
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome To EMS!!!");
		try {
			login();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		}
	}
}
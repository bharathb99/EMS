package com.mph.exception;

public class UserNotFoundException extends Exception{
	
	public UserNotFoundException()
	{
		System.out.println("User Not Found Exception thrown");
	}
	public String toString()
	{
		return "User Defined Exception Raised.";
	}
}

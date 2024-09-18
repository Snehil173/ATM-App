package com.snehil.basic.validatation;

import com.snehil.basic.exception.InvalidInputException;

public class MyValidation 
{
	public static boolean validateCardLength(String atmCardNo) throws InvalidInputException
	{
		if(atmCardNo.length()==16 )
			return true;
		else
			throw new InvalidInputException("Card Number must be 16 Digit");
	}
	
	public static boolean validateCardFormat(String atmCardNo)throws InvalidInputException
	{
		String nameRegex = "[0-9]+";
		if(atmCardNo.matches(nameRegex))	
			return true;
		else
			throw new InvalidInputException("Card number have Digits Only");
	}
	
	public static Integer validateCardPin(String atmPin)
	{
		if(atmPin.length()!=4) 
			return 0;
		
		for(char c : atmPin.toCharArray()) {
			if(!Character.isDigit(c)) {
				return 1;
			}
		}
		return 2;
	}
	
	public static boolean validateEmail(String mailId)throws InvalidInputException
	{
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";	
		
		if(mailId.matches(emailRegex))	
			return true;
		else
			throw new InvalidInputException("Email id format is not valid...");
	}
	
	
	
	public static Boolean validateAmount(Integer n)throws InvalidInputException
	{
		if(n%500==0)
			return true;
		else
			throw new InvalidInputException("Amount must be multiple of 500");
	}
	
	
}

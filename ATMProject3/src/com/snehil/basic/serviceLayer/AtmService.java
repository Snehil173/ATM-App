package com.snehil.basic.serviceLayer;

import java.util.List;

import com.snehil.basic.entity.Customer;
import com.snehil.basic.entity.Transaction;

public interface AtmService 
{
	String withdrawal(Customer customer, Integer withdrawalAmount);
	String deposit(Customer customer,Integer depositAmount);
	List<Transaction> miniStatement(Customer customer);	
	Integer showBalance(Customer customer);
	String changePin(Customer customer, String pin);
	void updateCardStatus(String cardNo,String cardStatus);
}

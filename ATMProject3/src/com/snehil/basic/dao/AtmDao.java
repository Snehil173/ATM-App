package com.snehil.basic.dao;
import java.util.List;

import com.snehil.basic.entity.Customer;
import com.snehil.basic.entity.Transaction;

public interface AtmDao
{
	void withdrawl(Customer customer,Integer withdrawlAmount);
	void deposit(Customer customer,Integer depositAmount);
	Integer showBalance(Customer customer);
	List<Transaction> miniStatement(Customer customer);
	String changePin(Customer customer, String pin);
	void updateCardStatus(String cardNo,String cardStatus);
}


package com.snehil.basic.presentation;

import com.snehil.basic.entity.Customer;
import com.snehil.basic.entity.Transaction;

public interface AtmApp {
	
	void withdrawal(Customer customer);
	void deposit(Customer customer);
	void showBalane(Customer customer);
	void changePin(Customer customer);
	void miniStatement(Customer customer);

}

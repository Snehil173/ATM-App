package com.snehil.basic.presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.snehil.basic.dao.AtmDao;
import com.snehil.basic.dao.AtmDaoImpl;
import com.snehil.basic.entity.Customer;
import com.snehil.basic.entity.Transaction;
import com.snehil.basic.exception.InvalidInputException;
import com.snehil.basic.serviceLayer.AtmService;
import com.snehil.basic.serviceLayer.AtmServicerImpl;
import com.snehil.basic.validatation.MyValidation;

public class AtmAppImpl implements AtmApp 
{
	AtmDao atmDao = new AtmDaoImpl();
	AtmService atmService = new AtmServicerImpl();
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void withdrawal(Customer customer) 
	{
		Boolean checkAmount=true;
		while(checkAmount)
		{
			System.out.println("Enter Amount to withdraw :  ");
			Integer withdrawlAmount = scanner.nextInt();
			try {
			if(MyValidation.validateAmount(withdrawlAmount))
			{
				checkAmount=false;
				System.out.println(atmService.withdrawal(customer,withdrawlAmount));
			}}catch(InvalidInputException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("DO you want to perform more transaction :Type - Y or N");
			Character choice = scanner.next().charAt(0);
			if(choice=='n' || choice== 'N')
				break;
			else
				checkAmount=true;
		}
	}

	@Override
	public void deposit(Customer customer) {
		Boolean checkAmount=true;
		while(checkAmount)
		{
			System.out.println("Enter Amount to deposit :  ");
			Integer depositAmount = scanner.nextInt();
			try 
			{
				if(MyValidation.validateAmount(depositAmount))
				{
					checkAmount=false;
				System.out.println(atmService.deposit(customer,depositAmount));
				}
			}
			catch(InvalidInputException e)
			{ 
			
				System.err.println(e.getMessage());
			}
			System.out.println("DO you want to perform more transaction :Type - Y or N");
			Character choice = scanner.next().charAt(0);
			
			if(choice=='n' || choice== 'N')
				break;
			else
				checkAmount=true;
		}
	}

	@Override
	public void showBalane(Customer customer) {
		System.out.println("Available Balance : "+atmService.showBalance(customer));
		
	}

	@Override
	public void miniStatement(Customer customer) {
		//atmService.miniStatement(customer);
		List<Transaction> list = atmService.miniStatement(customer);
		Iterator<Transaction> itr = list.iterator();
		System.out.println("\tTransactionId\taccountNo\tTransactionType\tAmount\tTransactionDate\tTransactionTime");
	
		System.out.println("\t--------------------------------------------------------------------------------------");
		while(itr.hasNext()) {
		  Transaction  transaction = itr.next();
			System.out.println("\t"+transaction.getTransactionId()+"\t"+transaction.getAccountNo()+"\t     "+transaction.getTransactionType()+"\t     "+transaction.getAmount()+"\t     "+transaction.getTransactionDate()+"\t    "+transaction.getTransactionTime());
		}
		System.out.println();
		System.out.println("Total Available Balance is :" + atmService.showBalance(customer));
		System.out.println();
	}

	@Override
	public void changePin(Customer customer) {
		System.out.println("Enter NewPin : ");
		String newPin = scanner.next();
		System.out.println(atmService.changePin(customer, newPin));
	}
}

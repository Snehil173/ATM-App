package com.snehil.basic.presentation;
import java.util.Scanner;

import com.snehil.basic.entity.Customer;
public class App 
{
	public void displayApp(Customer customer)
	{
		
		AtmApp atmApp = new AtmAppImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
			System.out.println("\t-------------------------------------------------------");
			System.out.println("\t---------------ATM Management System-------------------");
			System.out.println("\t-------------------------------------------------------");
			System.out.println();
			System.out.println("Welcome : " + customer.getCustomerName()+"\t\t\t Account No:" + customer.getAccount().get(0).getAccountNo());
			System.out.println();

			System.out.println("\t1.Withdrawl");
			System.out.println("\t2.Deposit");
			System.out.println("\t3.Show Balance");
			System.out.println("\t4.Mini Statement");
			System.out.println("\t5.Change Pin");
			System.out.println("\t6.Exit");
			
			System.out.println("Enter the choice : ");
			Integer choice = scanner.nextInt();
			
			switch(choice) 
			{
				case 1: 
					atmApp.withdrawal(customer);
					break;
				case 2: 
					atmApp.deposit(customer);
					break;
				case 3:
					atmApp.showBalane(customer);
					break;
				case 4:
					atmApp.miniStatement(customer);
					break;
				case 5:
				   atmApp.changePin(customer);
				   break;
				case 6: 
					System.out.println("Thank you Have a Nice Day !!!!!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
	}
}

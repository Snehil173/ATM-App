package com.snehil.basic.presentation;
import java.util.Scanner;

import com.snehil.basic.dao.CustomerDao;
import com.snehil.basic.dao.CustomerDaoImpl;
import com.snehil.basic.entity.Customer;
import com.snehil.basic.exception.InvalidInputException;
import com.snehil.basic.serviceLayer.AtmService;
import com.snehil.basic.serviceLayer.AtmServicerImpl;
import com.snehil.basic.validatation.MyValidation;

public class Login {
	public static void main(String[] args) {
		int pinCount=0;
		CustomerDao customerDao = new CustomerDaoImpl();
		AtmService atmService = new AtmServicerImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t-------------------------");
		System.out.println("\tAuthentication Screen");
		System.out.println("\t-------------------------");
		Boolean flagCardNo = true;
		Boolean flagPinNo = true;
		int countFlagCardNo=0;
		while (flagCardNo) {
			System.out.print("Enter the Card No :");
			String cardNo = scanner.next();
			try {
				if (MyValidation.validateCardFormat(cardNo)) {
					try {
						if (MyValidation.validateCardLength(cardNo)) {
							//CustomerDao customerDao = new CustomerDaoImpl();
							Customer customer = customerDao.findCardNo(cardNo);
							flagCardNo = false;
							if (customer != null) {
								if(customer.getAtmCard().getCardStatus().equals("Blocked"))
								{
									System.out.println("Your Card is Blocked kindly contact your Main Branch..");
									System.exit(0);
								}
								String atmPin ="";
								while (flagPinNo) {
									System.out.print("Enter the Pin No :");
									atmPin = scanner.next();
									try {
										if (MyValidation.validateCardPin(atmPin)==0) {
											throw new InvalidInputException("Pin No must be 4 Digit");
										}else if (MyValidation.validateCardPin(atmPin)==1) {
											throw new InvalidInputException("Pin No must be Numeric");
										}
										else {
											if (customerDao.findPinNo(atmPin)) {
												if (customer.getAtmCard().getCardPin().equals(atmPin)) {
													flagPinNo = false;
													new App().displayApp(customer);
												} else {
													System.out.println("Pin Not Matched Try Again..");
													pinCount++;
													if(pinCount>=3) {
														System.out.println("You have enter 3 times wrong pin no \nYour Card is blocked \ncontact to your Bank Branch to activate the Card..");
														//AtmService atmService = new AtmServicerImpl();
														atmService.updateCardStatus(customer.getAtmCard().getCardNo(), "Blocked");
														System.exit(0);
													}
												}
											}else {
												System.out.println("Pin Not Matched Try Again-1..");
												pinCount++;
												if(pinCount>=3) {
													System.out.println("You have enter 3 times wrong pin no \nYour Card is blocked \ncontact to your Bank Branch to activate the Card..");
													//AtmService atmService = new AtmServicerImpl();
													atmService.updateCardStatus(customer.getAtmCard().getCardNo(), "Blocked");
													System.exit(0);
												}
											}
										} 
									} catch (InvalidInputException e) {
										System.out.println(e.getMessage());
									}
								}
							} else {
								countFlagCardNo++;
								System.out.println("Card No Not Found");
							}
						}
					} catch (InvalidInputException e) {
						System.out.println(e.getMessage());
					}
				} // outer
			} catch (InvalidInputException e) {

				System.out.println(e.getMessage());
			}
			flagCardNo=true;
			
			if(countFlagCardNo>=3)
			{
				System.out.println("You have attempt Maximum Limit,Plz Run your application again...");
				System.exit(0);
			}
		} // while
	}// main
}// class
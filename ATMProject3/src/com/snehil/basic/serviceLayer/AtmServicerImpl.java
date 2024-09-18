package com.snehil.basic.serviceLayer;
import java.util.InputMismatchException;
import java.util.List;

import com.snehil.basic.dao.AtmDao;
import com.snehil.basic.dao.AtmDaoImpl;
import com.snehil.basic.entity.Customer;
import com.snehil.basic.entity.Transaction;
import com.snehil.basic.exception.InvalidInputException;

public class AtmServicerImpl implements AtmService {
		AtmDao atmDao = new AtmDaoImpl();
	    @Override
	    public String withdrawal(Customer customer, Integer withdrawalAmount) {
	    	String msg="";
	        try {
	            
	            if (customer != null) {
	                if (withdrawalAmount <0) {
	                    throw new InvalidInputException("Amount must be Positive");
	                }else if(withdrawalAmount ==0) {
	                	throw new InvalidInputException("Amount can not be Zero");
	                }
	                else if(withdrawalAmount >10000) {
	                	throw new InvalidInputException("Amount must be between 1 to 10000");
	                }
	                else {
	                    if (withdrawalAmount < customer.getAccount().get(0).getBalance()) {
	                    	//AtmDao atmDao= new AtmDaoImpl();
		                       atmDao.withdrawl(customer, withdrawalAmount);
		                       msg="Withdrawal Successfully";
	                   
	                    } else {
	                    	msg="Insufficient Balance";
	                    }
	                }
	            }
	        } catch (InvalidInputException e) {
	            System.err.println(e.getMessage());
	        } catch (InputMismatchException e) {
	            System.err.println(e);
	        }
	        return msg;
	    }
   
     
	@Override
	public String deposit(Customer customer, Integer depositAmount){
		String msg="";
	     if(customer!=null){
			try{
			       if(depositAmount<0){
			    	   throw new InvalidInputException("Amount must be positive ");
			        }else if(depositAmount ==0) {
	                	throw new InvalidInputException("Amount can not be Zero");
	                }
			       else if(depositAmount>20000){
			    	   throw new InvalidInputException("Amount must be less then 20000");
			       }
			       else{
			    	   //AtmDao atmDao= new AtmDaoImpl();
                       atmDao.deposit(customer, depositAmount);
                       msg="Deposited Successfully";
	              	}
		 	}
			catch(InvalidInputException e){
				System.err.println(e.getMessage());
			}
			catch(InputMismatchException e){
			      System.err.println(e);
			}
		}
		else{
			msg="Object not found.....";
		}
	     return msg;
	}
	@Override
	public List<Transaction> miniStatement(Customer customer) {
		return  atmDao.miniStatement(customer);
	}
	
	@Override
	public Integer showBalance(Customer customer) {
		return atmDao.showBalance(customer);
	}
	@Override
	public String changePin(Customer customer, String pin) {
		//System.out.println(customer.getAtmCard().getCardPin() + " : " + pin);
		 
		if(customer.getAtmCard().getCardPin().equals(pin)) {
			 return "New Pin can not be similar to last pin";
		 }
		 else
		 {
			 return atmDao.changePin(customer, pin);
		 }
		
	}
	public void updateCardStatus(String cardNo,String cardStatus) {
		atmDao.updateCardStatus(cardNo, cardStatus);
	}
}

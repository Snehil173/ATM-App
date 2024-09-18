package com.snehil.basic.dao;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.snehil.basic.entity.AtmCard;
import com.snehil.basic.entity.Customer;
import com.snehil.basic.entity.Transaction;

public class AtmDaoImpl implements AtmDao 
{
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer();
	EntityManager entityManager = MyConnection.getEntityManagerObject();
    EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public void withdrawl(Customer customer,Integer withdrawlAmount) 
	{	 
		entityTransaction.begin();
		customer.getAccount().get(0).setBalance(customer.getAccount().get(0).getBalance()-withdrawlAmount);
		Transaction transaction= new Transaction();
			transaction.setAccountNo(customer.getAccount().get(0).getAccountNo());
			transaction.setTransactionDate( LocalDate.now());
			transaction.setTransactionTime( LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
			transaction.setTransactionType("Dr");
			transaction.setAmount(withdrawlAmount);
		entityManager.persist(transaction);
		entityTransaction.commit();
	}
			
		

	@Override
	public void deposit(Customer customer,Integer depositAmount) 
	{
   	   entityTransaction.begin();
       customer.getAccount().get(0).setBalance(customer.getAccount().get(0).getBalance()+depositAmount);
       Transaction transaction= new Transaction();
       transaction.setAccountNo(customer.getAccount().get(0).getAccountNo());
       transaction.setTransactionDate( LocalDate.now());
       transaction.setTransactionTime( LocalTime.now().truncatedTo(ChronoUnit.SECONDS));
       transaction.setTransactionType("Cr");
       transaction.setAmount(depositAmount);
       entityManager.persist(transaction);
       entityTransaction.commit();
	}


	@Override
	public Integer showBalance(Customer customer) {
		customer = entityManager.find(Customer.class, customer.getCustomerId());
		return customer.getAccount().get(0).getBalance();
	}

	@Override
	public List<Transaction> miniStatement(Customer customer) 
	{
		String accountNo = customer.getAccount().get(0).getAccountNo();
		String jpql="from Transaction t where t.accountNo=?1";
		Query q = entityManager.createQuery(jpql);
		q.setParameter(1, accountNo);
		List<Transaction> l = q.getResultList();
		return  l;
	}
	
	@Override
	public String changePin(Customer customer, String pin) {
		AtmCard atmCard= customer.getAtmCard();
	     entityTransaction.begin();
		     atmCard.setCardPin(pin);
		 entityTransaction.commit();
		 return "Pin Change Successfully";
		
	}
	public void updateCardStatus(String cardNo,String cardStatus) {
		AtmCard atmCard = entityManager.find(AtmCard.class, cardNo);
		entityTransaction.begin();
			atmCard.setCardStatus(cardStatus);
		 entityTransaction.commit();
	}
}

package com.snehil.basic.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.snehil.basic.entity.Customer;

public class CustomerDaoImpl implements CustomerDao
{
	EntityManager entityManager = MyConnection.getEntityManagerObject();
	
	@Override
	public Customer findCardNo(String atmCardNo) 
	{
		String jpql = "select c from Customer c  ";
		Boolean flag=false;
		Query q = entityManager.createQuery(jpql);
		Customer customer=null;
		List<Customer> l = q.getResultList();
		for(Customer c:l) 
		{
			if(c.getAtmCard()!=null) 
			{
				if(c.getAtmCard().getCardNo().equals(atmCardNo))
				{
					flag=true;
					customer=c;
					break;
				}
			}
		}
		return customer;
	}
		
	@Override
	public Boolean findPinNo(String atmPin) 
	{
		String jpql = "select c from Customer c where c.atmCard.cardPin=?1";
		Query q = entityManager.createQuery(jpql);
		q.setParameter(1, atmPin);
		List<Customer> l = q.getResultList();	
		if(l.isEmpty())
			return  false;
		else 
			return  true;
	}
}

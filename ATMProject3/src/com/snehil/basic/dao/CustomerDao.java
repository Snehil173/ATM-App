package com.snehil.basic.dao;
import com.snehil.basic.entity.Customer;

public interface CustomerDao 
{
	Customer findCardNo(String atmCardNo);
	Boolean findPinNo(String atmPin);
}

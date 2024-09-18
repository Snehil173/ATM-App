package com.snehil.basic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
@Entity
public class Customer {
	
	@Id
	@Column(length = 16)
	private String customerId;
	@Column(length = 16)
	private String customerName;
	@Column(length = 6)
	private String gender;
	@Column(length = 16)
	private String custDob;
	@Column(length = 36)
	private String email;
	private String phoneNo;
	@Column(length = 16)
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cardNo")
	private AtmCard atmCard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountNo")
	private Account aaccount;
	
	
	@OneToMany(cascade = CascadeType.ALL )
	private List<Account> account;

	
	
	public Account getAaccount() {
		return aaccount;
	}

	public void setAaccount(Account aaccount) {
		this.aaccount = aaccount;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCustDob() {
		return custDob;
	}

	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AtmCard getAtmCard() {
		return atmCard;
	}

	public void setAtmCard(AtmCard atmCard) {
		this.atmCard = atmCard;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	

}
	
	


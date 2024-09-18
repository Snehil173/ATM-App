package com.snehil.basic.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AtmCard {
    @Id
    @Column(length = 16)
	private String cardNo;
    @Column(length = 4)
   	private String cardPin;
    @Column(length = 16)
	private String issueDate;
    @Column(length = 16)
	private String expiryDate;
   	private Integer cvvNo;
	@Column(length = 7)
   	private String cardStatus;
   	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "atmCard")
	private Customer customer;
	
	
	
	
	public String getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardPin() {
		return cardPin;
	}
	public void setCardPin(String cardPin) {
		this.cardPin = cardPin;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Integer getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(Integer cvvNo) {
		this.cvvNo = cvvNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}

package com.snehil.basic.presentation;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.snehil.basic.dao.MyConnection;
import com.snehil.basic.entity.Account;
import com.snehil.basic.entity.AtmCard;
import com.snehil.basic.entity.Customer;

public class CustomerDummyData {

	public static void main(String[] args) {
		EntityManager entityManager = MyConnection.getEntityManagerObject();
		EntityTransaction  entityTransaction =  entityManager.getTransaction();
		
		Account account1 = new Account(); 
		account1.setAccountNo("6545858912000099");
		account1.setAccountType("Saving");
		account1.setOpeningDate("2023-01-12");
		account1.setAccountStatus("Active");
		account1.setIfscCode("UBON5623897");
		account1.setBranchCode("568923");
		account1.setBranchAddress("Noida");
		account1.setBalance(20000);
		
		
		Account account3 = new Account(); 
		account3.setAccountNo("6545858912000021");
		account3.setAccountType("Saving");
		account3.setOpeningDate("2023-01-12");
		account3.setAccountStatus("Active");
		account3.setIfscCode("UBON5623897");
		account3.setBranchCode("568923");
		account3.setBranchAddress("Noida");
		account3.setBalance(20000);
		
		
		Account account4 = new Account(); 
		account4.setAccountNo("6545858912000022");
		account4.setAccountType("Current");
		account4.setOpeningDate("2023-01-12");
		account4.setAccountStatus("Active");
		account4.setIfscCode("UBON5623897");
		account4.setBranchCode("568923");
		account4.setBranchAddress("Noida");
		account4.setBalance(20000);
		
		Account account5 = new Account(); 
		account5.setAccountNo("6545858912000023");
		account5.setAccountType("Saving");
		account5.setOpeningDate("2023-01-12");
		account5.setAccountStatus("Active");
		account5.setIfscCode("UBON5623897");
		account5.setBranchCode("568923");
		account5.setBranchAddress("Noida");
		account5.setBalance(20000);
		
		Account account6 = new Account(); 
		account6.setAccountNo("6545858912000024");
		account6.setAccountType("Current");
		account6.setOpeningDate("2023-01-12");
		account6.setAccountStatus("Active");
		account6.setIfscCode("UBON5623897");
		account6.setBranchCode("568923");
		account6.setBranchAddress("Noida");
		account6.setBalance(20000);
		
		Account account7 = new Account(); 
		account7.setAccountNo("6545858912000025");
		account7.setAccountType("Current");
		account7.setOpeningDate("2023-01-12");
		account7.setAccountStatus("Active");
		account7.setIfscCode("UBON5623897");
		account7.setBranchCode("568923");
		account7.setBranchAddress("Noida");
		account7.setBalance(20000);
		
		Account account8 = new Account(); 
		account8.setAccountNo("6545858912000026");
		account8.setAccountType("Current");
		account8.setOpeningDate("2023-01-12");
		account8.setAccountStatus("Active");
		account8.setIfscCode("UBON5623897");
		account8.setBranchCode("568923");
		account8.setBranchAddress("Noida");
		account8.setBalance(20000);
		
		Account account9 = new Account(); 
		account9.setAccountNo("6545858912000027");
		account9.setAccountType("Saving");
		account9.setOpeningDate("2023-01-12");
		account9.setAccountStatus("Active");
		account9.setIfscCode("UBON5623897");
		account9.setBranchCode("568923");
		account9.setBranchAddress("Noida");
		account9.setBalance(20000);
		
		Account account10 = new Account(); 
		account10.setAccountNo("6545858912000028");
		account10.setAccountType("Current");
		account10.setOpeningDate("2023-01-12");
		account10.setAccountStatus("Active");
		account10.setIfscCode("UBON5623897");
		account10.setBranchCode("568923");
		account10.setBranchAddress("Noida");
		account10.setBalance(20000);
		
		Account account11 = new Account(); 
		account11.setAccountNo("6545858912000029");
		account11.setAccountType("Current");
		account11.setOpeningDate("2023-01-12");
		account11.setAccountStatus("Active");
		account11.setIfscCode("UBON5623897");
		account11.setBranchCode("568923");
		account11.setBranchAddress("Noida");
		account11.setBalance(20000);
		
		Account account12 = new Account(); 
		account12.setAccountNo("6545858912000030");
		account12.setAccountType("Saving");
		account12.setOpeningDate("2023-01-12");
		account12.setAccountStatus("Active");
		account12.setIfscCode("UBON5623897");
		account12.setBranchCode("568923");
		account12.setBranchAddress("Noida");
		account12.setBalance(20000);
		
		Account account13 = new Account(); 
		account13.setAccountNo("6545858912000031");
		account13.setAccountType("Current");
		account13.setOpeningDate("2023-01-12");
		account13.setAccountStatus("Active");
		account13.setIfscCode("UBON5623897");
		account13.setBranchCode("568923");
		account13.setBranchAddress("Noida");
		account13.setBalance(20000);
		
		Account account14 = new Account(); 
		account14.setAccountNo("6545858912000032");
		account14.setAccountType("Current");
		account14.setOpeningDate("2023-01-12");
		account14.setAccountStatus("Active");
		account14.setIfscCode("UBON5623897");
		account14.setBranchCode("568923");
		account14.setBranchAddress("Noida");
		account14.setBalance(20000);
		
		Account account15 = new Account(); 
		account15.setAccountNo("6545858912000033");
		account15.setAccountType("Current");
		account15.setOpeningDate("2023-01-12");
		account15.setAccountStatus("Active");
		account15.setIfscCode("UBON5623897");
		account15.setBranchCode("568923");
		account15.setBranchAddress("Noida");
		account15.setBalance(20000);
		
		Account account16 = new Account(); 
		account16.setAccountNo("6545858912000034");
		account16.setAccountType("Saving");
		account16.setOpeningDate("2023-01-12");
		account16.setAccountStatus("Active");
		account16.setIfscCode("UBON5623897");
		account16.setBranchCode("568923");
		account16.setBranchAddress("Noida");
		account16.setBalance(20000);
		
		Account account17 = new Account(); 
		account17.setAccountNo("6545858912000035");
		account17.setAccountType("Current");
		account17.setOpeningDate("2023-01-12");
		account17.setAccountStatus("Active");
		account17.setIfscCode("UBON5623897");
    	account17.setBranchCode("568923");
		account17.setBranchAddress("Noida");
		account17.setBalance(20000);
		
		Account account18 = new Account(); 
		account18.setAccountNo("6545858912000036");
		account18.setAccountType("Saving");
		account18.setOpeningDate("2023-01-12");
		account18.setAccountStatus("Active");
		account18.setIfscCode("UBON5623897");
		account18.setBranchCode("568923");
		account18.setBranchAddress("Noida");
		account18.setBalance(20000);
		
		
		Account account19 = new Account(); 
		account19.setAccountNo("6545858912000037");
		account19.setAccountType("Current");
		account19.setOpeningDate("2023-01-12");
		account19.setAccountStatus("Active");
		account19.setIfscCode("UBON5623897");
		account19.setBranchCode("568923");
		account19.setBranchAddress("Noida");
		account19.setBalance(20000);
		
		Account account20 = new Account(); 
		account20.setAccountNo("6545858912000038");
		account20.setAccountType("saving");
		account20.setOpeningDate("2023-01-12");
		account20.setAccountStatus("Active");
		account20.setIfscCode("UBON5623897");
		account20.setBranchCode("568923");
		account20.setBranchAddress("Noida");
		account20.setBalance(20000);
		
		Account account21 = new Account(); 
		account21.setAccountNo("6545858912000039");
		account21.setAccountType("Current");
		account21.setOpeningDate("2023-01-12");
		account21.setAccountStatus("Active");
		account21.setIfscCode("UBON5623897");
		account21.setBranchCode("568923");
		account21.setBranchAddress("Noida");
		account21.setBalance(20000);
		
		List<Account> cc= List.of(account1);
		List<Account> an1= List.of(account3);
		List<Account> an2= List.of(account4);
		List<Account> an3= List.of(account5);
		List<Account> an4= List.of(account6);
		List<Account> an5= List.of(account7);
		List<Account> an6= List.of(account8);
		List<Account> an7= List.of(account9);
		List<Account> an8= List.of(account10);
		List<Account> an9= List.of(account11);
		List<Account> an10= List.of(account12);
		List<Account> an11= List.of(account13);
		List<Account> an12= List.of(account14);
		List<Account> an13= List.of(account15);
		List<Account> an14= List.of(account16);
		List<Account> an15= List.of(account17);
		List<Account> an16= List.of(account18);
		List<Account> an17= List.of(account19);
		List<Account> an18= List.of(account20);
		List<Account> an19= List.of(account21);
		
		Customer customer1 = new Customer();
		
		customer1.setAccount(cc);
		customer1.setCustomerId("2225623");
		customer1.setAddress("Siya villa");
		customer1.setCustomerName("Siya");
		customer1.setEmail("siya123@gmail.com");
		customer1.setGender("Female");
		customer1.setCustDob("2001-06-03");
		customer1.setPhoneNo("9987632321");
		customer1.setAaccount(account1);
		
		AtmCard atmCard1=new AtmCard();
		atmCard1.setCardNo("1111222233334444");
		atmCard1.setCardPin("1001");
		atmCard1.setIssueDate(LocalDate.now().toString());
		atmCard1.setExpiryDate("2025-06-22");
		atmCard1.setCvvNo(255);
		atmCard1.setCardStatus("Active");
		customer1.setAtmCard(atmCard1);
	
		Customer customer2 = new Customer();
		customer2.setCustomerId("2225645");
		customer2.setAccount(an1);
		customer2.setAddress("Riya villa");
		customer2.setCustomerName("Riya");
		customer2.setEmail("riya1723@gmail.com");
		customer2.setGender("Female");
		customer2.setCustDob("2000-08-09");
		customer2.setPhoneNo("9964322232");
		customer2.setAaccount(account3);
		
		
        AtmCard atmCard2=new AtmCard();
		
		atmCard2.setCardNo("5555666677778888");
		atmCard2.setCardPin("1002");
		atmCard2.setIssueDate(LocalDate.now().toString());
		atmCard2.setExpiryDate("2025-06-22");
		atmCard2.setCvvNo(568);
		atmCard2.setCardStatus("Active");
		customer2.setAtmCard(atmCard2);
		
		Customer customer3 = new Customer();
		customer3.setCustomerId("2225612");
		customer3.setAccount(an2);
		customer3.setAddress("Ram villa");
		customer3.setCustomerName("Ram");
		customer3.setEmail("ram293@gmail.com");
		customer3.setGender("Male");
		customer3.setCustDob("2002-02-09");
		customer3.setPhoneNo("9923863433");
		customer3.setAaccount(account4);
		
        AtmCard atmCard3=new AtmCard();
		
		atmCard3.setCardNo("1111555566668888");
		atmCard3.setCardPin("1003");
		atmCard3.setIssueDate(LocalDate.now().toString());
		atmCard3.setExpiryDate("2025-06-22");
		atmCard3.setCvvNo(502);
		atmCard3.setCardStatus("Active");
		customer3.setAtmCard(atmCard3);
		
		Customer customer4 = new Customer();
		customer4.setCustomerId("2225613");
		customer4.setAccount(an3);
		customer4.setAddress("Raj villa");
		customer4.setCustomerName("Raj");
		customer4.setEmail("raj1273@gmail.com");
		customer4.setGender("Male");
		customer4.setCustDob("2002-01-02");
		customer4.setPhoneNo("9965676954");
		customer4.setAaccount(account5);
		
        AtmCard atmCard4=new AtmCard();
		atmCard4.setCardNo("8888555522229999");
		atmCard4.setCardPin("1004");
		atmCard4.setIssueDate(LocalDate.now().toString());
		atmCard4.setExpiryDate("2025-06-22");
		atmCard4.setCvvNo(528);
		atmCard4.setCardStatus("Active");
		customer4.setAtmCard(atmCard4);
		
		Customer customer5 = new Customer();
		customer5.setCustomerId("2225614");
		customer5.setAccount(an4);
		customer5.setAddress("Ravi villa");
		customer5.setCustomerName("Ravi");
		customer5.setEmail("ravi273@gmail.com");
		customer5.setGender("Male");
		customer5.setCustDob("2009-05-06");
		customer5.setPhoneNo("9964452235");
		customer5.setAaccount(account6);
		
        AtmCard atmCard5=new AtmCard();
		atmCard5.setCardNo("1111333388884444");
		atmCard5.setCardPin("1005");
		atmCard5.setIssueDate(LocalDate.now().toString());
		atmCard5.setExpiryDate("2025-06-22");
		atmCard5.setCvvNo(894);
		atmCard5.setCardStatus("Active");
		customer5.setAtmCard(atmCard5);
		
		Customer customer6 = new Customer();
		customer6.setCustomerId("2225616");
		customer6.setAccount(an5);
		customer6.setAddress("Rima villa");
		customer6.setCustomerName("Rima");
		customer6.setEmail("rima1256@gmail.com");
		customer6.setGender("Female");
		customer6.setCustDob("2000-12-05");
		customer6.setPhoneNo("9969882236");
		customer6.setAaccount(account7);
		
        AtmCard atmCard6=new AtmCard();
		atmCard6.setCardNo("1111888855551111");
		atmCard6.setCardPin("1011");
		atmCard6.setIssueDate(LocalDate.now().toString());
		atmCard6.setExpiryDate("2025-06-22");
		atmCard6.setCvvNo(123);
		atmCard6.setCardStatus("Active");
		customer6.setAtmCard(atmCard6);
		
		Customer customer7 = new Customer();
		customer7.setCustomerId("2225627");
		customer7.setAccount(an6);
		customer7.setAddress("Nisa villa");
		customer7.setCustomerName("Nisa");
		customer7.setEmail("nisa1983@gmail.com");
		customer7.setGender("Female");
		customer7.setCustDob("2000-08-12");
		customer7.setPhoneNo("9964326787");
		customer7.setAaccount(account8);
		
        AtmCard atmCard7=new AtmCard();
		atmCard7.setCardNo("5555222244448888");
		atmCard7.setCardPin("1007");
		atmCard7.setIssueDate(LocalDate.now().toString());
		atmCard7.setExpiryDate("2025-06-22");
		atmCard7.setCvvNo(741);
		atmCard7.setCardStatus("Active");
		customer7.setAtmCard(atmCard7);
		
		Customer customer8 = new Customer();
		customer8.setCustomerId("2225617");
		customer8.setAccount(an7);
		customer8.setAddress("Amarvilla");
		customer8.setCustomerName("Amar");
		customer8.setEmail("amar133@gmail.com");
		customer8.setGender("Male");
		customer8.setCustDob("2001-11-24");
		customer8.setPhoneNo("9964322878");
		customer8.setAaccount(account9);
		
        AtmCard atmCard8=new AtmCard();
		atmCard8.setCardNo("5555222244443333");
		atmCard8.setCardPin("1008");
		atmCard8.setIssueDate(LocalDate.now().toString());
		atmCard8.setExpiryDate("2025-06-22");
		atmCard8.setCvvNo(558);
		atmCard8.setCardStatus("Active");
		customer8.setAtmCard(atmCard8);
		
		Customer customer9 = new Customer();
		customer9.setCustomerId("2225618");
		customer9.setAccount(an8);
		customer9.setAddress("Abhinav villa");
		customer9.setCustomerName("Abhinav");
		customer9.setEmail("abhinav123@gmail.com");
		customer9.setGender("Male");
		customer9.setCustDob("2002-08-15");
		customer9.setPhoneNo("9964329739");
		customer9.setAaccount(account10);
		
        AtmCard atmCard9=new AtmCard();
		atmCard9.setCardNo("5555222277776666");
		atmCard9.setCardPin("1009");
		atmCard9.setIssueDate(LocalDate.now().toString());
		atmCard9.setExpiryDate("2025-06-22");
		atmCard9.setCvvNo(326);
		atmCard9.setCardStatus("Active");
		customer9.setAtmCard(atmCard9);
		
		Customer customer10 = new Customer();
		customer10.setCustomerId("2225610");
		customer10.setAccount(an9);
		customer10.setAddress("Akash villa");
		customer10.setCustomerName("Akash");
		customer10.setEmail("akash123@gmail.com");
		customer10.setGender("Male");
		customer10.setCustDob("2001-02-16");
		customer10.setPhoneNo("9964762891");
		customer10.setAaccount(account11);
		
        AtmCard atmCard10=new AtmCard();
		atmCard10.setCardNo("1111666688882222");
		atmCard10.setCardPin("1010");
		atmCard10.setIssueDate(LocalDate.now().toString());
		atmCard10.setExpiryDate("2025-06-22");
		atmCard10.setCvvNo(369);
		atmCard10.setCardStatus("Active");
		customer10.setAtmCard(atmCard10);
		
		Customer customer11 = new Customer();
		customer11.setCustomerId("2225671");
		customer11.setAccount(an10);
		customer11.setAddress("Ashish villa");
		customer11.setCustomerName("Tanu");
		customer11.setEmail("tanu123@gmail.com");
		customer11.setGender("Female");
		customer11.setCustDob("2002-02-18");
		customer11.setPhoneNo("9964376232");
		customer11.setAaccount(account12);
		
        AtmCard atmCard11=new AtmCard();
		atmCard11.setCardNo("4444333322221111");
		atmCard11.setCardPin("1019");
		atmCard11.setIssueDate(LocalDate.now().toString());
		atmCard11.setExpiryDate("2025-06-22");
		atmCard11.setCvvNo(159);
		atmCard11.setCardStatus("Active");
		customer11.setAtmCard(atmCard11);
		
		Customer customer12 = new Customer();
		customer12.setCustomerId("2225615");
		customer12.setAccount(an11);
		customer12.setAddress("Mani villa");
		customer12.setCustomerName("Mani");
		customer12.setEmail("mani123@gmail.com");
		customer12.setGender("Male");
		customer12.setCustDob("2003-08-13");
		customer12.setPhoneNo("9964327234");
		customer12.setAaccount(account13);
		
        AtmCard atmCard12=new AtmCard();
		atmCard12.setCardNo("8888999977775555");
		atmCard12.setCardPin("1012");
		atmCard12.setIssueDate(LocalDate.now().toString());
		atmCard12.setExpiryDate("2025-06-22");
		atmCard12.setCvvNo(567);
		atmCard12.setCardStatus("Active");
		customer12.setAtmCard(atmCard12);
		
		Customer customer13 = new Customer();
		customer13.setCustomerId("2225619");
		customer13.setAccount(an12);
		customer13.setAddress("Sima villa");
		customer13.setCustomerName("Sima");
		customer13.setEmail("sima193@gmail.com");
		customer13.setGender("Female");
		customer13.setCustDob("2002-06-13");
		customer13.setPhoneNo("9964327692");
		customer13.setAaccount(account14);
		
        AtmCard atmCard13=new AtmCard();
		atmCard13.setCardNo("1111555522224444");
		atmCard13.setCardPin("1013");
		atmCard13.setIssueDate(LocalDate.now().toString());
		atmCard13.setExpiryDate("2025-06-22");
		atmCard13.setCvvNo(224);
		atmCard13.setCardStatus("Active");
		customer13.setAtmCard(atmCard13);
		
		Customer customer14 = new Customer();
		customer14.setCustomerId("2225611");
		customer14.setAccount(an13);
		customer14.setAddress("Ziya villa");
		customer14.setCustomerName("Ziya");
		customer14.setEmail("ziya123@gmail.com");
		customer14.setGender("Female");
		customer14.setCustDob("2001-02-14");
		customer14.setPhoneNo("9964329834");
		customer14.setAaccount(account15);
		
        AtmCard atmCard14=new AtmCard();
		atmCard14.setCardNo("5555888866662222");
		atmCard14.setCardPin("1014");
		atmCard14.setIssueDate(LocalDate.now().toString());
		atmCard14.setExpiryDate("2025-06-22");
		atmCard14.setCvvNo(258);
		atmCard14.setCardStatus("Active");
		customer14.setAtmCard(atmCard14);
		
		Customer customer15 = new Customer();
		customer15.setCustomerId("2325613");
		customer15.setAccount(an14);
		customer15.setAddress("Anu villa");
		customer15.setCustomerName("Anu");
		customer15.setEmail("anu423@gmail.com");
		customer15.setGender("Female");
		customer15.setCustDob("2000-08-04");
		customer15.setPhoneNo("9964327986");
		customer15.setAaccount(account16);
		
        AtmCard atmCard15=new AtmCard();
		atmCard15.setCardNo("1111000055552222");
		atmCard15.setCardPin("1015");
		atmCard15.setIssueDate(LocalDate.now().toString());
		atmCard15.setExpiryDate("2025-06-22");
		atmCard15.setCvvNo(561);
		atmCard15.setCardStatus("Active");
		atmCard15.setCustomer(customer15);
		customer15.setAtmCard(atmCard15);
	
		Customer customer16 = new Customer();
		customer16.setCustomerId("2225235");
		customer16.setAccount(an15);
		customer16.setAddress("Ankur villa");
		customer16.setCustomerName("Ankur");
		customer16.setEmail("ankur423@gmail.com");
		customer16.setGender("Male");
		customer16.setCustDob("2002-05-06");
		customer16.setPhoneNo("9964398767");
		customer16.setAaccount(account17);
		
		Customer customer17 = new Customer();
		customer17.setCustomerId("2225659");
		customer17.setAccount(an16);
		customer17.setAddress("Virat villa");
		customer17.setCustomerName("Virat");
		customer17.setEmail("virat653@gmail.com");
		customer17.setGender("Male");
		customer17.setCustDob("2003-05-06");
		customer17.setPhoneNo("9964827872");
		customer17.setAaccount(account18);
		
		Customer customer18 = new Customer();
		customer18.setCustomerId("2225568");
		customer18.setAccount(an17);
		customer18.setAddress("Rajan villa");
		customer18.setCustomerName("Rajam");
		customer18.setEmail("rajam23@gmail.com");
		customer18.setGender("Male");
		customer18.setCustDob("2001-02-15");
		customer18.setPhoneNo("9964329834");
		customer18.setAaccount(account19);
		
		Customer customer19 = new Customer();
		customer19.setCustomerId("2225236");
		customer19.setAccount(an18);
		customer19.setAddress("Mansi villa");
		customer19.setCustomerName("Mansi");
		customer19.setEmail("mansi123@gmail.com");
		customer19.setGender("Female");
		customer19.setCustDob("2002-11-05");
		customer19.setPhoneNo("9964327562");
		customer19.setAaccount(account20);
		
		Customer customer20 = new Customer();
		customer20.setCustomerId("2225897");
		customer20 = new Customer();
		customer20.setAccount(an19);
		customer20.setAddress("Navin villa");
		customer20.setCustomerName("Mani");
		customer20.setEmail("mani123@gmail.com");
		customer20.setGender("Male");
		customer20.setCustDob("2003-09-18");
		customer20.setPhoneNo("9964327981");
		customer20.setAaccount(account21);
		
		account1.setCustomer(customer1);
		account3.setCustomer(customer2);
		account4.setCustomer(customer3);
		account5.setCustomer(customer4);
		account6.setCustomer(customer5);
		account7.setCustomer(customer6);
		account8.setCustomer(customer7);
		account9.setCustomer(customer8);
		account10.setCustomer(customer9);
		account11.setCustomer(customer10);
		account12.setCustomer(customer11);
		account13.setCustomer(customer12);
		account14.setCustomer(customer13);
		account15.setCustomer(customer14);
		account16.setCustomer(customer15);
		account17.setCustomer(customer16);
		account18.setCustomer(customer17);
		account19.setCustomer(customer18);
		account20.setCustomer(customer19);
		account21.setCustomer(customer20);
		
		entityTransaction.begin();
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		entityManager.persist(customer3);
		entityManager.persist(customer4);
		entityManager.persist(customer5);
		entityManager.persist(customer6);
		entityManager.persist(customer7);
		entityManager.persist(customer8);
		entityManager.persist(customer9);
		entityManager.persist(customer10);
		entityManager.persist(customer11);
		entityManager.persist(customer12);
		entityManager.persist(customer13);
		entityManager.persist(customer14);
		entityManager.persist(customer15);
		entityManager.persist(customer16);
		entityManager.persist(customer17);
		entityManager.persist(customer18);
		entityManager.persist(customer19);
		
		entityTransaction.commit();
		
		System.out.println("Save Object..........");
	}
}
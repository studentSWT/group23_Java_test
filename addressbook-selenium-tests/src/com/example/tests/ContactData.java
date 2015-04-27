package com.example.tests;

public class ContactData {
	public String firstName;
	public String lastName;
	public String address1;
	public String phoneHome;
	public String phoneMobile;
	public String phoneWork;
	public String email1;
	public String email2;
	public String bDay;
	public String bMonth;
	public String bYear;
	public String address2;
	public String phoneHome2;

	public ContactData(){ 
	}
	
	public ContactData(String firstName, String lastName, String address1,
			String phoneHome, String phoneMobile, String phoneWork,
			String email1, String email2, String bDay, String bMonth,
			String bYear, String address2, String phoneHome2) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address1 = address1;
		this.phoneHome = phoneHome;
		this.phoneMobile = phoneMobile;
		this.phoneWork = phoneWork;
		this.email1 = email1;
		this.email2 = email2;	
		this.bDay = bDay;
		this.bMonth = bMonth;
		this.bYear = bYear;
		this.address2 = address2;
		this.phoneHome2 = phoneHome2;
	}
}
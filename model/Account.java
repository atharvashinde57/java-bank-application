package com.vilgax.bankapplication.model;

public class Account {

	
	private int accountNo;
	private String name;
	private long password;
	private int adharNo;
	private String panNo;
	private String email;
	private long contactNo;
	private double accountBalance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int i) {
		this.accountNo = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public void setAadharCard(String next) {
		// TODO Auto-generated method stub
		
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
	    this.password = password;
	}

	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", adharNo=" + adharNo
				+ ", panNo=" + panNo + ", email=" + email + ", contactNo=" + contactNo + ", accountBalance="
				+ accountBalance + "]";
	}
	
		
	}
	
	
	
	


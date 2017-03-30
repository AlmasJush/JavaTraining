package com.ocajp7.mexk;

import java.math.BigDecimal;
import java.util.Locale;

public class Customer {

	private String name;
	private int accountNum;
	private Locale locale;
	private BigDecimal balance;
	
	public Customer(){
		this.name = "Default Name";
		this.accountNum = 12345;
		this.locale = Locale.ITALY;
		this.balance = new BigDecimal("0");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("Name can't be null");
		}else{
			this.name = name;
		}
	}
	
	public int getAccountNum(){
		return accountNum;
	}
	public void setAccountNum(int accountNum){
		this.accountNum = accountNum;
	}
	
	public BigDecimal getBalance(){
		return balance;
	}
	
	public void setBalance(float balance){
		this.balance = new BigDecimal(balance);
	}
	
	public String toString(){
		java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(locale);
		StringBuilder value = new StringBuilder();
		value.append(String.format("Name: %s%n", this.name));
		value.append(String.format("Account Number: %d%n", this.accountNum));
		value.append(String.format("Balance: %s%n", format.format(this.balance)));
		return value.toString();
		
	}
	
} // end of class

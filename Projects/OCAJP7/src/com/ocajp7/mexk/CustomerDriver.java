package com.ocajp7.mexk;

public class CustomerDriver {

	public static void main(String[] args) {

		// create a new customer object
		Customer cust = new Customer();
		cust.setBalance(12506.06f);
		
		System.out.println(cust.toString());
	}

}

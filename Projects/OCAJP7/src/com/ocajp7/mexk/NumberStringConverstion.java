package com.ocajp7.mexk;

public class NumberStringConverstion {

	public static void main(String[] args) {

		//convert number to string
		String s1 = String.valueOf(303);
		String s2 = String.valueOf(3.0253);
		System.out.println(s1 + " " + s2); 
		
		System.out.println();
		// conver string to number
		int num1 = Integer.valueOf("303").intValue();
		double num2 = Double.valueOf("3.0023").doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		
		// use parseInt or parseDouble methods
		num1 = Integer.parseInt("3003");
		num2 = Double.parseDouble("30.03");
		System.out.println(num1 + " " + num2);
	}

}

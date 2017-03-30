package com.ocajp7.mexk;

public class MiscellaneousStringMthds {

	public static void main(String[] args) {

		String str1 = " The white bear ";
		String newStr;
		
		newStr = str1.replace(' ', '.');
		System.out.println(newStr);
		
		newStr = str1.toLowerCase();
		System.out.println(newStr);
		
		newStr = str1.toUpperCase();
		System.out.println(newStr); 
		
		newStr = str1.trim();
		System.out.println("["+newStr+"]");
	}

}

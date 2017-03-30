package com.ocajp7.mexk;

public class BasicStringMethods {

	public static void main(String[] args) {

		String str = "Hyland";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.substring(3, 5));
		System.out.println(str.substring(2));
		
		System.out.println();
		
		String location = "Irene";
		System.out.println(location.indexOf('I'));
		System.out.println(location.indexOf('e'));
		System.out.println(location.lastIndexOf('e')); 
		
	}

}

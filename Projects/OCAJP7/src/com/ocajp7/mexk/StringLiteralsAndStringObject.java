package com.ocajp7.mexk;

public class StringLiteralsAndStringObject {

	public static void main(String[] args) {

		String _firstLiteral = "Albania";
		String $secondLiteral = "Albania";
		String strObject = new String("Albania");
		
		if(_firstLiteral == $secondLiteral){
			System.out.println("They are equal");
		}else{
			System.out.println("Not equal");
		}
		
		if($secondLiteral == strObject){
			System.out.println("literal equals to object");
		}else{
			System.out.println("Object never equals to String literal");
		}
		
		System.out.println();
		
		String location = "Karmay city";
		if(location.equals("karmay city")){
			System.out.println(location + "equals 'city' ");
		}else{
			System.out.println(location + " does not equal to 'karmay city'");
		}
		if(location.equalsIgnoreCase("karmay city")){
			System.out.println(location + " equals 'karmay city'");
		}else{
			System.out.println(location + "does not equal");
		}
		if(location.endsWith("City")){
			System.out.println(location + " ends with 'city'");
		}else{
			System.out.println(location + " does not end with 'city'");
		}
	}

}

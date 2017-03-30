package com.ocajp7.mexk;

public class ListOfVariablesOfSystem {

	public static void main(String[] args) {

		java.util.Properties properties = System.getProperties();

		properties.list(System.out); 
		
	}

}

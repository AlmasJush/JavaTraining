package com.mexk.almas.skillsoft;

import java.util.ArrayList;

public class RemoveElementFromArrayList {

	public static void display(ArrayList<String> al){
		for (String item : al){
			System.out.println("Original names : " + item);
		}
		
	}
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tursun weilai");
		names.add("Ghalip awak");
		names.add("Turghun turuap");
		names.add("Sattar Reyim");
		display(names);
		System.out.println();
		
		names.remove(2);
		display(names);
		System.out.println();
		
		String name = "Ghalip awak";
		names.remove(name);
		display(names);
	
	}

}

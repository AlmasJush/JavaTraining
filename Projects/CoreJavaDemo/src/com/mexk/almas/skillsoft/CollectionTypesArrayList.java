package com.mexk.almas.skillsoft;

import java.util.ArrayList;
public class CollectionTypesArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=1; i<11; ++i){
			numbers.add(i);
		}
		System.out.println("++i is = " + numbers); 
		
		int sum = 0;
		for (int num : numbers){
			sum = sum + num;
			}
		System.out.println("Total is : " + sum); 
	}

}

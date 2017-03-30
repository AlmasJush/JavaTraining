package com.mexk.almas.skillsoft;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseMinMax {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int num;
		for (int i=0; i<10; i++){
			num = (int)(Math.random()*100 + 1);
			numbers.add(num);
		}
		//below sysout display numbers in brackets
		//System.out.println("Numbers ArrayList values are : " + numbers); 
		
		for (int n : numbers){
			System.out.print(n + " "); 
		}
		
		Collections.reverse(numbers);
		System.out.println();
		
		for (int n : numbers){
			System.out.print(n + " ");
		}
		System.out.println(); 
		System.out.println("Minimum value is = " + Collections.min(numbers)); 
		System.out.println("Maximum value is = " + Collections.max(numbers)); 
	}

}

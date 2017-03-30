package com.ocajp7.mexk;

public class ManyVariablesOfArgument {

	public static void main(String[] args) {

		System.out.println(largest(12, -12, 45, 2, 8957, 12));
		System.out.println(largest(-12, -584, -54, -5, -487)); 
		//System.out.println(largest()); 
	}

	public static int largest(int ... numbers) {
		
		int currentLargest = numbers[0];
		for(int num : numbers){
			if(num > currentLargest){
				currentLargest = num;
			}
		}
		return currentLargest;
	}

}

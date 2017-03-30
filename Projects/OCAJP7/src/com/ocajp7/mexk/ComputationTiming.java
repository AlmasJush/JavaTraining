package com.ocajp7.mexk;

public class ComputationTiming {

	public static void main(String[] args) {
		int [] age = new int[5];
		int total =0;
		float average;
		age[0] = 22;
		age[1] = 20;
		age[2] = 19;
		age[3] = 18;
		age[4] = 23;
		
		for (int num : age){
			total = total + num;
		}

		average = total / (age.length)*1.0f;
	
		System.out.println(average); 	
	
	
	}

	
	
}

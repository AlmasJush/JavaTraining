package com.ocajp7.mexk;

public class ForLoopVariation {

	public static void main(String[] args) {

		// no initial operation and terminal condition(end loop operation)
		
		int i=0;
		for(; i<5;){
			i++;
			System.out.println(i);
		}
		 
		// enhanced for loop
		int num[] = new int[6];
		// add values to num 
		for(int j=0; j<6; j++){
			num[j] = j;
		}
		for(int element : num){
			System.out.print(element + " ");
		}
		
	}

}

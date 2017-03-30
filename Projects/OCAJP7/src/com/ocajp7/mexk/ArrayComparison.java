package com.ocajp7.mexk;

public class ArrayComparison {

	public static void main(String[] args) {
		
		boolean areEqual = true;
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		for(int i=0; i<5; i++){
			arr1[i] = 0;
			arr2[i] = 0;
		
			
			if(arr1[i] != arr2[i]){
				areEqual = false;
			}
		
		}
		System.out.println(areEqual); 
	}

}

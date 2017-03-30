package com.ocajp7.mexk;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		StringBuilder[] arr3 = new StringBuilder[4];
		arr3[0] = new StringBuilder("Pine");
		arr3[1] = new StringBuilder("Oak");
		arr3[2] = new StringBuilder("Maple");
		arr3[3] = new StringBuilder("Walnut");
		
		StringBuilder[] arr4 = new StringBuilder[4];
		
		System.arraycopy(arr3, 0, arr4, 0, 4); 
		
		//for(int i=0; i<arr4.length; i++){
		System.out.println("Arr3: " + Arrays.toString(arr3));  
		System.out.println();
		System.out.println(Arrays.toString(arr4) );  
		
		
	}

}

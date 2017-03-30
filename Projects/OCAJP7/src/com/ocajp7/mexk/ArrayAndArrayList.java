package com.ocajp7.mexk;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {

		int[] arr1 = new int[5];
		ArrayList list = new ArrayList();
		list.add("item1");
		list.add("item2");
		
		Object[] arr2 = {"item3", new Integer(7), list};
		String[] arr3 = {"Oak", "Pine", "Pear", "Walnut"};
		
		Arrays.fill(arr1, 6); 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.asList(arr3)); 
		System.out.println(Arrays.deepToString(arr2)); 
		
		
		
	}

}

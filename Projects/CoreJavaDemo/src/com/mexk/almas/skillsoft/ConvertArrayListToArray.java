package com.mexk.almas.skillsoft;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=1; i<1001; i++){
			numbers.add(i);
		}
		//System.out.println(numbers);
		
		Integer[] nums = numbers.toArray(new Integer[numbers.size()]);
		for (int i=0; i<nums.length; ++i){
			System.out.print(nums[i] + ", ");
			//System.out.println("Array of Nums is " + nums[i]); 
		}
	}

}

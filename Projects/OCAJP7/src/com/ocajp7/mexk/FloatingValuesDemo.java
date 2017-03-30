package com.ocajp7.mexk;

public class FloatingValuesDemo {

	public static void main(String[] args) {
		
		float num1 = 0.0f;
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println(Float.POSITIVE_INFINITY);
		
		System.out.println(0 == -0); 
		
		double num2 = 1.2f;
		double num3 = 0.2f;
		System.out.println(num2/num3); 
		
		float epsilon = 0.000001f;
		if(Math.abs(num2/num3)-6 < epsilon){
			System.out.println("EQUAL");
		}else{
			System.out.println("NOT equal..");
		}
		
		//System.out.println(new Float(-2.0f).compareTo(-0.0f));
		
		System.out.println(4%3);
		
		System.out.println(16 >>> 3);
	}

}

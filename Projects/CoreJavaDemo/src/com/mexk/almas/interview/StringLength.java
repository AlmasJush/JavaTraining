package com.mexk.almas.interview;

public class StringLength {

	static int i, c, res;
	
	static int length(String s){
		try{
		for(i=0, c=0; i>=0; i++, c++){
			s.charAt(i);
		}
		} catch (Exception e){
			System.out.print(" Length is = ");
			//e.printStackTrace();
		}
		return c;
	}
	
	public static void main(String[] args) {

		System.out.print("Original string is = ");
		System.out.println("Alive is awesome ");
		
		res = StringLength.length("Alive is awesome ");
		System.out.println(res); 
	}

}

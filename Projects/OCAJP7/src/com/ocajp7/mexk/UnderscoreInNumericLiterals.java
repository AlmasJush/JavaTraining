package com.ocajp7.mexk;

public class UnderscoreInNumericLiterals {

		// underscores can be used for explicitely to ease of eyes for spacing. it won't affect the code 
		static long ssn = 111_22_3333L;
	
	public static void main(String[] args) {

		//System.out.println(ssn); 
		
		// add dash (-) between numbers in ssn as to display in formatted way, like 111-22-3333 
		String formattedSsn = Long.toString(ssn);
		
		for(int i=0; i<formattedSsn.length(); i++){
			
			System.out.print(formattedSsn.charAt(i));
			
			if (i == 2 || i == 4){
				System.out.print("-");
			}
			
			
		}
		
		
		
	}

}

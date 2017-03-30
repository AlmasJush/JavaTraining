package com.mexk.almas.interview;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		System.out.println("pls enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char ch = firstNonRepeatedChar(s);
		System.out.println("First non repeated character is = " + ch); 
	}

	public static Character firstNonRepeatedChar(String str){
		
		HashMap<Character, Integer> charHashTable = new HashMap<Character, Integer>();
		int i;
		Character ch;

		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (charHashTable.containsKey(ch)) {
				charHashTable.put(ch, charHashTable.get(ch) + 1);
			} else {
				charHashTable.put(ch, 1);
			}
		}
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (charHashTable.get(ch) == 1) 
				return ch;
		}
		//return 0;
		return null;
	}
	
	
}

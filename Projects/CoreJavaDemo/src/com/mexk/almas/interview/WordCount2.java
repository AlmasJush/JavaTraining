package com.mexk.almas.interview;

import java.util.*;

public class WordCount2 {

	static int count = 0;
	public static int wordCount(String s){
		
		char[] words = new char[s.length()];
		
		for (int i=0; i<s.length(); i++){
			
			words[i] = s.charAt(i);
			
			if(((i>0) && words[i] != ' '&& (words[i-1] == ' ')) || ((words[0] != ' ') && (i==0))){
				count++;
			}
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {

		String str = "ghelbe kilix kerek";
		System.out.println("The number of words are = " + wordCount(str));
	}

}

package com.mexk.almas.skillsoft;

import java.util.regex.*;

public class RegexFindStringSpaces {

	public static void main(String[] args) {

		String words = "90 percent of effort in 100 percent of the time";
		String pattn = "\\s+";
		//String pattn = "\\S+";
		// lower case s is search for spaces between words, + is find more, not stop after 
		// found first one. If it's become upper case S that means search for non-spaces
		
		Pattern pattern = Pattern.compile(pattn);
		Matcher match = pattern.matcher(words);
		System.out.println(words); 
		int counter = 0;
		while(match.find()){
			counter++;
		}
		System.out.println("Total space is = " + counter);
	}
 
}

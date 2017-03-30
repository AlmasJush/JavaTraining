package com.mexk.almas.interview;

public class WordCount {

	static int i, c = 0, res;
	
	static int wordcount(String s){
		
		char[] ch = new char[s.length()];
		
		for (i=0; i < s.length(); i++){
			ch[i] = s.charAt(i);
			if(( (i>0) && (ch[i] != ' ') && (ch[i-1] == ' ')) ||((ch[0] != ' ') && (i==0))){
				c++;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {

		res = WordCount.wordcount(" manchester united is also known as red devil");
		System.out.println("The number of words in the String are: " + res); 
		
	}

}

package com.mexk.almas.interview;

public class AphabetFrequency {

	public static void main(String[] args) {

		
		
	}
	
	public static void alphabetFrequency(String s){
		
		char[] ch = new char[s.length()];
		
		for(int i=0; i<s.length(); i++){
			ch[i] = s.charAt(i);
			
			for(int w=0; w<i; w++){
				char c = ch[w];
				 
				for(int j=w+1; j<w; j++){
					if(ch[j] == c){
						for(int k=j; k<(i-1);k++){
							ch[k] = ch[k+1];
							i--;
							j=w;
						}
					}
					
				}
				
			}
			
		}
	int[] t = new t[i];
	}
	

}

package com.ocajp7.mexk;

public class MultiLoops {

	public static void main(String[] args) {

		int i, j;
		for(i=1; i<4; i++){
			for(j=2; j<4; j++){
				if(j == 3){
					continue;
				}
				System.out.println("i: " + i + " j: " + j); 
			}
		}
		
	}

}

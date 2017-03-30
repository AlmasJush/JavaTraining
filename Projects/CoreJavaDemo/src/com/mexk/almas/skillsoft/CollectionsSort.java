package com.mexk.almas.skillsoft;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {

	public static void main(String[] args) {

		ArrayList<Integer> dbl = new ArrayList<Integer>();
		int db;
		for(int i=0; i<55; i++){
			db = (int)(Math.random() * 75 + 1);
			dbl.add(db);
		}
		for(int d : dbl){
			System.out.print(d + " "); 
		}
		System.out.println();
		
		Collections.sort(dbl); 
		System.out.println("After sort ");
		
		for(int d : dbl){
			System.out.print(d + " "); 
		}
		
	}

}

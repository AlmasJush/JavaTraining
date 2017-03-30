package com.mexk.almas.junit;

import org.junit.Test;

public class ParalelWhile {

	@Test
	public void whileTest(){
		
		int i = 0;
		while (i++ < 100) {
			System.out.println("While " + i ); 
		}
	}
	
}

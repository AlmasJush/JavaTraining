package com.mexk.almas.junit;

import org.junit.Test;

public class ParallelFor {

	@Test
	public void forTest(){
		for(int i=0; i<100; i++){
			System.out.println("For Loop " + i); 
		}
	}
	
}

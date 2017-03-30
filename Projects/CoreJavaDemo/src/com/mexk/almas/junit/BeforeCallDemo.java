package com.mexk.almas.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeCallDemo {

	@BeforeClass
	public static void showBeforeClass(){
		System.out.println("Before Class.");
	}
	
	@Before
	public void showBefore(){
		System.out.println("Before");
	}
	
	@Test
	public void showTest(){
		System.out.println("Test");
	}
	
	@Test
	public void showTest2(){
		System.out.println("Two");
	}
	
	@Test
	public void showTest3(){
		System.out.println("Three");
	}
	
	@After
	public void showAfter(){
		System.out.println("After");
	}
	
	@AfterClass
	public static void showAfterClass(){
		System.out.println("After Class");
	}
	
	
}

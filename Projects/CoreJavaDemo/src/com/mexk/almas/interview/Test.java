package com.mexk.almas.interview;

import java.util.*;

class Test {
	/*static String s = "Instance ";
	
	public static void method(StringBuffer sb){
		
		sb = new StringBuffer("Hai ");
		sb.append(" added");
	}*/

	public static void main(String args[]){
		
		StringBuffer sb = new StringBuffer(8);
		sb.append("TestString");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
	
}

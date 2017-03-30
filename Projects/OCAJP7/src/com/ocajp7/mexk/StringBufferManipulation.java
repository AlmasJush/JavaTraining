package com.ocajp7.mexk;

public class StringBufferManipulation {

	public static void main(String[] args) {

		StringBuffer buf = new StringBuffer();
		buf.append("World lass ");
		buf.append("buffering mechanism");
		buf.insert(6, "C");
		
		System.out.println(buf.toString());  
		
	}

}

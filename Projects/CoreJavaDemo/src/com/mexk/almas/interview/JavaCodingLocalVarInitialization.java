package com.mexk.almas.interview;

public class JavaCodingLocalVarInitialization {

	int x = 3;
	
	public static void main(String[] args) {
		new JavaCodingLocalVarInitialization().go1();
	}

	void go1(){
		int x;
		// go2(++x); this is the line of test!
	}
	
	void go2(int y){
		int x = ++y;
		System.out.println(x); 
	}
	// local variable x is not initialized, So will not compile..
}

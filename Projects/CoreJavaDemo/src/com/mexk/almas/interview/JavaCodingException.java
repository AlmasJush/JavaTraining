package com.mexk.almas.interview;

public class JavaCodingException {

	public static void main(String[] args) {
		javahungrymethod();
	}

	public static int javahungrymethod(){
		try{
			System.out.println("Try");
			int x = 4/0;
			return 10;
		}catch(Exception e){
			System.out.println("Exception");
		}
		finally{
			System.out.println("Finally");
			return 88;
		}
	}
	// finally block executes always. It will execute at LAST int try/catch/finally flow, irrespective
	// of flow of exception generation and handling
}

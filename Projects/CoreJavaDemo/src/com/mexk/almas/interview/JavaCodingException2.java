package com.mexk.almas.interview;

public class JavaCodingException2 {

	public static void main(String[] args) {
		javahungrymethod();
	}

	public static int javahungrymethod() {
		try {
			System.out.println("Try");
			return 10;
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
			return 88;
		}
	}
	// output is: Try, Finally. Since there is no exception thrown in catch block
}

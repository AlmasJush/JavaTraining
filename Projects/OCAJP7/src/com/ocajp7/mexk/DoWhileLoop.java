package com.ocajp7.mexk;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		int numOfDigits;
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		numOfDigits = 0;
		do{
			num /= 10;
			numOfDigits++;
		} while(num != 0);
		
		System.out.printf("Number of digits: %d%n", numOfDigits);
		
	}

}

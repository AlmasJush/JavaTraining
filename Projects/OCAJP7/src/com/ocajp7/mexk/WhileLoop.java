package com.ocajp7.mexk;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		int divisor = 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num = scanner.nextInt();
		
		while(num >= divisor){
			if(num % divisor != 0){
				System.out.printf("%d%n", divisor);
			}
			divisor++;
		}
		
		while(num > 0){
			sum += num;
			System.out.println("Please enter a number: ");
			num = scanner.nextInt();
		}
		System.out.println("The sum is: " + sum); 
	}

}

package com.ocajp7.mexk;

public class LogicalAndAnd {

	public static void main(String[] args) {
		
		if(evaluateThis() || evaluateThat()){
			System.out.println("The result is true");
		}else{
			System.out.println("The result is false.");
		}
		
//		evaluateThis();
//		evaluateThat();
	}

	private static boolean evaluateThis(){
		System.out.println("evaluateThis EXEcuted!!");
		return false;
	}

	private static boolean evaluateThat() {

		System.out.println("evaluateThat executed..");
		return false;
	}
}

package com.enthuware.mexk;

public class Beta extends Baap {

	public int h = 44;
	public int getH(){
		System.out.println("Beta " + h);
		return h;
	}
	
	public static void main(String[] args) {

		Baap b = new Beta();
		System.out.println(b.h + " " + b.getH());
		
		Beta bb = new Beta();
		System.out.println(bb.h + " " + bb.getH());
		
	}

}

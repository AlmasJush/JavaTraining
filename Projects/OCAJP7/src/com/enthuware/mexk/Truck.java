package com.enthuware.mexk;

public class Truck extends Automobile {

	public void drive(){
		System.out.println("Truck: drive ");
	}
	
	public static void main(String[] args) {

		Automobile a = new Automobile();
		Truck t = new Truck();
		
		a.drive();
		t.drive();
		a = t;
		a.drive();
	}

}

package com.enthuware.mexk;

public class Application {

	public static void main(String[] args) {

		start(new OrderManager());
	}
	
	static void start(CorbaComponent cc){
		cc.print();
	}

}

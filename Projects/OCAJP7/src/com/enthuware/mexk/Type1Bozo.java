package com.enthuware.mexk;

public class Type1Bozo implements Bozo {

	public Type1Bozo() {

		//type = 1;
	}
	
	@Override
	public void jump() {

		System.out.println("jumping... " + type);
	}

}

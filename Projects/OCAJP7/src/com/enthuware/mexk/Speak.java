package com.enthuware.mexk;

public class Speak {

	public static void main(String[] args) {

		Speak s = new GoodSpeak();
		
		//((Tone)s).up();
		
		((GoodSpeak)s).up();
	}

}

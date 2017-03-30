package com.enthuware.mexk;

public class Soccer extends Game {

	public void play(){
		System.out.println("Playing soccer...");
	}
	
	
	public static void main(String[] args) {
		
		Game g = new Soccer();
		//g.play();
		
		/*Soccer s =  (Soccer) new Game();
		s.play();*/
	}

}

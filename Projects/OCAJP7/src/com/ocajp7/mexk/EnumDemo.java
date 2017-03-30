package com.ocajp7.mexk;

public class EnumDemo {

	public enum Directions {NORTH, SOUTH, EAST, WEST}
	
	public static void main(String[] args) {

		Directions direction;
		direction = Directions.EAST;
		
		//System.out.println(direction); 
		
		switch(direction){
		
		case NORTH:
			System.out.println("Going North");
			break;
		case SOUTH:
			System.out.println("Going South");
			break;
			
		case EAST:
			System.out.println("Going East");
			break;
		
		case WEST:
			System.out.println("Going West");
			break;
		}
		
	}

}

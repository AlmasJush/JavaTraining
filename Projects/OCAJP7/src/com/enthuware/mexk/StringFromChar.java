package com.enthuware.mexk;

public class StringFromChar {

	private int x=0;
	private String y = "Y";
	
	public StringFromChar(int k){
		this.x = k;
	}
	
	public StringFromChar(String k){
		this.y = k;
	}
	public void showMe(){
		System.out.println(x+y);
	}
	public static void main(String[] args) throws Exception {
		
		new StringFromChar(10).showMe();
		new StringFromChar("Z").showMe();
	}
	
	

}

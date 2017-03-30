package com.enthuware.mexk;

class OrderManager extends CorbaComponent {

	OrderManager(){}
	void startUp(String s){
		ior = getIORFromURL(s);
	}
	
	String getIORFromURL(String s){
		return "URL//:" + s;
	}
	
}

package com.enthuware.mexk;

class CorbaComponent {
	
	String ior;
	CorbaComponent(){startUp("IOR");}
	void startUp(String s){ ior = s;}
	void print(){System.out.println(ior);}

}

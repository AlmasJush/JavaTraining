package com.enthuware.mexk;

class B extends A {
	
	public int h = 44;
	 public int getH(){
		 System.out.println("Beta " + h);
		 return h;
	 }
	 
	 public static void main(String[] args){
		 A b = new B();
		// System.out.println(b.h +" "+ b.getH() );
		  B bb = (B)b;
		  System.out.println(bb.h +" "+ bb.getH());
 
	 }
	 
}

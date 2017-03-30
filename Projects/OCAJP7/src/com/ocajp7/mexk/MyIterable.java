package com.ocajp7.mexk;

import java.util.Iterator;

public class MyIterable implements Iterable<Integer> {

	private MyIterator iterator;
	
	public MyIterable() {
		iterator = new MyIterator();
	
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return iterator;
	}

	public static void main(String[] args) {
		
	MyIterable iterable = new MyIterable();
		
	for(Integer num : iterable){
		System.out.println(num + " ");
	}
	System.out.println();

}
}
package com.ocajp7.mexk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("human");
		arrList.add("animals");
		arrList.add("fishes");
		System.out.println(arrList);
		
		// insert an element in specified index of the ArrayList
		arrList.add(1, "reptiles");
		System.out.println();
		System.out.println(arrList); 
		
		// add another ArrayList elements to existing one
		// create new ArrayList
		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add("birds");
		arrList2.add("pets");
		
		// add all of arrList2 elements to the end of arrList
		arrList.addAll(arrList2);
		System.out.println(arrList); 
		
		// add all of arrList2 elements to specific position of arrList
		arrList.addAll(2, arrList2);
		System.out.println();
		System.out.println(arrList);
		System.out.println(arrList.size()); 
		
		// retrieve an element from arraylist using get()
		System.out.println(arrList.get(3)); 
		System.out.println(arrList.indexOf("birds")); 
		System.out.println(arrList.lastIndexOf("birds")); 
		
		// if the element does not exist, the method will return -1
		System.out.println(arrList.indexOf("alma")); 
		
		// toArray method returns an array of objects in the ArrayList
		String[] strArray = new String[0];
		strArray = arrList.toArray(strArray);
		for(String str : strArray){
			System.out.print(str + " ");
		}
		System.out.println(); 
		
		// Traversing ArrayList using simple for statement
		for(int i=0; i<arrList.size(); i++){
			System.out.print(arrList.get(i) + ", ");  
		}
		System.out.println();
		// traversing ArrayList using for each statement
		for (String all : arrList){
			System.out.print(all + ", "); 
		}
		System.out.println();
		System.out.println();
		
		// traversing ArrayList using Iterator
		Iterator<String> ite = arrList.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next() + ": ");
		}
		System.out.println();
		System.out.println();
		
		// traversing ArrayList in reverse order using ListIterator
		/*ListIterator<String> lit = arrList.listIterator();
		while (lit.hasPrevious()) {
			System.out.println(lit.previous() + ",, ");
		}*/
		
		// traversing ArrayList using ListIterator
		ListIterator<String> lite = arrList.listIterator();
		while(lite.hasNext()){
			System.out.print(lite.next() + "' ");
		}
		System.out.println();
		System.out.println();
		
		// replace an element with a new value
		arrList.set(2, "chicken");
		System.out.println(arrList);
		System.out.println();
		System.out.println();
		
		Collections.sort(arrList); 
		System.out.println(arrList); 
	}

}














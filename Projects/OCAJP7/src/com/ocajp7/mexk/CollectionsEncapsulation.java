package com.ocajp7.mexk;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class CollectionsEncapsulation {

	private ArrayList<Book> books = new ArrayList<Book>();
	
	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("dog");
		al.add("cat");
		al.add("horse");
		System.out.println(al.contains("cat")); 
	}
	public Book getBook(int index){
		return books.get(index);
	}
	
		public void setBooks(Book book){
		books.add(book);
	}
	
	public void addBook(Book book){
		books.add(book);
	}

}

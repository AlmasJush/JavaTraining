package com.ocajp7.mexk;

import java.sql.Date;

final public class ImmutableObject {

	private final String title;
	final private int version;
	private final Date date;
	
	public Date getDate(){
		return new Date(date.getTime());
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getVersion(){
		return version;
	}
	
	public ImmutableObject(String title, int version, Date date){
		this.title = title;
		this.version = version;
		this.date = new Date(date.getTime());
	}
	
	public String toString(){
		return "Title: " + this.title + "\n" +
				"Version: " + this.version + "\n" +
				"Date: " + this.date + "\n";
	}
	
}

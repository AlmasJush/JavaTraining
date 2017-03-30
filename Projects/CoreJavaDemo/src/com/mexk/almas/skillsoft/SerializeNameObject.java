package com.mexk.almas.skillsoft;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;

public class SerializeNameObject {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		ObjectOutputStream output = 
				new ObjectOutputStream(new FileOutputStream("C:\\Users\\aainiwaer\\Documents\\Z Start-5-13\\OutputFilesOfJava\\name.ser"));
		Name aName = new Name("Joe", "Doe");
		
		try{
			output.writeObject(aName);
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
		
		try{
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}

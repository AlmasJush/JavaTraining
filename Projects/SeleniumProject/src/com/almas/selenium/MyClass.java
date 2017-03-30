package com.almas.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";
		String expectedTitle = "Googlee";
		String actualTitle = "";
		
		// launch Firefox and direct it to the base url
		driver.get(baseUrl);
		
		// get the actual title
		actualTitle = driver.getTitle();
		
		// compare the actual title of the page with the expected one and print the result
		// as PASS or FAIL
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		//close the driver/ Firefox
		//driver.close();
		
		//System.exit(0);
	}

}

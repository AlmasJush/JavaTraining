package com.almas.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateGuiElements {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.facebook.com";
		String tagName = "";
		
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();
		//tagName = driver.findElement(By.tagName("div")).getTagName();
		//tagName = driver.findElement(By.partialLinkText("reg")).getText();
		System.out.println(tagName); 
		driver.close();
		System.exit(0);
	}

}

package com.almas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SwitchingFrame {

	public static void main(String[] args) {

		WebDriver driver = new InternetExplorerDriver();
		String alertMessage = "";
		driver.get("http://jsbin.com/usidix/1"); 
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		alertMessage = driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		driver.quit();
	}

}

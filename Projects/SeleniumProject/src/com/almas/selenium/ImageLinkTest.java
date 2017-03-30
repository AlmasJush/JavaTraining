package com.almas.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageLinkTest {

	private WebDriver driver;
	//public static void main(String[] args) {
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/identity?ctx=recover");
	}
	
		@Test
		public void backHomePageTest() throws Exception {

			// click on facebook logo
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]")).click();
		//if(driver.getTitle().equals("Welcome to Facebook - Log In, Sign Up or Learn More"))
		if(driver.getTitle().equalsIgnoreCase("Welcome to Facebook - Log in, sign Up or Learn More"))
		{
			System.out.println("We are back to home page");
		}else{
			System.out.println("We are NOT...");
		}
		driver.quit();
	}

}

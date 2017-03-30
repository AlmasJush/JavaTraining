package com.almas.selenium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingTableViaXPath {

	private WebDriver driver;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("file:///C:/AutomationTestingFiles/newhtml.html");
	}

	@Test
	public void test() {
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(innerText);
	
		driver.quit();
	
	}

}

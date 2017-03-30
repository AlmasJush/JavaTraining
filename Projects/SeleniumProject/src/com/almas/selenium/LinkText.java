package com.almas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) {

		String baseUrl = "http://newtours.demoaut.com/";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		
		String innerText;
		//innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
		innerText = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")).getText();
		System.out.println(innerText);
		
		/*String linkText = driver.findElement(By.partialLinkText("egis")).getText();
		System.out.println(linkText);
		
		String partialLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println(partialLinkText);*/
		
		driver.quit();
		
	}

}

package com.almas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	
	public static void main(String[] args) {
		String baseUrl = "http://www.facebook.com/";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl); 
		
		//WebElement txtUserName = driver.findElement(By.id("email"));
		//WebElement txtUserName = driver.findElement(By.cssSelector("input[id='email']"));
		WebElement txtUserName = driver.findElement(By.xpath("//html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input"));
		
		Actions builder = new Actions(driver);
		Action seriesActions = builder
				.moveToElement(txtUserName)
				.click()
				.keyDown(txtUserName, Keys.SHIFT)
				.sendKeys(txtUserName, "hello")
		        .keyUp(txtUserName, Keys.SHIFT)
		        .doubleClick(txtUserName)
		        
		        .build();

		seriesActions.perform();
		
		//driver.close();
		
		/*WebElement linkHome = driver.findElement(By.linkText("Home"));
		WebElement tdHome = driver.findElement(By.xpath(
				"//html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(linkHome).build();
		
		String bgColor = tdHome.getCssValue("background-color");
		System.out.println("Before hover " + bgColor);*/
		
		//mouseOverHome.perform();
		
		//bgColor = tdHome.getCssValue("background-color");
		//System.out.println("After hover " + bgColor);
		//driver.quit();
	}

}

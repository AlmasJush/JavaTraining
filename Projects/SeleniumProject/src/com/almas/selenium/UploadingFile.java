package com.almas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFile {

	public static void main(String[] args) {

	     String baseUrl = "http://www.megafileupload.com";
		WebDriver driver = new FirefoxDriver();
		
		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.xpath("//html/body/section[1]/div/div/ul/li/div[4]/a"));
		uploadElement.click();
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div/div/form/div[2]/label/div/div[1]/div/div")).click();
		
		uploadElement.sendKeys("C:\\newhtml.html");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div/div/form/div[2]/div/div[2]/div[1]/button"));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div/div/form/div[2]/div/div[4]/div[3]/div/button")).click();
		//driver.findElement(By.id("send")).click();
		
	}

}

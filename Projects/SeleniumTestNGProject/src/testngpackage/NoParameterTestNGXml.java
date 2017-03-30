package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoParameterTestNGXml {
  
	@Test
	public void testNoParameter() throws InterruptedException{
		String author = "Almas";
		String searchKey = "usa";
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement searchTxt = driver.findElement(By.name("q"));
		
		searchTxt.sendKeys(searchKey);
		System.out.println("Welcome -> " + author + "Your search key is -> "+searchKey);
		System.out.println("Thread will sleep now");
		Thread.sleep(3000);
		
		System.out.println("Value in Google search box = " 
				+ searchTxt.getAttribute("value") +"::: Value given by input = "+ searchKey);
		
		Assert.assertTrue(searchTxt.getAttribute("value").equalsIgnoreCase(searchKey));
	}
	
	
	
	
	
}

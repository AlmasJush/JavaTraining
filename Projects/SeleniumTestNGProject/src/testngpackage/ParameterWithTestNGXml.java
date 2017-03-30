package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;


public class ParameterWithTestNGXml {
 
	@Test
	@Parameters({"author","searchKey"})
	public void testParameterWithXml(@Optional("Abc") String author, String searchKey) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement searchText = driver.findElement(By.name("q"));
		
		searchText.sendKeys(searchKey);
		System.out.println("Welcome -> " + author + "Your search key is -> "+searchKey);
		System.out.println("Thread will sleep now");
		Thread.sleep(3000);
		
		System.out.println("Value in Google search box = " 
				+ searchText.getAttribute("value") +"::: Value given by input = "+ searchKey);
		
		Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
	}
	
	
}

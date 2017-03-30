package testngpackage;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class VerifyLinks {
  
	private String baseUrl = "http://newtours.demoaut.com/";
	private WebDriver driver = new FirefoxDriver();
	private String expected = null;
	private String actual = null;
	
	@BeforeTest
	public void launchBrowser(){
		driver.get(baseUrl);
	}
	
	@BeforeMethod
	public void verifyHomepageTitle(){
		expected = "Welcome: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(expected, actual); 
	}
	
	@Test
	public void register(){
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void support(){
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}

	@AfterMethod
	public void goBackToHomepage(){
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
	
	
	
	
}

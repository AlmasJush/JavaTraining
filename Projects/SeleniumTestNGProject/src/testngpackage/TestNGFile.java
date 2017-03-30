package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGFile {
	
	public String baseUrl = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver();
 
  @BeforeTest
  public void launchBrowser(){
	  driver.get(baseUrl);
  }
	
	
	@Test(priority=0)
  public void verifyHomepageTitle() {
	  
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle); 
	  //driver.quit();
	  
  }
  @Test(priority = 1)
  private void logOut(){
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  Assert.assertEquals("Sign-on: Mercury Tours", driver.getTitle());
  }
  
  @AfterTest
  public void closeBrowser(){
	  driver.quit();
  }
  
}






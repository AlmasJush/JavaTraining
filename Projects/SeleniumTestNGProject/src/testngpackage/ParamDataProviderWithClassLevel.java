package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ParamDataProviderWithClassLevel {
  
	WebDriver driver;
	
  @BeforeTest
  public void setUp() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://google.com"); 
  }
  
  @Test(dataProvider="SearchProvider", dataProviderClass=DataproviderClass.class )
  public void testMethod(String author, String searchKey) throws InterruptedException {
	  
	  WebElement searchText = driver.findElement(By.name("q"));
	  System.out.println("Welcome: " + author + " Your search key is "+ searchKey);
	  Thread.sleep(3000);
	  String testValue = searchText.getAttribute("value");
	  System.out.println(testValue + "::: " + searchKey);
	  searchText.clear();
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

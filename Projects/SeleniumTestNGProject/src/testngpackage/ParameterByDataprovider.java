package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class ParameterByDataprovider {
  
	WebDriver driver;
	
	@Test(dataProvider = "SearchProvider")
	public void testMethod(String author, String searchKey) throws InterruptedException {
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys(searchKey);
		
		System.out.println("Welcome -> " + author + " Your search key is -> "+searchKey);
		System.out.println("Thread will sleep now");
		Thread.sleep(3000);
		String testValue = searchText.getAttribute("value");
		System.out.println(testValue + " ::: " + searchKey);
		searchText.clear();
		Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	}

  @DataProvider(name="SearchProvider")
  public Object[][] getDataFromDataprovider() {
    return new Object[][] {
       { "Almas", "East Turkistan" },
      { "Krishma", "Uk" },
      {"Bupesh", "US"}
    };
  }
  
  
  @BeforeTest
  public void setUp() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://google.com");
  }

  @AfterTest
  public void tearDown(){
	  driver.quit();
  }
}

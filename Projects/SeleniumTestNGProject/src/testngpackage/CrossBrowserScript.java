package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CrossBrowserScript {
  
	WebDriver driver;
	
  @BeforeTest
  @Parameters("browser")
  public void setUp(String browser) throws Exception {
	  if(browser.equalsIgnoreCase("firefox")){
		  driver = new FirefoxDriver();
	  } 
	  else if(browser.equalsIgnoreCase("ie")){
		  DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		  capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver(capability);
	  }
	  else{
		  throw new Exception("Browser is not correct");
	  }
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testParameterWithXML() throws InterruptedException{
	  driver.get("http://demo.guru99.com/V4/");
	  WebElement userName = driver.findElement(By.name("uid"));
	  userName.sendKeys("guru99");
	  WebElement pword = driver.findElement(By.name("password"));
	  pword.sendKeys("guru99"); 
  }
  
  
  
  @AfterTest
  public void tearDown() {
	  driver.quit();
	  
  }

}

package com.almas.req;

	import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
	
	public class Requisition2ndPage {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver(capabilities);
	    driver.manage().window().maximize();
	    
	    baseUrl = "http://qav-001924/DocsForDeltek15RP2/REQAutomation/RequisitionForm/Requisition.aspx";
	    //baseUrl = "http://qav-001082/DocsForDeltek14-Upgrd/REQAutomation/RequisitionForm/Requisition.aspx";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitled2() throws Exception {
	    driver.get(baseUrl);
	    driver.findElement(By.id("txtEmpID")).clear();
	    driver.findElement(By.id("txtEmpID")).sendKeys("1001");
	    driver.findElement(By.id("btnValidate")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtRequester")).clear();
	    driver.findElement(By.id("txtRequester")).sendKeys("c");
	    driver.findElement(By.id("imgRequesterSearch")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("grdRequesters_ctl04_lblRequesterName")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnNew")).click();
	    Thread.sleep(9000);
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}


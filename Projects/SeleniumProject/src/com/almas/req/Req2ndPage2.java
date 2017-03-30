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

	public class Req2ndPage2 {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		  
		  // for IE browser 
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
	  public void testUntitled() throws Exception {
	    driver.get(baseUrl);
	    //driver.findElement(By.id("txtEmpID")).clear();
	    driver.findElement(By.id("txtEmpID")).sendKeys("1001");
	    driver.findElement(By.id("btnValidate")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtRequester")).sendKeys("c");
	    Thread.sleep(2000);
	    driver.findElement(By.id("imgRequesterSearch")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("grdRequesters_ctl04_lblRequesterName")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("btnNew")).click();
	    Thread.sleep(5000);
	   
	    // ship address 
	    driver.findElement(By.id("btnDeliveryAddressSearch")).click();
	    driver.findElement(By.linkText("ANCHOR")).click();
	    
	    // Project search
	    driver.findElement(By.id("projectIDLookup")).click();
	    Thread.sleep(1000);
	    //driver.findElement(By.id("projectIDSearchBox")).clear();
	    driver.findElement(By.id("projectIDSearchBox")).sendKeys("1000");
	    driver.findElement(By.id("Button1")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("10001.001.001")).click();
	    Thread.sleep(2000);
	    
	    // Account search
	    driver.findElement(By.id("accountSearchButton")).click();
	    Thread.sleep(3000);
	    // for Account id senKeys is optional
	    //driver.findElement(By.id("accountSearchPart1")).sendKeys("1");
	    //Thread.sleep(3000);
	    driver.findElement(By.id("AccountSearchSubmit")).click();
	    // Cancel account id search
	    //driver.findElement(By.id("AccountSearchCancel")).click();
	    Thread.sleep(2000); 
	    driver.findElement(By.linkText("81-100-10")).click();
	    Thread.sleep(3000);
	    
	    // Need by date
	   /* driver.findElement(By.id("btnDueDate")).click();
	    //driver.findElement(By.id("imgLNBDate")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("30")).click();*/
	    
	    // Vendor search
	    driver.findElement(By.id("imgVendor")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("vendorIDSearchBox")).sendKeys("ba");
	    driver.findElement(By.id(" btnSearchVendor ")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("V100013")).click();
	    Thread.sleep(3000);
	    
	    // Item code
	    driver.findElement(By.id("imgItemCode")).click();
	    driver.findElement(By.id("itemCodeSearchBox")).sendKeys("10");
	    driver.findElement(By.id("btnSearchitemCode")).click();
	    driver.findElement(By.linkText("10100 A002")).click();
	    
	    driver.findElement(By.id("entQty")).sendKeys("2");
	    Thread.sleep(2000);
	    driver.findElement(By.id("entUnit")).sendKeys("100");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnEntSave")).click();
	    Thread.sleep(2000);
	    
	    // popup message
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    
	    // Misc Type
	    //driver.findElement(By.id("entMiscType")).click();
	    
	    /*driver.findElement(By.id("OrgSearchButton")).click();
	    driver.findElement(By.id("OrgIDSearchBox")).clear();
	    driver.findElement(By.id("OrgIDSearchBox")).sendKeys("10");
	    driver.findElement(By.id("btnOrgSearch")).click();
	    Thread.sleep(3000);*/
	    
	    // for ide 
	    // target column: link=10001.001.001
	    // command column: clickAndWait
	    
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


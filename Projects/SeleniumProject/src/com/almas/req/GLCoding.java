package com.almas.req;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.*;

public class GLCoding {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	//public Actions action = new Actions(driver);
	private boolean acceptNextAlert = true;
	
	@Before
	public void setUp() throws Exception{
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver(capability);
		driver.manage().window().maximize();
		
		baseUrl = "http://qav-001082/DocsForDeltek14wOracle/IACostPoint/GLCoding/GLCoding_CP.aspx?customerNo=10001&did=31374&vocherID=&vid=E-USA009&invamt=3%2c003.00&invNumber=BOTH%3dNILL&invDate=09%2f09%2f2015&ProjNumber=&fiscalYear=2015&periodNo=9&subPeriodNo=1&PORelNo=&UserId=ABUSAS&PONonPOFlag=0&PONumber=&tranCurrCode=USD";
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	}
	@Test
	public void addGLlines() throws Exception{
		    int i = 0;
		//for(int i=0; i<5; i++)
		while(i<5) {
		    Actions action = new Actions(driver);
		    driver.get(baseUrl);
		    driver.findElement(By.id("frmAcceptor_imgHeadProject")).click();
		    driver.findElement(By.id("button1")).click();
		    
		    // NonPO invoices
		    // select project via double clicking 
		    WebElement element = driver.findElement(By.xpath("//select[@id='selector']"));
		    Action doubleClick = action.doubleClick(element).build();
		    doubleClick.perform();
		    // select account
		    driver.findElement(By.id("frmAcceptor_imgHeadAccount")).click();
		    driver.findElement(By.id("button1")).click();
		    WebElement element1 = driver.findElement(By.xpath("//select[@id='selector']"));
		    Action doubleClick1 = action.doubleClick(element1).build();
		    doubleClick1.perform();
		    // select org
		    driver.findElement(By.id("frmAcceptor_imgHeadOrg")).click();
		    driver.findElement(By.id("button1")).click();
		    WebElement element2 = driver.findElement(By.xpath("//select[@id='selector']"));
		    Action doubleClick2 = action.doubleClick(element2).build();
		    doubleClick2.perform();
		    
		    // Allocation %
		    driver.findElement(By.id("frmAcceptor_txtAllocation")).sendKeys("9"); 
		    driver.findElement(By.id("frmAcceptor_txtAmount")).click();
		    Thread.sleep(2000);
		    
		    // adding the line
		    driver.findElement(By.id("frmAcceptor_tbarimg")).click();
		    Thread.sleep(3000); 
		    //assertEquals("GL Coding amount is greater than Invoice amount. Click Ok to continue.", closeAlertAndGetItsText());
		    
		    i++;

		  //assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to delete all GL Lines[\\s\\S]$"));
		  //new Select(driver.findElement(By.id("selector"))).selectByIndex(2); //getFirstSelectedOption();//selectByValue("1000.001.000"); //selectByVisibleText("1000");
		  // driver.findElement(By.xpath("//select[@id='selector']")).
		  // Actions action = new Actions(driver);
		  //  WebElement element = new Select(driver.findElement(By.id("selector"))).selectByIndex(2));
		  //action.moveToElement(new Select(driver.findElement(By.id("selector"))).selectByIndex(2)).doubleClick().build().perform();
		}
		
		// Deleting all gl lines
	    driver.findElement(By.id("frmAcceptor_tbarimgDeleteAll")).click();
	    Thread.sleep(3000);
	    assertEquals("Are you sure you want to delete all GL Lines?", closeAlertAndGetItsText());
	    Thread.sleep(3000);
		
		
		// popup alert confirmation  
		//assertEquals("GL Coding amount is greater than Invoice amount. Click Ok to continue.", closeAlertAndGetItsText());
		
		}

	private String closeAlertAndGetItsText(){
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if(acceptNextAlert){
				alert.accept();
			}else{
				alert.dismiss();
			}
			return alertText;
		}
		finally{
			acceptNextAlert = true;
		}
	}
	@After
	  public void tearDown() throws Exception {
	    //driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	
}

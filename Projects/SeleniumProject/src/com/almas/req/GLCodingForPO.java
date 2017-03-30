package com.almas.req;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GLCodingForPO {
	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	
	@Before
	public void setUp() throws Exception{
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		System.setProperty("webdriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");

		driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		baseUrl = "http://appdev-vm-esxi1/DocsForDeltek2.9.1.X/IACostPoint/GLCoding/GLCoding_CP.aspx?customerNo=10001&did=32375&vocherID=4427&vid=V100001&invamt=1000.00&invNumber=MONDAY-1&invDate=8%2f17%2f2015+12%3a00%3a00+AM&ProjNumber=10100.10.01&fiscalYear=2015&periodNo=9&subPeriodNo=1&PONumber=PO-02-0024&PONonPOFlag=1&PORelNo=0&UserId=BIGGSS&tranCurrCode=USD&ViewOnly=false";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@Test
	public void addPOGLLines() throws Exception{
		int i = 0;
		driver.get(baseUrl);
		while(i < 50){
			Actions action = new Actions(driver);

			// add PO line number
			driver.findElement(By.cssSelector("div.moreView")).click();
			driver.findElement(By.className("PolnField")).click();
			driver.findElement(By.className("PolnField")).sendKeys("1");
			driver.findElement(By.id("frmAcceptor_txtHeadProjectID")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("frmAcceptor_txtHeadQuantity")).sendKeys("0.01");
			driver.findElement(By.id("frmAcceptor_txtAmount")).click();
			driver.findElement(By.id("frmAcceptor_tbarimg")).click();
			//assertEquals("GL Coding amount is greator than Invoice amount. Click Ok to continue", getAlertText());
		    Thread.sleep(3000);
		    
		    i++;
		}
		// Deleting all gl lines
	    driver.findElement(By.id("frmAcceptor_tbarimgDeleteAll")).click();
	    Thread.sleep(3000);
	    assertEquals("Are you sure you want to delete all GL Lines?", getAlertText());
	    Thread.sleep(3000);
		
	 // driver.quit();
	}
	
	public String getAlertText() throws Exception{
		try{
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
			acceptNextAlert=true;
		}
	}
	
}

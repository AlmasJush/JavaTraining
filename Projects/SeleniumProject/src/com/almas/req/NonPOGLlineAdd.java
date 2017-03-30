package com.almas.req;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NonPOGLlineAdd {

	private String baseUrl;
	private WebDriver driver;
	private boolean acceptNextAlert = true;
	
	@Before
	public void setUp() throws Exception{
		
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("WebDriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(capability);
		driver.manage().window().maximize();
		baseUrl = "http://qav-001924/DocsForDeltek15RP2/IACostPoint/GLCoding/GLCoding_CP.aspx?customerNo=10001&did=633&vocherID=10133&vid=V100011&invamt=2002.00&invNumber=%22%3dCPADMINSCHEM&invDate=9%2f22%2f2015+12%3a00%3a00+AM&ProjNumber=&fiscalYear=2015&periodNo=9&subPeriodNo=1&PONumber=&PONonPOFlag=0&PORelNo=&UserId=&tranCurrCode=USD&ViewOnly=false";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void addNonPOGLlines() throws InterruptedException{
		
		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
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
	    driver.findElement(By.id("frmAcceptor_txtAllocation")).sendKeys("2"); 
	    driver.findElement(By.id("frmAcceptor_txtAmount")).click();
	    Thread.sleep(2000);
	    
	    // adding the line
	    driver.findElement(By.id("frmAcceptor_tbarimg")).click();
	    Thread.sleep(3000); 
	    
	    int i = 0;
	    while(i<16){
	    // copy the line and add it
	    driver.findElement(By.id("Repeater1_ctl01_txtProjectID")).click();
	    driver.findElement(By.id("frmAcceptor_ImageCopy")).click();
	    driver.findElement(By.id("frmAcceptor_tbarimg")).click();
	    Thread.sleep(5000);
	    i++;
	    }
	    
	 // Deleting all gl lines
	    driver.findElement(By.id("frmAcceptor_tbarimgDeleteAll")).click();
	    Thread.sleep(3000);
	    assertEquals("Are you sure you want to delete all GL Lines?", closeAlertAndGetItsText());
	    Thread.sleep(3000);
	    
	}
	
	public String closeAlertAndGetItsText(){
		
		try{
			Alert alert = driver.switchTo().alert();
			String alertTxt = alert.getText();
			if(acceptNextAlert){
				alert.accept();
			}else{
				alert.dismiss();
			}
			return alertTxt;	
		}
		
		finally{
			acceptNextAlert=true;
		}
	}
	
	@After
    public void tearDown() throws Exception {
    	
    	driver.close();
    	driver.quit();
    }
	
}

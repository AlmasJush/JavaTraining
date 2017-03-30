package com.almas.req;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AddGLlinePopupConfirmation {
	  private WebDriver driver;
	  private String baseUrl = "QAV-001082";
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver(capabilities);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testGLCodingJsAlertPopupConfirmation() throws Exception {
	    driver.get(baseUrl + "/DocsForDeltek14wOracle/IACostPoint/GLCoding/GLCoding_CP.aspx?customerNo=10001&did=31374&vocherID=&vid=E-USA009&invamt=3%2c003.00&invNumber=BOTH%3dNILL&invDate=09%2f09%2f2015&ProjNumber=&fiscalYear=2015&periodNo=9&subPeriodNo=1&PORelNo=&UserId=ABUSAS&PONonPOFlag=0&PONumber=&tranCurrCode=USD");
	    driver.findElement(By.id("frmAcceptor_tbarimg")).click();
	    assertEquals("GL Coding amount is greater than Invoice amount. Click Ok to continue.", closeAlertAndGetItsText());
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

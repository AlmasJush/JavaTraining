package com.almas.req;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RequisitionPage {

	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("http://qav-001082/DocsForDeltek14-Upgrd/REQAutomation/RequisitionForm/Requisition.aspx");
		
		WebElement searchBox = driver.findElement(By.id("txtEmpID"));
		searchBox.sendKeys("1001");
		WebElement link;
		link = driver.findElement(By.id("btnValidate"));
		link.click();
		Thread.sleep(3000); 
		
		searchBox.sendKeys("c");
		link = driver.findElement(By.id("imgRequesterSearch"));
		link.click();
		Thread.sleep(3000);
		
		link = driver.findElement(By.id("grdRequesters_ctl03_lblRequesterName"));
		link.click();
		Thread.sleep(3000); 
		
		//driver.quit();
		
		
		/*String baseUrl = "http://qav-001082/DocsForDeltek14-Upgrd/REQAutomation/RequisitionForm/Requisition.aspx";
		String expectedTitle = "Requsiition";
		String actualTitle = "";*/
		
		/*driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println(actualTitle);
			System.out.println("Test PASS");
		}else{
			System.out.println(actualTitle);
			System.out.println("Test FAIL!!");
		}
		//close the browser
		driver.close();
		//exit the program
		System.exit(0);*/
	}

}

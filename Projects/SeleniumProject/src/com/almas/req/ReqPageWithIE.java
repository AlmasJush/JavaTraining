package com.almas.req;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ReqPageWithIE {

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\aainiwaer\\Documents\\Z-Start-5-13\\Selenium\\ENV\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(capabilities);
		
		driver.get("http://qav-001082/DocsForDeltek14-Upgrd/REQAutomation/RequisitionForm/Requisition.aspx");
		
		driver.quit();
		
	}

}

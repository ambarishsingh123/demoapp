package com.org.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.org.environment.GlobalPath;

public class BaseClass{	
	
	public static String browser;

	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		BaseClass.browser = browser;
	}

	public static WebDriver openBrowser(String browser) {
		WebDriver driver;
		switch (browser) {
		case "Chrome": {
			System.setProperty("webdriver.chrome.driver",GlobalPath.TESTRESOURCE_PATH+"\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setBrowser(browser);
			return driver;
		}
		case "Firefox": {
			System.setProperty("webdriver.gecko.driver",GlobalPath.TESTRESOURCE_PATH+"\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			setBrowser(browser);
			return driver;
		}
		}
		return null;
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	


}

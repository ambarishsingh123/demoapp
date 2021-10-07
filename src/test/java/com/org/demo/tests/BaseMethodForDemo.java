package com.org.demo.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import com.org.demo.page.LandingPage;
import com.org.environment.GetEnvironment;
import com.org.util.BaseClass;

public class BaseMethodForDemo extends BaseClass{
	static WebDriver driver;
	
	public LandingPage landing()
	{
		GetEnvironment.getEnvironment();
		driver = BaseClass.openBrowser(GetEnvironment.getBrowser());
		driver.get(GetEnvironment.getUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
}

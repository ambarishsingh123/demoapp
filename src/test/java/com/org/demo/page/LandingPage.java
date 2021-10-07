package com.org.demo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.objectRepo.LandingObj;
import com.org.actions.SeleniumActions;


public class LandingPage {
	@FindBy(name = LandingObj.DEPARTURECITY_DDNAME)
	WebElement departureCity;
	
	@FindBy(name = LandingObj.DESTINATIONCITY_DDNAME)
	WebElement destinationCity;
	
	@FindBy(xpath = LandingObj.FINDFLIGHT_BTNXPATH)
	WebElement findFlight;
	
	public void selectSource(String source) {
		SeleniumActions.selectDropdown(departureCity, source);	
	}
	
	public void selectDestination(String destination) {
		SeleniumActions.selectDropdown(destinationCity, destination);	
	}
	
	public FlightDetailPage findFlight(WebDriver driver)
	{
		SeleniumActions.clickElement(findFlight);
		return PageFactory.initElements(driver, FlightDetailPage.class);
	}
}

package com.org.demo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.objectRepo.FlightDetailObj;
import com.org.actions.SeleniumActions;

public class FlightDetailPage {
	@FindBy(xpath = FlightDetailObj.HEADING_XPATH)
	WebElement heading;
	
	@FindBy(xpath = FlightDetailObj.SELECTFIRSTFLIGHT_XPATH)
	WebElement selectFirstFlight;
	
	public String getHeading()
	{
		return SeleniumActions.getText(heading);
	}
	
	public PassDetailPage clickFIrstFlight(WebDriver driver )
	{
		SeleniumActions.clickElement(selectFirstFlight);
		return PageFactory.initElements(driver, PassDetailPage.class);
	}
}

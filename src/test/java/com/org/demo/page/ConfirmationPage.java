package com.org.demo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.objectRepo.ConfirmationObj;
import com.org.actions.SeleniumActions;

public class ConfirmationPage {
	@FindBy(xpath = ConfirmationObj.HEADINGCONF_XPATH)
	WebElement headingConfirmation;
	
	@FindBy(xpath = ConfirmationObj.ID_XPATH)
	WebElement idOFBooking;
	
	public String getConfirmationText()
	{
		return SeleniumActions.getText(headingConfirmation);
	}
	
	public boolean ifIdExist()
	{
		return SeleniumActions.isDisplayedElement(idOFBooking);
	}
}

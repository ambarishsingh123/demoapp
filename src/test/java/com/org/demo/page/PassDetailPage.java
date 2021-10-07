package com.org.demo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.objectRepo.PassDetailObj;
import com.org.actions.SeleniumActions;

public class PassDetailPage {

	@FindBy(id = PassDetailObj.NAME_TXTID)
	WebElement name;
	@FindBy(id = PassDetailObj.ADDRESS_TXTID)
	WebElement address;
	@FindBy(id = PassDetailObj.CITY_TXTID)
	WebElement city;
	@FindBy(id = PassDetailObj.STATE_TXTID)
	WebElement state;
	@FindBy(id = PassDetailObj.ZIPCODE_TXTID)
	WebElement zip;
	@FindBy(id = PassDetailObj.CARDTYPE_DDID)
	WebElement cardType;
	@FindBy(id = PassDetailObj.CARDNUMB_TXTID)
	WebElement cardNumb;
	@FindBy(id = PassDetailObj.CARDMONTH_TXTID)
	WebElement cardMonth;
	@FindBy(id = PassDetailObj.CARDYEAR_TXTID)
	WebElement cardYear;
	@FindBy(id = PassDetailObj.CARDNAME_TXTID)
	WebElement cardName;
	@FindBy(xpath = PassDetailObj.PURCHASEFLIGHT_BTNXPATH)
	WebElement purchase;
	
	public void enterPassDetail(String custName,String custAdd,String custCity,String custState,String custZip) 
	{
		SeleniumActions.enterValueInTextBox(name, custName);
		SeleniumActions.enterValueInTextBox(address, custAdd);
		SeleniumActions.enterValueInTextBox(city, custCity);
		SeleniumActions.enterValueInTextBox(state, custState);
		SeleniumActions.enterValueInTextBox(zip, custZip);
	}
	
	public void enterCardDetail(String custCardType,String custCardNumb,String custCardMonth,String custCardYear,String custCardName)
	{
		SeleniumActions.selectDropdown(cardType, custCardType);
		SeleniumActions.enterValueInTextBox(cardNumb, custCardNumb);
		SeleniumActions.enterValueInTextBox(cardMonth, custCardMonth);
		SeleniumActions.enterValueInTextBox(cardYear, custCardYear);
		SeleniumActions.enterValueInTextBox(cardName, custCardName);
	}
	
	public ConfirmationPage purchase(WebDriver driver)
	{
		SeleniumActions.clickElement(purchase);
		return PageFactory.initElements(driver, ConfirmationPage.class);
	}
}

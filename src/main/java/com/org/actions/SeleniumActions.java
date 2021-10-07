package com.org.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumActions {

	public static void enterValueInTextBox(WebElement element, String Value)
	{
		element.sendKeys(Value);
	}
	
	public static void clickElement(WebElement element)
	{
		element.click();
	}
	
	public static void selectDropdown(WebElement element,String value)
	{
		Select dropdown= new Select(element);
		dropdown.selectByVisibleText(value);
	}
	
	public static String getText(WebElement element)
	{
		return element.getText();
	}
	
	public static void waitTill(long milli)
	{
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static boolean isDisplayedElement(WebElement element)
	{
		return element.isDisplayed();
	}
}

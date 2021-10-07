package com.org.demo.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.org.demo.page.ConfirmationPage;
import com.org.demo.page.FlightDetailPage;
import com.org.demo.page.LandingPage;
import com.org.demo.page.PassDetailPage;

public class BookFlightTest extends BaseMethodForDemo{
	LandingPage landingPage;
	@BeforeClass
	public void beforeClass(){
		landingPage = landing();

	}
	
	@Test
	public void VerifyUserAbleToBookFlight()
	{
		landingPage.selectSource("Boston");
		landingPage.selectDestination("New York");
		FlightDetailPage flightDetail=landingPage.findFlight(driver);
		System.out.println(flightDetail.getHeading());
		Assert.assertEquals("Flights from Boston to New York:", flightDetail.getHeading());
		PassDetailPage passPageDetail=flightDetail.clickFIrstFlight(driver);
		passPageDetail.enterPassDetail("James", "BTM", "Bangalore", "Karnataka", "560098");
		passPageDetail.enterCardDetail("Visa", "10987655434", "April", "2022", "James");
		ConfirmationPage confPage=passPageDetail.purchase(driver);
		Assert.assertEquals("Thank you for your purchase today!", confPage.getConfirmationText());
		Assert.assertEquals(confPage.ifIdExist(),true);
	}


}

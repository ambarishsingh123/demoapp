package com.org.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {

	@Test
	public void verifyWithValidURLApiIsWorking()
	{
		RestAssured.given().when().get("https://api.spacexdata.com/v4/launches/latest").then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void verifyWithinValidURLApi()
	{
		RestAssured.given().when().get("https://api.spacexdata.com/v4/launches/latest/abc").then().log().all().assertThat().statusCode(404);
	}
	
	@Test
	public void verifyWithValidURLSuccessInResponse()
	{
		Response response=RestAssured.given().when().get("https://api.spacexdata.com/v4/launches/latest");
		String bodyAsString = response.asString();
		Assert.assertEquals(bodyAsString.contains("launchpad"),true);
	}
}

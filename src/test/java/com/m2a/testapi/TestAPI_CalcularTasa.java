package com.m2a.testapi;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPI_CalcularTasa {
	
//	final String ROOT_URI1 = "https://stg.api.workflow.saf-pe.cobiscloud.com/generic/v1/process-rules/rule-condition-values";
	final String ROOT_URI1 = "https://api.data.gov.sg/v1/environment";
	
	
	private static float tasa;
	private static int cod;
	private static String name;
	
	@BeforeTest
	public void beforeTest() {
		
		
	}
	
	@AfterTest
	public void afterTest() {
		
	}

	@Test
	public void start() {
		
		RestAssured.baseURI = ROOT_URI1;
		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = null;
		
		response = requestSpecification.get("24-hour-weather-forecast");
		System.out.println(response.body().asString());
		
	}
	
	
}

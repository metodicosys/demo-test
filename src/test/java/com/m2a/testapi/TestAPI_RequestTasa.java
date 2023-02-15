package com.m2a.testapi;

import org.apache.http.Header;
import org.apache.http.message.BasicHttpRequest;
import org.json.simple.JSONObject;
import org.openqa.selenium.remote.Response;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.Headers;
import io.restassured.http.Method;

public class TestAPI_RequestTasa {
	

//	final String ROOT_URI = "https://stg.api.authentication.saf-pe.cobiscloud.com/users/v1/auth/";
//	final String ROOT_URI1 = "https://api.data.gov.sg/v1/environment";
	
	
	private static float sesion;
	private static int codx;
	private static String ofic;
	
	@BeforeTest
	public void beforeTest() {
		
		
	}
	
	@AfterTest
	public void afterTest() {
		
	}

	@Test
	public void start() {
		
		//   RestAssured.ROOT_URI = "https://reqres.in/api/users/";
        RestAssured.baseURI = "https://stg.api.authentication.saf-pe.cobiscloud.com/users/v1/auth/";
     //   final String ROOT_URI = "https://stg.api.authentication.saf-pe.cobiscloud.com/users/v1/auth/";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject updateData = new JSONObject();
        updateData.put("login", "asesorqa4");
        updateData.put("password", "Surgir03*");

        httpRequest.header("Content-Type", "application/json");

        httpRequest.body(updateData.toJSONString());
        Response response = (Response) httpRequest.request(Method.PUT, "1");
        int statusCode = response.getStatus();
        Assert.assertEquals(statusCode, 200);

        JsonPath newData = ((ResponseBodyExtractionOptions) response).jsonPath();
        String name = newData.get("login");
        Assert.assertEquals(name, "Aarna");

	        
	}
	

}

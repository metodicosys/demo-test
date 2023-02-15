package com.m2a.testapi;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeTest;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import static io.restassured.RestAssured.given;

public class MyTestPost {
	
	String ROOT_URL = "https://stg.api.authentication.saf-pe.cobiscloud.com/users/v1/auth";
	String TOKEN = "XNDN......";
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @Test
  public void test_post() {
	  
	  JSONObject object = new JSONObject();
	  object.put("login", "aaa");
	  object.put("password", "xxxx");
	  
	//  RequestSpecification response = given().headers("Authorization","Bearer " + TOKEN,"Content-Type", ContentType.JSON);
	  RequestSpecification response = (RequestSpecification) given().headers("Content-Type", ContentType.JSON).body(object.toString()).when().post(ROOT_URL + "/users").then().extract()
			  .response();
	  
	  Assert.assertEquals(201, ((ResponseOptions<Response>) response).statusCode());

	  
  }
  
}

package com.gobi.Rest;

import  io.restassured.matcher.RestAssuredMatchers;

//import com.aventstack.extentreports.gherkin.model.Given;

//import com.aventstack.extentreports.gherkin.model.Given;

//import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.RestAssured;
//import io.restassured.matcher.RestAssuredMatchers;
public class RestAssuredBlocks {
	public static void main(String[] args) {
//		Base Url
		RestAssured.baseURI="http://www.appdomain.com";
		RestAssured.given().
		                 param("size", "20").
		                 param("page", "5").
		             when().
		                 get("/users").
		             then().
		             assertThat().statusCode(200);
	}

}

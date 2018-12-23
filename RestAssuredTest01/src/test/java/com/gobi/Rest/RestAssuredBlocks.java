package com.gobi.Rest;

import  io.restassured.matcher.RestAssuredMatchers;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import javax.mail.internet.ContentType;

import static org.hamcrest.Matchers.everyItem;
//import com.aventstack.extentreports.gherkin.model.Given;

//import com.aventstack.extentreports.gherkin.model.Given;

//import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.RestAssured;
//import io.restassured.matcher.RestAssuredMatchers;
public class RestAssuredBlocks {
	public static void main(String[] args) {
//		Base Url
		/*RestAssured.baseURI="https://petstore.swagger.io";
		RestAssured.given().
		                 param("status", "available").
		                 when().
		                 get("/v2/pet/findByStatus").
		                 then().
		                 assertThat().statusCode(200).and().contentType("application/json").and()
		                 .body("photoUrls",everyItem( hasItem("string")));*/
RestAssured.baseURI="https://maps.googleapis.com";
		
RestAssured.given().
		       param("location","-33.8670522,151.1957362").
		       param("radius","500").
		       param("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
		       when().
		       get("/maps/api/place/nearbysearch/json").
		       then().assertThat().statusCode(200).and().contentType("application/json").and().
		       body("results[0].name",equalTo("Sydney")).and().
		       body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and()
		       .header("server", "scaffolding on HTTPServer2")
		       //.and().body("results.photos.scope", equalTo("GOOGLE"))
		       
		       ;
		       //.body("results[0].geometry.location.lat",equalTo("-33.86882"));
	}

}

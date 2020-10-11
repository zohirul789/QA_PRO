import io.restassured.RestAssured;
import restassured_usingTestNG.AddPlaces;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basics {
	
	
	/*
	 * Validate if Add Place API is working as Expected
	 * 
	 * RestAssured Work with below Methods
	 * Given - all input details
	 * When - submit the API
	 * Then - Validate the response
	 * */
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		//Given - enter all the input details
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(AddPlaces.add())
		//When - put the Resource
		.when().post("maps/api/place/add/json")
		//Then - get the Response
		.then().log().all().assertThat().statusCode(200).body("status", equalTo("OK"));
		
	
	}
}

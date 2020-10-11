package restassured_usingTestNG;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;

public class Post {
	
	public static String place;

	
	@Test
	public void AddPlace() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		
		String respo =
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(AddPlaces.add())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().asString();
		
		JsonPath js= new JsonPath(respo);
		place = js.get("place_id");
		System.out.println("Place_id"+place);
		
		
		
	}
	
	@Test
	public void GetPlaces() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", "place").when().get("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
	}
	@Test
	public void Update() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").
		body("{\r\n" + 
				"\"place_id\":\""+place+"\",\r\n" + 
				"\"address\":\"New York Queens, USA\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}")
		.when().put("maps/api/place/add/json").then().log().all().assertThat().statusCode(200);
			
			
	}
	

}

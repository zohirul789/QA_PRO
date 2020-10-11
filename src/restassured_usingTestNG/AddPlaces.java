package restassured_usingTestNG;

public class AddPlaces {
	
	public static String add() {
		String place="{\r\n" + 
				"    \"location\": {\r\n" + 
				"        \"latitude\": \"-38.383494\",\r\n" + 
				"        \"longitude\": \"33.427362\"\r\n" + 
				"    },\r\n" + 
				"    \"accuracy\": \"50\",\r\n" + 
				"    \"name\": \"QA Automation\",\r\n" + 
				"    \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"    \"address\": \"New York, USA\",\r\n" + 
				"    \"types\": \"shoe park,shop\",\r\n" + 
				"    \"website\": \"https://rahulshettyacademy.com\",\r\n" + 
				"    \"language\": \"French-IN\"\r\n" +
				"}";
		return place;
	
	}

}

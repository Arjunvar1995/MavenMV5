package package1;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void m1() {
		
		
		
		JSONObject requestbody=new JSONObject();
		
		requestbody.put("name", "Arjun");
		requestbody.put("job", "Trainer");
		
		given().
			body(requestbody.toString()).
			headers("Content-Type","application/json").
			log().body().
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().body();
		
		
	}
	
	@Test
	public void m2() {
		
		
		
		JSONObject requestbody=new JSONObject();
		
		requestbody.put("name", "AJ");
		requestbody.put("job", "TR");
		
		given().
			body(requestbody.toString()).
			headers("Content-Type","application/json").
			log().body().
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().body();
		
		
	}

}

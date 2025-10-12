package Activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Activity2 {
	
	@Test(priority=1)
	public void postRequest() throws IOException {
		
		
		FileInputStream jsonBody=new FileInputStream("C:\\Users\\004PGZ744\\Documents\\Activity2.json");
		
		
		Response response = given()
				.baseUri("https://petstore.swagger.io/v2/user") 
				.header("Content-Type", "application/json") 
				.body(jsonBody) 
				.when().post();
		
		jsonBody.close();
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("1101"));
		
		
		
	}
	
	@Test(priority=2)
	public void getRequest() {
		
		
		File outputJSON = new File("C:\\Users\\004PGZ744\\Documents\\Activity2Output.json.txt");
		
		
		Response response = given()
				.baseUri("https://petstore.swagger.io/v2/user")
				.header("Content-Type", "application/json")
				.pathParam("username", "AkshaySunku")
				.when().get("/{username}");
		
		String responseBody = response.getBody().asPrettyString();
		
		
		try {
			// Create JSON file
			outputJSON.createNewFile();
			
			FileWriter writer = new FileWriter(outputJSON.getPath());
			writer.write(responseBody);
			writer.close();
		} catch (IOException excp) {
			excp.printStackTrace();
		}
		
		
		response.then().body("id", equalTo(1101));
		response.then().body("username", equalTo("AkshaySunku"));
		response.then().body("firstName", equalTo("Akshay"));
		response.then().body("lastName", equalTo("Sunku"));
		response.then().body("email", equalTo("akshaysunku@mail.com"));
		response.then().body("password", equalTo("password123"));
		response.then().body("phone", equalTo("9812763450"));
		
	}
	
	
	
	@Test(priority=3)
	public void deleteRequest() throws IOException {
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/user") 
			.header("Content-Type", "application/json") 
			.pathParam("username", "AkshaySunku") 
			.when().delete("/{username}"); 
 
		// Assertion
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("AkshaySunku"));
	}
	
	
	

}

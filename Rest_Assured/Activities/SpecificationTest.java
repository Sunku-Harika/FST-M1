package Examples;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;

public class SpecificationTest {
	
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petID;
	
	@BeforeClass
	public void setUp() {
		requestSpec=new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2/pet")
				.addHeader("Content-Type", "application/json").build();
		responseSpec=new ResponseSpecBuilder().expectStatusCode(200)
				.expectBody("status", equalTo("alive"))
				.expectResponseTime(lessThanOrEqualTo(5000L))
				.build();
		
	}
	
	
	@Test(priority=1)
	public void postRequestTest() {
		
		Map<String,Object> jsonBody=new HashMap<>();
		
		jsonBody.put("id", 4321);
		jsonBody.put("name", "Rocky");
		jsonBody.put("status", "alive");
		
		Response response=given().spec(requestSpec).body(jsonBody).when().post();
		
		this.petID=response.then().extract().path("id");
		
		response.then().spec(responseSpec);
		
		
	}
	
	@Test(priority=2)
	public void getRequestTest() {
		
		
		
		given().spec(requestSpec).pathParam("petID",this.petID).when().get("/{petID}").
		
	then().spec(responseSpec).body("name",equalTo("Rocky"));
		
		
	}
	
	
	@Test(priority=3)
	public void deleteRequestTest() {
		
		
		
		given().spec(requestSpec).pathParam("petID",this.petID).when().delete("/{petID}").
		
	then().statusCode(200);
		
		
	}
	
	
	

}

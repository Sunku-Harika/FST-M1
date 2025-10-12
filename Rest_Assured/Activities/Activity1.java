package Activities;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.equalTo;
public class Activity1 {

	
	
	
	@Test(priority=1)
	public void postRequest()
	{
		
		Map<String,Object> mp=new HashMap<>();
		
		mp.put("id", 77239);
		mp.put("name", "Riley");
		mp.put("status", "alive");
		
		
		Response response=given().baseUri("https://petstore.swagger.io/v2/pet")
				.header("Content-Type", "application/json").body(mp).when().post();
		
		
		response.then().body("id", equalTo(77239));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
		
		
		
	}
	
	
	@Test(priority=2)
	
	public void getRequest() {
		
		Response response=given().baseUri("https://petstore.swagger.io/v2/pet")
				.header("Content-Type", "application/json")
				.when().pathParam("petId", 77239).get("/{petId}");
		
		
		
		response.then().body("id", equalTo(77239));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
		
		
	}
	
	
	
	@Test(priority=3)
	
	public void deleteRequest() {
		
		Response response=given().baseUri("https://petstore.swagger.io/v2/pet/")
				.header("Content-Type", "application/json")
				.when().pathParam("petid",77239 ).delete("/{petid}");
		
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("77239"));
		
		
		
	}
	
	
	
	
}

package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIExampleBDD {
	
	@Test(enabled = false)
	public void getEmployeeData(){
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees/1")
		.prettyPrint();
		
	}
	@Test(enabled = true)
	public void getAllEmployeeData(){
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees")
		.prettyPrint();
		
	}
	
	@Test(enabled = false)
	public void postEmployeeData(){
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
		.when()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"id\": 6,\r\n"
				+ "  \"first_name\": \"VJ\",\r\n"
				+ "  \"last_name\": \"T\",\r\n"
				+ "  \"email\": \"vjt@gmail.com\"\r\n"
				+ "}")
		.post("employees")
		.prettyPrint();
		
	}

}

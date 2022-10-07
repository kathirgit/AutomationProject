package restAPI;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIExample {
	
	@Test(enabled = false)
	public void getEmployeeData(){
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification reqs = RestAssured.given();
		Response res = reqs.request(Method.GET,"employees/1");
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusLine());
		
		
	}
	
	@Test(enabled = false)
	public void getEmployeeAllData(){
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification reqs = RestAssured.given();
		Response res = reqs.request(Method.GET,"employees");
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusLine());
		
		
	}
	@Test(enabled = false)
	public void postEmployeeData(){
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification reqs = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "      \"id\": 4,\r\n"
						+ "      \"first_name\": \"R\",\r\n"
						+ "      \"last_name\": \"K\",\r\n"
						+ "      \"email\": \"rk@gmail.com\"\r\n"
						+ "    }");
		Response res = reqs.request(Method.POST,"employees");
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusLine());
		
		
	}
	@Test(enabled = true)
	public void putEmployeeData(){
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification reqs = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"id\": 4,\r\n"
						+ "    \"first_name\": \"R\",\r\n"
						+ "    \"last_name\": \"K\",\r\n"
						+ "    \"email\": \"rk@gmail.com\"\r\n"
						+ "  }");
		Response res = reqs.request(Method.PUT,"employees/4");
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusLine());
		
		
	}

}

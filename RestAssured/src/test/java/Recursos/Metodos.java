package Recursos;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Metodos {

	public static Response response;
	
	
public void Create_User(String body, String uri) {
	
	RequestSpecification request = RestAssured
			.given()
			.contentType(ContentType.JSON)
			.header("x-api-key","reqres-free-v1")
			.body(body);
	 response = request.post(uri);
	System.out.println(response.statusCode());
	System.out.println(response.asPrettyString());
	
}

public static String GetId() {
	return  response.getBody().jsonPath().getString("id");

}
public void UpdateUser(String body,String uri,String id) {
	RequestSpecification request = RestAssured
			.given()
			.contentType(ContentType.JSON)
			.header("x-api-key","reqres-free-v1")
			.body(body);
	 response = request.put(uri+"/"+id);
	System.out.println(response.statusCode());
	System.out.println(response.asPrettyString());
}

public void PatchUser(String body,String uri,String id) {
	RequestSpecification request = RestAssured
			.given()
			.contentType(ContentType.JSON)
			.header("x-api-key","reqres-free-v1")
			.body(body);
	 response = request.patch(uri+"/"+id);
	System.out.println(response.statusCode());
	System.out.println(response.asPrettyString());


}
public void DeleteUser(String uri,String id) {
	RequestSpecification request = RestAssured
			.given()
			.contentType(ContentType.JSON)
			.header("x-api-key","reqres-free-v1");
	 response = request.delete(uri+"/"+id);
	System.out.println(response.statusCode());
	System.out.println(response.asPrettyString());


}







}

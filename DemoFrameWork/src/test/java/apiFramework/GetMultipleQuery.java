package apiFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMultipleQuery
{

	@Test
	
	public void getapiresponse ()
	
	{
	RestAssured.given()
	.queryParam("id", "2028")
	.queryParam("name", "abcd")
	.when()
	.get("https://chercher.tech/sample/api/product/read")
	.prettyPrint();
	}
	
	@Test
	
 public void getapiresponse2 ()
	
	{
	RestAssured.given()
	.queryParam("what", "hotels")
	.queryParam("where", "boston,ma")
	.queryParam("page", "1")
	.queryParam("rpp", "5")
	.queryParam("sort", "alpha")
	.queryParam("publisher", "test")
	.queryParam("format", "json")
	.when()
	.get("https://api.citygridmedia.com/content/places/v2/search/where")
	.prettyPrint();
	}
}

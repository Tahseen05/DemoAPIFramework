package apiFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetApi2 
{
     //------------- For 1 query Parameter------------------//
		
			@Test
			
			public void getapiresponse ()
			
			{
				// to specify base uri
//				RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
//				https://api.citygridmedia.com/content/places/v2/search/where?what=hotels&where=boston,ma&page=1&rpp=5&sort=alpha&publisher=test&format=json
				RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1";
//				RestAssured.baseURI = "https://api.citygridmedia.com/content/places/v2";
				
				// Request Object
				RequestSpecification ga = RestAssured.given();
				
				//Response Object
//				Response response = ga.request(Method.GET ,"/search/where?what=hotels&where=boston,ma&page=1&rpp=5&sort=alpha&publisher=test&format=json");
//				
//				ga.params("what", "hotels");
//				ga.params("where", "boston,ma");
//				ga.params("page", "1");
//				ga.params("rpp", "5");
//				ga.params("sort", "alpha");
//				ga.params("publisher", "test");
//				ga.params("format", "json");
				
				Response response = ga.queryParam ("ISBN","9781449325862").get("/Book");

				// Print response
				String responsepoutput = response.getBody().asString();
				System.out.println("Ouput Response is : " +responsepoutput);
				
				// Status code validation
				
				int status_code = response.getStatusCode();
				System.out.println("Status Code is : "+status_code );
				Assert.assertEquals(status_code, 200);
				
				// Status line verification
				
				String status_line = response.getStatusLine ();
				System.out.println("Status Line is : " +status_line);
				Assert.assertEquals(status_line, "HTTP/1.1 200 OK");
				
				
				
			}
			

		}






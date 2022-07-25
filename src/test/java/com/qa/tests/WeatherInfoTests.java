//package com.qa.tests;
//
//import org.testng.annotations.BeforeMethod;
//import org.testng.AssertJUnit;
//
//import java.util.HashMap;
//
//import org.json.simple.JSONObject;
//import org.jsoup.Connection.Response;
//import org.junit.runner.Request;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import com.qa.util.TestBase;
//import com.qa.util.TestUtil;
//import io.restassured.RestAssured;
//import io.restassured.http.Headers;
//import io.restassured.path.json.JsonPath;
//import io.restassured.specification.RequestSpecification;
//import io.restassured.response.Response;
//
//@Test
//public class WeatherInfoTests extends TestBase{
//	
//	
//	@BeforeMethod
//	public void setUp(){
//		TestBase.init();
//	}
//	
//	@DataProvider
//	public Object[][] getData(){
//		Object testData[][] = TestUtil.getDataFromSheet(TestUtil.WeatherSheetName);
//		return testData;
//	}
//
//	public void getWeatherDetailsWithCorrectCityNameTest(String city,String HTTPMethod, String humidity, String temperature,	
//			String weatherdescription, String windspeed,String winddirectiondegree)
//	{
//		
//		//1. define the base url
//	
//		//http://restapi.demoqa.com/utilities/weather/city
//		
//		
//		RestAssured.baseURI = prop.getProperty("serviceurl");
//		
//		//2. define the http request:
//		RequestSpecification httpRequest = RestAssured.given();
//		
//		//3. make a request/execute the request:
//		
//
////		JSONObject requestParams = new JSONObject(); 
////		requestParams.put("userId", "TQ123"); 
////		requestParams.put("isbn", "9781449325862"); 
////		string req =requestParams.toJSONString();
////		
////		req.header("Content-Type", "application/json"); // Add the Json to the body of the request 
////		req.body(requestParams.toJSONString()); // Post the request and check the response
//
//        Response response =httpRequest.request("Method.GET","/City");
////		Response response=httpRequest.request(Method.getMethod(null));
//		System.out.println("The status received: " + response.statusMessage());
//
//			
//		//4. get the response body:
//		String responseBody = response.getBody().asString();
//		System.out.println("Response Body is: "+ responseBody);
//		//validate city name or validate the key or value
//		AssertJUnit.assertEquals(responseBody.contains(city), true);
//		
//		//5. get the status code and validate it:
//		int statusCode = response.getStatusCode();
//		System.out.println("the status code is: "+ statusCode);
//		
//		AssertJUnit.assertEquals(statusCode, TestUtil.RESPONSE_CODE_200);
//		System.out.println("the status line is: "+ response.getStatusLine());
//		
//		//6. get the headers:
//		
//		String contentType = response.getHeader("Content-Type");
//		System.out.println("the value of content-type header is: "+ contentType);
//		
//		String contentLength = response.getHeader("Content-Length");
//		System.out.println("the value of Content-Length header is: "+ contentLength);
//
//		//get the key value by using JsonPath:
//		
//		JsonPath jsonPathValue = response.jsonPath();
//		String cityVal = jsonPathValue.get("City");
//		System.out.println("the value of city is: "+ cityVal);
//		
//		AssertJUnit.assertEquals(cityVal, city);
//		
//		String temp = jsonPathValue.get("Temperature");
//
//		System.out.println("the value of Temperature is: "+ temp);
//		AssertJUnit.assertEquals(temp, temperature);
//
//
//		String Humidity = jsonPathValue.get("Humidity");
//		System.out.println("the value of Humidity is: "+ Humidity);
//
//		String WeatherDescription = jsonPathValue.get("WeatherDescription");
//		System.out.println("the value of WeatherDescription is: "+ WeatherDescription);
//
//		String WindSpeed = jsonPathValue.get("WindSpeed");
//		System.out.println("the value of WindSpeed is: "+ WindSpeed);
//
//		String WindDirectionDegree = jsonPathValue.get("WindDirectionDegree");
//		System.out.println("the value of WindDirectionDegree is: "+ WindDirectionDegree);
//
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//
//}

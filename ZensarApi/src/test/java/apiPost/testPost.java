package apiPost;

import static io.restassured.RestAssured.given;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class testPost {

	ResponseSpecification res;

	RequestSpecification req_spec;
	JSONObject obj1;

	String str = " ";

	@BeforeClass
	public void setSpecification() {
		res = RestAssured.expect();

		res.statusLine("HTTP/1.1 200 OK");

		res.contentType(ContentType.JSON);
		ExtentReportManager.createReport("API post Report");

		InputStream data = null;
		try {
			String fnm = "data/api.json";
			data = getClass().getClassLoader().getResourceAsStream(fnm);
			JSONTokener tokener = new JSONTokener(data);
			obj1 = new JSONObject(tokener);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void Valid_loginuser() {
		ExtentReportManager.startTest("Valid credentials");

		HashMap<String, String> params = new HashMap<String, String>();
		String nmValue = obj1.getJSONObject("Valid").getString("username");
		String passValue = obj1.getJSONObject("Valid").getString("password");
		System.out.println(nmValue);
		params.put("username", nmValue);
		params.put("password", passValue);
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Base url used:", RestAssured.baseURI);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Header used:", "Authorization:" + str);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Endpoint used:", "api/login");
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Expected content type:", ContentType.JSON.toString());
		Response resp = given().when().contentType("application/json").body(params).post("api/login").then()
				.contentType(ContentType.JSON).extract().response();
		System.out.println("op is" + resp.asPrettyString());
		LinkedHashMap<String, Object> payload = resp.body().jsonPath().get("payload");

		System.out.println(payload.toString());

	}

	@Test(priority = 3)
	public void wrongPass() {
		ExtentReportManager.startTest("Wrong Pass");

		HashMap<String, String> params = new HashMap<String, String>();
		String nmValue = obj1.getJSONObject("Valid").getString("username");
		String passValue = obj1.getJSONObject("wrongPass").getString("password");
		System.out.println(nmValue);
		params.put("username", nmValue);
		params.put("password", passValue);
		RestAssured.baseURI = "https://arcadia.pisysindia.com/";
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Base url used:", RestAssured.baseURI);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Header used:", "Authorization:" + str);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Endpoint used:", "api/login");
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Expected content type:", ContentType.JSON.toString());
		Response resp = given().when().contentType("application/json").body(params).post("api/login").then()
				.contentType(ContentType.JSON).extract().response();
		System.out.println("op is" + resp.asPrettyString());
		LinkedHashMap<String, Object> payload = resp.body().jsonPath().get("payload");

		System.out.println(payload.toString());

	}

	@AfterMethod
	public void tearDown() {
		ExtentReportManager.extentReport.endTest(ExtentReportManager.extentTest);
	}

	@AfterClass
	public void closeReport() {
		ExtentReportManager.extentReport.flush();
	}

}

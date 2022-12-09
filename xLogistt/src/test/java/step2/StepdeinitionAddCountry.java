package step2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.loginPage1;
import PO.loginPage2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepdeinitionAddCountry {
	WebDriver driver ;
	public loginPage2 obj;
	@Given("User open Chrome browser")
	public void user_open_chrome_browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			obj = new loginPage2(driver);
	}

	@When("User Open URL {string}")
	public void user_open_url(String string) {
		  // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			driver.get(string);
	}

	@When("User enter Emails as {string} and Password as {string} and Click on Login")
	public void user_enter_emails_as_and_password_as_and_click_on_login(String string, String string2) {
		try {
	        obj.valid(string,string2);
	        obj.Clicklogin();
	        Thread.sleep(4000);
		  ;

	       }catch(Exception ex)
	       {
	           ex.printStackTrace();
	       }
	}

	@When("User click on Locationsdropdown will open")
	public void user_click_on_locationsdropdown_will_open() throws InterruptedException {
	
		 obj.clickLocation();
	}

	@Then("Click on Country")
	public void click_on_country() throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
		   //  throw new io.cucumber.java.PendingException();
			 obj.clickCountry();
	}

	@Then("Click on Add Country and enter Country as {string}")
	public void click_on_add_country_and_enter_country_as(String string) throws InterruptedException {
	
	    // throw new io.cucumber.java.PendingException();
		 obj.clickAddCountry();
		 obj.send(string);
	}

	@Then("Click on add")
	public void click_on_add() throws InterruptedException {
		  // Write code here that turns the phrase above into concrete actions
	     //throw new io.cucumber.java.PendingException();
		 obj.clickAddingCountry();

	}

	@Then("Close Browser")
	public void close_browser() {
		 // Write code here that turns the phrase above into concrete actions
	    // new io.cucumber.java.PendingException();
			driver.close();
	}
}

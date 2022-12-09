package step1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.loginPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionAdd {
	WebDriver driver ;
	public loginPage1 obj;
	
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		obj = new loginPage1(driver);
		
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.get(url);
	}
	 @When("User enters Emails as {string} and Password as {string} and Click on Login")
	    public void user_enters_emails_as_and_password_as(String mail, String pass) {
	        // Write code here that turns the phrase above into concrete actions
	       //throw new io.cucumber.java.PendingException();
	       try {
	        obj.valid(mail,pass);
	        obj.Clicklogin();
	        Thread.sleep(4000);
		  ;

	       }catch(Exception ex)
	       {
	           ex.printStackTrace();
	       }
	    }

	 @When("User click on Locations dropdown will open")
	 public void user_click_on_locations_dropdown_will_open() throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
	    // throw new io.cucumber.java.PendingException();
		 obj.clickLocation();
		 
	 }

	 @Then("click on City")
	 public void click_on_city() throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
	   //  throw new io.cucumber.java.PendingException();
		 obj.clickCity();
	 }

	 @Then("click on Add City and enter city as {string}")
	 public void click_on_add_city_and_enter_city_as(String string) throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
	    // throw new io.cucumber.java.PendingException();
		 obj.clickAddCity();
		 obj.send(string);
	 }

	 @Then("click on Add")
	 public void click_on_add() throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new io.cucumber.java.PendingException();
		 obj.clickAddingCity();
	 }

	 @Then("close browser")
	 public void close_browser() {
	     // Write code here that turns the phrase above into concrete actions
	    // new io.cucumber.java.PendingException();
			driver.close();

	 }
	
	
}

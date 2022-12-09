package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage2 {

	  public loginPage2(WebDriver ldriver)
	    {
	        PageFactory.initElements(ldriver, this);
	    }
	    
	    @FindBy(xpath="//*[@id=\"useremail\"]")
	    @CacheLookup
	    WebElement emailinput;
	    public void email1(String mail)
	    {    
	        emailinput.sendKeys(mail);
	    }
	    
	    @FindBy(xpath="//*[@id=\"password\"]")
	    @CacheLookup
	    WebElement password;
	    public void password1(String pass)
	    {
	        password.sendKeys(pass);
	    }
	    
	    @FindBy(xpath="//*[@id=\"LoginForm\"]/button")
	    @CacheLookup
	    WebElement submit;
	    public void submit1()
	    {
	        submit.click();
	    }
	    
	    
	    public void valid(String mail,String pass)
	    {
	        email1(mail);
	        password1(pass);
	    }
	    
	    public void Clicklogin()
	    {
	        submit1();
	    }
	    
	    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
	    @CacheLookup
	    WebElement location;
	    public void Locations() throws InterruptedException {
	    	location.click();
	    	Thread.sleep(2000);
	    }
	    
	    public void clickLocation() throws InterruptedException {
	    	Locations();
	    }
	    
	    
	    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
	    @CacheLookup
	    WebElement country;
	    public void Country() throws InterruptedException {
	    	country.click();
	    	Thread.sleep(2000);
	    }
	    
	    public void clickCountry() throws InterruptedException {
	    	Country();
	    }
	    
	    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
	    @CacheLookup
	    WebElement addcountry;
	    public void addCountry() throws InterruptedException {
	    	addcountry.click();
	    	Thread.sleep(2000);
	    }
	    
	    public void clickAddCountry() throws InterruptedException {
	    	addCountry();
	    }
	    
	    @FindBy(how = How.XPATH, using = "//*[@id=\"Country\"]")
	    @CacheLookup
	    WebElement countryField;
	    public void sendCountry(String city) throws InterruptedException {
	    	countryField.sendKeys(city);
	    	Thread.sleep(2000);
	    }
	    
	    public void send(String str) throws InterruptedException {
	    	sendCountry(str);
	    }
	    
	    
	    @FindBy(how = How.XPATH, using = "//*[@id=\"addCountry\"]/div/div[2]/div/div/button")
	    @CacheLookup
	    WebElement add;
	    public void addingCountry() throws InterruptedException {
	    	add.click();
	    	Thread.sleep(2000);
	    }
	    
	    public void clickAddingCountry() throws InterruptedException {
	    	addingCountry();
	    }
	    
	    
}

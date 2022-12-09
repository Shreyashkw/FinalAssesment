package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage1 {
public WebDriver ldriver;
    
    public loginPage1(WebDriver ldriver)
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
    
    
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[3]/a")
    @CacheLookup
    WebElement city;
    public void City() throws InterruptedException {
    	city.click();
    	Thread.sleep(2000);
    }
    
    public void clickCity() throws InterruptedException {
    	City();
    }
    
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
    @CacheLookup
    WebElement addcity;
    public void addCity() throws InterruptedException {
    	addcity.click();
    	Thread.sleep(2000);
    }
    
    public void clickAddCity() throws InterruptedException {
    	addCity();
    }
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
    @CacheLookup
    WebElement cityField;
    public void sendCity(String city) throws InterruptedException {
    	cityField.sendKeys(city);
    	Thread.sleep(2000);
    }
    
    public void send(String str) throws InterruptedException {
    	sendCity(str);
    }
    
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"addCity\"]/div/div[2]/div/div/button")
    @CacheLookup
    WebElement add;
    public void addingCity() throws InterruptedException {
    	add.click();
    	Thread.sleep(2000);
    }
    
    public void clickAddingCity() throws InterruptedException {
    	addingCity();
    }
    
    
    
}

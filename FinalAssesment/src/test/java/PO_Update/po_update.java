package PO_Update;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.relevantcodes.extentreports.LogStatus;

import Utility_Coupon.report;

public class po_update {

	WebDriver driver;

	public po_update(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"useremail\"]")
	WebElement email;

	public void sendEmail(String mail) {
		email.sendKeys(mail);
		//report.extentTest.log(LogStatus.INFO, "Eneter mail", mail);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement password;

	public void sendPass(String pass) {
		password.sendKeys(pass);
//		report.extentTest.log(LogStatus.INFO, "Enter password", pass);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"LoginForm\"]/button")
	WebElement login;

	public void clickLog() {
		login.click();
	//	report.extentTest.log(LogStatus.INFO, "Clicking login", "Clicked");
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[3]/a")
	WebElement product;

	public void clickProduct() {
		product.click();
	//	report.extentTest.log(LogStatus.INFO, "Clicking on coupon", "Clicked");
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a")
	WebElement category;

	public void clickCategory() {
		category.click();
		//report.extentTest.log(LogStatus.INFO, "Clicking on category", "Clicked");
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[1]")
	WebElement actionName;

	public void clickNameAction() {
		actionName.click();
		
	//	report.extentTest.log(LogStatus.INFO, "Clicking on add Image action", "Clicked");
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"category_name\"]")
	WebElement name;

	
	public void sendName(String nm) {
		name.clear();
		name.sendKeys(nm);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"editCategory\"]/div[2]/div/button")
	WebElement updateName;
	public void clickUpdate() {
		updateName.click();
		//report.extentTest.log(LogStatus.INFO, "Clicking add", "Clicked");
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[2]")
	WebElement action;

	public void clickAction() {
		action.click();
	//	report.extentTest.log(LogStatus.INFO, "Clicking on add Image action", "Clicked");
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"inputFile-2\"]")
	WebElement image;

	public void sendImage(String nm) {
		image.sendKeys(nm);
		//report.extentTest.log(LogStatus.INFO, "Enter new coupon name", "entered");
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"addSubcategory\"]/div/div[2]/div/div/button")
	WebElement add;

	public void clickSubmit() {
		add.click();
		//report.extentTest.log(LogStatus.INFO, "Clicking add", "Clicked");
	}

	public void valid(String mail, String pass, String name,String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		
		
		sendPass(pass);
		Thread.sleep(2000);
		
		
		clickLog();
		Thread.sleep(2000);
		
		
		clickProduct();
		Thread.sleep(2000);
		
		
		clickCategory();
		Thread.sleep(2000);
		
		
		clickNameAction();
		Thread.sleep(2000);
		
		
		sendName(name);
		Thread.sleep(2000);
		
		
		clickUpdate();
		Thread.sleep(2000);
		
		
		clickAction();
		Thread.sleep(2000);
		
		
		sendImage(nm);
		Thread.sleep(2000);
		
		
		clickSubmit();
		
		
		
	}

	
}

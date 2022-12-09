package PO_Coupon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.relevantcodes.extentreports.LogStatus;

import Utility_Coupon.report;

public class po {

	WebDriver driver;

	public po(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"useremail\"]")
	WebElement email;

	public void sendEmail(String mail) {
		email.sendKeys(mail);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement password;

	public void sendPass(String pass) {
		password.sendKeys(pass);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"LoginForm\"]/button")
	WebElement login;

	public void clickLog() {
		login.click();
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/ul/li[8]/a")
	WebElement coupon;

	public void clickCoupon() {
		coupon.click();
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
	WebElement addCoupon;

	public void clickAddCoupon() {
		addCoupon.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"coupon_name\"]")
	WebElement couponField;

	public void sendCoupon(String nm) {
		couponField.sendKeys(nm);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"addcategory\"]/div/div[2]/div/div/button")
	WebElement add;

	public void clickSubmit() {
		add.click();
	}

	public void valid(String mail, String pass, String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		sendPass(pass);
		Thread.sleep(2000);
		clickLog();
		Thread.sleep(2000);
		clickCoupon();
		Thread.sleep(2000);
		clickAddCoupon();
		Thread.sleep(2000);
		sendCoupon(nm);
		Thread.sleep(2000);
		clickSubmit();
		Thread.sleep(2000);
		

	}

	public void blank(String mail, String pass, String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		sendPass(pass);
		Thread.sleep(2000);
		clickLog();
		Thread.sleep(2000);
		clickCoupon();
		Thread.sleep(2000);
		clickAddCoupon();
		Thread.sleep(2000);
		sendCoupon(nm);
		Thread.sleep(2000);
		clickSubmit();
		Thread.sleep(2000);
		

	}
	public void special(String mail, String pass, String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		sendPass(pass);
		Thread.sleep(2000);
		clickLog();
		Thread.sleep(2000);
		clickCoupon();
		Thread.sleep(2000);
		clickAddCoupon();
		Thread.sleep(2000);
		sendCoupon(nm);
		Thread.sleep(2000);
		clickSubmit();
		Thread.sleep(2000);
		

	}
	public void oneNum(String mail, String pass, String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		sendPass(pass);
		Thread.sleep(2000);
		clickLog();
		Thread.sleep(2000);
		clickCoupon();
		Thread.sleep(2000);
		clickAddCoupon();
		Thread.sleep(2000);
		sendCoupon(nm);
		Thread.sleep(2000);
		clickSubmit();
		Thread.sleep(2000);
		

	}
	public void oneChar(String mail, String pass, String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		sendPass(pass);
		Thread.sleep(2000);
		clickLog();
		Thread.sleep(2000);
		clickCoupon();
		Thread.sleep(2000);
		clickAddCoupon();
		Thread.sleep(2000);
		sendCoupon(nm);
		Thread.sleep(2000);
		clickSubmit();
		Thread.sleep(2000);
		

	}
	public void Space(String mail, String pass, String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		sendPass(pass);
		Thread.sleep(2000);
		clickLog();
		Thread.sleep(2000);
		clickCoupon();
		Thread.sleep(2000);
		clickAddCoupon();
		Thread.sleep(2000);
		sendCoupon(nm);
		Thread.sleep(2000);
		clickSubmit();
		Thread.sleep(2000);
		

	}
	public void maxNum(String mail, String pass, String nm) throws InterruptedException {
		sendEmail(mail);
		Thread.sleep(2000);
		sendPass(pass);
		Thread.sleep(2000);
		clickLog();
		Thread.sleep(2000);
		clickCoupon();
		Thread.sleep(2000);
		clickAddCoupon();
		Thread.sleep(2000);
		sendCoupon(nm);
		Thread.sleep(2000);
		clickSubmit();
		Thread.sleep(2000);
		

	}

}

package Test_Coupon;


import java.io.InputStream;

import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO_Coupon.po;
import Utility_Coupon.browser;
import Utility_Coupon.report;

public class test_coupon {
	
		
		WebDriver driver;
		org.json.JSONObject obj;
		
		@BeforeClass
		public void before() {
			InputStream data = null;
			try {
				
				String fnm = "data/assesment.json";
				data = getClass().getClassLoader().getResourceAsStream(fnm);
				JSONTokener tokener = new JSONTokener(data);
				obj = new org.json.JSONObject(tokener);
				System.out.println("Data:" + obj.toString());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@BeforeMethod
		@Parameters({"browser","url"})
		public void setup(String Browser,String url) throws InterruptedException {
			driver = browser.getDriver(Browser);
			Thread.sleep(2000);
			driver.get(url);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);

		}
		
		@Test(priority = 1)
		public void valid_data() throws InterruptedException {
			String mail = obj.getJSONObject("Valid").getString("loginEmail");
			String pass = obj.getJSONObject("Valid").getString("loginPassword");
			String nm = obj.getJSONObject("Valid").getString("Coupon");
			
			po pobj = PageFactory.initElements(driver, po.class);
			pobj.valid(mail, pass,nm);
		}
		
		@Test(priority = 2)
		public void blank_data() throws InterruptedException {
			String mail = obj.getJSONObject("InValid").getString("loginEmail");
			String pass = obj.getJSONObject("InValid").getString("loginPassword");
			String nm = obj.getJSONObject("Blank").getString("Coupon");
			
			po pobj = PageFactory.initElements(driver, po.class);
			pobj.blank(mail, pass,nm);
		}
		

		@Test(priority = 3)
		public void special() throws InterruptedException {
			String mail = obj.getJSONObject("InValid").getString("loginEmail");
			String pass = obj.getJSONObject("InValid").getString("loginPassword");
			String nm = obj.getJSONObject("specialCharcter").getString("Coupon");
			
			po pobj = PageFactory.initElements(driver, po.class);
			pobj.special(mail, pass,nm);
		}
		

		@Test(priority = 4)
		public void oneNum_data() throws InterruptedException {
			String mail = obj.getJSONObject("InValid").getString("loginEmail");
			String pass = obj.getJSONObject("InValid").getString("loginPassword");
			String nm = obj.getJSONObject("oneNum").getString("Coupon");
			
			po pobj = PageFactory.initElements(driver, po.class);
			pobj.oneNum(mail, pass,nm);
		}
		

		@Test(priority = 5)
		public void oneChar_data() throws InterruptedException {
			String mail = obj.getJSONObject("InValid").getString("loginEmail");
			String pass = obj.getJSONObject("InValid").getString("loginPassword");
			String nm = obj.getJSONObject("oneChar").getString("Coupon");
			
			po pobj = PageFactory.initElements(driver, po.class);
			pobj.oneChar(mail, pass,nm);
		}
		

		@Test(priority = 6)
		public void Space_data() throws InterruptedException {
			String mail = obj.getJSONObject("InValid").getString("loginEmail");
			String pass = obj.getJSONObject("InValid").getString("loginPassword");
			String nm = obj.getJSONObject("Space").getString("Coupon");
			
			po pobj = PageFactory.initElements(driver, po.class);
			pobj.Space(mail, pass,nm);
		}
		

		@Test(priority = 7)
		public void maxNum_data() throws InterruptedException {
			String mail = obj.getJSONObject("InValid").getString("loginEmail");
			String pass = obj.getJSONObject("InValid").getString("loginPassword");
			String nm = obj.getJSONObject("maxNum").getString("Coupon");
			
			po pobj = PageFactory.initElements(driver, po.class);
			pobj.maxNum(mail, pass,nm);
		}
		
		

	}



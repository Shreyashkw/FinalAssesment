package test_Update;


import java.io.InputStream;

import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO_Update.po_update;
import Utility_Coupon.browser;

public class test_update {
	
		
		WebDriver driver;
		org.json.JSONObject obj;
		
		@BeforeClass
		public void before() {
			InputStream data = null;
			try {
				
				String fnm = "data/update.json";
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
			String name = obj.getJSONObject("Valid").getString("name");
			String nm = obj.getJSONObject("Valid").getString("path");
			
			po_update pobj = PageFactory.initElements(driver, po_update.class);
			pobj.valid(mail,pass,name,nm);
		}
		
		
		
		

	}



package Nop;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registerNOP {
	
	public static void main(String[] args) {
	try
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
     
        
        
         driver.get("https://www.nopcommerce.com/en");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         
         WebElement userIcon=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
         WebElement registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
     
         Actions action=new Actions(driver);
         action.moveToElement(userIcon);
         action.click(registerlink).build().perform();
         
         
         WebElement First_Name= driver.findElement(By.xpath("//input[@id='FirstName']"));
         First_Name.sendKeys("Ameya");
         Thread.sleep(2000);


       WebElement Last_Name= driver.findElement(By.xpath("//input[@id='LastName']"));
         Last_Name.sendKeys("Wankhede");
         Thread.sleep(2000);


       WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
         email.sendKeys("Ameya14@gmail.com");
         Thread.sleep(2000);
         
         //WebElement Last_Name= driver.findElement(By.id("LastName"));
         WebElement Confirm_Email= driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
         Confirm_Email.sendKeys("Ameya14@gmail.com");
         Thread.sleep(2000);




        WebElement Username= driver.findElement(By.xpath("//input[@id='Username']"));
         Username.sendKeys("Ameya");
         Thread.sleep(2000);


         WebElement Check_Availiblity= driver.findElement(By.xpath("//*[@id=\"check-availability-button\"]"));
         Check_Availiblity.click();
         Thread.sleep(2000);
         
        
         WebElement country= driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
         Select select = new Select(country);
         select.selectByIndex(1);
         Thread.sleep(2000);
         
         WebElement timneZone= driver.findElement(By.xpath("//*[@id=\"TimeZoneId\"]"));
         Select select1 = new Select(timneZone);
         select1.selectByIndex(1);
         Thread.sleep(2000);
         
         WebElement password= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
         password.sendKeys("Ameya@14");
         Thread.sleep(2000);
         
         WebElement confrimPassword= driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
         confrimPassword.sendKeys("Ameya@14");
         Thread.sleep(2000);
         
         WebElement company= driver.findElement(By.xpath("//*[@id=\"Details_CompanyIndustryId\"]"));
         Select select2 = new Select(company);
         select2.selectByIndex(4); 
         Thread.sleep(2000);
         
//         WebElement companyActicity = driver.findElement(By.xpath("//*[@id=\"Details_CompanyRoleId\"]"));
//         Select select3 = new Select(companyActicity);
//         select3.selectByIndex(4);
//         
//         WebElement companyPeopleCount = driver.findElement(By.xpath("//*[@id=\"Details_CompanySizeId\"]"));
//         Select select4 = new Select(companyPeopleCount);
//         select4.selectByIndex(1);
//         
//         WebElement companyURL = driver.findElement(By.xpath("//*[@id=\"Details_CompanyWebsiteUrl\"]"));
//         companyURL.sendKeys("NA");
//         
         WebElement register = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
         register.click();
         Thread.sleep(2000);
         
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 		 FileUtils.copyFile(src, new File(".//Screenshot//shreyash.png"));
         
         Thread.sleep(2000);
         
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}

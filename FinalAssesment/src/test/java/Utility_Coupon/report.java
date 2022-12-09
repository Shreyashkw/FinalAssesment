package Utility_Coupon;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class report {
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	public static void create(String fnm) {
		Date date = new Date();
		long time = date.getTime();
		extentReports = new ExtentReports(System.getProperty("usr-dir")+"/target/data-output/"+fnm+"_"+time+".html");
		
	}
	
	public static void start(String nm) {
		extentTest = extentReports.startTest(nm);
	}
}

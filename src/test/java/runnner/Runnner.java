package runnner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass1.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\CFBDD\\src\\test\\java\\com\\feature", glue = "Step", monochrome = true,plugin = {"html:Report/Html_Report", 
		 "pretty", 
		 "json:Reports/Cucumber.json",
		 "com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html" })
public class Runnner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = BaseClass.browserLaunch("chrome");
}

	@AfterClass
	public static void tearDown() {
		BaseClass.driverClose();
		System.out.println("hotel book browser close");

	}
}

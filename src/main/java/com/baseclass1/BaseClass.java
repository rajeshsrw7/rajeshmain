package com.baseclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	// Browser Launch
	public static WebDriver browserLaunch(String options) {
		if (options.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\CucumberFrameWork\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (options.equalsIgnoreCase("firebox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			// driver = new FirefoxDriver();
		}
		return driver;
	}

	// Get
	public static void url(String url) {
		driver.get(url);
	}

	// Quit
	public static void driverQuit() {
		driver.quit();
	}

	// Close
	public static void driverClose() {
		driver.close();
	}

	// Click
	public static void elementClick(WebElement element) {
		element.click();
	}

	// SendKeys
	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	// dropdown
	public static void dropDown(WebElement element, String options, String value) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (options.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		} else if (options.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
	}
}

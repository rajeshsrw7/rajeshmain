package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotel {
	public WebDriver driver;
	@FindBy(id = "logout")
	private WebElement logout;
	

	public WebElement getLogout() {
		return logout;
	}

	public ConfirmHotel(WebDriver abc) {
		this.driver = abc;
		PageFactory.initElements(driver, this);
	}
}

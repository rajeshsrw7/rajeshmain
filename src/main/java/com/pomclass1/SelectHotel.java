package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public WebDriver driver;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public SelectHotel(WebDriver abc) {
		this.driver = abc;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "continue")
	private WebElement continuenext;

	public WebElement getContinuenext() {
		return continuenext;
	}

}

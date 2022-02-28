package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public WebDriver driver;
	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	public BookHotel(WebDriver abc) {
		this.driver = abc;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(id = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement cardno;

	public WebElement getCardno() {
		return cardno;
	}

	@FindBy(xpath = "//select[@class='select_combobox']")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}

	@FindBy(xpath = "(//select[@class='select_combobox2'])[1]")
	private WebElement expdate;

	public WebElement getExpdate() {
		return expdate;
	}

	@FindBy(xpath = "(//select[@class='select_combobox2'])[2]")
	private WebElement expyear;

	public WebElement getExpyear() {
		return expyear;
	}

	@FindBy(xpath = "(//input[@type='text'])[14]")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}

}

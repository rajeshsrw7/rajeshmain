package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels {
	public WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	public SearchHotels(WebDriver abc) {
		this.driver = abc;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[3]")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement noofroom;

	public WebElement getNoofroom() {
		return noofroom;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement datein;

	public WebElement getDatein() {
		return datein;
	}

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement dateout;

	public WebElement getDateout() {
		return dateout;
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private WebElement adults;

	public WebElement getAdults() {
		return adults;
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
	private WebElement childrens;

	public WebElement getChildrens() {
		return childrens;
	}

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

}

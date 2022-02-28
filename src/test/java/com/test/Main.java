package com.test;

import com.baseclass1.BaseClass;
import com.pomclass1.Login;
import com.pomclass1.SearchHotels;

public class Main extends BaseClass{
	public static void main(String[] args) {
		browserLaunch("chrome");
		url("https://adactinhotelapp.com/");
		Login p1 = new Login(driver);
		inputValues(p1.getUsername(), "rajesh777");
		inputValues(p1.getPassword(), "6969B1");
		elementClick(p1.getLogin());
		SearchHotels p2 = new SearchHotels(driver);
		dropDown(p2.getLocation(), "visibletext", "Sydney");
	}

}

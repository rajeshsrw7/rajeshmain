package Step;

import com.baseclass1.BaseClass;
import com.pomclass1.BookHotel;
import com.pomclass1.ConfirmHotel;
import com.pomclass1.Login;
import com.pomclass1.SearchHotels;
import com.pomclass1.SelectHotel;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDe extends BaseClass{
	@Given("^user Launch The Adaction Application$")
	public void user_Launch_The_Adaction_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		url("https://adactinhotelapp.com/index.php");
	   // throw new PendingException();
	}
Login p1 = new Login(driver);
	@When("^user Enters The \"([^\"]*)\" In The Username Input Box$")
	public void user_Enters_The_In_The_Username_Input_Box(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputValues(p1.getUsername(), username);
	  //  throw new PendingException();
	}

	@When("^user Enters The \"([^\"]*)\" In The Password Input Box$")
	public void user_Enters_The_In_The_Password_Input_Box(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputValues(p1.getPassword(), password);
	 //   throw new PendingException();
	}

	@Then("^user Clicks The Login Buttton And It Navigates To The Search Hotel Page$")
	public void user_Clicks_The_Login_Buttton_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		elementClick(p1.getLogin());
	    //throw new PendingException();
	}
	SearchHotels p2 = new SearchHotels(driver);
	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		dropDown(p2.getLocation(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		dropDown(p2.getHotels(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		dropDown(p2.getRoomtype(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		dropDown(p2.getNoofroom(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user Select The Check In Date \"([^\"]*)\" In The Data Input Box$")
	public void user_Select_The_Check_In_Date_In_The_Data_Input_Box(String in) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputValues(p2.getDatein(), in);
	   // throw new PendingException();
	}

	@When("^user Select The Check Out Date \"([^\"]*)\" In The Data Input Box$")
	public void user_Select_The_Check_Out_Date_In_The_Data_Input_Box(String out) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputValues(p2.getDateout(), out);
	    //throw new PendingException();
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		dropDown(p2.getAdults(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		dropDown(p2.getChildrens(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^user Click On The Search Button And Verify User Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_Verify_User_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		elementClick(p2.getSubmit());
	    //throw new PendingException();
	}
SelectHotel p3 = new SelectHotel(driver);
	@When("^user Click On The Radiobox Button$")
	public void user_Click_On_The_Radiobox_Button() throws Throwable {
		elementClick(p3.getRadiobutton());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^user Click On The Continue Button And Verify User Navigates To The Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_Verify_User_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		elementClick(p3.getContinuenext());
	   // throw new PendingException();
	}
BookHotel p4 = new BookHotel(driver);
	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		inputValues(p4.getFirstname(), "rajesh");
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		inputValues(p4.getLastname(), "s");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		inputValues(p4.getAddress(), "1/63,street");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		inputValues(p4.getCardno(), "1234567890123456");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		dropDown(p4.getCardtype(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user Select The Expiary Date$")
	public void user_Select_The_Expiary_Date() throws Throwable {
		dropDown(p4.getExpdate(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user Select The Expiary Year$")
	public void user_Select_The_Expiary_Year() throws Throwable {
		dropDown(p4.getExpyear(), "index", "2");
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		inputValues(p4.getCvv(), "123");
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}

	@Then("^user Click On The Book Now Button And Verify User Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_Verify_User_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		elementClick(p4.getBooknow());
	    //throw new PendingException();
	}
	
ConfirmHotel p5 = new ConfirmHotel(driver);
	@When("^user Click The Logout Button And Verify User Navigates To The Logout Page$")
	public void user_Click_The_Logout_Button_And_Verify_User_Navigates_To_The_Logout_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		elementClick(p5.getLogout());
	    //throw new PendingException();
	}


}

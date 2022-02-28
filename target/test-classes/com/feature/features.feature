Feature: Hotel Room Booking In Adactin Aplication
Scenario: Launching of Application
  Given user Launch The Adaction Application
  When user Enters The "rajesh777" In The Username Input Box
  When user Enters The "6969B1" In The Password Input Box
  Then user Clicks The Login Buttton And It Navigates To The Search Hotel Page
  
Scenario: Search a hotel in the application
 When user Select The Location
 And user Select The Hotels
 And user Select The Room Type
 And user Select The Number Of Rooms
 And user Select The Check In Date "13/07/2021" In The Data Input Box
 And user Select The Check Out Date "14/07/2021" In The Data Input Box
 And user Select The Adults Per Room
 And user Select The Children Per Room
 Then user Click On The Search Button And Verify User Navigates To The Select Hotel Page

Scenario: Select a hotel in the application
 When user Click On The Radiobox Button
 Then user Click On The Continue Button And Verify User Navigates To The Book A Hotel Page

Scenario: Book a hotel in the application
 When user Enter The First Name
 And user Enter The Last Name
 And user Enter The Billing Address
 And user Enter The Credit Card Number
 And user Select The Credit Card Type
 And user Select The Expiary Date
 And user Select The Expiary Year
 And user Enter The CVV Number
 Then user Click On The Book Now Button And Verify User Navigates To The Booking Confirmation Page

Scenario: Confirm a hotel in the application
 When user Click The Logout Button And Verify User Navigates To The Logout Page
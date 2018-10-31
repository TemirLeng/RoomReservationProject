@SPA1805
Feature: Smoke Test

 Scenario: Smoke test for login to make reservation

	 Given user is on the sign in page
	 When user sign in using email "teacherilsamnickel@gmail.com" and password "samnickel"
	 And user clicks on hunt to make reservation
	 And user chooses desired date "08/31" and time from "9:00pm" to "10:00pm" then clicks search button
	 And user clicks on book for microsoft room
	 Then booking confirmation page displayed
	 And user clicks on confirm button to reserve the room
	 And user "conference in microsoft has been successfully scheduled"
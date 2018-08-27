@SPA1805
Feature: Smoke Test

 Scenario: Smoke test for login to make reservation
 
	Given user is on the login page
	Given user login using email "teacherilsamnickel@gmail.com" and password "samnickel"
	And user clicks on the sign in button
	When user clicks on hunt to make reservation
	And user chooses "8/31" as the desired date and from hour "9:00PM" till "10:00PM"
	Then user clicks on book for microsoft room
	Then booking confirmation page displayed 
	And user clicks on confirm button to reserve the room
	And user "conference in microsoft has been successfully scheduled"
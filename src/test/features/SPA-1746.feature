Feature: Reservation Page Information
  @SPA1746
  Scenario: User should verify that free spots, and book links are displayed after choosing date and time for reservation
    Given user is on the sign in page
    Then user sign in using email "teacherilsamnickel@gmail.com" and password "samnickel"
    When user clicks on "hunt" to make reservation
    Then user chooses desired date "28" and time from "12:00am" to "2:00pm" then clicks search button
    Then verify "free spots" is displayed
    And verify "book" links displayed in every room
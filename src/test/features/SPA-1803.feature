Feature: Make reservation
  @SPA1016
  Scenario: Make reservation and check with database
    Given user is on the sign in page
    When user sign in using email "htwinbrowb4@blogspot.com" and password "kanyabang"
    When user clicks on hunt to make reservation
    Then user chooses desired date "08/30" and time from "7:00am" to "8:00am" then clicks search button
    Then user clicks on book to reserve for "amazon" room
    And user clicks on confirm button to reserve the room
    Then user's info should match database with name "Kanya Banga" and date "08/30" on schedule page
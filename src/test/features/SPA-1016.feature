Feature: Make reservation

  Scenario: Make reservation and check with database
    Given the user is on the sign in page
    When the user sign in using email "htwinbrowb4@blogspot.com" and password "kanyabang"
    When the user clicks on hunt to make reservation
    Then user chooses desired date "30" and time from "1:00pm" to "2:30pm" then clicks search button
    Then user clicks on book to reserve for "amazon" room
    And user clicks on confirm button to reserve the room
    Then user's info should match database with name "Kanya Banga" and date "08/30" on schedule page
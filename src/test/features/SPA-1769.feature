Feature: SPA-1769

  Scenario: Reserve a Room
    Given user is on home page
    When user clicks on hunt page
    And hunt for spot page is displayed
    Then user chooses date "31" and time from "12:00am" to "1.00pm"
    And user reserves "microsoft" room
    And verify "conference in microsoft has been successfully scheduled" message is displayed
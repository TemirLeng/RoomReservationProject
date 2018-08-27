@SPA-1802 @SPA-1741
Feature: User reserves a room

  Scenario Outline:

    Given "<user>" is on the signs in to page using valid "<email>" and "<password>"
    When "<user>" clicks on hunt to make reservation
    And chooses "current date" as the desired date
    And enters startTime "8:30am" endTime "9:30am" then searches and verifies free spots are displayed
    And clicks on book for "Apple" then verifies the time and confirms
    Then verifies that "Apple" has been reserved as a desired room

    Examples:
      |user       | email                         | password  |
      |Kanya Bang | htwinbrowb4@blogspot.com      | kanyabang |
      |Sam Nickel | teacherilsamnickel@gmail.com  | samnickel |
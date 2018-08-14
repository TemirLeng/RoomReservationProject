Feature: Reservation window

  Reservation window for the day should be from 7 am to 10 pm.

  Scenario Outline:
    Given <user> logs into the application
    When <user> navigates to hunt page
    And <user> chooses the date
    Then <user> should be able to make a reservation within 7 am and 10 pm

    Examples:
      |user      |
      |team-lead |
      |teacher   |

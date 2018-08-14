Feature: Reservation time

  User should be able to reserve a room on at least for 30 minutes and 2 hours maximum.

  Scenario Outline:
    Given <user> logs into the application
    When <user> navigates to hunt page
    And <user> chooses the date
    Then <user> chooses valid time for reservation

    Examples:
      |user     |
      |teacher  |
      |team-lead|
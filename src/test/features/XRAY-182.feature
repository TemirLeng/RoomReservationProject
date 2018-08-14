Feature: Reservations display

  As a user, I should be able to see my reservations for the day for all rooms within location.

  Scenario Outline:
    Given <user> logs into the application
    When <user> navigates to the schedule page
    Then <user> should be able to see all his reservations displayed

    Examples:
      |user     |
      |team-lead|
      |teacher  |
      |student  |
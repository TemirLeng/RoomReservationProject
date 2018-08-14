Feature: Cancel reservation

  As a user, I should be able to cancel reservation, which was booked.

  Scenario Outline:
    Given <user> navigates to the schedule page
    When <user> chooses a reserved room
    And <user> clicks on cancel conference button
    Then <user> should see that reserved room is not displayed

    Examples:
      |user     |
      |teacher  |
      |team-lead|

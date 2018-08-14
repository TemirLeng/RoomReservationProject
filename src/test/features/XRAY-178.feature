Feature: Room reservation

  User should be able to select the date and time when he accesses the hunt page.

  Scenario Outline:
    Given <user> logs into the application
    When <user> clicks on the "hunt" link
    And <user> selects the date and time
    Then <user> should be able to choose and book a room

    Examples:
      |user     |
      |teacher  |
      |team-lead|

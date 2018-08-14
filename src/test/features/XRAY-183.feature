Feature: Schedule view

  User should be able to see daily view for each room.

  Scenario Outline:
    Given <user> logs into the application
    When <user> clicks on any room
    Then <user> should be able to see table schedule

    Examples:
      |user     |
      |student  |
      |teacher  |
      |team-lead|
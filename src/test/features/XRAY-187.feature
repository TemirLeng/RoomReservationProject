Feature: Location title

  User should be able to see their location.

  Scenario Outline:
    Given <user> logs into the application
    And <user> should see their location

    Examples:
      |user     |
      |student  |
      |teacher  |
      |team-lead|
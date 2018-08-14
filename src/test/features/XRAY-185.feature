Feature: Calendar display

  In the "hunt for spot" page, date field should be displayed in calendar format.

  Scenario Outline:
    Given <user> logs into the application
    When <user> navigates to hunt for spot page
    Then <user> should be able to see date in calendar format

    Examples:
      |user     |
      |student  |
      |teacher  |
      |team-lead|
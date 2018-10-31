Feature: SPA_1767
@SPA_1767
  Scenario: Hours Display
    Given user is on the home page
    When user clicks on schedule
    Then first five hours should match the following:
      | 7:00AM |
      | 7:30AM |
      | 8:00AM |
      | 8:30AM |
      | 9:00AM |
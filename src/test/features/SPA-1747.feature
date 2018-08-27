Feature: Verify IL page
  Scenario: Use should verify that he is on IL page
    Given user is on the sign in page
    Then user sign in using email "teacherilsamnickel@gmail.com" and password "samnickel"
    And verify "IL" is displayed
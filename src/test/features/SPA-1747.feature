@smoke
Feature: Verify IL page
  @SPA1747
  Scenario: Use should verify that he is on IL page
    Given user is on the sign in page
    When user sign in using email "teacherilsamnickel@gmail.com" and password "samnickel"
    Then verify "IL" is displayed in home page
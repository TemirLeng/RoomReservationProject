Feature: Verify schedule page is displayed
  @SPA1748
  Scenario: After clicking on schedule link user should verify that he is on right page
    Given user is on the sign in page
    Then user sign in using email "teacherilsamnickel@gmail.com" and password "samnickel"
    And user clicks on the schedule link
    Then verify the "schedule" is displayed
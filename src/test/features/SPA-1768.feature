Feature: SPA-1768

  Scenario: Page Uploading
    Given user signs in
    Then user should be able to see links:
      | map      |
      | schedule |
      | hunt     |
      | my       |
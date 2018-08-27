@smoke @SPA1804
Feature: Verify Information
  Scenario: Verify informations in myself page
    Given user is on the sign in page
    When user sign in using email "htwinbrowb4@blogspot.com" and password "kanyabang"
    Then user click on myself button
    And user get datas and verify from DataBase
      | name     |Kanya Bang |
      | role     |student-team-leader |
      | team     |Hibernate|
      | batch    |8|
      | campus   |IL |


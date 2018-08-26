@Sec
Feature: Verify Information
  Scenario: Verify informations in myself page
    Given the user is on the sign in page
    When the user sign in using email "htwinbrowb4@blogspot.com" and password "kanyabang"
    Then the user click on myself button
    And the user get datas and verify from DataBase
      | name     |Kanya Bang |
      | role     |student-team-leader |
      | team     |Hibernate|
      | batch    |8|
      | campus   |IL |


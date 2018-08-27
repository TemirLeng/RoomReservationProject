 @SPA-1801 @SPA-1741
  Feature: Verify that you're on the web page

  Scenario Outline:
    Given "<user>" is on the sign in page
    When "<user>" should be able to sign in using valid "<email>" and "<password>"
    And "<user>" confirms that web page is visible
    Then the data from database should match the data given

    Examples:
      |user         |email                         |password    |
      |Kanya Bang   |htwinbrowb4@blogspot.com      |kanyabang   |
      |Engracia Huc |dfrederickb5@yellowbook.com   |engraciahuc |
      |Sam Nickel   |teacherilsamnickel@gmail.com  |samnickel   |

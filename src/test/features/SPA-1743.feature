Feature:

	#Verify group members in team page
  @SPA-1743 @SPA-1741
  Scenario Outline: Group members
    Given "<user>" is on the sign in page
    When "<user>" sign in using "<username>" and "<password>"
    When "<user>" hovers over on my button and chooses team
    Then "<user>" should be able to see "<output>"

    Examples:
      |user       |username                    |password   |output                                                      |
      |teacher    |teacherilsamnickel@gmail.com|samnickel  |Ned Stark                                                   |
      |team-leader|htwinbrowb4@blogspot.com    |kanyabang  |Kanya Bang, Engracia Huc, Rosetta Lightollers, Sherilyn Gohn|
      |student    |dfrederickb5@yellowbook.com |engraciahuc|Kanya Bang, Engracia Huc, Rosetta Lightollers, Sherilyn Gohn|
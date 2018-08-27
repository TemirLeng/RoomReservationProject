Feature:

	#Verify group members in team page
  @SPA-1743 @SPA-1741
  Scenario Outline: Group members
    Given <user> signs in
    When <user> hovers over on my button and chooses team
    Then <user> should be able to see <output>

    Examples:
      |user       |output   |
      |teacher    |Ned Stark|
      |team-leader|Kanya Bang,Engracia Huc,Rosetta Lightollers,Sherilyn Gohn|
      |student    |Kanya Bang,Engracia Huc,Rosetta Lightollers,Sherilyn Gohn|
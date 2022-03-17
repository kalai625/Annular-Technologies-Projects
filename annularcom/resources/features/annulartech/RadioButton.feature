Feature: Verify Radio button

  @Blognotdis
  Scenario Outline: Verify Radio Button
    Given user is in leafPage home page
    Then click Radio button in home page
    And select yes option in class
    And select default radio button checked option is selected
    Then Age group is selected
    Then click home logo icon
    Then verify user is in leafPage home page

    Examples: 
      | srhemail |
      | subject  |

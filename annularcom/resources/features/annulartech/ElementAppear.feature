Feature: Element Appear 

  @chooseus
  Scenario Outline: Element Appear in testleaf
    Given user is in leafPage home page
    Then click element to Appears button in home page
    And wait for element to appear
    Then verify the Voila Im here Guys is displayed
    Then click home logo icon
    Then verify user is in leafPage home page
    

    Examples: 
      | searchString |
      | annulartech  |

Feature: Dragagable and Dropabble
  @drag
  Scenario Outline: Drag and Drop
    Given user is in leafPage home page
    And click droppableIcon button
    When  Verify current page is displayed
    Then  Drag the box to the traget position
    
    
 

    Examples: 
      | srhemail |
      | subject  |
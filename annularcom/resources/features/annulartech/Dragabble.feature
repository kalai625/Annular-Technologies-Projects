Feature: Dragagable button 
  @dragble
  Scenario Outline: Dragabble
    Given user is in leafPage home page
    And click Draggable button
    When  Verify current page is displayed 
    Then  Drag the box to the same box dragabble     
     Then click home logo icon
    Then verify user is in leafPage home page
    
 

    Examples: 
      | srhemail |
      | subject  |
Feature: Alert handling

  @alrtval
  Scenario Outline: Alert Handling in testLeaf
    Given user is in leafPage home page
    And click Alert icon in home page
    Then verify alertpage is displayed
    And click Alertbox button
    Then handle and accept the popup
    And click confirmbox button
    Then handle and accept the popup
    Then print the confirmation message
    And click prompt button
    Then print popup text
    Then give the send key "<searchString>" to the promptbox
    Then handle and accept the popup
    Then print the confirmation message2
   And click line break
   Then handle and accept the popup
   And Click Sweet Alert
    When Print the message time of alert
   
   Then click home logo icon
    Then verify user is in leafPage home page

  
    Examples: 
      | searchString |
      | Test         |

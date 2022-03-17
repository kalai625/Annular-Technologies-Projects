Feature: verify hyperlink displayed in testleaf

  @address
  Scenario Outline: verify hyperlink displayed in contactpage
    Given user is in leafPage home page
    And click hyperlink icon in home page
    Then  verify the hperlink page is open
    And click the go to home button
     Then Verify home page is display
    And click hyperlink icon in home page
    And Click the second link find where it is go
    Then verify and display the current page name
     And navigate the back page   
    And click the broken link of third link  
    Then verify the link is broken and display the title of the broken link page 
    And navigate the back page
     Then click home botton intract the same link and different xpath
     And navigate the back page
     And Click the final link of hyperlink bcz od taking count link
     Then verify the count of link in current page
     Then click home logo icon
     Then verify user is in leafPage home page
    
    
    Examples: 
      | searchString |	
      | annulartech  |	
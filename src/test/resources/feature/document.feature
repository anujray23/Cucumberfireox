Feature: Document to test Amazon
  
  Scenario: Amazon uid test
    Given browser "chrome" opens and get website "https://www.amazon.in/" 
    And click signin 
    When I enter valid userid "23decanuj@gmail.com"
    And click continue button
    Then password textbox must come
   
  Scenario: Amazon pwd test
    Given userid is valid
    When i enter valid password "Rays@hab23"
    And click submit button 
    Then I should login
  
Feature: Document to test Amazon

  @amazon @uid
  Scenario: Amazon uid test
    Given browser "chrome" opens and get website "https://www.amazon.in/" 
    And click signin 
    When I enter valid userid "23decanuj@gmail.com"
    And click continue button
    Then password textbox must come
    
   @amazon @pwd
  Scenario: Amazon pwd test
    Given userid is valid
    When i enter valid password "Rays@hab23"
    And click submit button 
    Then I should login
    
    @facebook @login
  Scenario Outline:
  Given i open "chrome" and goto "https://www.facebook.com/"
  When i enter userid <userid> and password <password>
  And click login button
  Then get message
  
  Examples:
  |userid|password|
  |afgd|fgtre|
  |jgff|kjgtj|
  |nbgg|mbfg|
  
 
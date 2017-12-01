Feature: Access the google account 

  
  Scenario Outline: Access to google account
    Given I have a google account  <account>
    And I have the password <password> 
    When I try to access
    Then I should be able to enter to my account
    
   
    Examples:
    |              account             |          password        |
    |      eduardo.alvarez0007         |    S3r3nd1p1aLup0N3r0    |   
    
    
  Scenario Outline: Validate the error message when trying to access a google account
    Given I have a google account  <account>
    And  I have the password <password> 
    When I try to access
    Then I should be able to get the proper error<error>
    And  The color should be <color>
    
    Examples:
    |              account             |          password        |     error                                               |  color |
    |                                  |                          |     No se ha podido encontrar tu cuenta de Google       | #d50000|
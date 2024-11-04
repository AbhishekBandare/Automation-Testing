Feature: login details
  I want to use this template for my feature file

  @happytest
  Scenario Outline: login successfully
 
    Given user must be on the home page of herokuapp login
    When Enter the username "<username>" and password "<password>"
    Then check the outcomes & logout the page

    Examples: 
      | username | password             |
      | tomsmith | SuperSecretPassword! |
  

 
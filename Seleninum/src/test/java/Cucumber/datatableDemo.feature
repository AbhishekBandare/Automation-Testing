Feature: data table example

  Background: 
        login detatils


  Scenario: parameter using data table demo
    Given user open the url
    When enter the EmailId and password
      | username | password |
      | tomsmith | tom@123  |
    Then close the broswer

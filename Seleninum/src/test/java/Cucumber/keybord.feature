Feature: keybord Action

  @tag1
  Scenario Outline: Keybord Action
    Given user must be on the home page
    When search the itams "<Search>"
    Then close the broswer

    Examples: 
      | Search         |
      | Football       |
      | mouse          |
      | Footabll shoes |
      | Football jersy |

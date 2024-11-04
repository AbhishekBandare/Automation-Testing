Feature: Test the Scenario

  Scenario Outline: Happy Case
    Given login into the page
    When enter the "<username>" and "<password>"
    Then check the output
    And std logut from application

    Examples: 
      | username      | password    |
      | student       | Password123 |
      | incorrectUser | Password123 |

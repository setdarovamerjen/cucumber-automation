@login
Feature: Login test cases

  @login1
  Scenario: Correct username and password
    Given correct "username" and correct "password"
    When user logs in to the application
    Then verify user is logged in
    Then verify user is logged out

    @login2
    Scenario: Incorrect username and correct password
      Given incorrect "username" and correct "password"
      When user logs in to the application
      Then verify user is not logged in



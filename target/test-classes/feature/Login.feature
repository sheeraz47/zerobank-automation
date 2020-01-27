@Login
Feature: Login Functionality


  Scenario: User login with valid credentials
    Given user is on the login page
    And user logs in with valid username and password
    Then user verifies that "Zero - Account Summary" page should be displayed


  Scenario: user login with invalid credentials
    Given user is on the login page
    Given user logs in with invalid username and password
    Then user verifies that error message "Login and/or password are wrong." should be displayed



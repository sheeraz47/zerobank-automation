@Login
Feature: Login Functionality


  Scenario:When user logs in with valid credentials Account summary page should be displayed
    Given user is on the login page
    And user logs in with username "username" and password "password"
    Then user verifies that "Account Summary" page should be displayed

  @negative_invalidCredentials
  Scenario: When user tries to login with inavalid username and password error message should be displayed.
    Given user is on the login page
    And user logs in with username "wrongusername" and password "wrongpassword"
    Then user verifies that error message "Login and/or password are wrong." should be displayed.

  @negative_withoutCredentials
  Scenario: When user tries to login with blank credentials error message should be displayed.
    Given user is on the login page
    And user logs in with username "" and password ""
    Then user verifies that error message "Login and/or password are wrong." should be displayed.

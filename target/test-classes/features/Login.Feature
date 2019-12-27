Feature: Login
  Only authorized users should be able to login to the application

  Scenario:When user logs in with valid credentials, Account summary page should be displayed
    Given user is on the login page
    Then user logs in with username "username" and password "password"
    And user verifies that "Account summary" page should be displayed

  @negative_invalidCredentials
  Scenario: Users with wrong username or wrong password should not be able to login
    Given user is on the login page
    Then user logs in with username "wrongusername" and password "wrongpassword"
    And user verifies that error message "Login and/or password are wrong" should be displayed.

  @negative_withoutCredentials
  Scenario: Users with wrong username or wrong password should not be able to login
    Given user is on the login page
    Then user logs in with username "" and password ""
    And user verifies that error message "Login and/or password are wrong" should be displayed.
@Pay_Bills
Feature: Pay Bill

  Background:
    Given user is on the login page
    And user logs in with valid username and password
    And user is on Pay Bill page

  Scenario: Pay Bills page title
    Then Verify that page title is "Zero - Pay Bills"

  Scenario: Verify that user complete pay operation
    When user completes a pay operation with following data
        |Amount     |Date       |Description  |
        |100        |2020-01-01 |Payment      |
    And user verifies that message "The payment was successfully submitted." should be displayed.


  Scenario: Verify pop-up window notification when we left blank date or amount
    When user blank leave blank the the following data
      |Amount     |Date       |Description  |
      |           |           |             |
    Then verify pay operation error message "Please fill out this field." is displayed


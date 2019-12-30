@Account_Summary
Feature: Account Summary is Displayed

  Background: Logging in to the web application
    Given user is on the login page
    And user logs in with username "username" and password "password"

  Scenario: Account Summary page title
    Then Account Summary page should have the title "Zero - Account Summary"


  Scenario: Account types
    And verifies that Account Summary page should have to following account types
      |Cash Accounts       |
      |Investment Accounts |
      |Credit Accounts     |
      |Loan Accounts       |

  Scenario: Credit Accounts table
    And verifies that Credit Accounts table must have following columns
      |Account     |
      |Credit Card |
      |Balance     |

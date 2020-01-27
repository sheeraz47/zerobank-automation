@Account_Activity
Feature: Account Activity

  Background:
    Given user is on the login page
    And user logs in with valid username and password

  Scenario: Account Activity page title
    And Verify that page title is "Zero - Account Activity"

  Scenario: Default drop down option
    Given user verifies that the default drop down option is "Savings"

  Scenario: Account drop down menu options
    Given user verify that following options are available on account dropdown
      |Savings     |
      |Checking    |
      |Savings     |
      |Loan        |
      |Credit Card |
      |Brokerage   |

  Scenario: Transaction table
    Given user verify that following options are available on transaction table
      |Date        |
      |Description |
      |Deposit     |
      |Withdrawal  |
@Account_Activity
Feature: Account Activity functionality

  Background: Logging in to the web application
    Given user is on the login page
    And user logs in with username "username" and password "password"

  Scenario: Account Activity page title
    Then Account Summary page should have the title "Zero - Account Account"

  Scenario: Account drop down default option should be Savings
    When User click on Account activity tab
    Then default option should be "Savings"

  Scenario: Account drop down should have the following options
    When User click on Account activity tab
    Then  drop Down option should be :
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario: Transactions table should have following column names
    When User click on Account activity tab
    Then Transaction table options are:
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
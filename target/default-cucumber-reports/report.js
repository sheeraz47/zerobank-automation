$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary is Displayed",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Account_Summary"
    }
  ]
});
formatter.background({
  "name": "Logging in to the web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with username \"username\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account Summary page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Account_Summary"
    }
  ]
});
formatter.step({
  "name": "Account Summary page should have the title \"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.account_Summary_page_should_have_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Logging in to the web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with username \"username\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account types",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Account_Summary"
    }
  ]
});
formatter.step({
  "name": "verifies that Account Summary page should have to following account types",
  "rows": [
    {
      "cells": [
        "Cash Accounts"
      ]
    },
    {
      "cells": [
        "Investment Accounts"
      ]
    },
    {
      "cells": [
        "Credit Accounts"
      ]
    },
    {
      "cells": [
        "Loan Accounts"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.verifies_that_Account_Summary_page_should_have_to_following_account_types(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Logging in to the web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with username \"username\" and password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Credit Accounts table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Account_Summary"
    }
  ]
});
formatter.step({
  "name": "verifies that Credit Accounts table must have following columns",
  "rows": [
    {
      "cells": [
        "Account"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Balance"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.verifies_that_Credit_Accounts_table_must_have_following_columns(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
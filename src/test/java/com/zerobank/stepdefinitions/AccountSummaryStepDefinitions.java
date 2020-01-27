package com.zerobank.stepdefinitions;


import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


import java.util.List;

public class AccountSummaryStepDefinitions {



    AccountSummary accountSummary = new AccountSummary();


    @Then("Account Summary page should have the title {string}")
    public void account_Summary_page_should_have_the_title(String tile) {
        Assert.assertEquals(tile, Driver.get().getTitle());
    }

    @Given("verifies that Account Summary page should have to following account types")
    public void verifies_that_Account_Summary_page_should_have_to_following_account_types(List<String> dataTable) {
        Assert.assertEquals(dataTable, BrowserUtils.getListOfString(accountSummary.accountTypes));
    }

    @Given("verifies that Credit Accounts table must have following columns")
    public void verifies_that_Credit_Accounts_table_must_have_following_columns(List<String> dataTable) {
        Assert.assertEquals(dataTable, BrowserUtils.getListOfString(accountSummary.creditAccountTableName));
    }



}

package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.CustomMethod;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDefinitions {

    AccountActivity accountActivity = new AccountActivity();


    @When("Verify that page title is {string}")
    public void verify_that_page_title_is(String title) {
        accountActivity.clickOnAccountActivity.click();
        Assert.assertEquals("title is not displayed", title, Driver.get().getTitle());
    }

    @Given("user verifies that the default drop down option is {string}")
    public void user_verifies_that_the_default_drop_down_option_is(String expectedOption) {

        WebElement state = Driver.get().findElement(By.xpath("//*[@id=\"aa_accountId\"]/option[1]"));
        Select select = new Select(state);
//        <option value="MD">Maryland</option>
        //we can use tes, value or index for selection
        select.selectByVisibleText("Savings");
        BrowserUtils.wait(2);
        Assert.assertEquals(expectedOption,select.getFirstSelectedOption().getText() );
    }

    @Given("user verify that following options are available on account dropdown")
    public void user_verify_that_following_options_are_available_on_account_dropdown(List<String> dataTable) {

        Assert.assertEquals(dataTable, BrowserUtils.getListOfString(accountActivity.accountDropDownOptions));
    }

    @Given("user verify that following options are available on transaction table")
    public void user_verify_that_following_options_are_available_on_transaction_table(List<String> dataTable) {

        Assert.assertEquals(dataTable, BrowserUtils.getListOfString(accountActivity.transactionsTableColumnNames));
    }





}

package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinitions extends BasePage {

    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
       Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String string, String string2) {
       loginPage.login(string, string2);
    }

    @Then("user verifies that {string} page should be displayed")
    public void user_verifies_that_page_should_be_displayed(String page) {
        int tab = 0;
        switch (page){
            case "Account Summary": tab=0; break;
            case "Account Activity": tab=1; break;
            case "Transfer Funds": tab=2; break;
            case "Pay Bills": tab=3; break;
            case "My Money Map": tab=4; break;
            default: tab=5; break;
        }
        Assert.assertEquals(page, navigationTabs.get(tab).getText());
    }

    @Then("user verifies that error message {string} should be displayed.")
    public void user_verifies_that_error_message_should_be_displayed(String string) {
       Assert.assertEquals(string, loginPage.ErrorMessage.getText().trim());
    }




}

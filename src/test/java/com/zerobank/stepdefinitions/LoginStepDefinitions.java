package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.CustomMethod;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class LoginStepDefinitions{

        LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
      Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user logs in with valid username and password")
    public void user_logs_in_with_valid_username_and_password() {
        loginPage.userNameInput.sendKeys("username");
        loginPage.passwordInput.sendKeys("password", Keys.ENTER);
    }

    @Then("user verifies that {string} page should be displayed")
    public void user_verifies_that_page_should_be_displayed(String string) {
      Assert.assertEquals(string, Driver.get().getTitle());
    }



    @Given("user logs in with invalid username and password")
    public void user_logs_in_with_invalid_username_and_password() {

        loginPage.userNameInput.sendKeys("invalid");
        loginPage.passwordInput.sendKeys("invalid",Keys.ENTER);
    }

    @Then("user verifies that error message {string} should be displayed")
    public void user_verifies_that_error_message_should_be_displayed(String string) {

       Assert.assertEquals(string, loginPage.errorMessage.getText());

    }



}

package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.CustomMethod;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class PayBillsStepDefinitions {

    PayBills payBills = new PayBills();

    @Given("user is on Pay Bill page")
    public void user_is_on_Pay_Bill_page() {
       payBills.clickOnPayBills.click();
        BrowserUtils.wait(3);
    }


    @Then("user completes a pay operation with following data")
    public void user_completes_a_pay_operation_with_following_data(List<Map<String, String>> dataTable) {

        for (Map<String, String> map : dataTable) {
            BrowserUtils.wait(5);
            payBills.setPayeeOptions("Apple");
            payBills.setAccountOptions("Savings");
            payBills.amountElement.sendKeys(map.get("Amount"));
            payBills.dateElement.sendKeys(map.get("Date"));
            payBills.decriptionElement.sendKeys(map.get("Description"));
            BrowserUtils.waitForPageToLoad(2);
        }
       if(dataTable != null){
           System.out.println(dataTable);
       }else {
           System.out.println("Invalid data");

       }    }

    @When("user verifies that message {string} should be displayed.")
    public void user_verifies_that_message_should_be_displayed(String string) {

        Assert.assertEquals(string,payBills.payemntConfirmationMessage.getText());
    }

    @When("user blank leave blank the the following data")
    public void user_blank_leave_blank_the_the_following_data(List<Map<String,String>> dataTable) {
        for (Map<String, String> map : dataTable) {
            payBills.amountElement.sendKeys(map.get("Amount"));
            payBills.dateElement.sendKeys(map.get("Date"));
            payBills.decriptionElement.sendKeys(map.get("Description"));

        }
    }

    @Then("verify pay operation error message {string} is displayed")
    public void verify_pay_operation_error_message_is_displayed(String string) {
        Assert.assertEquals(string,payBills.verificationMessage.getText());
    }

}


package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity extends BasePage {

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    @FindBy(css = "[id='aa_accountId'] > option")
    public List<WebElement> accountDropDownOptions;

    @FindBy(css = "[id='all_transactions_for_account'] th")
    public List<WebElement> transactionsTableColumnNames;

    @FindBy(xpath = "//*[@id='account_activity_tab']/a")
    public WebElement clickOnAccountActivity;



    public String getDefaultSelectedOption(){
        Select select = new Select(accountDropDown);
            return select.getFirstSelectedOption().getText();
    }
}



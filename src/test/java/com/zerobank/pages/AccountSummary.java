package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountSummary extends BasePage {


    @FindBy(xpath = "//a[contains(text(), 'Account Summary' )]")
    public WebElement AccountSummaryTab;

    @FindBy(css = "[class='offset2 span8'] h2")
    public List<WebElement> accountTypes;

    @FindBy(css = "div[class='board']:nth-of-type(3) tr>th")
    public List<WebElement> creditAccountTableName;


}
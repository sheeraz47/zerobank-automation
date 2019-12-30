package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummary extends BasePage {


    @FindBy(xpath = "//*[@class='span12']//h2")
    public List<WebElement> accountTypes;

    @FindBy(css = "div[class='board']:nth-of-type(3) tr>th")
    public List<WebElement> creditAccountTableName;




}

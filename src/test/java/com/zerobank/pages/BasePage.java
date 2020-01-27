package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[id='account_summary_tab'] a")
    public WebElement accountSummarytab;

    @FindBy(css = "[id='account_activity_tab'] a")
    public WebElement accountActivitytab;

    @FindBy(css = "[id='transfer_funds_tab'] a")
    public WebElement transferFundtab;

    @FindBy(css = "[id='pay_bills_tab'] a")
    public WebElement payBillstab;

    @FindBy(css = "[id='money_map_tab'] a")
    public WebElement myNomenyMaptab;

    @FindBy(css = "[id='money_map_tab'] a")
    public WebElement onlineStatementtab;

    public void navigateTo(String tab){
        WebElement module =
        tab.equalsIgnoreCase("Account Summary")? accountSummarytab:
        tab.equalsIgnoreCase("Account Activity")? accountActivitytab:
        tab.equalsIgnoreCase("Transfer Funds")? transferFundtab:
        tab.equalsIgnoreCase("Pay Bills")? payBillstab:
        tab.equalsIgnoreCase("My Money Map")?myNomenyMaptab:
        tab.equalsIgnoreCase("Online Statements")?onlineStatementtab:null;

        if(module != null){
            module.click();
        }else{
            System.out.println("Invalid tab!");
        }
    }

    public void logOut(){

    }

}

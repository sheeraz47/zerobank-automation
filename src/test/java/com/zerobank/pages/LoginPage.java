package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = "[id='user_login']")
    public WebElement userNameInput;

    @FindBy(css = "[id ='user_password']")
    public WebElement passwordInput;

    @FindBy(css = "[value='Sign in']")
    public WebElement SignIn;

    @FindBy(css = "[class ='alert alert-error']")
    public WebElement ErrorMessage;

   public LoginPage(){
       PageFactory.initElements(Driver.get(), this);

   }
   public void login(String username, String password){
       userNameInput.sendKeys(username);
       passwordInput.sendKeys(password, Keys.ENTER);
   }




}





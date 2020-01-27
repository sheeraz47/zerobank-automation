package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "signin_button")
    public WebElement signInButton;

    @FindBy(css = "[id='user_login']")
    public WebElement userNameInput;

    @FindBy(css = "[id ='user_password']")
    public WebElement passwordInput;

    @FindBy(css = "[class='alert alert-error']")
    public WebElement errorMessage;


    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);

    }
    public void login(String username, String password){
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }


   public String getErrorMessage(){
       return errorMessage.getText();

   }
}










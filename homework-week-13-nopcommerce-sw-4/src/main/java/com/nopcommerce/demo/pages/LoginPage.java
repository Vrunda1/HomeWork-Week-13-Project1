package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By loginClick = By.linkText("Log in");
    By verifyLogin = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By emailPassword = By.name("Password");
    By loginBtn = By.xpath("//button[contains(text(),'Log in')]");
    By verifyLogOut =By.linkText("Log out");
    By verifyErr = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");

    public void loginLinkClick(){
        clickOnElement(loginClick);
    }
     public String verifyLoginButton(){
        return getTextFromElement(verifyLogin);
     }
    public void enterEmail(String mail){
         sendTextToElement(emailField,mail);
    }
    public void enterPassword(String password){
        sendTextToElement(emailPassword,password);
    }
    public void clickOnLogInButton(){
        clickOnElement(loginBtn);
    }
    public String verifyText(){
        return getTextFromElement(verifyLogOut);
    }
    public String verifyError(){
        return  getTextFromElement(verifyErr);
    }



}

package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {

    By forgotPasswordLink= By.xpath("//a[contains(text(),'Forgot your password?')]");
    By verifyPassword = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void clickOnForgotPassword(){
        clickOnElement(forgotPasswordLink);
    }
    public String verifyForgotPassword(){
        return getTextFromElement(verifyPassword);

    }
}

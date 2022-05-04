package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By WelcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By signInEmailBox = By.xpath("//input[@id='user[email]']");
    By signInPasswordBox = By.xpath("//input[@id='user[email]']");
    By verifyerror = By.xpath("//li[@class='form-error__list-item']");
//input[@id='user[password]']);
    By signInButton = By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By invalidError =By.xpath("//li[@class='form-error__list-item']");

    public void setSignInEmail(String textemail) {
        sendTextToElement(signInEmailBox, "textemail");

    }

    public void setSignInPassword(String password) {
        sendTextToElement(signInPasswordBox, "password");
    }

    public void clickSignInBox() {
        clickOnElement(signInButton);
    }

    public String errorMsgText() {
        return getTextFromElement(invalidError);
    }

    }



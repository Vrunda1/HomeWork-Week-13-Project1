package com.orangehrmlive.demo_opensource.pages;


import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {
    By userField = By.xpath("//input[@id='txtUsername']");
    By passwordField = By.xpath("//input[@id='txtPassword']");
    By logInButton = By.id("btnLogin");
    By welcomeText =By.xpath("//a[@id='welcome']");



    public void userEntry(String name) {
        sendTextToElement(userField, name);
    }
    public void passwordEntry(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickLogin(){
        clickOnElement(logInButton);
    }
    public String verifyText(){
        return getTextFromElement(welcomeText);

    }
    }


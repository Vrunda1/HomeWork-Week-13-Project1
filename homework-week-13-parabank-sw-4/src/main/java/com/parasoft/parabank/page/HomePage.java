package com.parasoft.parabank.page;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By registerLink = By.xpath("//a[text()='Register']");
    By loginButton = By.xpath("//input[@value='Log In']");
    By customerText = By.xpath("//div[@id='leftPanel']//h2[text()='Customer Login']");

    public void enterUserName(String name){
        sendTextToElement(userName, name);
    }
    public void enterPassword(String pw){
        sendTextToElement(password, pw);
    }
    public void clickOnRegister(){
        clickOnElement(registerLink);
    }
    public void clickOnLoginBtn(){
        clickOnElement(loginButton);
    }

    public String verifyCustomerText(){
        return getTextFromElement(customerText);
    }
}

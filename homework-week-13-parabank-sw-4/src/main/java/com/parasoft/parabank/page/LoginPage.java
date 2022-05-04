package com.parasoft.parabank.page;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By errorMessageText = By.xpath("//p[text()='The username and password could not be verified.']");
    By logOutButton = By.xpath("//a[text()='Log Out']");

    public void clickOnLogOut(){
        clickOnElement(logOutButton);
    }
    public String verifyErrorMessageText(){
        return getTextFromElement(errorMessageText);
    }
}

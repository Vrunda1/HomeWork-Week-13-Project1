package com.ultimateqa.courses.pages;

import com.google.common.base.Verify;
import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signInLink = By.xpath(("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]"));
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");

    public void clickonSignIn(){
        clickOnElement(signInLink);
    }
    public String welcomeTextLink(){
       return getTextFromElement(welcomeText);

    }
}




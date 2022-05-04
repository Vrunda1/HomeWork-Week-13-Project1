package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class SecurePage extends Utility {

    By verifySecureText = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");

    public String verifyText() {
        return getTextFromElement(verifySecureText);
    }
}

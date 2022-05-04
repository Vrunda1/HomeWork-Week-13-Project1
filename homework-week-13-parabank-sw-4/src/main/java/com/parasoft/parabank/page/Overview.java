package com.parasoft.parabank.page;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class Overview extends Utility {
    By accountOverView = By.xpath("//h1[text()='Accounts Overview']");


    public String verifyAccountOverViewText(){
        return getTextFromElement(accountOverView);
    }
}

package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {
    By userName = By.xpath("//input[@id='username']");
    By passwordText = By.xpath("//input[@id='password']");
    By logInButton = By.xpath("//i[contains(text(),'Login')]");
    By verifySecureText = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By verifypassword = By.xpath("//div[@id='flash']");
    By verifyUser = By.xpath("//div[@id='flash']");

    //By verifyUserField = By.xpath("")


    public void sendUser(String name) {
        sendTextToElement(userName, name);
    }

    public void sendpasswordText(String password) {
        sendTextToElement(passwordText, password);
    }

    public void clickOnLogin() {
        clickOnElement(logInButton);
    }

    public String verifyText() {
        return getTextFromElement(verifySecureText);
    }
   public String verifyPasswordText() {
       return getTextFromElement(verifypassword);
   }

    public String verifyUserName(){
        return getTextFromElement(verifyUser);

       }


        // }
//        public void getListofElements()
//        List<WebElement> products
    }


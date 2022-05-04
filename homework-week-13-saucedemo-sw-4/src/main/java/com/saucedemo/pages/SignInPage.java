package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignInPage extends Utility {
            By userName = By.xpath("//input[@id='user-name']");
        By passwordField = By.xpath("//input[@id='password']");
        By logInButton = By.xpath("//input[@id='login-button']");
        By productText = By.xpath("//span[contains(text(),'Products')]");
        By verifyProducts = By.className("inventory_item");



        public void sendEmailText(String email) {
            sendTextToElement(userName, email);
        }

        public void sendpasswordText(String password) {
            sendTextToElement(passwordField, password);
        }
        public void clockOnLogin(){
            clickOnElement(logInButton);
        }
        public String verifyProductText(){
            return getTextFromElement(productText);

        }
//        public void getListofElements()
//        List<WebElement> products
}

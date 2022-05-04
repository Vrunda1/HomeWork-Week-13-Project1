package com.parasoft.parabank.page;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class Registration extends Utility {
    By signingUp = By.xpath("//h1[text()='Signing up is easy!']");
    By firstName = By.xpath("//input[@name='customer.firstName']");
    By lastName = By.xpath("//input[@name='customer.lastName']");
    By address = By.xpath("//input[@id='customer.address.street']");
    By city = By.xpath("//input[@id='customer.address.city']");
    By state = By.xpath("//input[@id='customer.address.state']");
    By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNum = By.xpath("//input[@name='customer.phoneNumber']");
    By ssnNum = By.xpath("//input[@name='customer.ssn']");
    By userMail = By.xpath("//input[@name='customer.username']");
    By passwordReg = By.xpath("//input[@name='customer.password']");
    By confirmPassword = By.xpath("//input[@name='repeatedPassword']");
    By registerButton = By.xpath("//input[@value='Register']");
    By accountSuccess = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public String verifySigningUpText(){
        return getTextFromElement(signingUp);
    }
    public void enterFirstName(String fname){
        sendTextToElement(firstName, fname);
    }
    public void enterLastName(String lname) {
        sendTextToElement(lastName, lname);
    }
    public void enterAddress(String res){
        sendTextToElement(address, res);
    }
    public void enterCity(String cityName){
        sendTextToElement(city, cityName);
    }
    public void enterState(String sttNo){
        sendTextToElement(state, sttNo);
    }
    public void enterZip(String zip){
        sendTextToElement(zipCode, zip);
    }
    public void enterPhoneNo(String phone){
        sendTextToElement(phoneNum, phone);
    }
    public void enterSsnNo(String ssn){
        sendTextToElement(ssnNum, ssn);
    }
    public void enterUserMail(String mail){
        sendTextToElement(userMail, mail);
    }
    public void enterPasswordRegister(String password){
        sendTextToElement(passwordReg, password);
    }
    public void enterConfirmPassword(String confirmPass){
        sendTextToElement(confirmPassword, confirmPass);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String verifyAccountSuccessText(){
        return getTextFromElement(accountSuccess);
    }
}

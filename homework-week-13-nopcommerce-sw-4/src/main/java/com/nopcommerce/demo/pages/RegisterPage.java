package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerLink = By.linkText("Register");// click on the ‘Register’ link
    //Verify the text ‘Register’
   By verifyRegister = By.xpath("//a[contains(text(),'Register')]");
   By genderButton = By.xpath("//input[@id='gender-female']");
   By firstName = By.xpath("//input[@id='FirstName']");
   By lastName = By.xpath("//input[@id='LastName']");
   By birth = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
   By month = By.name("DateOfBirthMonth");
   By year = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
   By email = By.xpath("//input[@id='Email']");
   By password = By.xpath("//input[@id='Password']");
   By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
   By registerButton = By.xpath("//button[@id='register-button']");
   By verifyRegisterBtn = By.xpath("//div[contains(text(),'Your registration completed')]");

   public void clickOnRegister(){
       clickOnElement(registerLink);
   }
   public String verifyRegisterLink(){
       return getTextFromElement(verifyRegister);
   }
   public void clickOnGender(){
       clickOnElement(genderButton);
   }
   public void sendFirstName(String fname){
       sendTextToElement(firstName,fname);
   }
    public void sendLastName(String lname){
        sendTextToElement(lastName,lname);
    }
    public void selectBirth(String birthdate){
      selectByVisibleTextFromDropDown(birth,birthdate);
    }
    public void selectMonth(String monthName) {
       selectByVisibleTextFromDropDown(month, monthName);
    }
    public void selectYear(String yearValue) {
        selectByVisibleTextFromDropDown(year, yearValue);
    }
    public void emailText(String emailtext) {
        sendTextToElement(email,emailtext);
    }
    public void passwordText(String pw) {
        sendTextToElement(password,pw);
    }
    public void confirmPW(String confirmPW) {
        sendTextToElement(confirmPassword,confirmPW);
    }

    public void cLickOnRegisterButton()
    {
       clickOnElement(registerButton);
    }
    public String verifyRegText() {
        return getTextFromElement(verifyRegisterBtn);
    }

}

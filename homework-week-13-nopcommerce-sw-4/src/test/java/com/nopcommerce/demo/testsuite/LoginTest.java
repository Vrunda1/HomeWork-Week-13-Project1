package com.nopcommerce.demo.testsuite;



import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();



   @Test
    public void userShouldNavigateToLoginPageSuccessfullys() {
      loginPage.loginLinkClick();

       String expectedMessage = "Welcome, Please Sign In!";
       String actualMessage = loginPage.verifyLoginButton();
       Assert.assertEquals(actualMessage,expectedMessage,"Not in correct page");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
       loginPage.loginLinkClick();
       loginPage.enterEmail("softtest1@yahoo.com");
       loginPage.enterPassword("abc123");
       loginPage.clickOnLogInButton();


        String expectedMessage = "Log out";
        String actualMessage = loginPage.verifyText();
        Assert.assertEquals(actualMessage,expectedMessage,"User is logged In");

    }
    @Test
    public void verifyTheErrorMessage(){
        loginPage.loginLinkClick();
        loginPage.enterEmail("softtest12@yahoo.com");
        loginPage.enterPassword("abc1231");
        loginPage.clickOnLogInButton();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualResult = loginPage.verifyError();
        Assert.assertEquals(actualResult,expectedMessage,"User is logged in successfully");

    }



    }





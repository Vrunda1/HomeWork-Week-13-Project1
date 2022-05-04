package com.herokuapp.the_internet.testsuite;


import com.herokuapp.the_internet.pages.LogInPage;
import com.herokuapp.the_internet.pages.SecurePage;
import com.herokuapp.the_internet.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LogInPage logInPage = new LogInPage();
    SecurePage securePage = new SecurePage();


   @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        logInPage.sendUser("tomsmith");
        logInPage.sendpasswordText("SuperSecretPassword!");
        logInPage.clickOnLogin();

        String actualMessage = logInPage.verifyText();
       String expectedMsg = "Secure Area";
       Assert.assertEquals(expectedMsg,actualMessage,"Not in correct page");
    }

    @Test
    public void verifyTheUserdErrorMessage(){
        logInPage.sendUser("tomsmith1");
        logInPage.sendpasswordText("SuperSecretPassword!");
        logInPage.clickOnLogin();

        String actualMessage = logInPage.verifyUserName();
        String expectedMsg = "Your username is invalid!\n"  +
                "×";

        Assert.assertEquals(expectedMsg,actualMessage,"Not in correct page");
    }
   @Test
    public void verifyThePasswordErrorMessage(){
        logInPage.sendUser("tomsmith");
        logInPage.sendpasswordText("SuperSecretPassword");
        logInPage.clickOnLogin();
        String expectedtext = logInPage.verifyPasswordText();
        String actualtext ="Your password is invalid!\n"  +
                                "×";
        Assert.assertEquals(expectedtext,actualtext,"In correct page");

    }
    }





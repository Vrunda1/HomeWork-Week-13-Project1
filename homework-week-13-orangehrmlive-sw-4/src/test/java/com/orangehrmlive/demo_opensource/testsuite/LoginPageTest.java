package com.orangehrmlive.demo_opensource.testsuite;


import com.orangehrmlive.demo_opensource.pages.LogInPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LogInPage logInPage =new LogInPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentialss() {
        logInPage.userEntry("Admin");
        logInPage.passwordEntry("admin123");
        logInPage.clickLogin();

        String expectedMsg = "Welcome";
        String actualMessage = logInPage.verifyText();
        String sub = actualMessage.substring(0,7);
       Assert.assertEquals(expectedMsg,sub,"Not in correct page");
    }




    }





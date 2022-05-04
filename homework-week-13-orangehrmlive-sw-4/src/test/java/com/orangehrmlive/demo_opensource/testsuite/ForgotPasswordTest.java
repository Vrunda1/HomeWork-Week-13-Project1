package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.ForgotPassword;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    ForgotPassword forgotPassword = new ForgotPassword();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPassword.clickOnForgotPassword();
        String expectedlMsg = "Forgot Your Password?";
        String actulMsg = forgotPassword.verifyForgotPassword();
        Assert.assertEquals(actulMsg,expectedlMsg,"password is correct");

    }

}

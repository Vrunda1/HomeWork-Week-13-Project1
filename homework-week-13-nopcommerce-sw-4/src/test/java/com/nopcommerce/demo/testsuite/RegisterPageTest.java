package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
   RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickOnRegister();

    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        registerPage.clickOnRegister();
        registerPage.clickOnGender();
        registerPage.sendFirstName("testng");
        registerPage.sendLastName("software");
        registerPage.selectBirth("5");
        registerPage.selectMonth("January");
        registerPage.selectYear("2001");
        registerPage.emailText("softtest1@yahoo.com");
        registerPage.passwordText("abc123");
        registerPage.confirmPW("abc123");
        registerPage.cLickOnRegisterButton();

        String expectedResult = "Your registration completed";
        String actualResult = registerPage.verifyRegText();
        Assert.assertEquals(expectedResult,actualResult,"Not registered.");

    }
}

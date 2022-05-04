package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.page.HomePage;
import com.parasoft.parabank.page.Registration;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    Registration registration = new Registration();

    @Test
    public void verifyThatSigningUpPageDisplay(){
        homePage.clickOnLoginBtn();
        Assert.assertEquals(registration.verifySigningUpText(), "Signing up is easy!", "Cannot navigate to page");

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegister();
        registration.enterFirstName("software");
        registration.enterLastName("teser");
        registration.enterAddress("3,Street");
        registration.enterCity("Peris");
        registration.enterState("Pinner");
        registration.enterZip("111");
        registration.enterPhoneNo("078451200");
        registration.enterSsnNo("21");
        registration.enterUserMail("op@ymail.com");
        registration.enterPasswordRegister("abc");
        registration.enterConfirmPassword("abc");
        registration.clickOnRegisterButton();
        Assert.assertEquals(registration.verifyAccountSuccessText(), "Your account was created successfully. You are now logged in.", "Cannot navigate to page");



    }
}

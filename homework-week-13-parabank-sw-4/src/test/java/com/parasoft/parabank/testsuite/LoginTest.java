package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.page.HomePage;
import com.parasoft.parabank.page.LoginPage;
import com.parasoft.parabank.page.Overview;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Overview overView = new Overview();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.enterUserName("tester");
        homePage.enterPassword("ab123");
        homePage.clickOnLoginBtn();
        Assert.assertEquals(overView.verifyAccountOverViewText(), "Accounts Overview", "Cannot navigate to page");

    }
    @Test
    public void verifyTheErrorMessage() {
        homePage.enterUserName("tester1@yahoo.com");
        homePage.enterPassword("123456");
        homePage.clickOnLoginBtn();
       Assert.assertEquals(loginPage.verifyErrorMessageText(),"The username and password could not be verified.", "Canot navigate to page");
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        homePage.enterUserName("op@ymail.com");
        homePage.enterPassword("123456");
        homePage.clickOnLoginBtn();
        loginPage.clickOnLogOut();
        Assert.assertEquals(homePage.verifyCustomerText(), "Customer Login", "Not navigate to page");

    }

}

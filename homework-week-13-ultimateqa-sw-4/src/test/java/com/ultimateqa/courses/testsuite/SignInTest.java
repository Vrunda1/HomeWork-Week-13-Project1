package com.ultimateqa.courses.testsuite;


import com.google.common.base.Verify;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {

   HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    @Test
    //userShouldNavigateToLoginPageSuccessfully
    //* click on the ‘Sign In’ link
    //* Verify the text ‘Welcome Back!’
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickonSignIn();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.welcomeTextLink();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickonSignIn();
     //
        signInPage.setSignInEmail("prime123@gmail.com");
        signInPage.setSignInPassword("abc123");
        signInPage.clickSignInBox();
        signInPage.errorMsgText();

    }
}




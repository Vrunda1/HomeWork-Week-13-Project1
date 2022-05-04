package com.saucedemo.testsuite;


import com.saucedemo.pages.ProductPage;
import com.saucedemo.pages.SignInPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    SignInPage signInPage = new SignInPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        signInPage.sendEmailText("standard_user");
        signInPage.sendpasswordText("secret_sauce");
        signInPage.clockOnLogin();
        String expectedMsg = "PRODUCTS";
        String actualMsg = signInPage.verifyProductText();
        Assert.assertEquals(expectedMsg, actualMsg, "Not verified");

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        signInPage.sendEmailText("standard_user");
        signInPage.sendpasswordText("secret_sauce");
        signInPage.clockOnLogin();
        int expectedMessage = 6;
        int actualMessage = productPage.products();
        Assert.assertEquals(actualMessage, expectedMessage, "unable to display 6 product");

    }
}





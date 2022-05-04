package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuTestPage;
import com.nopcommerce.demo.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuTestPage topMenuTestPage = new TopMenuTestPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        topMenuTestPage.clickOnComputerLink();
        String expectedResult = "Computers";
        String actualResult1 = topMenuTestPage.verifyComputerHeader();
        Assert.assertEquals(expectedResult, actualResult1,"Not in computer page");
    }
   @Test
        public void userShouldNavigateToElectronicsPageSuccessfully() {
       topMenuTestPage.clickOnElecronicsLink();
       String expectedResulte = "Electronics";
       String actualTexte = topMenuTestPage.verifyElectronicsHeader();
       Assert.assertEquals(expectedResulte, actualTexte);
   }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
       topMenuTestPage.clickOnApparelLink();
       String expectedResulta = "Apparel";
       String actulResulta = topMenuTestPage.verifyApparelHeader();
        Assert.assertEquals(expectedResulta, actulResulta);
   }
   @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        topMenuTestPage.clickOnDigDown();
       String expectedResult1 = "Digital downloads";
       String actualResult1 = topMenuTestPage.verifyDigitalDownHeader();
       Assert.assertEquals(expectedResult1, actualResult1);
   }
    @Test
    public void userShouldNavigateToBooksPageSuccessfullyl() {
        topMenuTestPage.clickOnBooksy();
        String expectedResult = "Books";
        String actualMessage = topMenuTestPage.verifyBooksHeader();
        Assert.assertEquals(expectedResult, actualMessage);

            }
    @Test
    public void uuserShouldNavigateToJewelryPageSuccessfulll() {
        topMenuTestPage.clickOnJewelry();
        String expectedResult = "Jewelry";
        String actualMessage1 = topMenuTestPage.verifyJewelryHeader();
        Assert.assertEquals(expectedResult, actualMessage1);

    }
    @Test
   public void  userShouldNavigateToGiftCardsPageSuccessfully(){
        topMenuTestPage.clickOnGiftCard();
        String expectedResult = "Gift Cards";
        String actualMessage1 = topMenuTestPage.verifyGiftCardsHeader();
        Assert.assertEquals(expectedResult, actualMessage1);

    }
}

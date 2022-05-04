package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuTestPage extends Utility {

    By computerLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By verifyComputer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By verifyElectronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By electronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparel = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1] ");
    By verifyApparel = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    By digitaldown = By.linkText("Digital downloads");
    By verifyDD =By.linkText("Digital downloads");
    By books = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By verifyBooks =By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By jewelry = (By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
    By verifyJewelry =(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
    By giftCards = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");
    By verifyGiftcards =By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");


    public void clickOnComputerLink(){
        clickOnElement(computerLink);
    }
    public void clickOnElecronicsLink(){
        clickOnElement(electronics);
    }
    public void clickOnApparelLink(){
        clickOnElement(apparel);
    }
    public void clickOnDigDown(){
        clickOnElement(digitaldown);
    }

    public void clickOnJewelry() {
        clickOnElement(jewelry);
    }
    public void clickOnBooksy() {
        clickOnElement(books);
    }
    public void clickOnGiftCard() {
        clickOnElement(giftCards);
    }
    public String verifyComputerHeader(){
        return getTextFromElement(verifyComputer);
    }
    public String verifyElectronicsHeader(){
        return getTextFromElement(verifyElectronics);
    }
    public String verifyApparelHeader(){
        return getTextFromElement(verifyApparel);
    }
    public String verifyJewelryHeader(){
        return getTextFromElement(verifyJewelry);
    }
    public String verifyDigitalDownHeader(){
        return getTextFromElement(verifyDD);
    }
    public String verifyBooksHeader(){
        return getTextFromElement(verifyBooks);
    }
    public String verifyGiftCardsHeader(){
        return getTextFromElement(verifyGiftcards);
    }
}

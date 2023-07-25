package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    public void mouseHoverOnCronusYogaPant() {
        log.info("Mouse hover on Cronus Yoga pant"+cronusYogaPant.toString());
        mouseHoverToElement(cronusYogaPant);
    }

    public void clickOnSize() {
        log.info("Clicking on Size 32"+size.toString());
        clickOnElement(size);
    }

    public void clickOnColor() {
        log.info("Clicking on Black color"+color.toString());
        clickOnElement(color);
    }

    public void clickOnAddToCart() {
        log.info("Clicking on Add cart button"+addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getTextAfterAddToCart() {
        log.info("Getting \"You added Cronus Yoga Pant to your shopping cart.\"");
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        log.info("Clicking on Shopping Cartbutton"+shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

}

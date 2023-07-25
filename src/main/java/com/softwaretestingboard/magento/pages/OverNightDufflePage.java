package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OverNightDufflePage extends Utility {
    private static final Logger log = LogManager.getLogger(OverNightDufflePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    public String getOverNightDuffelText() {
        log.info("Getting Overnight Duffle Text");
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty) {
        log.info("Enter 3 Quantity");
         qty.clear();
        sendTextToElement(qty, newQty);
    }

    public void clickOnAddToCart() {
        log.info("Clicking on Add to cart"+addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getAddToCartText() {
        log.info("Getting You added Overnight Duffle to your shopping cart");
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        log.info("Clicking on Shopping cart"+shoppingCart.toString());
        clickOnElement(shoppingCart);
    }
}

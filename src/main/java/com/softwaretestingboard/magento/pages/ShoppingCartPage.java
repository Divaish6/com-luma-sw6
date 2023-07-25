package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;

    public String getShoppingCart() {
        log.info("Getting Shopping cart link");
        return getTextFromElement(shoppingCart);
    }

    public String getCronusYogaPantText() {
        log.info("Getting Cronus Yoga Pant Text");
        return getTextFromElement(cronusYogaPant);
    }

    public String getSizeText() {
        log.info("Getting Size 32");
        return getTextFromElement(size);
    }

    public String getColorText() {
        log.info("Getting Black color");
        return getTextFromElement(color);
    }

    public String getOverNightDuffleText() {
        log.info("Getting Over Night Duffle text");
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty() {
        String qty =  qtyText.getAttribute("value");
        return qty;
    }

    public String getProductPrice() {
        log.info("Getting Total price"+productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty) {
        log.info("Enter 5 Quantity");
        qty.clear();
        sendTextToElement(qty, newQty);
    }

    public void clickOnUpdateShoppingCart() {
        log.info("Click on upadate shopping cart");
        clickOnElement(updateShoppingCart);
    }

    public String getUpdatedProductPrice() {
        log.info("Getting Updated Product Price"+updatedProductPrice.toString());
        return getTextFromElement(updatedProductPrice);
    }

}

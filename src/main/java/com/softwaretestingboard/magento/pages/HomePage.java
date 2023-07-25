package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
        log.info("Mouse hover on Women tab"+womenMenu.toString());
    }

    public void mouseHoverOnTops() {
        log.info("Mouse hover on tops"+tops.toString());
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        log.info("Clicking on Jackets"+jackets.toString());
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu() {
        log.info("Mouse hover on Men tab"+menMenu.toString());
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() {
        log.info("Mouse hover on Bottom tab"+ bottomMenu.toString());
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPant() {
        log.info("Clicking on Pants"+pants.toString());
        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu() {
        log.info("Mouse hover on Gear menu"+gearMenu.toString());
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        log.info("Clicking on Bags"+bags.toString());
        clickOnElement(bags);
    }
}

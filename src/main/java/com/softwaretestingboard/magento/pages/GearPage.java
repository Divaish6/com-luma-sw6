package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;


    public void clickOnOvernightDuffle() {
     log.info("Clicking on Overnight Duffle"+overnightDuffle.toString());
        clickOnElement(overnightDuffle);
    }
}

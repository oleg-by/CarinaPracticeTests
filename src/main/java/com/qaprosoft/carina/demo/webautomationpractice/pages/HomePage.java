package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"header_logo\"]")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//a[text()=\"Ecommerce software by PrestaShop™\"]")
    private ExtendedWebElement copyright;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoPresent(){
        return logo.isElementPresent();
    }

    public boolean isPageScrolledDown(){
        return copyright.isElementPresent();
    }

}

package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {

    @FindBy(xpath = "//h1[text()=\"My account\"]")
    private ExtendedWebElement title;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitlePresent(){
        return title.isElementPresent();
    }
}

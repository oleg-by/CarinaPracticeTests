package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.webautomationpractice.components.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {

    @FindBy(xpath = "//h1[text()=\"My account\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//header[@id=\"header\"]")
    private Header header;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public Header getHeader() {
        return header;
    }

    public boolean isTitlePresent(){
        return title.isElementPresent();
    }
}

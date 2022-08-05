package com.qaprosoft.carina.demo.webautomationpractice.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartContainer extends AbstractUIObject {

    @FindBy(xpath = ".//td[@class=\"cart_description\"]//p")
    private ExtendedWebElement productName;

    public CartContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}

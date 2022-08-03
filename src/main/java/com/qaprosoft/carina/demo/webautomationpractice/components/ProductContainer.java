package com.qaprosoft.carina.demo.webautomationpractice.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductContainer extends AbstractUIObject {

    @FindBy(xpath = "//h5[@itemprop=\"name\"]//a[@class=\"product-name\"]")
    private ExtendedWebElement productName;

    public ProductContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getProductName() {
        return productName.getText();
    }

    @Override
    public String toString() {
        return "ProductContainer{" +
                "productName=" + productName.getText() +
                '}';
    }
}

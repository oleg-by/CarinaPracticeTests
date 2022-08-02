package com.qaprosoft.carina.demo.webautomationpractice.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductContainer extends AbstractUIObject {

    @FindBy(xpath = "(//*[@class=\"product-container\"])[%s]")
    private ExtendedWebElement someProduct;

    @FindBy(xpath = "(//h5[@itemprop=\"name\"]//a[@class=\"product-name\"])[%s]")
    private ExtendedWebElement someProductName;

    public ProductContainer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getSomeProduct(int i) {
        return someProduct.format(String.valueOf(i));
    }

    public ExtendedWebElement getSomeProductName(int i) {
        return someProductName.format(String.valueOf(i));
    }
}

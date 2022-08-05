package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.webautomationpractice.AutomationPracticePageBase;
import com.qaprosoft.carina.demo.webautomationpractice.components.CartContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends AutomationPracticePageBase {

    @FindBy(xpath = "//h1[@id=\"cart_title\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "//span[@id=\"summary_products_quantity\"]")
    private ExtendedWebElement summaryProductsQuantity;

    @FindBy(xpath = "//tr[contains(@id,\"product\")]")
    private List<CartContainer> products;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

}

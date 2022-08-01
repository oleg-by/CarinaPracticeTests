package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends AbstractPage {

    @FindBy(xpath = "//span[@class=\"category-name\"]")
    private ExtendedWebElement categoryNameTitle;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCategoryNameTitle(){
        return categoryNameTitle.isElementPresent();
    }
}

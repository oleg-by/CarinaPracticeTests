package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.webautomationpractice.AutomationPracticePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends AutomationPracticePageBase {

    @FindBy(xpath = "//span[@class=\"category-name\"]")
    private ExtendedWebElement categoryNameTitle;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return categoryNameTitle.isElementPresent();
    }

    public boolean isCategoryCorrect(String title) {
        return categoryNameTitle.getText().equals(title);
    }
}

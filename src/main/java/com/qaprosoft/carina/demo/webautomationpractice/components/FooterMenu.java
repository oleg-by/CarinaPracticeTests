package com.qaprosoft.carina.demo.webautomationpractice.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.webautomationpractice.pages.CategoryPage;
import com.qaprosoft.carina.demo.webautomationpractice.pages.SpecialsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenu extends AbstractUIObject {

    @FindBy(linkText = "Women")
    private ExtendedWebElement womenCategoryLink;

    @FindBy(linkText = "Specials")
    private ExtendedWebElement specialsLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CategoryPage openCategoryPage(){
        womenCategoryLink.click();
        return new CategoryPage(getDriver());
    }

    public SpecialsPage openSpecialsPage(){
        specialsLink.click();
        return new SpecialsPage(getDriver());
    }
}

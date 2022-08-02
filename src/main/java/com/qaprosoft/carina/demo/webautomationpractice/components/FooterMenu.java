package com.qaprosoft.carina.demo.webautomationpractice.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.enums.Categories;
import com.qaprosoft.carina.demo.enums.InfoLink;
import com.qaprosoft.carina.demo.enums.MyAccountLink;
import com.qaprosoft.carina.demo.webautomationpractice.AutomationPracticePageBase;
import com.qaprosoft.carina.demo.webautomationpractice.pages.CategoryPage;
import com.qaprosoft.carina.demo.webautomationpractice.pages.SpecialsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenu extends AbstractPage {

    @FindBy(xpath = "//div[contains(@class,'category_footer')]//a[contains(text(),'%s')]")
    private ExtendedWebElement categoriesLink;

    @FindBy(xpath = "//li[@class=\"item\"]//a[contains(text(),\"%s\")]")
    private ExtendedWebElement informationLink;

    @FindBy(xpath = "//a[text()=\"%s\"]")
    private ExtendedWebElement myAccountLink;

    @FindBy(xpath = "//a[text()=\"Ecommerce software by PrestaShop™\"]")
    private ExtendedWebElement copyright;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver);
    }

    public boolean isOpened() {
        return copyright.isElementPresent();
    }

    public AutomationPracticePageBase clickCategoriesLink(Categories item) {
        categoriesLink.format(item.getCategory()).click();
        return initPage(getDriver(), AutomationPracticePageBase.class);
    }

    public AutomationPracticePageBase clickInformationLink(InfoLink item) {
        informationLink.format(item.getInfolink()).click();
        return initPage(getDriver(), AutomationPracticePageBase.class);
    }

    public AutomationPracticePageBase clickMyAccountLink(MyAccountLink item) {
        myAccountLink.format(item.getAccountLink()).click();
        return initPage(getDriver(), AutomationPracticePageBase.class);
    }
}

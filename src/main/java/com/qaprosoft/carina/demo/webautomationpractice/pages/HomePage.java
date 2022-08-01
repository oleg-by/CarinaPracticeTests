package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.webautomationpractice.components.FooterMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"header_logo\"]")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//a[@class=\"login\"]")
    private ExtendedWebElement signInBtn;

    @FindBy(xpath = "//input[@id=\"search_query_top\"]")
    private ExtendedWebElement searchBar;

    @FindBy(xpath = "//button[@name=\"submit_search\"]")
    private ExtendedWebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"footer\"]")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//a[text()=\"Ecommerce software by PrestaShop™\"]")
    private ExtendedWebElement copyright;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public boolean isLogoPresent(){
        return logo.isElementPresent();
    }

    public AuthenticationPage clickSignInBtn(){
        signInBtn.click();
        return new AuthenticationPage(getDriver());
    }

    public boolean isCopyrightPresent(){
        return copyright.isElementPresent();
    }

    public void typeSearchRq(String text){
        searchBar.type(text);
    }

    public String getTypedText(){
        assertElementPresent(searchBar);
        return searchBar.getText();
    }

    public ResultPage clickSearchBtn(){
        searchBtn.click();
        return new ResultPage(getDriver());
    }

}

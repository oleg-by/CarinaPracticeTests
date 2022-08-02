package com.qaprosoft.carina.demo.webautomationpractice.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.webautomationpractice.pages.AuthenticationPage;
import com.qaprosoft.carina.demo.webautomationpractice.pages.ResultPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(xpath = "//a[@class=\"logout\"]")
    private ExtendedWebElement signOutBtn;

    @FindBy(xpath = "//a[@class=\"login\"]")
    private ExtendedWebElement signInBtn;

    @FindBy(xpath = "//*[@id=\"header_logo\"]")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//input[@id=\"search_query_top\"]")
    private ExtendedWebElement searchBar;

    @FindBy(xpath = "//button[@name=\"submit_search\"]")
    private ExtendedWebElement searchBtn;

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AuthenticationPage clickSignOutBtn() {
        if (signOutBtn.isElementPresent()) {
            signOutBtn.click();
            return new AuthenticationPage(getDriver());
        } else throw new NoSuchElementException("Sign out button is not presented on page.");
    }

    public AuthenticationPage clickSignInBtn() {
        if (signInBtn.isElementPresent()) {
            signInBtn.click();
            return new AuthenticationPage(getDriver());
        } else throw new NoSuchElementException("Sign out button is not presented on page.");
    }

    public void typeSearchRq(String text){
        searchBar.type(text);
    }

    public ResultPage clickSearchBtn(){
        searchBtn.click();
        return new ResultPage(getDriver());
    }

}

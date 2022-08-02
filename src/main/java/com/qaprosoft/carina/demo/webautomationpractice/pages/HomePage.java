package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.webautomationpractice.components.FooterMenu;
import com.qaprosoft.carina.demo.webautomationpractice.components.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//header[@id=\"header\"]")
    private Header header;

    @FindBy(xpath = "//div[@id=\"slider_row\"]")
    private ExtendedWebElement slider;

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

    public Header getHeader() {
        return header;
    }

    public boolean isSliderPresent() {
        return slider.isElementPresent();
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

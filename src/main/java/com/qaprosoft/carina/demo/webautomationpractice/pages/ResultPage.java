package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends AbstractPage {

    @FindBy(xpath = "//span[@class=\"heading-counter\"]")
    private ExtendedWebElement resultsCounter;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[%S]/div/div[2]/h5/a")
    private ExtendedWebElement someResultProduct;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCounterPresent(){
        return resultsCounter.isElementPresent();
    }

    public int countResults(){
        return Integer.parseInt(resultsCounter.getText().replaceAll("\\D", ""));
    }

    public String getResultProductTitle(int i){
        return someResultProduct.format(String.valueOf(i)).getText();
    }

}

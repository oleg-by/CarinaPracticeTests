package com.qaprosoft.carina.demo.webautomationpractice.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.webautomationpractice.AutomationPracticePageBase;
import com.qaprosoft.carina.demo.webautomationpractice.components.ProductContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends AutomationPracticePageBase {

    @FindBy(xpath = "//span[@class=\"heading-counter\"]")
    private ExtendedWebElement resultsCounter;

    @FindBy(xpath = "//ul[@class=\"product_list grid row\"]")
    private List<ProductContainer> resultProducts;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return resultsCounter.isElementPresent();
    }

    public int getProductCount(){
        return Integer.parseInt(resultsCounter.getText().replaceAll("\\D", ""));
    }

    public String getResultProductTitle(int i){
        return resultProducts.get(i).getSomeProductName(i).getText();
    }

//    public void initList(){
//        List<WebElement> elements = getDriver().findElements(By.xpath("//*[@class=\"product-container\"]"));
//    }



}

package com.qaprosoft.carina.demo.mobilesample.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MessagePageBase extends AbstractPage {

    public MessagePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isSearchBarPresent();
}

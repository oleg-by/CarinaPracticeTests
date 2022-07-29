package com.qaprosoft.carina.demo.mobilesample.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PhonePageBase extends AbstractPage {
    public PhonePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isSearchBarPresent();

}

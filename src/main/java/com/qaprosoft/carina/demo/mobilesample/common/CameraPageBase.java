package com.qaprosoft.carina.demo.mobilesample.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CameraPageBase extends AbstractPage {
    public CameraPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isImagePresent();

}

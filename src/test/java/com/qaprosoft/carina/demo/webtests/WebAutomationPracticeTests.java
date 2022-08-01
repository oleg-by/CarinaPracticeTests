package com.qaprosoft.carina.demo.webtests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.webautomationpractice.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebAutomationPracticeTests implements IAbstractTest {

    @Test(testName = "Verify home page")
    @MethodOwner(owner = "oleg-by")
    public void testHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isLogoPresent(), "Home page isn't opened.");

    }
}

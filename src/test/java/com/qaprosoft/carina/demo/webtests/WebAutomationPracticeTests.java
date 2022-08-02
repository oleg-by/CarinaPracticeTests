package com.qaprosoft.carina.demo.webtests;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.enums.Categories;
import com.qaprosoft.carina.demo.webautomationpractice.components.FooterMenu;
import com.qaprosoft.carina.demo.webautomationpractice.components.HeaderMenu;
import com.qaprosoft.carina.demo.webautomationpractice.pages.*;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebAutomationPracticeTests extends BaseTest {

    @Test(testName = "Verify home page")
    @MethodOwner(owner = "oleg-by")
    public void testHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isOpened(), "Home page is not opened.");
        FooterMenu footer = homePage.getFooter();
        Assert.assertTrue(footer.isUIObjectPresent(5), "Footer menu wasn't found!");
        Assert.assertTrue(footer.isOpened(), "Copyright is not presented on home page.");
        CategoryPage categoryPage = (CategoryPage) footer.clickCategoriesLink(Categories.WOMEN);
        Assert.assertTrue(categoryPage.isOpened(), "Category page is not opened.");
        Assert.assertTrue(categoryPage.isCategoryCorrect(Categories.WOMEN.getCategory()), "Category is not correct.");
    }

    @Test(testName = "Check the search engine")
    @MethodOwner(owner = "oleg-by")
    public void testSearchEngine() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isOpened(), "Home page is not opened.");
        String searchRq = "Printed";
        HeaderMenu header = homePage.getHeader();
        header.typeSearchRq(searchRq);
        ResultPage resultPage = header.clickSearchBtn();
        Assert.assertTrue(resultPage.isOpened(), "Result page is not opened.");
        for (int i = 1; i <= resultPage.getProductCount(); i++) {
            Assert.assertTrue(StringUtils
                            .containsIgnoreCase(resultPage.getResultProductTitle(i), searchRq),
                    "The title of product doesn't contain the search substring.");
        }
    }

    @Test(testName = "Register a new account")
    @MethodOwner(owner = "oleg-by")
    public void testSignUp() {
        MyAccountPage myAccountPage = authenticationService.register();
        Assert.assertTrue(myAccountPage.isOpened(), "Account is not created.");
    }

    @Test(testName = "Sign in")
    @MethodOwner(owner = "oleg-by")
    public void testSignIn() {
        MyAccountPage myAccountPage = authenticationService.login();
        Assert.assertTrue(myAccountPage.isOpened(), "Sign In is failed.");
    }

    @Test(testName = "Sign out")
    @MethodOwner(owner = "oleg-by")
    public void testSignOut() {
        MyAccountPage myAccountPage = authenticationService.login();
        Assert.assertTrue(myAccountPage.isOpened(), "Sign In is failed.");
        HeaderMenu header = myAccountPage.getHeader();
        Assert.assertTrue(header.isUIObjectPresent(5), "Header wasn't found!");
        AuthenticationPage authenticationPage = header.clickSignOutBtn();
        Assert.assertTrue(authenticationPage.isOpened(), "Authentication page is not opened");
    }
}

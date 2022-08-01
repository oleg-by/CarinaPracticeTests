package com.qaprosoft.carina.demo.webtests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.model.User;
import com.qaprosoft.carina.demo.utils.DataLoader;
import com.qaprosoft.carina.demo.webautomationpractice.components.FooterMenu;
import com.qaprosoft.carina.demo.webautomationpractice.pages.*;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebAutomationPracticeTests implements IAbstractTest {

    @Test(testName = "Verify home page")
    @MethodOwner(owner = "oleg-by")
    public void testHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isLogoPresent(), "Home page is not opened.");
        FooterMenu footerMenu = homePage.getFooterMenu();
        Assert.assertTrue(footerMenu.isUIObjectPresent(5), "Footer menu wasn't found!");
        Assert.assertTrue(homePage.isCopyrightPresent(), "Copyright is not presented on home page.");
        CategoryPage categoryPage = footerMenu.openCategoryPage();
        Assert.assertTrue(categoryPage.isCategoryNameTitle(), "Category page is not opened.");
        categoryPage.quitDriver();
    }

    @Test(testName = "Check the search engine")
    @MethodOwner(owner = "oleg-by")
    public void testSearchEngine() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isLogoPresent(), "Home page is not opened.");
        String searchRq = "Printed";
        homePage.typeSearchRq(searchRq);
        //Assert.assertEquals(homePage.getTypedText(), searchRq, "The search term was not entered in the search bar.");
        ResultPage resultPage = homePage.clickSearchBtn();
        Assert.assertTrue(resultPage.isCounterPresent(), "Result page is not opened.");
        for (int i = 1; i <= resultPage.countResults(); i++) {
            Assert.assertTrue(StringUtils
                            .containsIgnoreCase(resultPage.getResultProductTitle(i), searchRq),
                    "The title of product doesn't contain the search substring.");
        }
        resultPage.quitDriver();
    }

    @Test(testName = "Register a new account")
    @MethodOwner(owner = "oleg-by")
    public void testSignUp() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isLogoPresent(), "Home page is not opened.");
        AuthenticationPage authenticationPage = homePage.clickSignInBtn();
        Assert.assertTrue(authenticationPage.isTitlePresent(), "Authentication page is not opened");
        User user = DataLoader.getRandomUser();
        authenticationPage.typeNewEmail(user.getEmail());
        CreateAccountPage createAccountPage = authenticationPage.clickCreateBtn();
        createAccountPage.clickGender(user.getGender());
        createAccountPage.typeFirstName(user.getFirstname());
        createAccountPage.typeLastName(user.getLastname());
        createAccountPage.typePassword(user.getPassword());
        createAccountPage.typeAddress(user.getAddress());
        createAccountPage.typeCity(user.getCity());
        createAccountPage.selectState(user.getState());
        createAccountPage.typePostcode(user.getPostcode());
        createAccountPage.typeMobilePhone(user.getMobilePhone());
        AccountPage accountPage = createAccountPage.clickRegisterBtn();
        Assert.assertTrue(accountPage.isTitlePresent(), "Account is not created.");
    }



}

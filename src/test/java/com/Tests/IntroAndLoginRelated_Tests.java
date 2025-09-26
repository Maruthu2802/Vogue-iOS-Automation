package com.Tests;

import Base.Baseclass;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class IntroAndLoginRelated_Tests extends Baseclass {

    LandingAndSignInScreen landingAndSignInScreen;
    HomeScreen homeScreen;

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        homeScreen = new HomeScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 1, description = "VD-TC-22 - Unsuccessful login")
    public void validateUnsuccessfulLogin() {
        landingAndSignInScreen.UnsuccessfulLogin(Credentials.invalidUsername);
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 2, description = "Verify The Skipping Intro Video")
    public void validateSkipIntroVideo() {
        landingAndSignInScreen.validateSkipIntroVideo();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 3, description = "Verify The Skipping Intro Video")
    public void validateSignInPageUI() {
        landingAndSignInScreen.validateSignInPage();
    }

}

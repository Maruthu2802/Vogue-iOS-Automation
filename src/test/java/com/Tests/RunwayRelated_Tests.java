package com.Tests;

import Base.Baseclass;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import com.automate.pages.RunwayScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class RunwayRelated_Tests extends Baseclass {

    LandingAndSignInScreen landingAndSignInScreen;
    RunwayScreen runwayScreen;
    HomeScreen homeScreen;

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        runwayScreen = new RunwayScreen();
        homeScreen = new HomeScreen();
    }

    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE })
    @Test(priority = 1, description = "VD_TC_225_Added Images to a Board message")
    public void savedToBoardCtaValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        runwayScreen.validateAddToBoardCta();
    }

    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE })
    @Test(priority = 2, description = "VD_TC_522_Verify user can check and uncheck options")
    public void validationOfCheckboxes() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        runwayScreen.clickOnImageArchieve();
    }

    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE })
    @Test(priority = 3, description = "VD_TC_521_Verify available options are displayed with checkboxes")
    public void validationOfCheckboxesAndOptions() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        runwayScreen.validateOptionswithCheckBox();
    }


    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE })
    @Test(priority = 4, description = "VD_TC_520_Verify search field is present in each filter")
    public void validationOfSearchFields() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        runwayScreen.validateSearchboxInOptions();
    }


    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE })
    @Test(priority = 5, description = "VD_TC_496_Verify that both Trending and Latest sections are displayed under the Image Archive screen.")
    public void validateTrendingAndLatestSections() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        runwayScreen.validateTrendingAndLatest();
    }

    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE })
    @Test(priority = 6, description = "VD_TC_239_filter option")
    public void validateFilterOptionOnRunwayTab() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        runwayScreen.validateFilter();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }






}

package com.Tests;

import Base.Baseclass;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class SavedPageValidation_Tests extends Baseclass {

    LandingAndSignInScreen landingAndSignInScreen;
    HomeScreen homeScreen;

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        homeScreen = new HomeScreen();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.REGRESSION})
    @Test(priority = 1, description = "VD-TC-222-Scrolling - Header Changes and Dock Hides:")
    public void VD_TC_222_savedImageScreenDockHideValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.clickOnProfileIcon();
//        homeScreen.scrollTillArticle();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.REGRESSION})
    @Test(priority = 2, description = "VD-TC-225-Added Images to a Board message")
    public void VD_TC_225_savedToBoardCtaValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.scrollTillChanel();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.REGRESSION})
    @Test(priority = 3, description = "VD-TC-227-Select images to remove")
    public void VD_TC_227_selectImagesToRemovePageValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.clickOnProfileIcon();
//        homeScreen.clickOnAllSavedImages();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.REGRESSION})
    @Test(priority = 4, description = "VD-TC-228-My Boards Empty")
    public void VD_TC_228_validationOfCreateBoardCta() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
//        homeScreen.validateCreateBoardCta();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}







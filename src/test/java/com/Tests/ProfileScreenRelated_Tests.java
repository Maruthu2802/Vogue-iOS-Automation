package com.Tests;

import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class ProfileScreenRelated_Tests {

    HomeScreen homeScreen;
    RunwayScreen runwayPage;
    PostScreen postPage;
    ProfileScreen profilePage;
    LandingAndSignInScreen landingAndSignInScreen;
    String commentText = "Test";

    @BeforeMethod
    public void initialize() {
        homeScreen = new HomeScreen();
        runwayPage = new RunwayScreen();
        postPage = new PostScreen();
        profilePage = new ProfileScreen();
        landingAndSignInScreen = new LandingAndSignInScreen();
    }



    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE }) //PASS
    @Test(priority = 1, description = "VD_TC_228_My Boards Empty")
    public void validationOfCreateBoardCta() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        profilePage.validateCreateBoardCta();
    }

    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE }) //PASS
    @Test(priority = 2, description = "VD_TC_227_Select images to remove")
    public void selectImagesToRemovePageValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        profilePage.clickOnAllSavedImages();
    }

    @FrameworkAnnotation(author = { "Maruthu" }, category = { CategoryType.SMOKE }) //PASS
    @Test(priority = 3, description = "VD_TC_222_Scrolling - Header Changes and Dock Hides:")
    public void profilePageDockHideValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        profilePage.scrollUntilHeaderVisible();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE}) //PASS
    @Test(priority = 4, description = "VD_TC_211_Opening the Board Creation Drawer")
    public void validationOfCreateBoardCtaIsDisapled() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        profilePage.createBoard();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE}) //PASS
    @Test(priority = 5, description = "VD_TC_212_Entering Board Name and Description")
    public void validateCreateButtonOnCreateBoard() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        profilePage.createButtonEnabled(commentText);
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 6, description = "VD_TC_218_Displaying a Board Creation Confirmation Message:")
    public void validationOfBoardCreation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername,Credentials.subscribedPassword);
        profilePage.boardCreated(commentText);
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }
}





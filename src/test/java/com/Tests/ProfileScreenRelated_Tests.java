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

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 7, description = "VD_TC_203-Verify the Grid View Is Displayed")
    public void VD_TC_203_verifyGridViewIsDisplayed() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateGridViewIsDisplayed();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 8, description = "VD_TC_213-Verify the Long Title Creation")
    public void VD_TC_213_verifyLongTitleCreation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateLongTitleCreation();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 9, description = "VD_TC_216-Verify the Dismiss board creation drawer")
    public void VD_TC_216_verifyDismissBoardCreationDrawer() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateDismissBoardCreationDrawer();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 10, description = "VD_TC_221-Verify the add notes in images")
    public void VD_TC_221_verifyAddNotesInImage() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateDisplayingNotesIcon();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 11, description = "VD_TC_228-Verify the my boards page")
    public void VD_TC_228_verifyMyBoardsEmpty() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateMyBoardsEmpty();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 12, description = "VD_TC_229-Verify the All saved Images are Empty")
    public void VD_TC_229_verifyAllSavedImagesEmpty() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateAllSavedImagesEmpty();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 13, description = "VD_TC_237-Verify the long text in Image")
    public void VD_TC_237_verifyLongTextInImage() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateLongtextInImage();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }
}





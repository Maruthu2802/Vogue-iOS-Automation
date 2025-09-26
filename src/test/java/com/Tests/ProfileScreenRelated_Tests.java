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

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 1, description = "VD_TC_203-Verify the Grid View Is Displayed")
    public void VD_TC_203_verifyGridViewIsDisplayed() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateGridViewIsDisplayed();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 2, description = "VD_TC_213-Verify the Long Title Creation")
    public void VD_TC_213_verifyLongTitleCreation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateLongTitleCreation();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 3, description = "VD_TC_216-Verify the Dismiss board creation drawer")
    public void VD_TC_216_verifyDismissBoardCreationDrawer() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateDismissBoardCreationDrawer();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 4, description = "VD_TC_221-Verify the add notes in images")
    public void VD_TC_221_verifyAddNotesInImage() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateDisplayingNotesIcon();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 5, description = "VD_TC_228-Verify the my boards page")
    public void VD_TC_228_verifyMyBoardsEmpty() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateMyBoardsEmpty();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 6, description = "VD_TC_229-Verify the All saved Images are Empty")
    public void VD_TC_229_verifyAllSavedImagesEmpty() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateAllSavedImagesEmpty();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 7, description = "VD_TC_237-Verify the long text in Image")
    public void VD_TC_237_verifyLongTextInImage() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        profilePage.validateLongtextInImage();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

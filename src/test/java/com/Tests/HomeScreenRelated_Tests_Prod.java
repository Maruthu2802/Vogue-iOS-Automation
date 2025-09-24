package com.Tests;

import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class HomeScreenRelated_Tests_Prod {

    HomeScreen homeScreen;
    LandingAndSignInScreen landingAndSignInScreen;
    String commentText = "Nice Post!";

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        homeScreen = new HomeScreen();
    }

    //PROD
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 10, description = "VD-TC-282 -> On tapping a post, it should open in full screen")
    public void VD_TC_282_OpenFullPostTest() {
        homeScreen.navigateToContributorsAllTab();
        homeScreen.clickOnFirstPostFromAllTab();
        homeScreen.validateFullScreenPostOpened();
    }

    //PROD
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 11, description = "VD-TC-320 -> Tapping the Share button shows all social media options")
    public void VD_TC_320_VerifyShareFunctionality() {
        homeScreen.navigateToContributorsFollowingTab();
        homeScreen.clickonShare();
        homeScreen.SocialMediaShareOptions();
    }

    //PROD
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 12, description = "VD-TC-323 -> Tapping Copy Link, should copy the link and show “Copied to clipboard” message")
    public void VD_TC_323_VerifyCopyLinkFunctionality() {
        homeScreen.navigateToContributorsFollowingTab();
        homeScreen.clickonShare();
        homeScreen.CopyLinkFunctionality();
        homeScreen.validateCopyLinkPopup();
    }

    //PROD
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 13, description = "VD-TC-330 -> Verify canceling iMessage share")
    public void VD_TC_330_shareThroughMessageFunctionalityCheck() {
        homeScreen.navigateToContributorsFollowingTab();
        homeScreen.clickonShare();
        homeScreen.shareThroughMessage();
    }

    //Prod
    //   Pass but last step need locator
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 14, description = "VD-TC-336 -> Verify user can add and view a comment on a shared post")
    public void VD_TC_336_CommentValidation() {
        homeScreen.navigateToContributorsAllTab();
        homeScreen.CommentValidation(commentText);
    }


    //Prod
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 15, description = "VD-TC-307 -> Verify Latest Stories section in Home Page")
    public void VD_TC_307_LatestStoriesValidation() {
        homeScreen.verifyFirstPostUnderLatestStories();
    }

    // Prod
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 16, description = "VD-TC-331 -> Verify share popup can be closed and story screen is displayed")
    public void VD_TC_331_verifySharePopupClose() {
        homeScreen.ShareAndCloseLatestStories();
    }

    //Prod
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 17, description = "VD-TC-283 -> On tapping a post, it should open in full screen")
    public void VD_TC_283_verifyPostOpensInFullScreen() {
        homeScreen.navigateToContributorsAllTab();
        homeScreen.clickOnFirstPostFromAllTab();
        homeScreen.validateFullScreenPostOpened();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }


}

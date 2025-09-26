package com.Tests;

import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import com.automate.pages.RunwayScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class HomeScreenRelated_Tests_Prod {

    HomeScreen homeScreen;
    LandingAndSignInScreen landingAndSignInScreen;
    RunwayScreen runwayScreen;
    String commentText = "Nice Post!";

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        homeScreen = new HomeScreen();
        runwayScreen = new RunwayScreen();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 1, description = "VD-TC-282 -> On tapping a post, it should open in full screen")
    public void VD_TC_282_OpenFullPostTest() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToContributorsAllTab();
        homeScreen.clickOnFirstPostFromAllTab();
        homeScreen.validateFullScreenPostOpened();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 2, description = "VD-TC-320 -> Tapping the Share button shows all social media options")
    public void VD_TC_320_VerifyShareFunctionality() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToContributorsFollowingTab();
        homeScreen.clickonShare();
        homeScreen.SocialMediaShareOptions();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 3, description = "VD-TC-323 -> Tapping Copy Link, should copy the link and show “Copied to clipboard” message")
    public void VD_TC_323_VerifyCopyLinkFunctionality() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToContributorsFollowingTab();
        homeScreen.clickonShare();
        homeScreen.CopyLinkFunctionality();
        homeScreen.validateCopyLinkPopup();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 4, description = "VD-TC-330 -> Verify canceling iMessage share")
    public void VD_TC_330_shareThroughMessageFunctionalityCheck() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToContributorsFollowingTab();
        homeScreen.clickonShare();
        homeScreen.shareThroughMessage();
    }

    //   Pass but last step need locator
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 5, description = "VD-TC-336 -> Verify user can add and view a comment on a shared post")
    public void VD_TC_336_CommentValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToContributorsAllTab();
        homeScreen.CommentValidation(commentText);
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 6, description = "VD-TC-307 -> Verify Latest Stories section in Home Page")
    public void VD_TC_307_LatestStoriesValidation() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyFirstPostUnderLatestStories();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 7, description = "VD-TC-331 -> Verify share popup can be closed and story screen is displayed")
    public void VD_TC_331_verifySharePopupClose() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.ShareAndCloseLatestStories();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 8, description = "VD-TC-283 -> On tapping a post, it should open in full screen")
    public void VD_TC_283_verifyPostOpensInFullScreen() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToContributorsAllTab();
        homeScreen.clickOnFirstPostFromAllTab();
        homeScreen.validateFullScreenPostOpened();
    }

    //PROD
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 10, description = "VD-TC-32 -> Back CTA functionality check on Runway Tab")
    public void VD_TC_32_BackCTAValidationInRunway() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.BackCTAInRunway();
        homeScreen.signOut();
    }

    //PROD
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 11, description = "VD-TC-83 -> Check that the All Seasons tab in the Collection Details screen shows the designer’s seasons in a paginated list")
    public void VD_TC_83_verifyAllSeasonsTabPagination() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.navigateToAllSeasonsTab();
        homeScreen.signOut();
    }

    //PROD
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 12, description = "VD-TC-111 -> Check that each show in the Street Style tab shows the title, season name (if any), and full-resolution thumbnail image.")
    public void VD_TC_111_verifyStreetStyleShowUI() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.navigateToAllSeasonsTab();
        homeScreen.signOut();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

package com.Tests;

import Base.Baseclass;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class PostRelated_Tests extends Baseclass {

    LandingAndSignInScreen landingAndSignInScreen;
    PostScreen postScreen;
    HomeScreen homeScreen;

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        postScreen = new PostScreen();
        homeScreen = new HomeScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 1, description = "VD-TC-350-Verify user can have option for post tab below the screen")
    public void validatePostBottomTab() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validatePostBottomTab();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 2, description = "VD-TC-351-Verify when user click on post tab it should navigate to new page having title 'New post' on the top.")
    public void validateNavigationToNewPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateNavigationToNewPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 3, description = "VD-TC-352-Verify when user name & profile pic in new post page")
    public void validateUserNameAndProfilePicInNewPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateUserNameAndProfilePicInNewPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 4, description = "VD-TC-353-Verify placeholder text 'Type your post here..'")
    public void validatePlaceHolderTextInNewPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validatePlaceHolderTextInNewPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
//    @Test(priority = 5, description = "VD-TC-364 Verify when image get post successfully it should show pop up 'CONTINUE PUBLISHING?'")
    public void validatePostButtonInPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validatePostButtonInPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
//    @Test(priority = 6, description = "VD-TC-365-Verify when user click on 'Publish' on continue publishing pop up it's get publish successfully")
    public void validateSuccessfulPublishOfPost() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateSuccessfulPublishOfPost();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
//    @Test(priority = 7, description = "VD-TC-366-Verify when user click on 'cancel' on continue publishing pop up it's get cancel successfully")
    public void validateCancelThePublishOfPost() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateCancelThePublishOfPost();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

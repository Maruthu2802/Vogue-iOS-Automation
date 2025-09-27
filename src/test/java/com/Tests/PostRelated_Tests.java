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



    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 1, description = "VD_TC_367_Verify when user choose camera option it should give again two option like Take a Photo Take a video")
    public void validationOfAfterClickingCamera() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.validateAfterclickingCamera();
    }
    
    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 2, description = "VD_TC_269_Publish button behaviour for text beyond limit")
    public void enterExceededTextAndCheckPostIsDisabled() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.enterMoreThan500Text();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 3, description = "VD_TC_355_Verify user can enter post title text which should not be more then 500 character.")
    public void validatingByGivingMoreThan500Texts() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.validateMaxCharactersAllowedInPost();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 4, description = "VD_TC_362_Verify when user uplaod the picture from gallery and press next button it should navigate to POST TO page")
    public void validateAddingImagesFromGalleryPostIcon() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.validatePostIconOnPosting();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 5, description = "VD_TC_363_Verify user can select all topic listed & press next button to post it")
    public void selectingTopicAndPosting() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.clickOnCategories();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 6, description = "VD_TC_374_Verify when user click on use photo it should naviagte back to new post page with same image.")
    public void VD_TC_374_validateAfterclickingCancelFromCameralandingOnNewPost() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.clickOnCameraCancel();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 7, description = "VD_TC_359_Verify when user try to upload attachment from there gallery it should be multi selected up to 4 images")
    public void validateSelectingFourImageAndPostedSuccessfully() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.clickOnPostTabToPost();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.SMOKE})
    @Test(priority = 8, description = "VD_TC_360_Verify when user try to upload more image then 4 it should show pop up message up to four images may be attached,please try again")
    public void validateSelectingFiveImageAndPopUp() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.selectFirstFiveImages();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 9, description = "VD-TC-350-Verify user can have option for post tab below the screen")
    public void validatePostBottomTab() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validatePostBottomTab();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 10, description = "VD-TC-351-Verify when user click on post tab it should navigate to new page having title 'New post' on the top.")
    public void validateNavigationToNewPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateNavigationToNewPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 11, description = "VD-TC-352-Verify when user name & profile pic in new post page")
    public void validateUserNameAndProfilePicInNewPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateUserNameAndProfilePicInNewPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 12, description = "VD-TC-353-Verify placeholder text 'Type your post here..'")
    public void validatePlaceHolderTextInNewPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validatePlaceHolderTextInNewPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
//    @Test(priority = 13, description = "VD-TC-364 Verify when image get post successfully it should show pop up 'CONTINUE PUBLISHING?'")
    public void validatePostButtonInPostScreen() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validatePostButtonInPostScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
//    @Test(priority = 14, description = "VD-TC-365-Verify when user click on 'Publish' on continue publishing pop up it's get publish successfully")
    public void validateSuccessfulPublishOfPost() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateSuccessfulPublishOfPost();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
//    @Test(priority = 15, description = "VD-TC-366-Verify when user click on 'cancel' on continue publishing pop up it's get cancel successfully")
    public void validateCancelThePublishOfPost() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        postScreen.validateCancelThePublishOfPost();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

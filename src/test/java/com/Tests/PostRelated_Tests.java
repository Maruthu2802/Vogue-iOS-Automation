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



    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 1, description = "VD_TC_367_Verify when user choose camera option it should give again two option like Take a Photo Take a video")
    public void validationOfAfterClickingCamera() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.validateAfterclickingCamera();

    }



    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 2, description = "VD_TC_269_Publish button behaviour for text beyond limit")
    public void enterExceededTextAndCheckPostIsDisabled() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.enterMoreThan500Text();

    }


    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 3, description = "VD_TC_355_Verify user can enter post title text which should not be more then 500 character.")
    public void validatingByGivingMoreThan500Texts() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.validateMaxCharactersAllowedInPost();
    }

    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 4, description = "VD_TC_362_Verify when user uplaod the picture from gallery and press next button it should navigate to POST TO page")
    public void validateAddingImagesFromGalleryPostIcon() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.validatePostIconOnPosting();

    }


    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 5, description = "VD_TC_363_Verify user can select all topic listed & press next button to post it")
    public void selectingTopicAndPosting() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.clickOnCategories();
    }


    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 6, description = "VD_TC_374_Verify when user click on use photo it should naviagte back to new post page with same image.")
    public void VD_TC_374_validateAfterclickingCancelFromCameralandingOnNewPost() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.clickOnCameraCancel();
    }


    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 7, description = "VD_TC_359_Verify when user try to upload attachment from there gallery it should be multi selected up to 4 images")
    public void validateSelectingFourImageAndPostedSuccessfully() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.clickOnPostTabToPost();
    }


    @FrameworkAnnotation(author = {"Maruthu"}, category = {CategoryType.REGRESSION})
    @Test(priority = 8, description = "VD_TC_360_Verify when user try to upload more image then 4 it should show pop up message up to four images may be attached,please try again")
    public void validateSelectingFiveImageAndPopUp() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        postScreen.selectFirstFiveImages();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

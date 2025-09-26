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

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 1, description = "VD-TC-212: Entering Board Name and validating if Create button is enabled")
    public void validateIfCreateButtonInCreateBoardPageIsEnabled() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateIfCreateButtonInCreateBoardIsEnabledUponEnteringBoardname();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.SMOKE})
    @Test(priority = 2, description = "Verify LiveStream Tab")
    public void VD_TC_78_verifyLivestreamtab() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.navigateToFirstShow();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 3, description = "Verify reset option in filter in runway tab")
    public void VD_TC_524_verifyResetButtonInFilter() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateClearButtonInFilter();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 4, description = "Verify Apply option in filter in runway tab")
    public void VD_TC_525_verifyApplyButtonFuntion() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateApplyButtonInFilter();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 5, description = "Verify All Action bar in Image Archive")
    public void VD_TC_523_verifyAllActionBarInImageArchive() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateAllActionBarInImageArchive();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 6, description = "Verify All Filter Section in Image Archive")
    public void VD_TC_519_verifyAllFiltersInImageArchive() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateAllFilterSectionsAreAccessibleInImageArchive();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 7, description = "Verify Combining Multiple Filter Section in Image Archive")
    public void VD_TC_178_verifyCombiningMultipleFiltersInImageArchive() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateMultipleFiltersInImageArchive();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 8, description = "Verify Image sharing in colections")
    public void VD_TC_146_verifySharingImagefromCollections() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateSharingImageinCollection();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 9, description = "Verify Combining Multiple Filter Section in Collection")
    public void VD_TC_248_verifyMultipleFiltersInImageArchive() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername, Credentials.contributorPassword);
        runwayScreen.validateMultipleFiltersInCollections();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }


}

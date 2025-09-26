package com.Tests;

import Base.Baseclass;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import com.automate.pages.SettingsScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;


public class SettingsScreenTest extends Baseclass {

    LandingAndSignInScreen landingAndSignInScreen;
    HomeScreen homeScreen;
    SettingsScreen settingsPage;

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        homeScreen = new HomeScreen();
        settingsPage = new SettingsScreen();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 1, description = "Verify the Privacy and Terms")
    public void verifyPrivacyTab() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        settingsPage.clickOnPrivacyAndTerms();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 2, description = "Verify the Invite Friends")
    public void verifyInvitesFriendsTab() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        settingsPage.shareAppOnNotesApp();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 3, description = "VD_TC_159-Verify the Change Appearance")
    public void VD_TC_159_verifyChangeAppearance() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        settingsPage.validateChangeAppearanceOptions();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 4, description = "VD_TC_163-Verify the Share Feedback")
    public void VD_TC_163_verifyShareFeedback() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        settingsPage.validateShareFeedbackOptions();
    }

    //PROD
    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 5, description = "VD_TC_168-Verify the Rate App" )
    public void VD_TC_168_verifyRateApp() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        settingsPage.validateRateAppOptions();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 6, description = "VD_TC_178-Verify the Sign Out")
    public void VD_TC_178_verifySignOut() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        settingsPage.validateSignOut();
    }

    @FrameworkAnnotation(author = {"Abee"}, category = {CategoryType.REGRESSION})
    @Test(priority = 5, description = "VD_TC_158-Verify the Delete Account")
    public void VD_TC_158_verifyDeleteAccount() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        settingsPage.validateDeleteAccount();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

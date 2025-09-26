package com.automate.pages;


import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class SettingsScreen extends ScreenActions {

    HomeScreen homeScreen = new HomeScreen();

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile Picture']/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeImage[2]")
    public MobileElement profileTab;

    @AndroidFindBy(accessibility = "Settings")
    @iOSXCUITFindBy(accessibility = "Settings")
    public MobileElement settingsTab;

    //Change Appearance Page
    @AndroidFindBy(accessibility = "CHANGE APPEARANCE")
    @iOSXCUITFindBy(accessibility = "CHANGE APPEARANCE")
    public MobileElement changeAppearance;

    @AndroidFindBy(accessibility = "Vogue")
    @iOSXCUITFindBy(accessibility = "Vogue")
    public MobileElement vogueTitle;

    @AndroidFindBy(accessibility = "LIGHT")
    @iOSXCUITFindBy(accessibility = "LIGHT")
    public MobileElement lightTheme;

    @AndroidFindBy(accessibility = "DARK")
    @iOSXCUITFindBy(accessibility = "DARK")
    public MobileElement darkTheme;

    @AndroidFindBy(accessibility = "USE SYSTEM SETTINGS")
    @iOSXCUITFindBy(accessibility = "USE SYSTEM SETTINGS")
    public MobileElement useSystemSettingsTheme;

    //Share Feedback Page
    @AndroidFindBy(accessibility = "SHARE FEEDBACK")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='SHARE FEEDBACK']")
    public MobileElement shareFeedback;

    @AndroidFindBy(accessibility = "REPORT A BUG")
    @iOSXCUITFindBy(accessibility = "REPORT A BUG")
    public MobileElement reportABug;

    @AndroidFindBy(accessibility = "REQUEST A FEATURE")
    @iOSXCUITFindBy(accessibility = "REQUEST A FEATURE")
    public MobileElement requestAFeature;

    @AndroidFindBy(accessibility = "ASK A QUESTION")
    @iOSXCUITFindBy(accessibility = "ASK A QUESTION")
    public MobileElement askAQuestion;

    @AndroidFindBy(accessibility = "ADD A GENERAL COMMENT")
    @iOSXCUITFindBy(accessibility = "ADD A GENERAL COMMENT")
    public MobileElement addAGeneralComment;

    // Rate App Page
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='RATE APP'])[1]")
    public MobileElement rateApp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='AppStore.shelfItemSubComponent.title']")
    public MobileElement appTitleInAppStore;

    // Privacy & Terms
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='PRIVACY & TERMS']")
    public MobileElement privacyAndTerms;

    @iOSXCUITFindBy(accessibility = "PRIVACY & TERMS")
    public MobileElement privacyAndTermsTitle;

    //Invite Friends
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='INVITE FRIENDS']")
    public MobileElement inviteFriendsTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='cellTitleLabel' and @label='Notes']")
    public MobileElement notesApp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Save']")
    public MobileElement saveButton;

    //Sign Out
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SIGN OUT']")
    public MobileElement signOutButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Yes']")
    public MobileElement yesButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SIGN IN']")
    public MobileElement signInButton;

    //Delete Account
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DELETE ACCOUNT']")
    public MobileElement deleteAccountButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='DELETE YOUR CONDE NAST ACCOUNT']")
    public MobileElement deleteAcountConfirmation;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
    public MobileElement cancelButton;

    public void clickOnPrivacyAndTerms() {
        homeScreen.navigateToSettings();
        scrollUntilElementVisible(privacyAndTerms);
        waitingFor(8000);
        click(privacyAndTerms, "Privacy and Terms");
        verifyElementPresent(privacyAndTermsTitle, "Privacy and Terms is present");
    }

    public void clickOnInviteFriends() {
        homeScreen.navigateToSettings();
        scrollUntilElementVisible(inviteFriendsTab);
        waitingFor(8000);
        click(inviteFriendsTab, "Invite Friends Tab");
    }

    public void shareAppOnNotesApp() {
        clickOnInviteFriends();
        click(notesApp, "Notes App");
        click(saveButton, "Notes App Save button");
    }

    public void validateChangeAppearanceOptions() {
        homeScreen.navigateToSettings();
        scrollToElementAndClick(changeAppearance, "Click on Change Appearance");
        verifyElementPresent(vogueTitle, "Vogue title should be visible inside Change Appearance menu");
        verifyElementPresent(lightTheme, "Light theme option should be visible inside Change Appearance menu");
        verifyElementPresent(darkTheme, "Dark theme option should be visible inside Change Appearance menu");
        verifyElementPresent(useSystemSettingsTheme, "Use System Settings option should be visible inside Change Appearance menu");
    }

    public void validateShareFeedbackOptions() {
        homeScreen.navigateToSettings();
        scrollUntilElementVisible(shareFeedback);
        waitingFor(5000);
        click(shareFeedback, "Click on Share Feedback");
        verifyElementPresent(reportABug, "Report a Bug option should be visible inside Share Feedback");
        verifyElementPresent(requestAFeature, "Request a Feature option should be visible inside Share Feedback");
        verifyElementPresent(askAQuestion, "Ask a Question option should be visible inside Share Feedback");
        verifyElementPresent(addAGeneralComment, "Add a General Comment option should be visible inside Share Feedback");
    }

    public void validateRateAppOptions() {
        homeScreen.navigateToSettings();
        scrollUntilElementVisible(rateApp);
        waitingFor(3000);
        click(rateApp, "Click on Rate App");
        verifyElementPresent(appTitleInAppStore, "App should navigate to App Store after clicking on Rate App");
    }

    public void validateSignOut() {
        homeScreen.navigateToSettings();
        click(signOutButton, "Click on signout button");
        click(yesButton, "Click on yes in signout confirmation pop up");
        verifyElementPresent(signInButton, "Sign-in button should be visible after navigating to App Store");
    }

    public void validateDeleteAccount() {
        homeScreen.navigateToSettings();
        scrollUntilElementVisible(deleteAccountButton);
        click(deleteAccountButton, "Click on delete account");
        verifyElementPresent(deleteAcountConfirmation, "App should navigate to delete your account page");
        click(deleteAccountButton, "Click on delete account");
        click(cancelButton, "Click on cancel button");
        click(cancelButton, "Click on cancel button");
        waitForVisibility(deleteAccountButton, 5);
        verifyElementPresent(deleteAccountButton, "App should navigate to settings page");
    }


}

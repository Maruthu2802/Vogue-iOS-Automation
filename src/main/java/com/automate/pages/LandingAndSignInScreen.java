package com.automate.pages;

import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

public class LandingAndSignInScreen extends ScreenActions {

    @iOSXCUITFindBy(xpath = "//*[@name='Vogue']")
    public MobileElement VogueCTA;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther//XCUIElementTypeImage)[2]")
    public MobileElement vogueTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[normalize-space(@name)='Welcome to the Vogue app']")
    public MobileElement WelcomeToTheVogueAppScreenTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Never miss a new post']")
    public MobileElement NeverMissANewPostScreenTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='ALLOW NOTIFICATIONS']")
    public MobileElement AllowNotificationsButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'Create an account')]")
    public MobileElement crearteAccountText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CREATE ACCOUNT']")
    public MobileElement createAccountButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Already have an account? ']")
    public MobileElement alreadyHaveAnAccount;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SIGN IN']")
    public MobileElement SignInButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[./preceding-sibling::XCUIElementTypeOther[@name='Email address']]")
    public MobileElement EmailAddressTextField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sign in to Vogue']")
    public MobileElement SignInToVogue;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'CONTINUE')]")
    public MobileElement ContinueButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Set a password' and @value='1']/XCUIElementTypeStaticText")
    public MobileElement SetAPasswordText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    public MobileElement PasswordTextField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CONTINUE WITH SAME ACCOUNT']")
    public MobileElement ContinueWithSameAccountButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Vogue']")
    public MobileElement HomeScreenVogueCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SIGN IN ANOTHER WAY']")
    public MobileElement SignInAnotherWayLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sign in or create an account']")
    public MobileElement SignInOrCreateAnAccountScreenHeader;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email address']")
    public MobileElement EmailAddressTextline;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sign in with a password.']")
    public MobileElement SignInWithAPasswordText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sign in faster next time?']")
    public MobileElement SignInFasterNextTimeScreenHeader;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Continue without a passkey']")
    public MobileElement ContinueWithoutAPasskeyLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Invalid email']")
    public MobileElement InvalidEmailErrorMessage;

    @iOSXCUITFindBy(className = "XCUIElementTypeButton[contains(@name='Vogue')]")
    public MobileElement introVideo;

    public void skipIntroVideo(){
        waitForElementToBeClickable(introVideo, 40);
        click(introVideo, "Skip intro video");
    }

    public void validateSkipIntroVideo() {
        skipIntroVideo();
        Assert.assertTrue(SignInButton.isDisplayed(), "Intro Video is not skipped");
    }

    public void EnterEmailAddressAndClickOnContinue(String username){
        type(EmailAddressTextField, username, "Email Address Text Field");
        Assert.assertTrue(verifyElementPresentAndClick(ContinueButton, "Continue With Email Button"), "Continue With Email Button should be displayed");
    }

    public void UnsuccessfulLogin(String username){
        skipIntroVideo();
        waitForVisibility(SignInButton, 30);
        Assert.assertTrue(verifyElementPresentAndClick(SignInButton, "Sign In Button"), "Sign In Button should be displayed");
        if(isElementVisible(ContinueWithSameAccountButton)) {
            click(SignInAnotherWayLink, "Sign In Another Way Link");
            waitForVisibility(EmailAddressTextline, 30);
            EnterEmailAddressAndClickOnContinue(username);
        } else {
            waitForVisibility(EmailAddressTextline, 30);
            EnterEmailAddressAndClickOnContinue(username);
        }
        Assert.assertTrue(verifyElementPresent(InvalidEmailErrorMessage, "Invalid Email Error Message"),"Invalid Email Error Message should be displayed");
    }

    public void validateSignInPage() {
        skipIntroVideo();
        Assert.assertTrue(isElementVisible(vogueTitle), "Vogue Title on Landing Screen should be visible");
        Assert.assertTrue(isElementVisible(crearteAccountText), "Create An Account text on Landing Screen should be visible");
        Assert.assertTrue(isElementVisible(createAccountButton), "Create Account Button on Landing Screen should be visible");
        Assert.assertTrue(isElementVisible(alreadyHaveAnAccount), "Already have an account text on Landing Screen should be visible");
        Assert.assertTrue(isElementVisible(SignInButton), "Sign In button should be visible");
    }

    public void validateWelcomeToVogueAppScreen(){
        if(isElementVisible(WelcomeToTheVogueAppScreenTitle)){
            click(ContinueButton, "Continue Button");
            if(isElementVisible(NeverMissANewPostScreenTitle)){
                click(AllowNotificationsButton, "Allow Notifications Button");
                acceptAllAlerts(1, 10);
            }
        }
    }

    public void signInFlow(String username, String password) {
        skipIntroVideo();
        acceptAllAlerts(1, 10);
        validateWelcomeToVogueAppScreen();
        waitForVisibility(SignInButton, 30);
        Assert.assertTrue(verifyElementPresentAndClick(SignInButton, "Sign In Button"), "Sign In Button should be displayed");
        if(isElementVisible(ContinueWithSameAccountButton)){
            click(SignInAnotherWayLink, "Sign In Another Way Link");
            waitForVisibility(SignInOrCreateAnAccountScreenHeader, 30);
            EnterEmailAddressAndClickOnContinue(username);
            if (isElementVisible(SetAPasswordText)) {
                Assert.assertTrue(verifyElementPresent(SetAPasswordText, "Set a password Screen title"), "Set a password Screen title should be displayed");
                type(PasswordTextField, password, "Password Field");
                click(VogueCTA, "Vogue CTA");
                Assert.assertTrue(verifyElementPresentAndClick(ContinueButton, "Continue Button"), "Continue Button should be displayed");
                handledismissAlert();
            }else{
                type(PasswordTextField, password, "Password Field");
                click(VogueCTA, "Vogue CTA");
                Assert.assertTrue(verifyElementPresentAndClick(SignInButton, "SignIn Button"), "SignIn Button should be displayed");
                handledismissAlert();
            }
        } else {
            EnterEmailAddressAndClickOnContinue(username);
            if (isElementVisible(SetAPasswordText)) {
                Assert.assertTrue(verifyElementPresent(SetAPasswordText, "Set a password Screen Title"), "Set a password Screen Title should be displayed");
                type(PasswordTextField, password, "Password Field");
                click(VogueCTA, "Vogue CTA");
                Assert.assertTrue(verifyElementPresentAndClick(ContinueButton, "Continue Button"), "Continue Button should be displayed");
                handledismissAlert();
            }else{
                type(PasswordTextField, password, "Password Field");
                click(VogueCTA, "Vogue CTA");
                Assert.assertTrue(verifyElementPresentAndClick(SignInButton, "SignIn Button"), "SignIn Button should be displayed");
                handledismissAlert();
            }
        }
        if(isElementVisible(SignInFasterNextTimeScreenHeader)){
            waitForVisibility(SignInFasterNextTimeScreenHeader, 30);
            Assert.assertTrue(verifyElementPresentAndClick(ContinueWithoutAPasskeyLink, "Continue Without A Passkey Link"), "Continue Without A Passkey Link should be displayed");
            validateWelcomeToVogueAppScreen();
            Assert.assertTrue(verifyElementPresent(HomeScreenVogueCTA, "Home Screen Vogue CTA"), "Home Screen Vogue CTA should be displayed");
        } else {
            validateWelcomeToVogueAppScreen();
            Assert.assertTrue(verifyElementPresent(HomeScreenVogueCTA, "Home Screen Vogue CTA"), "Home Screen Vogue CTA should be displayed");
        }
    }




}

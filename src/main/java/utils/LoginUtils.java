package utils;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import com.automate.pages.screenActions.ScreenActions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import java.util.NoSuchElementException;

import static com.automate.driver.Manager.DriverManager.getDriver;

public class LoginUtils {
    private static final Logger log = LoggerFactory.getLogger(LoginUtils.class);

    public static final String stagingBundleID = "com.condenast.voguerunway.rokmetro";
    public static final String prodBundleID = "";

    public static void SignInFlow(String username, String password) throws InterruptedException {
        LandingAndSignInScreen landingScreenValidation = new LandingAndSignInScreen();

        ScreenActions.waitForVisibility(landingScreenValidation.SignInButton,120);
        ScreenActions.verifyElementPresentAndClick(landingScreenValidation.SignInButton, "Sign In Button");

//        if(){
//
//        }

        ScreenActions.click(landingScreenValidation.EmailAddressTextField, "Email Address Text Field");
        ScreenActions.type(landingScreenValidation.EmailAddressTextField, username, "Email Address Text Field");
        ScreenActions.verifyElementPresentAndClick(landingScreenValidation.ContinueButton, "Continue With Email Button");

        if(ScreenActions.isElementVisible(landingScreenValidation.SetAPasswordText)){
            ScreenActions.verifyElementPresent(landingScreenValidation.SetAPasswordText, "Set a password Screen Text");
            ScreenActions.click(landingScreenValidation.PasswordTextField,"Password Field");
            ScreenActions.type(landingScreenValidation.PasswordTextField, password, "Password Field");
            ScreenActions.verifyElementPresentAndClick(landingScreenValidation.ContinueButton, "Continue Button");
            ScreenActions.handledismissAlert();
        }


//        try {
//            if (ScreenActions.isElementVisible(landingScreenValidation.EmailAddressTextField)){
//
//                ScreenActions.verifyElementPresent(landingScreenValidation.SignInOrCreateAnAccountText, "SignIn Or Create An Account Text");
//
//                ScreenActions.waitForElementToBeClickable(ftuescreevalidation.emailfieldbox, 60);
//                Assert.assertTrue(ftuescreevalidation.emailfieldbox.isDisplayed());
//
//                //Author - Yogha
//                ftuescreevalidation.emailfieldbox.click();
//                ftuescreevalidation.emailfieldbox.sendKeys(username);
//                try {
//                    ScreenActions.waitForVisibility(ftuescreevalidation.continueemailbtn, 30);
//
//                    if (ftuescreevalidation.continueemailbtn != null && ftuescreevalidation.continueemailbtn.isDisplayed()) {
//                        Assert.assertTrue(ftuescreevalidation.continueemailbtn.isDisplayed(), "Continue with email button is not displayed");
//                        ScreenActions.waitForElementToBeClickable(ftuescreevalidation.continueemailbtn, 60);
//                        ScreenActions.click(ftuescreevalidation.continueemailbtn, "Continue with email button");
//                        Thread.sleep(2000);
//                    } else {
//                        ScreenActions.waitForVisibility(ftuescreevalidation.goKeyBoardButton, 30);
//                        ScreenActions.waitForElementToBeClickable(ftuescreevalidation.goKeyBoardButton, 30);
//                        ScreenActions.click(ftuescreevalidation.goKeyBoardButton, "The Keyboard button - Clicked");
//                    }
//                } catch (Exception e) {
//                    System.out.println("Exception during FTUE email/keyboard handling: " + e.getMessage());
//                }
//
//
//                try {
//                    ScreenActions.waitForVisibility(ftuescreevalidation.passwordfieldbox, 20);
//                } catch (Exception e) {
//                    try {
//                        if (ftuescreevalidation.passkeybutton.isDisplayed()) {
//                            ScreenActions.waitForVisibility(ftuescreevalidation.passkeybutton, 30);
//                            Assert.assertTrue(ftuescreevalidation.passkeybutton.isDisplayed());
//                            ScreenActions.click(ftuescreevalidation.passkeybutton, "The Passkey button is not clicked");
//
//                            ScreenActions.waitForVisibility(ftuescreevalidation.passwordfieldbox, 60);
//                            Assert.assertTrue(ftuescreevalidation.passwordfieldbox.isDisplayed());
//                            ScreenActions.waitForElementToBeClickable(ftuescreevalidation.passwordfieldbox, 60);
//
//                            //Author - Yogha
//                            ftuescreevalidation.passwordfieldbox.click();
//                            ScreenActions.waitForVisibility(ftuescreevalidation.passwordfieldbox, 60);
//                            ftuescreevalidation.passwordfieldbox.sendKeys(password);
//                            try {
//                                if (ftuescreevalidation.passwordSignInButton != null && ftuescreevalidation.passwordSignInButton.isDisplayed()) {
//                                    ScreenActions.scrollUntilElementVisible(ftuescreevalidation.passwordSignInButton);
//                                    ScreenActions.waitForVisibility(ftuescreevalidation.passwordSignInButton, 30);
//                                    ScreenActions.waitForElementToBeClickable(ftuescreevalidation.passwordSignInButton, 30);
//                                    ScreenActions.click(ftuescreevalidation.passwordSignInButton, "Sign-In button - Clicked");
//                                } else {
//                                    ScreenActions.waitForVisibility(ftuescreevalidation.keyboardgo, 30);
//                                    ScreenActions.waitForElementToBeClickable(ftuescreevalidation.keyboardgo, 30);
//                                    ScreenActions.click(ftuescreevalidation.keyboardgo, "Keyboard 'Go' button - Clicked");
//                                }
//                            } catch (Exception ex) {
//                                System.out.println("Exception during Sign-In or Keyboard flow: " + ex.getMessage());
//                            }
//
//                        } else {
//                            log.info("Pass Key Button is not displayed");
//                        }
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//
//                    try {
//
//                        if (ftuescreevalidation.loginreloadicon.isDisplayed()) {
//                            // Retry login flow
//                            ScreenActions.waitForElementToBeClickable(ftuescreevalidation.loginreloadicon, 60);
//                            ScreenActions.click(ftuescreevalidation.loginreloadicon, "Reload Icon - Clicked");
//                            Thread.sleep(2000);
//                            ScreenActions.waitForVisibility(ftuescreevalidation.emailfieldbox, 40);
//                            ftuescreevalidation.emailfieldbox.click();
//                            ftuescreevalidation.emailfieldbox.sendKeys(username);
//                            ScreenActions.waitForElementToBeClickable(ftuescreevalidation.continueemailbtn, 60);
//                            ScreenActions.click(ftuescreevalidation.continueemailbtn, "Continue with email button");
//                        } else {
//                            log.info("Reload Icon is not displayed");
//                        }
//                    } catch (Exception ex) {
//                        System.out.println(ex);
//                    }
//
//                }
//                Thread.sleep(2000);
//
//                try {
//                    if (ftuescreevalidation.passwordfieldbox.isDisplayed()) {
//
//                        ScreenActions.waitForVisibility(ftuescreevalidation.passwordfieldbox, 60);
//                        Assert.assertTrue(ftuescreevalidation.passwordfieldbox.isDisplayed());
//                        ScreenActions.waitForElementToBeClickable(ftuescreevalidation.passwordfieldbox, 60);
//                        //Author - Yogha
//                        ftuescreevalidation.passwordfieldbox.click();
//                        ScreenActions.waitForVisibility(ftuescreevalidation.passwordfieldbox, 60);
//                        ftuescreevalidation.passwordfieldbox.sendKeys(password);
//                        try {
//                            if (ftuescreevalidation.passwordSignInButton != null && ftuescreevalidation.passwordSignInButton.isDisplayed()) {
//                                ScreenActions.scrollUntilElementVisible(ftuescreevalidation.passwordSignInButton);
//                                ScreenActions.waitForVisibility(ftuescreevalidation.passwordSignInButton, 30);
//                                ScreenActions.waitForElementToBeClickable(ftuescreevalidation.passwordSignInButton, 30);
//                                ScreenActions.click(ftuescreevalidation.passwordSignInButton, "Sign-In button - Clicked");
//                            } else {
//                                ScreenActions.waitForVisibility(ftuescreevalidation.keyboardgo, 30);
//                                ScreenActions.waitForElementToBeClickable(ftuescreevalidation.keyboardgo, 30);
//                                ScreenActions.click(ftuescreevalidation.keyboardgo, "Keyboard 'Go' button - Clicked");
//                            }
//                        } catch (Exception ex) {
//                            System.out.println("Exception during Sign-In or Keyboard flow: " + ex.getMessage());
//                        }
//                        Thread.sleep(20000);
//                        try {
//                            if (ftuescreevalidation.withoutpasskeybutton.isDisplayed()) {
//                                ScreenActions.waitForVisibility(ftuescreevalidation.withoutpasskeybutton, 30);
//                                ScreenActions.waitForElementToBeClickable(ftuescreevalidation.withoutpasskeybutton, 30);
//                                ScreenActions.click(ftuescreevalidation.withoutpasskeybutton, "Without passkey Button - Clicked");
//                            }
//
//                        } catch (Exception e) {
//                            log.info(String.valueOf(e));
//                        }
//                        ScreenActions.click(ftuescreevalidation.notificationscreenturnonbtn, "Notification screen turn on button");
//                        ScreenActions.handleacceptAlert();
//                    }else {
//                        log.info("Password Filed is not displayed");
//                    }
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            }
//
//        }
//        catch(NoSuchElementException | InterruptedException e) {
//            ScreenActions.acceptAllAlerts(1,60);
//            try {
//                if (ftuescreevalidation.acceptterms.isDisplayed()){
//                    ScreenActions.waitForVisibility(ftuescreevalidation.acceptterms,60);
//                    ScreenActions.click(ftuescreevalidation.acceptterms,"Accept pop is clicked");
//                }
//            } catch (Exception ex) {
//                System.out.println("No Accept Popup is displayed" +ex);
//            }
//            Assert.assertTrue(ftuescreevalidation.signintext.isDisplayed());
//            Assert.assertTrue(ftuescreevalidation.signinanotherwaytext.isDisplayed());
//            ScreenActions.click(ftuescreevalidation.signinanotherwaytext,"Signin in another way");;
//            ScreenActions.waitForVisibility(ftuescreevalidation.signinorcreateaccounttext,60);
//            Assert.assertTrue(ftuescreevalidation.signinorcreateaccounttext.isDisplayed());
//            Assert.assertTrue(ftuescreevalidation.emailfieldbox.isDisplayed());
//            ScreenActions.waitForElementToBeClickable(ftuescreevalidation.emailfieldbox,60);
//            ftuescreevalidation.emailfieldbox.sendKeys(username);
//            Assert.assertTrue(ftuescreevalidation.continueemailbtn.isDisplayed());
//            ScreenActions.click(ftuescreevalidation.continueemailbtn,"Continue Email button");
//            try {
//                if (!ftuescreevalidation.passwordfieldbox.isDisplayed()){
//                    try {
//                        if (ftuescreevalidation.passkeybutton.isDisplayed()) {
//                            ScreenActions.waitForVisibility(ftuescreevalidation.passkeybutton, 30);
//                            Assert.assertTrue(ftuescreevalidation.passkeybutton.isDisplayed());
//                            ScreenActions.click(ftuescreevalidation.passkeybutton, "The Passkey button is not clicked");
//                        } else {
//                            log.info("Pass Key Button is not displayed");
//                        }
//                    } catch (Exception ex) {
//                        log.info(String.valueOf(ex));
//                    }
//                    ScreenActions.waitForVisibility(ftuescreevalidation.loginreloadicon,30);
//                    ScreenActions.waitForElementToBeClickable(ftuescreevalidation.loginreloadicon,60);
//                    ScreenActions.click(ftuescreevalidation.loginreloadicon,"Reload Icon - Clicked");
//                    ftuescreevalidation.emailfieldbox.click();
//                    ftuescreevalidation.emailfieldbox.sendKeys(username);
//                    Assert.assertTrue(ftuescreevalidation.continueemailbtn.isDisplayed());
//                    ScreenActions.waitForElementToBeClickable(ftuescreevalidation.continueemailbtn,60);
//                    ScreenActions.click(ftuescreevalidation.continueemailbtn, "Continue with email button");
//
//                }else {
//                    System.out.println("Password Field - Displayed");
//                }
//            } catch (Exception e2) {
//                System.out.println("Exception:"+e2);
//            }
//
//            ScreenActions.waitForElementToBeClickable(ftuescreevalidation.passwordtextbox,60);
//            Assert.assertTrue(ftuescreevalidation.passwordtextbox.isDisplayed());
//            ftuescreevalidation.passwordtextbox.sendKeys(password);
//            try {
//                if (ftuescreevalidation.passwordSignInButton != null && ftuescreevalidation.passwordSignInButton.isDisplayed()) {
//                    ScreenActions.scrollUntilElementVisible(ftuescreevalidation.passwordSignInButton);
//                    ScreenActions.waitForVisibility(ftuescreevalidation.passwordSignInButton, 30);
//                    ScreenActions.waitForElementToBeClickable(ftuescreevalidation.passwordSignInButton, 30);
//                    ScreenActions.click(ftuescreevalidation.passwordSignInButton, "Sign-In button - Clicked");
//                } else {
//                    ScreenActions.waitForVisibility(ftuescreevalidation.keyboardgo, 30);
//                    ScreenActions.waitForElementToBeClickable(ftuescreevalidation.keyboardgo, 30);
//                    ScreenActions.click(ftuescreevalidation.keyboardgo, "Keyboard 'Go' button - Clicked");
//                }
//            } catch (Exception ex) {
//                System.out.println("Exception during Sign-In or Keyboard flow: " + ex.getMessage());
//            }
//            try {
//                if (ftuescreevalidation.withoutpasskeybutton.isDisplayed()){
//                    ScreenActions.waitForVisibility(ftuescreevalidation.withoutpasskeybutton,30);
//                    ScreenActions.waitForElementToBeClickable(ftuescreevalidation.withoutpasskeybutton,30);
//                    ScreenActions.click(ftuescreevalidation.withoutpasskeybutton,"Without passkey Button - Clicked");
//                }
//            } catch (Exception exception) {
//                log.info(String.valueOf(exception));
//            }
//            ScreenActions.waitForElementToBeClickable(ftuescreevalidation.ftujskip,30);
//        }
//
//        ScreenActions.click(ftuescreevalidation.notificationscreenturnonbtn,"Notification screen turn on button");
//        ScreenActions.handleacceptAlert();
//        Thread.sleep(10000);
    }

//    public static void signOutFlow(){
//        FTUEscreenvalidation ftuEscreenvalidation = new FTUEscreenvalidation();
//
//        ScreenActions.waitForVisibility(ftuEscreenvalidation.mylibrarymenu,30);
//        ScreenActions.waitForElementToBeClickable(ftuEscreenvalidation.mylibrarymenu,30);
//        ScreenActions.click(ftuEscreenvalidation.mylibrarymenu,"The Library Section is not clicked");
//
//        ScreenActions.waitForVisibility(ftuEscreenvalidation.settingsIcon,30);
//        ScreenActions.waitForElementToBeClickable(ftuEscreenvalidation.settingsIcon,30);
//        ScreenActions.click(ftuEscreenvalidation.settingsIcon,"The Library Section is not clicked");
//
//        ScreenActions.waitForVisibility(ftuEscreenvalidation.signoutbutton,30);
//        ScreenActions.waitForElementToBeClickable(ftuEscreenvalidation.signoutbutton,30);
//        ScreenActions.click(ftuEscreenvalidation.signoutbutton,"The Library Section is not clicked");
//
//        try {
//            if (ftuEscreenvalidation.signoutpopup.isDisplayed()) {
//                ScreenActions.waitForVisibility(ftuEscreenvalidation.signoutpopup, 30);
//                ScreenActions.waitForElementToBeClickable(ftuEscreenvalidation.signoutpopup, 30);
//                ScreenActions.click(ftuEscreenvalidation.signoutpopup, "The Library Section is not clicked");
//            }else {
//                System.out.println("Signout Popup Page is no displayed");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        ScreenActions.dismissAllAlerts(2,10);
//
//        try {
//            if (ftuEscreenvalidation.signoutsettingpage.isDisplayed()){
//                log.info("The Sign-Out is successfull");
//            }else {
//                log.info("The Sign-ou is not done");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}

package com.Tests;

import Base.Baseclass;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class HomeScreenRelated_Tests extends Baseclass {

    HomeScreen homeScreen;
    LandingAndSignInScreen landingAndSignInScreen;
    String commentText = "Hi Convo!";

    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        homeScreen = new HomeScreen();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.REGRESSION})
//    @Test(priority = 1, description = "VD-TC-22 - Unsuccessful login")
    public void VD_TC_22_Unsuccessful_Login() {
        landingAndSignInScreen.UnsuccessfulLogin(Credentials.invalidUsername);
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.REGRESSION})
//    @Test(priority = 2, description = "VD-TC-21 - Successful login")
    public void VD_TC_21_loginFlowValidations() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.REGRESSION})
//    @Test(priority = 3, description = "VD-TC-481 - Verify User Can Vote on All Available Images")
    public void VD_TC_481_voteNowValidations() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyUserCanVoteOnMultipleImages();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.REGRESSION})
//    @Test(priority = 4, description = "VD_TC_479 - Verify “Vote Now” CTA is Enabled and Clickable")
    public void VD_TC_479_voteNowBtn() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateVoteNowIsEnabledAndClickable();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 5, description = "VD_TC_480 - Verify Redirection to Voting Screen on CTA Click")
    public void VD_TC_480_ValidateNavigationToVotingGalleryPage() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateVoteNowPage();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 6, description = "VD_TC_489 - Verify Two-Grid Layout on Voting Results Screen")
    public void VD_TC_489_twoGrid() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateTwoGridView();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 7, description = "VD_TC_490 - Verify “View Profile” CTA is Enabled on Result Screen")
    public void VD_TC_490_viewProfileCTA() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToImageVotingPage();
        homeScreen.validateProfileButtonInVotingResultsPage();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 8, description = "VD_TC_491 - Verify Share Option is Available Post Voting")
    public void VD_TC_491_shareCTA() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToImageVotingPage();
        homeScreen.validateShareButtonInVotingResultsPage();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 9, description = "VD_TC_443 - When user click eye button of how it works on play screen it should open/show all the conditions and term")
    public void VD_TC_443_eyeIconExpandsTermsAndConditions() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyHowItWorks();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 10, description = "VD_TC_444 - Verify the options /rules present on the how it works eye button")
    public void VD_TC_444_verifyRulesAfterClickingOnHowItWorks() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyHowItWorksContent();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 11, description = "VD_TC_445 - Verify when user is in how it works eye screen the popup page is shutter enabled so that user can able to close it by pulling down")
    public void VD_TC_445_verifyShutterDownAfterScrollingDown() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyHowItSectionScroll();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 12, description = "VD_TC_446 - Verify when user is in how it works eye screen the popup page have GOT IT CTA button to user can able to close it")
    public void VD_TC_446_verifyGotItButtonOnEyeScreen() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.gotItButtonOnPlayQuiz();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 13, description = "VD_TC_447 - Verify when start play the game the quizz slide have back arrow on the top left corner")
    public void VD_TC_447_verifyBackArrowOnQuizScreen() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyBackArrowOnQuizScreen();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 14, description = "VD_TC_448 - Verify when start play the game the quizz slide have slide count on the top of the screen eg.1/20")
    public void VD_TC_448_verifyQuizCountOnPlayQuizScreen() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyQuizSlideCount();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 15, description = "VD_TC_455 - Verify when start play the game the quizz slide have slide count on the top of the screen eg.1/20")
    public void VD_TC_455_verifyClickingBackButtonWhilePlayingQuiz() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateClickOnBackButtonOnPlayQuiz();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.REGRESSION})
//    @Test(priority = 16, description = "VD_TC_453_456_438_410_437_422_425_426_427_428_429_518 - Verify user can able to play all the question one after another till the last slide of the question and SHARE page")
    public void VD_TC_453_456_438_410_437_422_425_426_427_428_429_518_verifyPlayingQuiz_sharePage() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyPlayingQuiz();                                         //VD_TC_453, VD_TC_456
        homeScreen.shareOptions();                                              //VD_TC_438, VD_TC_410
        homeScreen.shareWithFrnzMsg();                                          //VD_TC_437
        homeScreen.validateUserOnHomePage();
        homeScreen.navigateToQuizResultScreen();                                //VD_TC_422
        homeScreen.verifyPlayMoreRunwayGeniusViewAllSectionUnderResults();      //VD_TC_425, VD_TC_426
        homeScreen.verifyQuizznameAndPlaynowCTAbuttonForEachSlideOftheQuizz();  //VD_TC_427, VD_TC_428
        homeScreen.verifyPlayButtonAndDifficultyLevelForQuiz();                 //VD_TC_429, VD_TC_518
    }

    //Stage
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
//    @Test(priority = 17, description = "VD-TC-337 -> Verify Group Chat Functionality")
    public void VD_TC_337_VerifyGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.navigateBackToHomeScreenFromGroupChat();
    }

    //Stage
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 18, description = "VD-TC-343 -> Verify adding a comment in Group Chat")
    public void VD_TC_343_validateCommentingInGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.validatePostedCommentInGroupChat(commentText);
    }

    //Stage
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 19, description = "VD-TC-345 -> Verify REPORTING IN GROUP CHAT")
    public void VD_TC_345_verifyReportCommentInGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    //Stage
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 20, description = "VD-TC-346 -> Verify multiple options are displayed for REPORTING Options")
    public void VD_TC_346_verifyReportOptionsForComments() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.VerifyVisibilityOfReportingOptions();
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    //Stage
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 21, description = "VD-TC-347 -> Verify the display of REPORTING Options  1.INAPPROPRIATE OF ILLEGAL COMMENT 2. INFRINGES COPYRIGHT")
    public void VD_TC_347_verifyReportOption() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.VerifyVisibilityOfReportingOptions();
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    //Stage
    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.REGRESSION})
    @Test(priority = 22, description = "VD-TC-348 -> Verify reporting a comment navigates to external platform")
    public void VD_TC_348_reportAComment() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.VerifyVisibilityOfReportingOptions();
        homeScreen.reportingOptions();
        homeScreen.relaunchApp("com.condenast.voguerunway.rokmetro");
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.REGRESSION})
    @Test(priority = 23, description = "VD_TC_344-Verify when user click on comment section and with writing anything & click on done keyboard should get hide")
    public void VD_TC_344_validateCommentingInGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.postCommentInGroupChat(commentText);
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.REGRESSION})
    @Test(priority = 24, description = "VD_TC_260-Posts landing UI for author")
    public void VD_TC_260_validateIconsOnContributorePage() {
        homeScreen.validateAllFollwingPostTab();

    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.REGRESSION})
    @Test(priority = 25, description = "VD_TC_482-Verify Special Message on Matching Editor’s Choice")
    public void VD_TC_482_validateSpecialMessageOnVoting() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifySpecialMessageOnMatchingEditorsChoice();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.REGRESSION})
    @Test(priority = 26, description = "VD_TC_481-Verify User Can Vote on All Available Images")
    public void VD_TC_481_validateUserCanVoteOnAllAvailableImages() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyUserCanVoteOnMultipleImages();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

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

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 1, description = "VD-TC-21 - Successful login")
    public void loginFlowValidations() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 2, description = "VD-TC-481 - Verify User Can Vote on All Available Images")
    public void voteNowValidations() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyUserCanVoteOnMultipleImages();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 3, description = "VD_TC_479 - Verify “Vote Now” CTA is Enabled and Clickable")
    public void voteNowBtn() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateVoteNowIsEnabledAndClickable();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 4, description = "VD_TC_480 - Verify Redirection to Voting Screen on CTA Click")
    public void verifyRedirectionToVotingScreenOnCTAClick() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateVoteNowPage();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 5, description = "VD_TC_489 - Verify Two-Grid Layout on Voting Results Screen")
    public void verifyTwoGridLayoutOnVotingResultsScreen() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateTwoGridView();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 6, description = "VD_TC_490 - Verify “View Profile” CTA is Enabled on Result Screen")
    public void verifyViewProfileCTAIsEnabledOnResultScreen() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToImageVotingPage();
        homeScreen.validateProfileButtonInVotingResultsPage();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 7, description = "VD_TC_491 - Verify Share Option is Available Post Voting")
    public void verifyShareOptionIsAvailablePostVoting() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToImageVotingPage();
        homeScreen.validateShareButtonInVotingResultsPage();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 8, description = "VD_TC_443 - When user click eye button of how it works on play screen it should open/show all the conditions and term")
    public void verifyClickingOnEyeIconExpandsTermsAndConditions() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateHowItWorks();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 9, description = "VD_TC_444 - Verify the options /rules present on the how it works eye button")
    public void verifyTheOptionsAfterClickingOnHowItWorksIcon() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateHowItWorksContent();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 10, description = "VD_TC_445 - Verify when user is in how it works eye screen the popup page is shutter enabled so that user can able to close it by pulling down")
    public void verifyAfterClickingOnHowItWorksPopupPageIsShutterIsEnabled() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateHowItSectionScroll();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 11, description = "VD_TC_446 - Verify when user is in how it works eye screen the popup page have GOT IT CTA button to user can able to close it")
    public void verifyAfterClickingOnHowItWorksIconGotItButton() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateGotItButtonOnPlayQuiz();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 12, description = "VD_TC_447 - Verify when start play the game the quizz slide have back arrow on the top left corner")
    public void verifyQuizSlideHaveBackArrowAtTopLeftCorner() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateBackArrowOnQuizScreen();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 13, description = "VD_TC_448 - Verify when start play the game the quizz slide have slide count on the top of the screen eg.1/20")
    public void verifyQuizSlideHaveSlideCountOnTheTopOfTheScreen() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateQuizSlideCount();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 14, description = "VD_TC_455 - Verify when user is in quizz screen and middle of the quizz press back arrow user should able to go back with out asking the confirmation message.")
    public void verifyClickingBackButtonWhilePlayingQuizInTheMiddle() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validateClickOnBackButtonOnPlayQuiz();
    }

    //The reason this test method has so many testcases covered is dependency of the testcases on the results screen after playing Quiz.
    @FrameworkAnnotation(author = "Shivumuni, Satish", category = {CategoryType.SMOKE})
    @Test(priority = 15, description = "VD_TC_453_456_438_404_406_407_454_410_437_422_425_426_427_428_429_518 - Verify user can able to play all the question one after another till the last slide of the question and SHARE page")
    public void verifyPlayingQuizAndShareOptionsAndQuizResultsPageAndDifficultyLevel() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.validatePlayingQuiz();                         //VD_TC_456, VD-TC-407, VD-TC-438, VD-TC-453, VD-TC-454, VD-TC-404, VD-TC-406
        homeScreen.validateShareOptions();                                              //VD_TC_410
        homeScreen.validateShareWithFrnzMsg();                                          //VD_TC_437
        homeScreen.validateUserOnHomePage();
        homeScreen.navigateToQuizResultScreen();                                //VD_TC_422
        homeScreen.validatePlayMoreRunwayGeniusViewAllSectionUnderResults();      //VD_TC_425, VD_TC_426
        homeScreen.validateQuizznameAndPlaynowCTAbuttonForEachSlideOftheQuizz();  //VD_TC_427, VD_TC_428
        homeScreen.validatePlayButtonAndDifficultyLevelForQuiz();                //VD_TC_429, VD_TC_518
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 16, description = "VD-TC-337 -> Verify Group Chat Functionality")
    public void VerifyGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.navigateBackToHomeScreenFromGroupChat();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 17, description = "VD-TC-343 -> Verify adding a comment in Group Chat")
    public void VD_TC_343_validateCommentingInGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.validatePostedCommentInGroupChat(commentText);
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 18, description = "VD-TC-345 -> Verify REPORTING IN GROUP CHAT")
    public void VD_TC_345_verifyReportCommentInGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 19, description = "VD-TC-346 -> Verify multiple options are displayed for REPORTING Options")
    public void VD_TC_346_verifyReportOptionsForComments() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.VerifyVisibilityOfReportingOptions();
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 20, description = "VD-TC-347 -> Verify the display of REPORTING Options  1.INAPPROPRIATE OF ILLEGAL COMMENT 2. INFRINGES COPYRIGHT")
    public void VD_TC_347_verifyReportOption() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.VerifyVisibilityOfReportingOptions();
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    @FrameworkAnnotation(author = "Vidya", category = {CategoryType.SMOKE})
    @Test(priority = 21, description = "VD-TC-348 -> Verify reporting a comment navigates to external platform")
    public void VD_TC_348_reportAComment() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.navigateToGroupChat();
        homeScreen.reportCommentFunctionality();
        homeScreen.VerifyVisibilityOfReportingOptions();
        homeScreen.reportingOptions();
        homeScreen.relaunchApp("com.condenast.voguerunway.rokmetro");
        homeScreen.navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.SMOKE})
    @Test(priority = 22, description = "VD_TC_344_Verify when user click on comment section and with writing anything & click on done keyboard should get hide")
    public void validateCommentingInGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.postCommentInGroupChat();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.SMOKE})
    @Test(priority = 23, description = "VD_TC_260-Posts landing UI for author")
    public void validateIconsOnContributorePage() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        homeScreen.validateAllFollwingPostTab();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 24, description = "VD_TC_482-Verify Special Message on Matching Editor’s Choice")
    public void validateSpecialMessageOnVoting() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifySpecialMessageOnMatchingEditorsChoice();
    }

    @FrameworkAnnotation(author = "Satish A", category = {CategoryType.SMOKE})
    @Test(priority = 25, description = "VD_TC_481-Verify User Can Vote on All Available Images")
    public void validateUserCanVoteOnAllAvailableImages() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.verifyUserCanVoteOnMultipleImages();
    }

    @FrameworkAnnotation(author = "Shivumuni", category = {CategoryType.SMOKE})
    @Test(priority = 26, description = "VD_TC_405 - Verify Quiz Results In Leaderboard")
    public void verifyQuizResultsInLeaderboard() {
        landingAndSignInScreen.signInFlow(Credentials.unsubscribedUsername, Credentials.unsubscribedPassword);
        homeScreen.navigateQuizResultsInLeaderboard();
        homeScreen.validateTotalPlayedStreakAccuracy();
    }

    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}

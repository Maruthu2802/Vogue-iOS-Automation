package com.automate.pages;

import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;
import java.util.Arrays;
import java.util.List;

public class HomeScreen extends ScreenActions {

    @iOSXCUITFindBy(className = "XCUIElementTypeButton[contains(@name='Vogue')]")
    public MobileElement introVideo;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@traits='Header' and @visible='true']")
    public MobileElement validateHeader;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='POST, Tab 3 of 5']")
    public MobileElement postIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKeyboard/XCUIElementTypeOther/XCUIElementTypeOther")
    public MobileElement groupchatKeyboard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Vogue']")
    public MobileElement HomeScreenVogueCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[normalize-space(@name)='LATEST QUIZ VIEW ALL']/following-sibling::XCUIElementTypeButton")
    public MobileElement LatestQuizCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[normalize-space(@name)='LATEST QUIZ VIEW ALL']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeButton")
    public MobileElement VoteNowSecondCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'Voting Gallery')]")
    public MobileElement VotingGalleryScreenTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[normalize-space(@name)='LATEST QUIZ VIEW ALL']")
    public MobileElement QuizViewAllButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='Profile Picture']")
    public MobileElement myProfileIcon;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[./preceding-sibling::XCUIElementTypeOther[contains(@name,'TODAY IN VOGUE')]])[1]")
    public MobileElement clickOnChanel;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'HOME')]")
    public MobileElement HomeBottomTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'RUNWAY')]")
    public MobileElement RunwayBottomTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[normalize-space(@name)='CONTRIBUTORS Tab 2 of 2']")
    public MobileElement ContributorsTab;

    // Home>Contributors>All
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ALL']")
    public MobileElement AllTab;

    @iOSXCUITFindBy(xpath = "(//*[@type='XCUIElementTypeImage'][1])[3]")
    public MobileElement FirstPostFromAll;

    // Home>Contributors>Following
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='FOLLOWING']")
    public MobileElement FollowingTab;

    //Contributors>Following>Post
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='FOLLOWING']/following::XCUIElementTypeImage[1]")
    public MobileElement FirstPostFromFollowing;

    //FullScreenView of post
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage")
    public MobileElement FullScreenViewOfPost;

    //Contributors>Following>Share option in any post
    @iOSXCUITFindBy(xpath = "//*[@name='Share'][1]")
    public MobileElement ShareOption;

    @iOSXCUITFindBy(accessibility = "STORIES")
    public MobileElement StoriesOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='COPY LINK']")
    public MobileElement CopyLinkOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Copied to clipboard.']")
    public MobileElement CopyLinkPopup;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='MESSAGE']")
    public MobileElement MessageOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Cancel']")
    public MobileElement CancelInMessageInbox;

    @iOSXCUITFindBy(accessibility = "Settings")
    public MobileElement settingsTab;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView[contains(@name,'VOTE NOW')])[1]")
    public MobileElement FirstVoteNowImageInVotingGallery;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView[contains(@name,'VOTE NOW')])[2]")
    public MobileElement SecondVoteNowImageInVotingGallery;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='VOTE NOW']")
    public MobileElement VoteNowButtonInImageScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Results']")
    public MobileElement ResultsScreenTitle;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Results']/following-sibling::XCUIElementTypeStaticText)[2]")
    public MobileElement SpecialMessageOnMatchingEditorsChoice;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public MobileElement BackButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SIGN OUT']")
    public MobileElement signOutButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Yes']")
    public MobileElement yesButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SIGN IN']")
    public MobileElement signInButton;

    // VOTE NOW
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Voting Gallery in Voting Container']")
    public MobileElement VoteNowButton;

    // Verifying that the user is in "Voting Gallery in Voting Container" Page  TC_479
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name, 'Voting Gallery')]")
    public MobileElement VotingGalleryPage;

    // Verifying Grid View - Two Grid layout  TC_489
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='Grid view']")
    public MobileElement twoGridView;

    // VOTE NOW under Voting Galley in Voting Container
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[contains(normalize-space(@name), 'VOTE NOW')]")
    public MobileElement firstImageVoteNowButtonInGallery;

    // Final VOTE NOW button
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='VOTE NOW']")
    public MobileElement voteNowButtonInImagePage;

    // Verifying VIEW PROFILE
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='VIEW PROFILE']")
    public MobileElement ViewProfileButton;

    // Verifying Share symbol
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Share']")
    public MobileElement ShareButton;

    // Verifying after "HoW IT WORKS ?"  TC_443
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='HOW IT WORKS']")
    public MobileElement HowItWorksButton;

    // Verifying the content after "HoW IT WORKS ?" TC_444
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='RUNWAY GENIUS 101']")
    public MobileElement HeaderSectn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Play either Beginner or Genius difficulty']")
    public MobileElement DifficultyContent;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Score points for each correct look']")
    public MobileElement ScorePointContent;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Play every day to keep your streak']")
    public MobileElement PlayEveryDayContent;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='A streak will double your daily points']")
    public MobileElement StreakContent;

    // TC_445 Scroll down
    // GOT IT button  TC_446
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='GOT IT']")
    public MobileElement GotItButton;

    // PLAY button
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='PLAY']")
    public MobileElement PlayButton;

    // TC_448 slide count on the top of the screen eg.1/7
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back']/following-sibling::XCUIElementTypeStaticText")
    public MobileElement QuizCount;

    //First answer
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name])[3]")
    public MobileElement FirstAnswer;

    // SHARE WITH FRIENDS button TC_410
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SHARE WITH FRIENDS']")
    public MobileElement ShareWithButton;

    // Checking for "MESSAGE" option TC_410
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='MESSAGE']")
    public MobileElement ShareMsgButton;

    // Closing the Share with Friends screen
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther//XCUIElementTypeImage)[1]")
    public MobileElement CloseShareButton;

    // CONTINUE button
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CONTINUE']")
    public MobileElement ContinueButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Vogue']")
    public MobileElement VogueLogo;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SHARE']")
    public MobileElement SharePage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='MESSAGE']")
    public MobileElement MessageButton;

    // Clicking on MORE
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='MORE']")
    public MobileElement MoreButton;

    // Verify Mail option
    @iOSXCUITFindBy(xpath = "(//*[@name='Mail'])[1]")
    public MobileElement MailButton;

    // Verify Notes option
    @iOSXCUITFindBy(xpath = "(//*[@name='Notes'])[1]")
    public MobileElement NotesButton;

    // Clicking on Close
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='UICloseButtonBackground']")
    public MobileElement CloseButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='vogue.com'])[1]")
    public MobileElement vogueComButton;

    // Verifying that after clicking on the MESSAGE it is directed to the correct page
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='New Message']")
    public MobileElement NewMsgHeader;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Cancel']")
    public MobileElement CancelButton;

    // Clicking on RUNWAY GENIUS
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'The Vogue Runway Weekly Quiz')]")
    public MobileElement runwayGeniusInLatestQuiz;

    // RESULTS Screen
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='RESULTS']")
    public MobileElement ResultsSectionInResultScreen;

    // LEADERBOARD
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='LEADERBOARD']")
    public MobileElement LeaderBoard;

    //Scroll down to PLAY MORE RUNWAY GENIUS
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='PLAY MORE RUNWAY GENIUS']")
    public MobileElement playMoreRunwayGeniusSectionUnderResults;

    //Scroll down to PLAY MORE RUNWAY GENIUS and VIEW ALL
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='VIEW ALL']")
    public MobileElement viewAllSectionUnderResults;

    // Checking PLAY QUIZ slides
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='PLAY MORE RUNWAY GENIUS']/following-sibling::XCUIElementTypeOther//XCUIElementTypeButton")
    public MobileElement playQuizButtonUnderPlayMoreRunwayGenius;

    // Verify it is directed to Quiz Page
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DIFFICULTY: GENIUS']")
    public MobileElement difficultyLevel;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'HOME')]")
    public MobileElement HomeTab;

    //CONTRIBUTORS>ALL>FIRST post comment option
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(normalize-space(@name),'CONTRIBUTOR')]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeButton)[1]")
    public MobileElement CommentOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='Add a comment']")
    public MobileElement AddACommentField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='Vogue']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage")
    public MobileElement DoneArrow;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Latest Stories']")
    public MobileElement LatestStorySectionTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Latest Stories']/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    public MobileElement FirstPostUnderLatestStorySection;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Before It’s In Fashion, It’s In Dogue']")
    public MobileElement GroupChat;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@name, 'Add a comment')]")
    public MobileElement CommentFieldInGroupChat;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField/following-sibling::XCUIElementTypeImage[2]")
    public MobileElement DoneArrowGroupChat;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name, 'JOIN THE CONVERSATION')]")
    public MobileElement AddedComment;

    //3rd comment in group chat and reporting can be validated for other's comment , not urs.
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,' ')])[3]")
    public MobileElement PreexistingCommentInGroupChat;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=normalize-space('REPORT Your report will be sent to a moderator for review.')]")
    public MobileElement Report;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='REASONS FOR REPORTING']")
    public MobileElement ReasonsForReportingPopup;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='INAPPROPRIATE OR ILLEGAL COMMENT']")
    public MobileElement InapproriateOrIllegalComment;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='INFRINGES COPYRIGHT']")
    public MobileElement InfringesCopyright;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Welcome to Mail']")
    public MobileElement ExternalPlatformToReport;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='Profile Picture']")
    public MobileElement Profile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public MobileElement BackInProfile;

    //Methods
    public void validateVoteNowIsEnabledAndClickable() {
        scrollUntilElementVisible(VoteNowButton);
        Assert.assertTrue(isElementEnabled(VoteNowButton, "Vote Now Button"), "Vote Now Button should be Enabled");
        System.out.println(VoteNowButton.getAttribute("accessible"));
        Assert.assertEquals(VoteNowButton.getAttribute("accessible"), "true", "Vote Now Button should be Clickable");
        click(HomeTab, "Home Tab");
    }

    public void validateVoteNowPage() {
        scrollToElementAndClick(VoteNowButton, "VoteNowButton");
        Assert.assertTrue(verifyElementPresent(VotingGalleryPage, "Voting Gallery Page"), "Voting Gallery Page shold be displayed"); //TC_479
        click(BackButton, "Back Button");
    }

    public void validateTwoGridView() {
        scrollToElementAndClick(VoteNowButton, "VoteNowButton");
        Assert.assertTrue(verifyElementPresent(twoGridView, "Two Grid View"), "Two Grid View should be displayed"); // TC_489
        click(BackButton, "Back Button");
    }

    public void navigateToImageVotingPage() {
        scrollToElementAndClick(VoteNowButton, "VoteNowButton");
        scrollToElementAndClick(firstImageVoteNowButtonInGallery, "First Image Vote Now Button In Gallery");
    }

    public void validateProfileButtonInVotingResultsPage() { // TC_490,
        click(voteNowButtonInImagePage, "Vote Now Button In Image Page");
        Assert.assertTrue(verifyElementPresent(ViewProfileButton, "View Profile Button"), "View Profile Button should be displayed"); //TC_490
        click(BackButton, "Back Button");
    }

    public void validateShareButtonInVotingResultsPage(){ //TC_491
        click(voteNowButtonInImagePage, "Vote Now Button In Image Page");
        Assert.assertTrue(verifyElementPresent(ShareButton, "Share option"), "Share Button should be displayed"); //TC_491
        click(BackButton, "Back Button");
    }

    public void navigateToPlayQuiz() {
        waitForVisibility(HomeScreenVogueCTA, 10);
        scrollToElementAndClick(LatestQuizCard, "Play Quiz");
    }

    public void verifyHowItWorks() {
        navigateToPlayQuiz();
        verifyElementPresentAndClick(HowItWorksButton, "'HOW IT WORKS ?' section should be available"); //VD-TC-443
        Assert.assertTrue(verifyElementPresent(HeaderSectn, "Header Section"),"After Expanding verifying Header section");
        click(GotItButton, "Got it Button");
        click(BackButton, "Back Button");
        click(BackButton, "Back Button");
    }

    public void navigateToQuizResultScreen() {
        scrollToElementAndClick(runwayGeniusInLatestQuiz, "RUNWAY GENIUS In Latest Quiz");
        waitForVisibility(ResultsSectionInResultScreen, 10);
        Assert.assertTrue(verifyElementPresent(ResultsSectionInResultScreen, "RESULTS Section In Results Screen"), "RESULTS button should be displayed"); //TC_422
        Assert.assertTrue(verifyElementPresent(LeaderBoard, "LEADERBOARD section"),"LEADERBOARD section should be displayed"); //VD-TC-423
    }

    public void verifyPlayMoreRunwayGeniusViewAllSectionUnderResults() {
        scrollUntilElementVisible(playMoreRunwayGeniusSectionUnderResults);
        scrollUntilElementVisible(viewAllSectionUnderResults);
        Assert.assertTrue(verifyElementPresent(playMoreRunwayGeniusSectionUnderResults, "PLAY MORE RUNWAY GENIUS"), "PLAY MORE RUNWAY GENIUS section should be displayed"); //425
        Assert.assertTrue(verifyElementPresent(viewAllSectionUnderResults,"VIEW ALL"), "VIEW ALL section should be displayed"); //426
    }

    public void verifyQuizznameAndPlaynowCTAbuttonForEachSlideOftheQuizz() {
        Assert.assertTrue(verifyElementPresent(playQuizButtonUnderPlayMoreRunwayGenius,"PLAY QUIZ"), "PLAY QUIZ should be available"); //VD-TC-428
        Assert.assertTrue(verifyElementPresent(playQuizButtonUnderPlayMoreRunwayGenius, "Quiz Name"), "Quiz Name should be in first slide");//VD-TC-428
        scrollVertical();
        waitingFor(2000);
        horizontalSwipe();//VD-TC-427
        Assert.assertTrue(verifyElementPresent(playQuizButtonUnderPlayMoreRunwayGenius,"PLAY QUIZ"), "PLAY QUIZ should be available");//VD-TC-428
        Assert.assertTrue(verifyElementPresent(playQuizButtonUnderPlayMoreRunwayGenius, "Quiz Name"), "Quiz Name should be present in second slide");;//VD-TC-428
        waitingFor(2000);
        horizontalSwipe();//VD-TC-427
        Assert.assertTrue(verifyElementPresent(playQuizButtonUnderPlayMoreRunwayGenius,"PLAY QUIZ"), "PLAY QUIZ should be available");//VD-TC-428
        Assert.assertTrue(verifyElementPresent(playQuizButtonUnderPlayMoreRunwayGenius, "Quiz Name"), "Quiz Name should be present in third slide");//VD-TC-428
    }

    public void verifyPlayButtonAndDifficultyLevelForQuiz() {
        Assert.assertTrue(verifyElementPresentAndClick(playQuizButtonUnderPlayMoreRunwayGenius, "PLAY QUIZ under PLAY MORE RUNWAY GENIUS"), "PLAY QUIZ under PLAY MORE RUNWAY GENIUS should be displayed"); // TC_429
        Assert.assertTrue(verifyElementPresent(difficultyLevel, "DIFFICULTY MODE"), "DIFFICULTY:GENIUS should be present"); //TC_518
        click(BackButton, "Back Button");
        click(BackButton, "Back Button");
    }

    public void verifyHowItWorksContent() {
        // verifying all sections // VD-TC-444
        navigateToPlayQuiz();
        verifyElementPresentAndClick(HowItWorksButton, "'HOW IT WORKS ?' section should be available");
        List<MobileElement> elementsToVerify = Arrays.asList(
                HeaderSectn,
                DifficultyContent,
                ScorePointContent,
                PlayEveryDayContent,
                StreakContent
        );
        for (MobileElement element : elementsToVerify) {
            Assert.assertTrue(element.isDisplayed(), "Element is NOT displayed: " + element.getText());
        }
        click(GotItButton, "Got it Button");
        click(BackButton, "Back Button");
    }

    public void verifyHowItSectionScroll(){
        navigateToPlayQuiz();
        verifyElementPresentAndClick(HowItWorksButton, "'HOW IT WORKS ?'");
        waitForVisibility(HeaderSectn,30);
        scrollDownHoldingElement(HeaderSectn); //VD-TC-445
        click(BackButton, "Back Button");
    }

    public void gotItButtonOnPlayQuiz(){
        navigateToPlayQuiz();
        verifyElementPresentAndClick(HowItWorksButton, "HOW IT WORKS ?");
        verifyElementPresentAndClick(GotItButton, "GOT IT"); //VD-TC-446
        click(BackButton, "Back Button");
    }

    public void verifyBackArrowOnQuizScreen(){
        navigateToPlayQuiz();
        verifyElementPresentAndClick(PlayButton, "PLAY");
        Assert.assertTrue(verifyElementPresent(BackButton, "Back Arrow"),"Back arrow should be displayed on top of the screen"); //VD-TC-447
        click(BackButton, "Back Button");
    }

    public void verifyQuizSlideCount(){
        navigateToPlayQuiz();
        verifyElementPresentAndClick(PlayButton, "PLAY");
        Assert.assertTrue(verifyElementPresent(QuizCount, "Quiz Count"),"Quiz slide should have slide count on the top of the screen"); //VD-TC-448
        click(BackButton,"Back Button");
    }

    public void validateClickOnBackButtonOnPlayQuiz()  {
        navigateToPlayQuiz();
        verifyElementPresentAndClick(PlayButton, "PLAY");
        click(FirstAnswer, "First Answer of 1st Question");
        click(FirstAnswer, "First Answer of 2nd Question");
        click(FirstAnswer, "First Answer of 3rd Question");
        // VD-TC-455
        waitForElementToBeClickable(BackButton, 30);
        click(BackButton, "Back '<' symbol");
        Assert.assertTrue(verifyElementPresent(VogueLogo, "Vogue logo"), "Vogue logo should be displayed");
    }

    public void verifyPlayingQuiz()  {
        navigateToPlayQuiz();
        verifyElementPresentAndClick(PlayButton, "PLAY");
        for (int i = 1; i <= 7; i++) {
            String str = QuizCount.getText();
            Assert.assertTrue(str.contains(String.valueOf(i)), "The Quiz count "+i+" is not displayed");    //TC_453
            waitForVisibility(QuizCount,30);
            waitForVisibility(FirstAnswer, 30);//VD-TC-456
            click(FirstAnswer, "Answers");
            waitingFor(3000);
        }
        verifyElementPresentAndClick(ShareWithButton, "SHARE WITH FRIENDS");
        Assert.assertTrue(verifyElementPresent(SharePage, "SHARE Header"),"SHARE page should be displayed");; //VD-TC-438
        Assert.assertTrue(verifyElementPresent(ShareMsgButton, "MESSAGE Option"),"MESSAGE option");
        verifyElementPresentAndClick(CloseShareButton, "X");
        verifyElementPresentAndClick(ContinueButton, "CONTINUE");
    }

    public void shareOptions()  { //VD-TC-410
        verifyElementPresentAndClick(ShareButton, "Share option at the top right corner");
        Assert.assertTrue(verifyElementPresent(MessageButton, "MESSAGE option"),"MESSAGE option should be displayed");
        waitingFor(1000);
        verifyElementPresentAndClick(MoreButton, "MORE option");
        waitingFor(1000);
        Assert.assertTrue(verifyElementPresent(MailButton, "Mail option"),"Mail option should be displayed");
        Assert.assertTrue(verifyElementPresent(NotesButton, "Notes option"),"Notes option should be displayed");
        scrollDownHoldingElement(vogueComButton);
    }

    public void  shareWithFrnzMsg(){
        // verifying after clicking on MESSAGE it is directed to the correct page // VD-TC-437
        verifyElementPresentAndClick(ShareButton, "SHARE WITH FRIENDS");
        verifyElementPresentAndClick(MessageButton, "MESSAGE option");
        Assert.assertTrue(verifyElementPresent(NewMsgHeader, "New Message"), "New Message header should be available");
        verifyElementPresentAndClick(CancelButton, "Cancel");
        closeAndLaunchApp();
    }
    // Shivu's code end

    //Vidya's code
    public void SocialMediaShareOptions() {
        click(StoriesOption, "STORIES");
    }

    public void CommentValidation(String commentText) {
        scrollUntilElementVisible(CommentOption);
        waitForVisibility(CommentOption, 10);
        click(CommentOption, "Comment");
        waitForVisibility(AddACommentField, 10);
        click(AddACommentField, "Placeholder to type");
        type(AddACommentField, commentText, "Add a Comment Field");
        click(DoneArrow, "Done Arrow");
        //Validate added comment is Displayed
    }

    //VD-TC-307 - > pending
    public void verifyFirstPostUnderLatestStories() {
        validateUserOnHomePage();
        // Scroll to "Latest Stories" section title
        scrollUntilElementVisible(FirstPostUnderLatestStorySection);
        // Wait for the visibility of the first post under Latest Stories
        waitForVisibility(FirstPostUnderLatestStorySection, 10);
        // Verify the first post is present
        Assert.assertTrue(verifyElementPresent(FirstPostUnderLatestStorySection, "first post under Latest Stories"), "First post under Latest Stories should be displayed");
        // Get and print the text from the first post
        String postText = FirstPostUnderLatestStorySection.getAttribute("label");
        System.out.println("Text of the first post under Latest Stories: " + postText);
    }

    //    VD-TC-337
    public void validateGroupChat() {
        validateUserOnHomePage();
        // Scroll to "Latest Stories" section title
        scrollUntilElementVisible(GroupChat);
        waitForElementToBeClickable(GroupChat, 10);
        // Verify the first post is present
        Assert.assertTrue(verifyElementPresent(GroupChat, "Group chat"), "Group chat should be displayed");
    }

    public void navigateToGroupChat() {
        validateUserOnHomePage();
        // Scroll to "Latest Stories" section title
        scrollUntilElementVisible(GroupChat);
        waitForElementToBeClickable(GroupChat, 10);
        click(GroupChat, "Group Chat");
    }

    public void navigateBackToHomeScreenFromGroupChat(){
        click(BackButton, "Back Button");
        click(RunwayBottomTab,"Runway Bottom Tab");
        waitForVisibility(HomeScreenVogueCTA, 10);

    }

    public void postCommentInGroupChat(String commentText) {
        waitForVisibility(CommentFieldInGroupChat, 15);
        click(CommentFieldInGroupChat, "comment input in Group Chat");
        type(CommentFieldInGroupChat, commentText, "Add a Comment Field");
        click(DoneArrowGroupChat, "Done Arrow");
    }

    //   VD-TC-343
    public void validatePostedCommentInGroupChat(String commentText) {
        postCommentInGroupChat(commentText);
        scrollALittle("up");
        waitForVisibility(AddedComment, 8);
        System.out.println("The get text String: "+getText(AddedComment));
        Assert.assertTrue(getText(AddedComment).contains(commentText), "Group chat should be displayed");
        scrollALittle("down");
        click(BackButton, "Back Button");
        click(RunwayBottomTab, "Runway Bottom Tab");
    }

    //    VD-TC-345 - Stage      -- Home>Today>Group chat>>Hold for few sec on comments that pre exist.
    public void reportCommentFunctionality() {
        scrollUntilElementVisible(PreexistingCommentInGroupChat);
        waitForVisibility(PreexistingCommentInGroupChat, 10);
        longPressElement(PreexistingCommentInGroupChat, 2, "Pre-existing Comment in Group Chat");
        waitingFor(3000);
        click(Report, "Report");
        Assert.assertTrue(verifyElementPresent(ReasonsForReportingPopup,"Reasons For Reporting Popup"), "Reasons For Reporting Popup should be displayed");
    }

    //    VD-TC-346 - Stage      -- Home>Today>Group chat>>Hold for few sec on comments that pre exist.
    public void VerifyVisibilityOfReportingOptions() {
        Assert.assertTrue(verifyElementPresent(InapproriateOrIllegalComment, "INAPPROPRIATE OR ILLEGAL COMMENT"), "INAPPROPRIATE OF ILLEGAL COMMENT should be displayed");
        Assert.assertTrue(verifyElementPresent(InfringesCopyright, "INFRINGES COPYRIGHT"), "INFRINGES COPYRIGHT should be displayed");
    }

    //    //    VD-TC-348
    public void reportingOptions() {
        click(InapproriateOrIllegalComment, "INAPPROPRIATE OR ILLEGAL COMMENT");
        Assert.assertTrue(verifyElementPresent(ExternalPlatformToReport, "External Platforms"), "External Platforms should be displayed");
    }

    public void navigatingBackToHomeScreenFromReportingOptionsOfGroupChatComments(){
        scrollDownHoldingElement(ReasonsForReportingPopup);
        scrollVerticalUp();
        click(BackButton, "Back Button");
        click(RunwayBottomTab, "Runway Bottom Tab");
    }

    public void ShareAndCloseLatestStories() {
        validateUserOnHomePage();
        // Scroll to "Latest Stories" section title
        scrollUntilElementVisible(FirstPostUnderLatestStorySection);
        // Wait for the visibility of the first post under Latest Stories
        waitForVisibility(FirstPostUnderLatestStorySection, 10);
        // Verify the first post is present
        Assert.assertTrue(verifyElementPresent(FirstPostUnderLatestStorySection, "first post under Latest Stories"), "first post under Latest Stories should be displayed");
        click(FirstPostUnderLatestStorySection, "INAPPROPRIATE OF ILLEGAL COMMENT");
    }

    public void BackCTAValidationOnProfile() {
        waitForVisibility(myProfileIcon, 10);
        click(myProfileIcon, "Profile");
        waitForVisibility(BackInProfile, 10);
        click(BackInProfile, "Back In Profile Page");
        validateUserOnHomePage();
    }
    //Vidya's code end

    //Maruthu's code
    public void clickToSkipIntroVideo() {
        waitForVisibility(introVideo, 10);
        click(introVideo, "Skip intro video");
    }

    public void navigateTOSettings(){
        clickOnProfileIcon();
        waitForElementToBeClickable(settingsTab, 5);
        click(settingsTab, "Clicking on the SettingIcon");
    }

    public void scrollUntilHeaderVisible() {
        waitForVisibility(myProfileIcon,20);
        click(myProfileIcon,"Click On ProfileIcon");
        scrollUntilElementVisible(validateHeader);
        Assert.assertTrue(validateHeader.isDisplayed());

    }

    public void validateAllFollwingPostTab() {
        clickOnContributorsTab();
        Assert.assertTrue(AllTab.isDisplayed());
        Assert.assertTrue(FollowingTab.isDisplayed());
        Assert.assertTrue(postIcon.isDisplayed());
    }

    public void TapOnGroupChat() {
        // Scroll to "Latest Stories" section title
        scrollUntilElementVisible(GroupChat);
        waitForElementToBeClickable(GroupChat,3);
        // Verify the first post is present
        verifyElementPresent(GroupChat, "Checking Group chat is visible");
        click(GroupChat, "Clicking on Group Chat");
    }

    public void validateKeyBoardGetsHiddenAfterClickingDoneButtonWhilePostingComment(String commentText){
        navigateToGroupChat();
        postCommentInGroupChat(commentText);
        Assert.assertFalse(isElementVisible(groupchatKeyboard));
    }

    //Maruthu's code end

    public void navigateToSettings() {
        clickOnProfileIcon();
        waitForElementToBeClickable(settingsTab, 15);
        click(settingsTab, "the SettingIcon");
    }

    public void validateUserOnHomePage() {
        waitForVisibility(HomeScreenVogueCTA, 10);
        Assert.assertTrue(isElementVisible(HomeScreenVogueCTA), "Vogue Logo not visible - Home page not loaded!");
    }

    public void clickOnContributorsTab() {
        waitForVisibility(ContributorsTab, 10);
        click(ContributorsTab, "Contributors Tab");
    }

    public void clickOnAll() {
        waitForVisibility(AllTab, 10);
        click(AllTab, "All Tab");
    }

    public void clickOnFirstPostFromAllTab() {
        scrollUntilElementVisible(FirstPostFromAll);
        waitForVisibility(FirstPostFromAll, 10);
        click(FirstPostFromAll, "first post in Contributors > All");
    }

    public void validateFullScreenPostOpened() {
        Assert.assertTrue(isElementVisible(FullScreenViewOfPost), "Full screen view of post not opened!");
    }

    public void clickOnFollowing() {
        waitForVisibility(FollowingTab, 30);
        click(FollowingTab, "All Tab");
    }

    public void clickonShare() {
        scrollUntilElementVisible(ShareOption);
        waitingFor(4000);
        click(ShareOption, "Share Option");
    }

    public void clickOnProfileIcon() {
        waitForVisibility(myProfileIcon, 30);
        click(myProfileIcon, "ProfileIcon");
    }

    public void scrollTillChanel() {
        waitForVisibility(HomeScreenVogueCTA, 30);
        scrollUntilElementVisible(clickOnChanel);
        waitForElementToBeClickable(clickOnChanel, 30);
        click(clickOnChanel, "Chanelcta");
    }

    public void CopyLinkFunctionality() {
        Assert.assertTrue(isElementVisible(CopyLinkOption));
        click(CopyLinkOption, "COPY LINK");
    }

    public void validateCopyLinkPopup() {
        Assert.assertTrue(isElementVisible(CopyLinkPopup));
        //verify Popup text
        Assert.assertEquals(CopyLinkPopup.getText(), "Copied to clipboard.", "Popup text mismatch!");
    }

    public void shareThroughMessage() {
        click(MessageOption, "MESSAGE");
        click(CancelInMessageInbox, "Cancel in Message Inbox");
    }

    //    Home -> CONTRIBUTORS tab -> ALL
    public void navigateToContributorsAllTab() {
        waitForVisibility(ContributorsTab, 30);
        click(ContributorsTab, "Contributors Tab");
        waitForVisibility(AllTab, 30);
        click(AllTab, "All Tab");
    }

    //    Home -> CONTRIBUTORS tab -> FOLLOWING
    public void navigateToContributorsFollowingTab() {
        waitForVisibility(ContributorsTab, 30);
        click(ContributorsTab, "Contributors Tab");
        waitForVisibility(FollowingTab, 30);
        click(FollowingTab, "Following Tab");
    }

    public void navigateToVotingGalleryPage() {
        Assert.assertTrue(verifyElementPresent(HomeScreenVogueCTA, "Home Screen Vogue CTA"), "Home Screen Vogue CTA should be displayed");
        scrollToElementAndClick(VoteNowSecondCard, "Vote Now Second Card");
        Assert.assertTrue(verifyElementPresent(VotingGalleryScreenTitle, "Voting Gallery Screen Title"), "Voting Gallery Screen Title should be displayed");
    }

    public void clickOnVoteNowForGalleryImage(MobileElement whichImage, String image) {
        scrollUntilElementVisible(whichImage);
        scrollUp();
        Assert.assertTrue(verifyElementPresentAndClick(whichImage, image), image + " should be displayed");
        Assert.assertTrue(verifyElementPresentAndClick(VoteNowButtonInImageScreen, "Vote Now Button In Image Screen"), "Vote Now Button In Image Screen should be displayed");
        Assert.assertTrue(verifyElementPresent(ResultsScreenTitle, "Results Screen Title"), "Results Screen Title should be displayed");
    }

    //VD-TC-481 - Verify User Can Vote on All Available Images
    public void verifyUserCanVoteOnMultipleImages() {
        navigateToVotingGalleryPage();
        clickOnVoteNowForGalleryImage(FirstVoteNowImageInVotingGallery, "First Vote Now Image In Voting Gallery");
        Assert.assertTrue(verifyElementPresent(SpecialMessageOnMatchingEditorsChoice, "Special Message On Matching Editors Choice"), "Special Message On Matching Editors Choice should be displayed");
        click(BackButton, "Back Button");
    }

    //VD-TC-482 - Verify Special Message on Matching Editor’s Choice
    public void verifySpecialMessageOnMatchingEditorsChoice() {
        navigateToVotingGalleryPage();
        clickOnVoteNowForGalleryImage(SecondVoteNowImageInVotingGallery, "Second Vote Now Image In Voting Gallery");
        click(BackButton, "Back Button");
    }

    public void validateSignOut() {
        navigateToSettings();
        click(signOutButton, "Signout button");
        click(yesButton, "Yes in Signout confirmation pop up");
        Assert.assertTrue(verifyElementPresent(signInButton, "SignIn Button"), "SignIn Button should be displayed");
    }

    public void signOut(){
        navigateToSettings();
        click(signOutButton, "Signout button");
        click(yesButton, "yes in Signout confirmation pop up");
    }


}

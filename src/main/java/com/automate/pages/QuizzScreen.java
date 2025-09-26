package com.automate.pages;

import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

public class QuizzScreen extends ScreenActions {

//    HomeScreenVogueCTA

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'OF') and contains(@name,'CORRECT') and @visible='true']")
    public MobileElement answeredCorrectly;



    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='RESULTS']")
    public MobileElement quizResultsTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='PLAY' and ./following-sibling::XCUIElementTypeButton[contains(@name, 'DIFFICULTY')]]")
    public MobileElement playQuizButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'DIFFICULTY') and ./preceding-sibling::XCUIElementTypeButton[@name='PLAY']]")
    public MobileElement difficulty;


    //Shivumuni's code
    // Clicking on RUNWAY GENIUS
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'The Vogue Runway Weekly Quiz')]")
    public MobileElement RunwayGeniusBtn;

    // RESULTS Screen
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='RESULTS']")
    public MobileElement ResultsBtn;

    //Scroll down to PLAY MORE RUNWAY GENIUS
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='PLAY MORE RUNWAY GENIUS']")
    public MobileElement PlayMoreRunwayGeniusBtn;

    //Scroll down to PLAY MORE RUNWAY GENIUS and VIEW ALL
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='VIEW ALL']")
    public MobileElement ViewAllBtn;

    // Checking PLAY QUIZ slides
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Runway Genius')]")
    public MobileElement PlayQuizBtn;
    // Verify Quiz name1
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Runway Genius:')]")
    public MobileElement QuizName1;
    // Verify Quiz name2
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Runway Genius:')]")
    public MobileElement QuizName2;
    // Verify Quiz name3
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Runway Genius:')]")
    public MobileElement QuizName3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Runway Genius')]")
    public MobileElement PlayQuizBtn1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Runway Genius')]")
    public MobileElement PlayQuizBtn2;

    // Verifying PLAY QUIZ is directing to PLAY QUIZ page
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Runway Genius')]")
    public MobileElement PlayQuizRunwayGenius;
    // Verify it is directed to Quiz Page
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DIFFICULTY: BEGINNER']")
    public MobileElement PlayQuizRunwayGeniusDiff;

    //Methods
    public void playQuizBtn() {
        scrollToElementAndClick(RunwayGeniusBtn, "RUNWAY GENIUS Section");
        waitForVisibility(ResultsBtn, 10);
        Assert.assertTrue(verifyElementPresent(ResultsBtn, "RESULTS button"), "RESULTS button should be displayed");
    }

    public void playMoreViewAllBtn() {
        scrollUntilElementVisible(PlayMoreRunwayGeniusBtn);
        scrollUntilElementVisible(ViewAllBtn);
        Assert.assertTrue(verifyElementPresent(PlayMoreRunwayGeniusBtn, "PLAY MORE RUNWAY GENIUS section"), "PLAY MORE RUNWAY GENIUS section should be displayed"); //TC_479
        Assert.assertTrue(verifyElementPresent(ViewAllBtn,"VIEW ALL section"), "VIEW ALL section should be displayed");
    }

    public void playQuizSlidesValidation() {
        Assert.assertTrue(verifyElementPresent(PlayQuizBtn,"PLAY QUIZ"), "PLAY QUIZ should be displayed");  //VD-TC-427, 428
        Assert.assertTrue(verifyElementPresent(QuizName1, "Quiz Name in first slide"), "Quiz Name in first slide should be displayed"); //VD-TC-428

        scrollVertical();
        horizontalSwipe();//VD-TC-427
        Assert.assertTrue(verifyElementPresent(PlayQuizBtn1,"PLAY QUIZ is available"), " should be displayed"); //VD-TC-428
        Assert.assertTrue(verifyElementPresent(QuizName2, "Quiz Name is present in second slide"), " should be displayed"); //VD-TC-428

        horizontalSwipe();//VD-TC-427
        Assert.assertTrue(verifyElementPresent(PlayQuizBtn2,"PLAY QUIZ is available"), " should be displayed"); //VD-TC-428
        Assert.assertTrue(verifyElementPresent(QuizName3, "Quiz Name is present in third slide"), " should be displayed"); //VD-TC-428

        // VD-TC_429
        Assert.assertTrue(verifyElementPresentAndClick(PlayQuizRunwayGenius, "Clicking on PLAY QUIZ under PLAY MORE RUNWAY GENIUS"), " should be displayed");
        //Assert.assertTrue(verifyElementPresent(PlayQuizRunwayGeniusDiff, "'DIFFICULTY:BEGINNER' is present"), " should be displayed");
    }
    //Shivumuni's code end

    public void selectingDifficulty(String difficultyOption){
        Assert.assertTrue(verifyElementPresentAndClick(difficulty, "Difficulty Dropdown"), "Difficulty Dropdown should be displayed");
    }
    public void playQuiz(){
        Assert.assertTrue(verifyElementPresentAndClick(playQuizButton, "Play Quiz Button"), "Play Quiz Button should be displayed");
    }



}

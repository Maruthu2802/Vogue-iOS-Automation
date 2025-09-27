package com.automate.pages;

import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.util.List;

public class ProfileScreen extends ScreenActions {

    RunwayScreen runwayScreen = new RunwayScreen();
    HomeScreen homeScreen = new HomeScreen();
    LandingAndSignInScreen landingScreen = new LandingAndSignInScreen();

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'ALL SAVED')]")
    public MobileElement allSavedImages;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'Photo')]")
    public MobileElement gridViewImage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CREATE BOARD']")
    public MobileElement createBoardButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@name, 'BOARD NAME')]")
    public MobileElement boardNameTextBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Scrim']")
    public MobileElement outsideAreaOfBoardCreation;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='ADD NOTE']")
    public MobileElement addNoteInImage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='Note']")
    public MobileElement noteInsideAddNote;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SAVE']")
    public MobileElement saveButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public MobileElement backButton;

    @iOSXCUITFindBy(className = "XCUIElementTypeStaticText")
    public MobileElement textAfterAddingNote;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='NO SAVED IMAGES']")
    public MobileElement noSavedImageText;

    @iOSXCUITFindBy(xpath = ".//XCUIElementTypeStaticText[contains(@name, 'Save images')]")
    public MobileElement noSavedImagesLongText;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther//XCUIElementTypeImage)[4]")
    public MobileElement firstShowInCollectionDetails;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='EDIT']")
    public MobileElement editButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SELECT IMAGES TO REMOVE']")
    public MobileElement removeButtonOnSelect;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther//XCUIElementTypeImage)[2]")
    public MobileElement selectImageToRemove;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='REMOVE']")
    public MobileElement removeButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='REMOVE']")
    public MobileElement removeButtonInside;

    //Vidya's code
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeImage[2]")
    public MobileElement Profile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public MobileElement BackCTA;

    //Action Methods
    public void ValidateBackCTAOnProfile() {
        click(Profile,"clicking profile");
        click(BackCTA,"clicking BackCTA Btn");
    }
    //Vidya's code end

    //Maruthu's code
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeOther//XCUIElementTypeImage)[1]")
    public MobileElement clickBoard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@name,'BOARD NAME')]")
    public MobileElement boardNameBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@name,'BOARD DESCRIPTION')]")
    public MobileElement boardDescription;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CREATE']")
    public MobileElement createButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Test created']")
    public MobileElement testBoardCreated;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[.//XCUIElementTypeStaticText[@name='TESTING']]//XCUIElementTypeImage")
    public List<MobileElement> testingBoardImages;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]")
    public MobileElement testingBoard;

    @iOSXCUITFindBy(xpath="(//XCUIElementTypeOther//XCUIElementTypeButton[1])[2]")
    public MobileElement boardFirstImage;

    @iOSXCUITFindBy(xpath="((//XCUIElementTypeButton[contains(@name,'Photo')])[6]")
    public MobileElement boardSixthImage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeImage")
    public List<MobileElement> boardImages;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Options']")
    public MobileElement clickOnThreeDots;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SELECT IMAGES TO REMOVE']")
    public MobileElement selectImagesToRemove;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther//XCUIElementTypeOther/following-sibling::XCUIElementTypeImage)[1]")
    public MobileElement validateMultiSelectButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@traits='Header' and @visible='true']")
    public MobileElement validateHeader;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='REORDER IMAGES']")
    public MobileElement reorderImages;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='CANCEL']")
    public MobileElement cancelButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Dismiss']")
    public MobileElement dismissCreateBoardButton;


    public void createBoard(){
        homeScreen.clickOnProfileIcon();
        waitingFor(20);
        click(createBoardButton,"Click On CreateBoard");
        Assert.assertTrue(boardNameBox.isDisplayed());
        Assert.assertTrue(boardDescription.isDisplayed());
        Assert.assertFalse(createButton.isEnabled());
        scrollDownHoldingElement(dismissCreateBoardButton);
        click(backButton, "Back Button");
    }

    public void createButtonEnabled(String commentText){
        homeScreen.clickOnProfileIcon();
        waitingFor(20);
        click(createBoardButton,"Click On CreateBoard");
        click(boardNameBox,"Click On BoardNameBox");
        type(boardNameBox, commentText, "Add a Comment Field");
        Assert.assertTrue(createButton.isEnabled());
        scrollDownHoldingElement(dismissCreateBoardButton);
        click(backButton, "Back Button");
    }

    public void boardCreated(String commentText){
        homeScreen.clickOnProfileIcon();
        waitingFor(5000);
        click(createBoardButton,"Click On CreateBoard");
        click(boardNameBox,"Click On BoardNameBox");
        String testBoardName = "Test";
        boardNameTextBox.sendKeys(testBoardName);
        click(createButton,"Click On CreateButton");
        Assert.assertTrue(verifyElementPresent(testBoardCreated, "Create Board"));
        click(backButton, "Back Button");
    }




    public void createBoardPage() {
        runwayScreen.navigateToFirstShow();// Navigate to first show in runway tab
        runwayScreen.saveImagesFromCollections();
        closeAndLaunchApp();
        landingScreen.skipIntroVideo();
        homeScreen.clickOnProfileIcon();
    }

    public void removeImage() {
        homeScreen.clickOnProfileIcon();
        click(allSavedImages, "Click on all saved images");
        waitingFor(3000);
        click(runwayScreen.optionsinFirstShowScreen , "Click on option");
        click(removeButtonOnSelect, "Click on remove photo");
        click(selectImageToRemove, "Click on image to remove");
        click(removeButton, "Click on remove button");
        click(removeButtonInside, "Click Remove Button in inside");
        closeAndLaunchApp();
    }

    public void validateGridViewIsDisplayed() {

        createBoardPage();
        click(allSavedImages, "Click on All Saved Images");
        verifyElementPresent(gridViewImage, "Grid view should be displayed with at least one image");

    }

    public void validateLongTitleCreation() {

        createBoardPage();
        click(createBoardButton, "Create Board Name");
        String testBoardName = "My Super Long Board 🚀✨🔥💯 - @#*&(){}[]";
        boardNameTextBox.clear();
        boardNameTextBox.sendKeys(testBoardName);
        String enteredText = boardNameTextBox.getText();
        Assert.assertEquals(enteredText, testBoardName,
                "Board name text box should contain the entered value");

    }

    public void validateDismissBoardCreationDrawer() {

        createBoardPage();
        click(createBoardButton, "Create Board Name");
        click(outsideAreaOfBoardCreation, "Tapped outside drawer");
        Assert.assertFalse(ScreenActions.isElementVisible(boardNameTextBox),
                "Board creation drawer should be dismissed after tapping outside");

    }

    public void validateDisplayingNotesIcon() {

        removeImage();
        createBoardPage();
        click(allSavedImages, "Click on All Saved Images");
        click(gridViewImage, "Click on grid view image in all saved");
        click(addNoteInImage, "Click on Add Notes in notes");
        String addnote = "This is for testing purpose";
        noteInsideAddNote.clear();
        noteInsideAddNote.sendKeys(addnote);
        click(saveButton, "Click to save text");
        waitForVisibility(textAfterAddingNote, 5);
        String actualText = textAfterAddingNote.getText();
        Assert.assertNotNull(actualText, "Note text should be present, but it was empty or null");

    }

    public void validateMyBoardsEmpty() {

        createBoardPage();
        waitForVisibility(createBoardButton, 30);
        Assert.assertTrue(
                ScreenActions.isElementVisible(createBoardButton),
                "Create Board CTA Button should be visible"
        );

    }

    public void validateAllSavedImagesEmpty() {
        homeScreen.clickOnProfileIcon();
        Assert.assertFalse(ScreenActions.isElementVisible(noSavedImageText),
                " No Saved Images Text should be visible");
        Assert.assertFalse(ScreenActions.isElementVisible(noSavedImagesLongText),
                " No Saved Images Long text should be visible");


    }

    public void validateLongtextInImage() {

        removeImage();
        createBoardPage();
        click(allSavedImages, "Click on all saved images");
        click(gridViewImage, "Click on grid view image in all saved");
        click(addNoteInImage, "Click on Add Notes in notes");
        String addnote = "Technology has transformed daily life, making tasks faster, " +
                "simpler, and more convenient. Smartphones, laptops, and the inter" +
                "net allow instant communication, access to knowledge, and online s" +
                "ervices that save time and effort. Education has expanded through " +
                "e-learning, and healthcare has improved with telemedicine. At the service";
        noteInsideAddNote.clear();
        noteInsideAddNote.sendKeys(addnote);
        click(saveButton, "Click to save text");
        waitForVisibility(textAfterAddingNote, 5);
        scrollUntilElementVisible(textAfterAddingNote);
        String actualText = textAfterAddingNote.getText();
        Assert.assertEquals(actualText.trim(), addnote.trim(),
                "Saved note text did not match the entered text!");

    }

    public void validateCreateBoardCta() {
        homeScreen.clickOnProfileIcon();
        waitingFor(10000);
        Assert.assertTrue(verifyElementPresent(createBoardButton, "Create Board"));
        click(backButton, "Back Button");
    }

    public void clickOnAllSavedImages() {
        homeScreen.clickOnProfileIcon();
        click(allSavedImages, "Click On AllSavedImages");
        click(clickOnThreeDots, "Click On ThreeDots");
        click(selectImagesToRemove, "Click On SelectImagesToRemove");
        Assert.assertTrue(validateMultiSelectButton.isDisplayed());
        click(cancelButton,"Cancel Button");
        click(backButton, "Back Button");
        click(backButton, "Back Button");
        click(backButton, "Back Button");
    }

    public void scrollUntilHeaderVisible() {
        homeScreen.clickOnProfileIcon();
        scrollUntilElementVisible(validateHeader);
        Assert.assertTrue(validateHeader.isDisplayed());
        click(backButton,"Back Button");
    }


}

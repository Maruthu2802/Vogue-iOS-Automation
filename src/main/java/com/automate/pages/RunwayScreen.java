package com.automate.pages;

import com.automate.driver.Manager.DriverManager;
import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class RunwayScreen extends ScreenActions {

    ProfileScreen profileScreen =new ProfileScreen();
    HomeScreen homeScreen = new HomeScreen();



    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'RUNWAY')]")
    public MobileElement runwayTab;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@name, 'Ready-to-Wear')])[1]")
    public MobileElement firestShowInCollection;

    @iOSXCUITFindBy(accessibility = "Options")
    public MobileElement optionsinFirstShowScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SELECT LOOKS TO SAVE']")
    public MobileElement selectLooksTosave;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[normalize-space(@name)='Image Select image'])[1]" )
    public MobileElement selectImage;

    @iOSXCUITFindBy(accessibility = "SAVE")
    public MobileElement saveButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name='Vogue']")
    public MobileElement appHeading;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='POST, Tab 3 of 5']")
    public MobileElement postIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'IMAGE ARCHIVE')]")
    public MobileElement ImageArchiveTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Create Board']")
    public MobileElement CreateBoardButtonInSaveToBoardScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='CREATE BOARD']")
    public MobileElement CreateBoardScreenTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CREATE']")
    public MobileElement CreateButtonInCreateBoardScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@name,'BOARD NAME')]")
    public MobileElement BoardNameTextField;


    //Abee's code
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Filters']")
    public MobileElement FilterOption;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@name, 'Ready-to-Wear')])[1]")
    public MobileElement firstShowInCollection;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='BRAND']")
    public MobileElement brandFilter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SEASON']")
    public MobileElement seasonFilter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='TYPE']")
    public MobileElement typeFilter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='LOCATION']")
    public MobileElement locationFilter;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView/following-sibling::XCUIElementTypeOther//XCUIElementTypeButton)[1]")
    public MobileElement filterBy;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='APPLY']")
    public MobileElement applyButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[2]")
    public MobileElement fillteredOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='RESET']")
    public MobileElement resetButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name, 'RESULTS')]")
    public MobileElement resultCount;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage")
    public MobileElement backButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView/following-sibling::XCUIElementTypeOther//XCUIElementTypeButton)[1]")
    public MobileElement firstOptionInfilter;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView/following-sibling::XCUIElementTypeOther//XCUIElementTypeButton)[1]")
    public MobileElement firstShowInCollectionafterfilter;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Scrim']")
    public MobileElement outsideOfFilter;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther//XCUIElementTypeImage)[4]")
    public MobileElement firstShowInCollectionDetails;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Show more')]")
    public MobileElement showMoreOptions;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='MORE']")
    public MobileElement moreButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='cellTitleLabel' and @label='Notes']")
    public MobileElement notesApp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Save']")
    public MobileElement saveButton1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='New Note'])[1]")
    public MobileElement newNoteInNotesApp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Save')]")
    public MobileElement bookMark;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'TESTING')]")
    public MobileElement testingBoard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='chevron.forward']")
    public  MobileElement chevronBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='UIActivityContentView']")
    public MobileElement sharingPopUp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
    public MobileElement cancelBtn;

    public void navigateToFirstShow() {

        navigateToRunwaytab();
        waitForVisibility(firstShowInCollection, 5);
        Assert.assertTrue(verifyElementPresent(firstShowInCollection , "First show thumbnail (Ready-to-Wear) in collection"), "First show thumbnail (Ready-to-Wear) should be visible in collection");

    }



    public void navigateToFilterInImageArchive(){

        click(runwayTab , "Click on Runway Tab");
        click(ImageArchiveTab, "Click on Image Archive");
        click(FilterOption, "Click on Filter Option");

    }

    public void validateAllActionBarInImageArchive() {
        navigateToFilterInImageArchive();
        click(locationFilter, "Click on Location Filter");
        click(filterBy, "Click an option in filter");
        waitForVisibility(applyButton, 30);
        Assert.assertTrue(verifyElementPresent(applyButton, "Filtered option"), "Filtered option is displayed");
        click(applyButton, "Click on apply button");
        waitForVisibility(fillteredOption, 30);
        waitForVisibility(resetButton, 30);
        Assert.assertTrue(resetButton.isDisplayed(), "Reset button is displayed");        waitForVisibility(resultCount, 30);
        Assert.assertTrue(verifyElementPresent(resultCount, "Result Count"),"Result Count is displayed");
        homeScreen.navigateToHomepage();
    }

    public void validateClearButtonInFilter() {

        navigateToFilterInImageArchive();
        click(brandFilter, "Click on Brand Filter");
        click(filterBy, "Click an option in filter");
        click(applyButton, "Click on apply button");
        waitForVisibility(fillteredOption, 20);
        Assert.assertTrue(resetButton.isDisplayed(), "Reset button is displayed");
        click(resetButton, "Click on reset button");
        Assert.assertFalse(isElementVisible(fillteredOption), "Filtered option is not displayed after reset");
        homeScreen.navigateToHomepage();

    }

    public void validateApplyButtonInFilter() {

        navigateToFilterInImageArchive();
        click(locationFilter, "Click on Location Filter");
        click(filterBy, "Click an option in filter");
        click(applyButton, "Click on apply button");
        Assert.assertTrue(fillteredOption.isDisplayed(), "Filtered option is displayed");
        waitingFor(3000);
        homeScreen.navigateToHomepage();

    }

    public void validateAllFilterSectionsAreVisibleInImageArchive() {

        navigateToFilterInImageArchive();
        List<MobileElement> filters = Arrays.asList(brandFilter, seasonFilter, typeFilter, locationFilter);
        List<String> filterNames = Arrays.asList("Brand", "Season", "Type", "Location");

        for (int i = 0; i < filters.size(); i++) {
            Assert.assertTrue(ScreenActions.isElementVisible(filters.get(i)),
                    filterNames.get(i) + " filter should be visible");
        }


    }

    public void validateAllFilterSectionsAreAccessibleInImageArchive() {

        validateAllFilterSectionsAreVisibleInImageArchive();
        List<MobileElement> filters = Arrays.asList(brandFilter, seasonFilter, typeFilter, locationFilter);
        List<String> filterNames = Arrays.asList("Brand", "Season", "Type", "Location");

        for (int i = 0; i < filters.size(); i++) {
            click(filters.get(i), "Click on " + filterNames.get(i) + " Filter");
            click(backButton, "Click on Back button");
        }
        Assert.assertFalse(filters.isEmpty(), "Filters are not visible.");
        click(outsideOfFilter , "Click outside of filter to go back");
        waitingFor(3000);
        homeScreen.navigateToHomepage();

    }

    public void validateMultipleFiltersInImageArchive() {

        navigateToFilterInImageArchive();
        MobileElement[] filters = {brandFilter, seasonFilter, typeFilter, locationFilter};
        String[] filterNames = {"brand", "season", "type", "location"};

        for (int i = 0; i < filters.length; i++) {
            click(filters[i], "Click on " + filterNames[i] + " option in filter");

            try {
                if (firstOptionInfilter.isDisplayed()) {
                    String selectedOption = firstOptionInfilter.getText();
                    click(firstOptionInfilter, "Click on first option in " + filterNames[i] + " filter");
                    click(applyButton, "Click on apply button");

                    String productText = firstShowInCollectionafterfilter.getText();
                    Assert.assertTrue(
                            productText.contains(selectedOption),
                            "Products should match " + filterNames[i] + " filter. Expected: "
                                    + selectedOption + " but got: " + productText
                    );
                } else {
                    click(outsideOfFilter, "Tap outside to dismiss empty filter drawer");
                }
            } catch (Exception e) {
                click(outsideOfFilter, "Tap outside to dismiss filter drawer after exception");
            }

            if (i < filters.length - 1) {
                click(FilterOption, "Click on filter option in image archive");
            }
        }
        homeScreen.navigateToHomepage();

    }

    public void validateSharingImageInCollection() {
        navigateToRunwaytab();
        click(firstShowInCollection, "Click on first show in collection");
        click(firstShowInCollectionDetails, "click on first show in collection details");
        click(showMoreOptions, "Click on show more options");
        click(moreButton, "Click on more options in share option");
        click(notesApp, "click on notes app");
        click(saveButton, "click on save button");

        DriverManager.getDriver().activateApp("com.apple.mobilenotes");
        String expectedNoteTitle = "My Shared Note"; // Replace with your note title
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
        boolean isShared = false;
        click(chevronBtn, "Click chevron forward button");
        try {
            isShared = new WebDriverWait(DriverManager.getDriver(), 10)
                    .until(ExpectedConditions.visibilityOf(newNoteInNotesApp))
                    .isDisplayed();
        } catch (Exception ignored) {

        }
        Assert.assertTrue(isShared, "Image was not shared to Notes!");
        DriverManager.getDriver().activateApp("com.condenast.voguerunway.rokmetro");
        waitForVisibility(cancelBtn, 20);
        click(cancelBtn, "Click on cancle button in sharing pop up");
        scrollDownHoldingElement(sharingPopUp);
        click(outsideOfFilter, "Click on outside the pop up");
        homeScreen.navigateToHomepage();

    }

    public void validateMultipleFiltersInCollections() {

        navigateToRunwaytab();
        MobileElement[] filters = {brandFilter, seasonFilter};
        String[] filterNames = {"brand", "season"};

        for (int i = 0; i < filters.length; i++) {
            click(filters[i], "Click on " + filterNames[i] + " option in filter");

            try {
                if (firstOptionInfilter.isDisplayed()) {
                    String selectedOption = firstOptionInfilter.getText();
                    click(firstOptionInfilter, "Click on first option in " + filterNames[i] + " filter");
                    click(applyButton, "Click on apply button");
                    String productText = firstShowInCollectionafterfilter.getText();
                    Assert.assertTrue(
                            productText.contains(selectedOption),
                            "Products should match " + filterNames[i] + " filter. Expected: "
                                    + selectedOption + " but got: " + productText
                    );
                } else {
                    click(outsideOfFilter, "Tap outside to dismiss empty filter drawer");
                }
            } catch (Exception e) {
                click(outsideOfFilter, "Tap outside to dismiss filter drawer after exception");
            }
        }


    }

    //Abee's code end

    //Vidya's Code

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Back']")
    public MobileElement BackCTAInShow;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[normalize-space(@name)='COLLECTIONS Tab 1 of 2']")
    public MobileElement Collections;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[contains(@name,'IMAGE ARCHIVE')]")
    public MobileElement ImageArchive;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name=', LOOK 1/30, gallery']")
    public MobileElement FirstElementInCollectionDetailsPage;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name=', LOOK 2/30, gallery']")
    public MobileElement SecondElementInCollectionDetailsPage;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name=', LOOK 3/30, gallery']")
    public MobileElement ThirdElementInCollectionDetailsPage;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'ALL SEASONS')]")
    public MobileElement AllSeasons;

    public void clickOnRunway() {
        waitForVisibility(runwayTab, 10);
        click(runwayTab, "Clicking on Runway");
    }

    public void BackCTAInRunway() {
        click(runwayTab, "Clicking on Runway");
        waitForVisibility(firestShowInCollection, 10);
        click(firestShowInCollection, "Clicking on First show in collection");
        waitForVisibility(BackCTAInShow, 10);
        click(BackCTAInShow, "Clicking on Back In Profile Page");
    }

    public void navigateToAllSeasonsTab() {
        clickOnRunway();
        click(firestShowInCollection, "Clicking on First show in collection");
        Assert.assertTrue(verifyElementPresent(FirstElementInCollectionDetailsPage, "First Element in Collection Details page."), "First Element in Collection Details page should be displayed");
        Assert.assertTrue(verifyElementPresent(SecondElementInCollectionDetailsPage, "Second Element Collection Details page."), "Second Element Collection Details page should be displayed");
        Assert.assertTrue(verifyElementPresent(ThirdElementInCollectionDetailsPage, "Third Element Collection Details page."), "Third Element Collection Details page should be displayed");
        Assert.assertTrue(verifyElementPresent(AllSeasons, "All Season Tab"), "All Season Tab should be displayed");
    }

    //Vidya's Code end

    //Maruthu's Code

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'TRENDING')]")
    public MobileElement trendingAndLatest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'IMAGE ARCHIVE')]")
    public MobileElement imageArchieve;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Filters']")
    public MobileElement filterOption;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='BRAND']")
    public MobileElement selectBrand;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='LOCATION']")
    public MobileElement locationTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='AMSTERDAM']")
    public MobileElement verifyText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='SEARCH']")
    public MobileElement searchTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage\n")
    public MobileElement filterBackButton;


    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Added to Test']")
    public MobileElement addedToBoardCta;

    public void clickOnImageArchieve() {
        clickOnRunway();
        verifyElementPresentAndClick(imageArchieve , "Click On Image Archieve");
        click(filterOption , "Click On FilterTab");
        waitingFor(3000);
        click(locationTab , "Click On FilterTab");
        waitForVisibility(verifyText,10);
        Assert.assertTrue(verifyText.isDisplayed());
        click(verifyText , "Click On FilterTab");
        waitingFor(3000);
        click(verifyText , "Click On FilterTab");
        click(filterBackButton,"click on the filter back btn");
        click(outsideOfFilter,"click out side of the filter");
    }

    public void navigateToLiveStreamtab() {
        navigateToFirstShow();
        homeScreen.navigateToHomepage();

    }

    public void  validateFilter() {
        clickOnRunway();
        Assert.assertTrue(brandFilter.isDisplayed());
        Assert.assertTrue(seasonFilter.isDisplayed());
        Assert.assertTrue(typeFilter.isDisplayed());
        Assert.assertTrue(locationFilter.isDisplayed());
    }

    public void validateSearchboxInOptions(){
        clickOnRunway();
        verifyElementPresentAndClick(imageArchieve,"click on image Archive");
        click(filterOption,"click on filter option");
        waitingFor(3000);
        click(selectBrand,"Click On SelectBrand");
        Assert.assertTrue(searchTab.isDisplayed());
        click(filterBackButton,"Click on FilterBackbutton");
        click(seasonFilter,"Click On SeasonFilter");
        Assert.assertTrue(searchTab.isDisplayed());
        click(filterBackButton,"Click on FilterBackbutton");
        click(locationFilter,"Click on LocationFilter");
        Assert.assertTrue(searchTab.isDisplayed());
        click(filterBackButton,"Click on FilterBackbutton");
        click(outsideOfFilter,"click on outside of filter");
    }

    public void validateOptionswithCheckBox(){
        clickOnRunway();
        click(imageArchieve,"Click On Image Archieve");
        click(filterOption,"Click On FilterTab");
        click(locationTab,"Click on LocationTab");
        Assert.assertTrue(verifyText.isDisplayed());
        click(filterBackButton,"click on the filter back btn");
        click(outsideOfFilter,"click out side of the filter");
    }





    public void clickOnPostIcon () {
        waitForVisibility(appHeading,5);
        waitForElementToBeClickable(postIcon,3);
        Assert.assertTrue(verifyElementPresentAndClick(postIcon, "PostIcon"), "PostIcon should be displayed");
    }

    public void navigateToRunwaytab(){
        waitForVisibility(appHeading, 30);
        Assert.assertTrue(verifyElementPresentAndClick(runwayTab, "Runway Tab"), "Runway Tab should be displayed");
    }

    public void navigateToImageArchive(){
        navigateToRunwaytab();
        Assert.assertTrue(verifyElementPresentAndClick(ImageArchiveTab, "Image Archive Tab"), "Image Archive Tab should be displayed");
        waitForVisibility(FilterOption, 10);
    }



    public void navigateToSaveToBoardsScreen() {
        Assert.assertTrue(verifyElementPresentAndClick(optionsinFirstShowScreen, "Options in First Show Screen"),"Options in First Show Screen should be displayed");
        Assert.assertTrue(verifyElementPresentAndClick(selectLooksTosave, "Select looks to save "),"Select looks to save should be displayed");
        Assert.assertTrue(verifyElementPresentAndClick(selectImage, "Select image"),"Select image should be displayed");
        Assert.assertTrue(verifyElementPresentAndClick(saveButton, "Save button on Image Selection Screen"),"Save button on Image Selection Screen should be displayed");
    }

    public void saveImagesFromCollections() {
        navigateToFirstShow(); // Navigate to first show in runwy tab
        navigateToSaveToBoardsScreen(); //Navigating to Save to boards screen
        Assert.assertTrue(verifyElementPresentAndClick(saveButton, "Save button in Save To Board screen"),"Save button in Save To Board screen should be displayed");
    }

    public void navigateToCreateBoardScreen(){
        navigateToFirstShow(); // Navigate to first show in runwy tab
        navigateToSaveToBoardsScreen(); //Navigating to Save to boards screen
        Assert.assertTrue(verifyElementPresentAndClick(CreateBoardButtonInSaveToBoardScreen, "Create Board Button In Save To Board Screen"),"Create Board Button In Save To Board Screen should be displayed");
        Assert.assertTrue(verifyElementPresent(CreateBoardScreenTitle, "Create Board Screen Title"),"Create Board Screen Title should be displayed");
    }


    public void validateIfCreateButtonInCreateBoardIsEnabledUponEnteringBoardname(){
        navigateToCreateBoardScreen();
        Assert.assertTrue(isElementDisabled(CreateButtonInCreateBoardScreen, "Create Button In Create Board Screen"),"Create Button In Create Board Screen should be Disabled");
        type(BoardNameTextField, "Boar", "Board Name textfield");
        Assert.assertTrue(isElementEnabled(CreateButtonInCreateBoardScreen, "Create Button In Create Board Screen"),"Create Button In Create Board Screen should be Enabled");
    }

    public void validateAddToBoardCta() {
        homeScreen.clickOnProfileIcon();
        click(profileScreen.createBoardButton, "Create Board Name");
        String testBoardName = "Testing";
        profileScreen.boardNameTextBox.clear();
        profileScreen.boardNameTextBox.sendKeys(testBoardName);
        click(profileScreen.createButton,"Click On CreateButton");
        clickOnRunway();
        click(firstShowInCollection, "Click On Firstshow");
        waitingFor(2000);
        verifyElementPresentAndClick(firstShowInCollectionDetails , "Click On A Show in Collections Details");
        click(bookMark, "Click on bookmark button");
        waitForVisibility(testingBoard,15);
        click(testingBoard,"Click On TestBoard");
        waitingFor(2000);
        Assert.assertTrue(addedToBoardCta.isDisplayed());
        click(BackCTAInShow,"click on back Btn");
        click(BackCTAInShow,"click on back Btn");
        click(BackCTAInShow,"click on back Btn");
    }

    public void validateTrendingAndLatest(){
        navigateToRunwaytab();
        click(imageArchieve , "Click On Image Archieve");
        waitingFor(3000);
        Assert.assertTrue(trendingAndLatest.isDisplayed());

    }



}

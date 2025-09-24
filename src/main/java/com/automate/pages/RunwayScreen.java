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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Vogue']")
    public MobileElement VoteNowSecondCard;

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

    public void navigateToFirstShow() {

        navigateToRunwaytab();
        waitForVisibility(firstShowInCollection, 5);
        Assert.assertTrue(verifyElementPresent(firstShowInCollection , "First show thumbnail (Ready-to-Wear) in collection"), "First show thumbnail (Ready-to-Wear) should be visible in collection");

    }

//    public void saveImagesFromCollections(){
//
//        waitingFor(8000);
//        click(optionsinFirstShowScreen , "Options in First Show Screen");
//        click(selectLooksTosave , "Select looks to save ");
//        click(selectImage, "Select image");
//        click(saveButton , "Save button in below pop up");
//        click(saveButton , "Save button in boards page");
//    }

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
        Assert.assertTrue(verifyElementPresent(applyButton, "Filtered option"), "Filtered option should be displayed");
        click(applyButton, "Click on apply button");
        waitForVisibility(fillteredOption, 30);
        waitForVisibility(resetButton, 30);
        Assert.assertTrue(verifyElementPresent(resetButton,"Reset button"),"Reset button should be displayed");
        waitForVisibility(resultCount, 30);
        Assert.assertTrue(verifyElementPresent(resultCount, "Result Count"),"Result Count should be displayed");
    }

    public void validateClearButtonInFilter() {

        navigateToFilterInImageArchive();
        click(brandFilter, "Click on Brand Filter");
        click(filterBy, "Click an option in filter");
        click(applyButton, "Click on apply button");
        waitForVisibility(fillteredOption, 20);
        click(resetButton, "Click on reset button");
        Assert.assertFalse(isElementVisible(fillteredOption), "Filtered option should not be displayed after reset");

    }

    public void validateApplyButtonInFilter() {

        navigateToFilterInImageArchive();
        click(locationFilter, "Click on Location Filter");
        click(filterBy, "Click an option in filter");
        click(applyButton, "Click on apply button");
        Assert.assertTrue(fillteredOption.isDisplayed(), "Filtered option should be displayed");

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

            // Go back to filter list before checking next filter (only if not last one)
            if (i < filters.length - 1) {
                click(FilterOption, "Click on filter option in image archive");
            }
        }

    }

    public void validateSharingImageinCollection() {
        navigateToRunwaytab();
        click(firstShowInCollection, "Click on first show in collection");
        click(firstShowInCollectionDetails, "click on first show in collection details");
        click(showMoreOptions, "Click on show more options");
        click(moreButton, "Click on more options in share option");
        click(notesApp, "click on notes app");
        click(saveButton, "click on save button");

        DriverManager.getDriver().activateApp("com.apple.mobilenotes");
        String expectedNoteTitle = "My Shared Note"; // Replace with your note title
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
        boolean isShared = false;
        try {
            isShared = new WebDriverWait(DriverManager.getDriver(), 10)
                    .until(ExpectedConditions.visibilityOf(newNoteInNotesApp))
                    .isDisplayed();
        } catch (Exception ignored) {

        }
        Assert.assertTrue(isShared, "Image was not shared to Notes!");

    }

    public void validateMultipleFiltersInCollections() {

        navigateToRunwaytab();
        MobileElement[] filters = {brandFilter, seasonFilter};
        String[] filterNames = {"brand", "season"};

        for (int i = 0; i < filters.length; i++) {
            // Click directly on the filter (already visible on the page)
            click(filters[i], "Click on " + filterNames[i] + " option in filter");

            try {
                if (firstOptionInfilter.isDisplayed()) {
                    String selectedOption = firstOptionInfilter.getText();
                    click(firstOptionInfilter, "Click on first option in " + filterNames[i] + " filter");
                    click(applyButton, "Click on apply button");

                    // Validate that product matches filter
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
    public MobileElement filterByLocation;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='SEARCH']")
    public MobileElement searchTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage\n")
    public MobileElement filterBackButton;

    public void clickOnImageArchieve() {
        ScreenActions.click(imageArchieve , "Click On Image Archieve");
        ScreenActions.click(filterOption , "Click On FilterTab");
        ScreenActions.click(locationTab , "Click On FilterTab");
        ScreenActions.click(filterByLocation , "Click On FilterTab");
        ScreenActions.click(filterByLocation , "Click On FilterTab");
    }

    public void  validateFilter() {
        Assert.assertTrue(brandFilter.isDisplayed());
        Assert.assertTrue(seasonFilter.isDisplayed());
        Assert.assertTrue(typeFilter.isDisplayed());
//        swipeLeft();
        Assert.assertTrue(locationFilter.isDisplayed());
    }

    public void validateSearchboxInOptions(){
        click(selectBrand,"Click On SelectBrand");
        Assert.assertTrue(searchTab.isDisplayed());
        click(filterBackButton,"Click on FilterBackbutton");
        click(seasonFilter,"Click On SeasonFilter");
        Assert.assertTrue(searchTab.isDisplayed());
        click(filterBackButton,"Click on FilterBackbutton");
        click(locationFilter,"Click on LocationFilter");
        Assert.assertTrue(searchTab.isDisplayed());

    }

    public void validateOptionswithCheckBox(){
        click(locationTab,"Click on LocationTab");
        Assert.assertTrue(filterByLocation.isDisplayed());
    }
    //Maruthu's code end





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

//    public void navigateToFirstShow(){
//        navigateToRunwaytab(); // Navigate to runway tab
//        Assert.assertTrue(verifyElementPresentAndClick(firestShowInCollection , "First show in Runway Tab"), "First show in Runway Tab");
//    }

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

    //VD-TC-212: Entering Board Name and validating if Create button is enabled
    public void validateIfCreateButtonInCreateBoardIsEnabledUponEnteringBoardname(){
        navigateToCreateBoardScreen();
        Assert.assertTrue(isElementDisabled(CreateButtonInCreateBoardScreen, "Create Button In Create Board Screen"),"Create Button In Create Board Screen should be Disabled");
        type(BoardNameTextField, "Boar", "Board Name textfield");
        Assert.assertTrue(isElementEnabled(CreateButtonInCreateBoardScreen, "Create Button In Create Board Screen"),"Create Button In Create Board Screen should be Enabled");
    }



}

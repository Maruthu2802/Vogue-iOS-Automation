package com.automate.pages;

import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.util.List;

public class PostScreen extends ScreenActions {

    @iOSXCUITFindBy(xpath = "//*[@name='Vogue']")
    public MobileElement vogueCTA;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'POST')]")
    public MobileElement PostBottomTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='NEW POST']")
    public MobileElement NewPostHeader;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='POST']/preceding-sibling::XCUIElementTypeButton")
    public MobileElement BackButtonInNewPostScreen;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField[@name='Type your post here...']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeImage)[1]")
    public MobileElement UserProfilePicInNewPostScreen;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField[@name='Type your post here...']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeImage)[2]")
    public MobileElement UsernameInNewPostScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='Type your post here...']")
    public MobileElement TypeYourPostHerePlaceholderText;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='gallery']")
    public MobileElement GalleryButtonInNewPost;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Photos']//XCUIElementTypeImage)[1]")
    public MobileElement FirstPicInGallery;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Photos']//XCUIElementTypeImage)[2]")
    public MobileElement SecondPicInGallery;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Photos']//XCUIElementTypeImage)[3]")
    public MobileElement ThirdPicInGallery;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Photos']//XCUIElementTypeImage)[4]")
    public MobileElement FourthPicInGallery;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add']")
    public MobileElement AddButtonInNewPost;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='camera']")
    public MobileElement CameraButtonInNewPost;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='TAKE A PHOTO']")
    public MobileElement TakeAPhotoOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='TAKE A VIDEO']")
    public MobileElement TakeAVideoOption;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='NEXT']")
    public MobileElement NextButtonInNewPost;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='POST TO']")
    public MobileElement PostToScreenTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public MobileElement backButtonInPostToScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SKIP']")
    public MobileElement SkipButtonInNewPost;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='POST']")
    public MobileElement PostButtonInNewPost;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'CONTINUE PUBLISHING')]")
    public MobileElement ContinuePublishingPopup;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='PUBLISH']")
    public MobileElement PublishButtonInContinuePublishingPopup;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
    public MobileElement CancelButtonInContinuePublishingPopup;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your post has been published.']")
    public MobileElement YourPostHasBeenPublishedToastMessage;



    //Maruthu's code

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='POST, Tab 3 of 5']")
    public MobileElement postIcon;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='POST']")
    public MobileElement headerPost;

    @iOSXCUITFindBy(accessibility = "Type your post here...")
    public MobileElement textBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@value, 'AAAA')]")
    public MobileElement afterTextEnteredInPost;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='NEXT']")
    public MobileElement nextTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='SKIP']")
    public MobileElement skipTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name='Vogue (POC)']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeImage[2]")
    public MobileElement brandSelection;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='gallery']")
    public MobileElement galleryIcon;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='camera']")
    public MobileElement cameraIcon;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='TAKE A PHOTO']")
    public MobileElement takePhoto;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='TAKE A VIDEO']")
    public MobileElement takeVideo;


    @iOSXCUITFindBy(xpath="(//XCUIElementTypeOther[@name='Photos']//XCUIElementTypeImage)[1]")
    public MobileElement galleryPhotos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Photos']//XCUIElementTypeImage")
    public List<MobileElement> galleryPhotosList;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Add']")
    public MobileElement galleryAddTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name='BEAUTY']")
    public MobileElement brandTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name='CELEBRITY STYLE']")
    public MobileElement celebrityTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name='COUTURE']")
    public MobileElement coutureTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name='DESIGNERS']")
    public MobileElement designersTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Cancel']")
    public MobileElement cancelTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name='NEW POST']")
    public MobileElement newPost;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Up to four images may be attached. Please try again']")
    public MobileElement popUp;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Scrim']")
    public MobileElement hidePopUp;
    
    public void clickOnPostIcon () {
        waitForElementToBeClickable(postIcon,10);
        click(postIcon, "Clicking on the PostIcon");
    }

    public void validateHeaderPost () {
        click(postIcon, "Clicking on the PostIcon");
        click(nextTab, "Clicking on the NextTab");
        click(skipTab, "Clicking on the SkipTab");
        click(headerPost, "Clicking on the HeaderPost");
        Assert.assertTrue(textBox.isDisplayed());
    }

    public void enterMoreThan500Text () {
        clickOnPostIcon();
        enterCharactersInTextBox(textBox, 500);
        click(nextTab, "Clicking on the NextTab");
        click(brandSelection, "Clicking on the BrandSelection");
        click(nextTab, "Clicking on the NextTab");
        Assert.assertTrue(headerPost.isEnabled());
        closeAndLaunchApp();
    }

    public void validateAfterclickingCamera ()  {
        clickOnPostIcon();
        click(cameraIcon, "Clicking on the CameraTab");
        Assert.assertTrue(isElementVisible(takePhoto));
        Assert.assertTrue(isElementVisible(takeVideo));
        click(hidePopUp,"Click On Screen");
        closeAndLaunchApp();
    }

    public void validateMaxCharactersAllowedInPost() {
        clickOnPostIcon();
        enterCharactersInTextBox(textBox, 502);
        String text = afterTextEnteredInPost.getText();
        Assert.assertNotNull(text, "❌ Validation Failed: Textbox value is null");
        Assert.assertEquals(text.length(), 500,
                "❌ Validation Failed: Textbox accepted " + (text == null ? "null" : text.length()) + " characters instead of 500");
        System.out.println("✅ Validation Passed: Textbox allows only 500 characters.");
        closeAndLaunchApp();
    }

    public void validatePostIconOnPosting() {
        clickOnPostIcon();
        click(galleryIcon,"Click On GalleryIcon");
        click(galleryPhotos,"Click on GalleryPhotos");
        click(galleryAddTab,"Click on AddTab");
        click(nextTab,"Click On NextTab");
        click(skipTab,"Click On SkipTab");
        click(headerPost,"Click On HeaderPost");
        closeAndLaunchApp();
    }

    public void discardThePost() {
        String text = "hi";
        textBox.sendKeys(text);

    }

    public void clickOnCategories() {
        clickOnPostIcon();
        click(nextTab,"Click on NextTab");
        click(brandTab,"Click on BrandTab");
        click(celebrityTab,"Click on CelebrityTab");
        click(coutureTab,"Click on CoutrTab");
        click(designersTab,"Click on DesignersTab");
        click(nextTab,"Click On NextTab");
        click(headerPost,"Click On HeaderPost");
        closeAndLaunchApp();
    }

    public void clickOnCameraCancel() {
        clickOnPostIcon();
        click(cameraIcon,"Click On CameraIcon");
        click(takePhoto,"Click On TakePhoto");
        click(cancelTab,"Click On CancelTab");
        Assert.assertTrue(newPost.isEnabled());
        closeAndLaunchApp();
    }

    public void selectFirstFourImages() {
        click(galleryIcon,"Click On GalleryIcon");
        int limit = Math.min(4, galleryPhotosList.size()); // in case less than 4
        for (int i = 0; i < limit; i++) {
            galleryPhotosList.get(i).click();
            System.out.println("✅ Selected image at index: " + i);
        }
    }

    public void clickOnPostTabToPost() {
        clickOnPostIcon();
        click(galleryIcon,"Click On GalleryIcon");
        click(galleryPhotos,"Click on GalleryPhotos");
        click(galleryAddTab,"Click on AddTab");
        click(nextTab,"Click On NextTab");
        click(skipTab,"Click On SkipTab");
        click(headerPost,"Click On HeaderPost");
        closeAndLaunchApp();
    }

    public void selectFirstFiveImages() {
        clickOnPostIcon();
        click(galleryIcon,"Click On GalleryIcon");
        int limit = Math.min(5, galleryPhotosList.size()); // in case less than 4
        for (int i = 0; i < limit; i++) {
            galleryPhotosList.get(i).click();
            System.out.println("✅ Selected image at index: " + i);
        }
        click(galleryAddTab,"Click on AddTab");
        waitForVisibility(popUp,5);
        Assert.assertTrue(popUp.isDisplayed());
        closeAndLaunchApp();
    }

    //Maruthu's code end

    //VD-TC-350-Verify user can have option for post tab below the screen
    public void validatePostBottomTab(){
        waitForVisibility(vogueCTA, 30);
        Assert.assertTrue(verifyElementPresent(PostBottomTab, "Post Bottom Tab"),"Post Bottom Tab is not displayed");
    }

    public void navigateToNewPostScreen(){
        waitForVisibility(vogueCTA, 30);
        click(PostBottomTab, "Post Bottom Tab");
    }

    //VD-TC-351	Verify when user click on post tab it should navigate to new page having title "New post" on the top.
    public void validateNavigationToNewPostScreen(){
        navigateToNewPostScreen();
        Assert.assertTrue(verifyElementPresent(NewPostHeader, "New Post Header"), "New Post Header is not displayed");
    }

    //VD-TC-352	Verify when user name & profile pic in new post page
    public void validateUserNameAndProfilePicInNewPostScreen(){
        navigateToNewPostScreen();
        Assert.assertTrue(verifyElementPresent(UserProfilePicInNewPostScreen, "User Profile Pic In New Post Screen"),"User Profile Pic In New Post Screen is not displayed");
        Assert.assertTrue(verifyElementPresent(UsernameInNewPostScreen, "Username In New Post Screen"),"Username In New Post Screen is not displayed");
    }

    //VD-TC-353	Verify placeholder text "Type your post here.."
    public void validatePlaceHolderTextInNewPostScreen(){
        navigateToNewPostScreen();
        Assert.assertTrue(verifyElementPresent(TypeYourPostHerePlaceholderText, "Type Your Post Here Placeholder Text"),"Type Your Post Here Placeholder Text is not displayed");
    }

    public void addPicsToNewPostFromGallery(){
        Assert.assertTrue(verifyElementPresentAndClick(GalleryButtonInNewPost, "Gallery Button In New Post"), "Gallery Button In New Post is not displayed");
        Assert.assertTrue(verifyElementPresentAndClick(FirstPicInGallery, "First Pic In Gallery"), "First Pic In Gallery is not displayed");
        Assert.assertTrue(verifyElementPresentAndClick(SecondPicInGallery, "Second Pic In Gallery"), "Second Pic In Gallery is not displayed");
        Assert.assertTrue(verifyElementPresentAndClick(ThirdPicInGallery, "Third Pic In Gallery"), "Third Pic In Gallery is not displayed");
        Assert.assertTrue(verifyElementPresentAndClick(FourthPicInGallery, "Fourth Pic In Gallery"), "Fourth Pic In Gallery is not displayed");
        Assert.assertTrue(verifyElementPresentAndClick(AddButtonInNewPost, "Add Button In New Post"), "Add Button In New Post is not displayed");
    }

    public void navigateToPostToScreen(){
        click(NextButtonInNewPost, "Next Button In New Post");
        Assert.assertTrue(verifyElementPresent(PostToScreenTitle, "Post To Screen Title"), "Post To Screen Title is not displayed");
    }

    //VD-TC-366-Verify when user click on 'cancel' on continue publishing pop up it's get cancel successfully
    public void validateNavigationBackToNewPostFromPostToScreen(){
        navigateToNewPostScreen();
        addPicsToNewPostFromGallery();
        navigateToPostToScreen();
        click(backButtonInPostToScreen, "Back Button In Post To Screen");
        Assert.assertTrue(verifyElementPresent(NewPostHeader, "New Post Header"), "New Post Header is not displayed");
    }

    public void validatePostButtonInNewPostScreen(){
        Assert.assertTrue(verifyElementPresentAndClick(SkipButtonInNewPost, "Skip Button In New Post"),"Skip Button In New Post is not displayed");
        Assert.assertTrue(verifyElementPresent(PostButtonInNewPost, "Post Button In New Post"),"Post Button In New Post is not displayed");
    }

    //VD-TC-364 Verify when image get post successfully it should show pop up "CONTINUE PUBLISHING?"
    public void validatePostButtonInPostScreen() {
        navigateToNewPostScreen();
        addPicsToNewPostFromGallery();
        navigateToPostToScreen();
        validatePostButtonInNewPostScreen();
        Assert.assertTrue(verifyElementPresentAndClick(PostButtonInNewPost, "Post Button in New Post Screen"), "Post button is not clicked");
        Assert.assertTrue(verifyElementPresent(ContinuePublishingPopup, "Continue Publishing Popup"),"Continue Publishing Popup is not displayed");

    }

    //VD-TC-365-Verify when user click on "publish " on continue publishing pop up it's get publish successfully.
    public void validateSuccessfulPublishOfPost(){
        navigateToNewPostScreen();
        addPicsToNewPostFromGallery();
        navigateToPostToScreen();
        click(backButtonInPostToScreen, "Back Button In Post To Screen");
        validatePostButtonInNewPostScreen();
        Assert.assertTrue(verifyElementPresentAndClick(PublishButtonInContinuePublishingPopup, "Publish Button in Continue Publishing Popup"),"Publish Button in Continue Publishing Popup is not clicked");
        Assert.assertTrue(verifyElementPresent(YourPostHasBeenPublishedToastMessage, "Your Post Has Been Published Toast Message"), "Your Post Has Been Published Toast Message is not displayed");
    }

    //VD-TC-366-Verify when user click on "cancel" on continue publishing pop up it's get cancel successfully.
    public void validateCancelThePublishOfPost(){
        navigateToNewPostScreen();
        addPicsToNewPostFromGallery();
        navigateToPostToScreen();
        click(backButtonInPostToScreen, "Back Button In Post To Screen");
        validatePostButtonInNewPostScreen();
        verifyElementPresentAndClick(CancelButtonInContinuePublishingPopup, "Publish Button in Continue Publishing Popup");
        Assert.assertTrue(verifyElementPresent(YourPostHasBeenPublishedToastMessage, "Your Post Has Been Published Toast Message"), "Your Post Has Been Published Toast Message is not displayed");
    }






}

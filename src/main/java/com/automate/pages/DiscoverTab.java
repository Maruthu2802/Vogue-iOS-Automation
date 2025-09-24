package com.automate.pages;

import com.automate.pages.screenActions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

public class DiscoverTab extends ScreenActions {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'DISCOVER')]")
    public MobileElement DiscoverBottomTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public MobileElement SearchInDiscover;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public MobileElement BackCTAInDiscover;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='STREET STYLE']")
    public MobileElement StreetStyle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='STREET STYLE']")
    public MobileElement StreetStyleTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Inspiring street style images of celebrities, models, editors, and stylish people around the world. ']")
    public MobileElement Description;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'From the Train to the Front Row—Subway Hands Photographs the Best Hands at NYFW')]")
    public MobileElement LongText;

    public void navigateToStreetStyleShows() {
        click(DiscoverBottomTab, "Clicking on First show in collection");
        click(StreetStyle, "clicking on Street style");
        Assert.assertTrue(verifyElementPresent(StreetStyleTitle, "Street style title"), "Street style title should be displayed");
        Assert.assertTrue(verifyElementPresent(Description, "Description"), "Description should be dispalyed");
    }

    public void viewStreetStyleLongShowName() {
        click(DiscoverBottomTab, "Clicking on First show in collection");
        click(StreetStyle, "clicking on Street style");
        scrollUntilElementVisible(LongText);
        Assert.assertTrue(verifyElementPresent(LongText, "Long Text in multi line"), "Long Text in multi line should be displayed");
    }

}

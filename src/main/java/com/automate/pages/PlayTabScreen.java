package com.automate.pages;
//
//
//import com.automate.driver.Manager.DriverManager;
//import com.automate.pages.screenActions.ScreenActions;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
//import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
//
//import java.time.Duration;
//
//public class PlayTabScreen{
//
//    private AppiumDriver<MobileElement> driver;
//
//    // 🎯 Locators (update if needed)
//    @iOSXCUITFindBy(accessibility = "Play")
//    private MobileElement playTabButton;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Solve the puzzle\"]")
//    private MobileElement solvePuzzleButton;
//
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thursday, September 4\"]")
//    private MobileElement dateText;
//
//    // ✅ Constructor
//    public PlayTabScreen() {
//        this.driver = DriverManager.getDriver();
//        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
//;
//    }
//
//    // ✅ Page actions
//    public void openPlayTab() {
//        playTabButton.click();
//    }
//
//    public boolean validateSolvePuzzleButton() {
//    	return solvePuzzleButton.isDisplayed();
//    }
//
//    public boolean isTextDisplayed() {
//        return dateText.isDisplayed();
//    }
//}
//

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automate.driver.Manager.DriverManager;
import com.automate.pages.screenActions.ScreenActions;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.time.Duration;

public class PlayTabScreen  extends ScreenActions{

  

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Vogue']")
    private WebElement playTabButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Solve the puzzle']")
    private WebElement solvePuzzleButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thursday, September 4']")
    private WebElement dateText;

//    public PlayTabScreen() {
//       
//    	PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
//    }

    public void openPlayTab() { 
    	playTabButton.click(); 
    	}
    public boolean validateSolvePuzzleButton() { 
    	return solvePuzzleButton.isDisplayed(); 
    	}
    public boolean isTextDisplayed() {
    	return dateText.isDisplayed(); 
    	}
}


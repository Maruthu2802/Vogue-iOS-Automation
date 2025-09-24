package com.automate.pages.screenActions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import com.automate.driver.Manager.DriverManager;
import com.automate.reports.ExtentReportLogger;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ScreenActions {

    private static final boolean ENABLE_DEBUG_LOGS = true; // 🔁 Set to true for local debugging

    protected ScreenActions() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }

    protected void waitForPageLoad(int waitTime) {
        DriverManager.getDriver().manage().timeouts().pageLoadTimeout(waitTime, TimeUnit.SECONDS);
    }

    protected String getTextFromAttribute(MobileElement element) {
        return element.getAttribute("text");
    }

    protected String getText(MobileElement element) {
        return element.getText();
    }

    protected boolean isElementDisplayed(MobileElement element) {
        return element.isDisplayed();
    }

    protected void doClear(MobileElement element) {
        element.clear();
    }

    public static void handledismissAlert() {
        try {
            Alert alert = DriverManager.getDriver().switchTo().alert(); // Switch to alert
            if (alert != null) {
                System.out.println("Alert Found: " + alert.getText());
                alert.dismiss(); // dismiss the alert
            }
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present.");
        }
    }

    public static void handleacceptAlert() {
        try {
            Alert alert = DriverManager.getDriver().switchTo().alert(); // Switch to alert
            if (alert != null) {
                System.out.println("Alert Found: " + alert.getText());
                alert.accept(); // Accept the alert
            }
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present.");
        }
    }

    public static void scrollToWebElement(WebElement ele) {
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "down");
        params.put("element", ((RemoteWebElement) ele).getId());
        DriverManager.getDriver().executeScript("mobile:scroll", params);
    }

    public static void click(MobileElement element, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
            ExtentReportLogger.logInfo("Clicked on " + elementName);
        } catch (Exception e) {
            ExtentReportLogger.logFail("Exception occurred when clicking on - " + elementName, e);
        }
    }

    public static void justClick(MobileElement element, String elementName) {
        try {
            element.click();
            ExtentReportLogger.logInfo("Just Clicked on " + elementName);
        } catch (Exception e) {
            ExtentReportLogger.logFail("Exception occurred when just clicking on - " + elementName, e);
        }
    }

    public static void type(MobileElement textFieldElement, String input, String textFieldName) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
            wait.until(ExpectedConditions.visibilityOf(textFieldElement));
            textFieldElement.click();
            textFieldElement.sendKeys(input);
            hideKeyBoardiOS();
            input = input.split("\n")[0];
            ExtentReportLogger.logInfo("Typed the value " + input + " into " + textFieldName);
        } catch (Exception e) {
			ExtentReportLogger.logFail("Typed the value " + input + " into " + textFieldName, e);
        }
    }

    public static void hideKeyBoardiOS() {
        DriverManager.getDriver().hideKeyboard();
//        DriverManager.getDriver().hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Done");
    }

    public static void swipeRight() {
        DriverManager.getDriver().executeScript("mobile:swipe",
                ImmutableMap.of("direction", "right"));
        ExtentReportLogger.logInfo("Swipe Right");
    }

    public static void swipeleft() {
        DriverManager.getDriver().executeScript("mobile:scroll",
                ImmutableMap.of("direction", "left"));
        ExtentReportLogger.logInfo("Swipe Left");
    }

    public static void swipeleft(int times) {
        for(int i=1;i<times;i++){
            DriverManager.getDriver().executeScript("mobile:scroll",
                    ImmutableMap.of("direction", "left"));
            ExtentReportLogger.logInfo("Swipe Left");
        }
    }

    public static void horizontalSwipe() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int startX = (int) (size.getWidth() * 0.8);
        int startY = size.getHeight() / 2;
        int endX = (int) (size.getWidth() * 0.2);
        int endY = startY;
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        DriverManager.getDriver().perform(Collections.singletonList(sequence));
    }

    public static void scrollVertical() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = (int) (size.getHeight() * 0.8);
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.2);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        DriverManager.getDriver().perform(Collections.singletonList(sequence));
    }

    public static void scrollVerticalUp() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = (int) (size.getHeight() * 0.2);
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.8);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        DriverManager.getDriver().perform(Collections.singletonList(sequence));
    }

    // To close and Re-Launch the Application
    public static void closeAndLaunchApp() {
        // To close and relaunch the app
        DriverManager.getDriver().terminateApp("com.condenast.voguerunway.rokmetro");
        Map<String, Object> args = new HashMap<>();
        args.put("bundleId", "com.condenast.voguerunway.rokmetro");  // your app bundle id
        DriverManager.getDriver().executeScript("mobile: launchApp", args);
    }

    public static void relaunchApp(String bundleID){
        Map<String, Object> args = new HashMap<>();
        args.put("bundleId", bundleID);  // your app bundle id
        DriverManager.getDriver().executeScript("mobile: launchApp", args);
    }


    // Position Verification
    public static void validateElementCenteredHorizontally(MobileElement element, String elementName) {
        Rectangle elementRect = element.getRect();
        int elementCenterX = elementRect.getX() + (elementRect.getWidth() / 2);

        Dimension screenSize = DriverManager.getDriver().manage().window().getSize();
        int screenCenterX = screenSize.getWidth() / 2;

        int tolerance = 10; // pixels

        if (ENABLE_DEBUG_LOGS) {
            System.out.println("[" + elementName + "] Element center X: " + elementCenterX);
            System.out.println("[" + elementName + "] Screen center X: " + screenCenterX);
        }

        Assert.assertTrue(Math.abs(screenCenterX - elementCenterX) <= tolerance,
                elementName + " is not horizontally centered.");

        if (ENABLE_DEBUG_LOGS) {
            System.out.println("✅ " + elementName + " is horizontally centered.");
        }
    }

    // Optional: Log element position (only when debug flag is true)
    public static void logElementPositionInfo(MobileElement element, String elementName) {
        if (!ENABLE_DEBUG_LOGS) return;

        Dimension screenSize = DriverManager.getDriver().manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        Point elementLocation = element.getLocation();
        Dimension elementSize = element.getSize();

        double xRatio = (double) elementLocation.getX() / screenWidth;
        double yRatio = (double) elementLocation.getY() / screenHeight;
        double widthRatio = (double) elementSize.getWidth() / screenWidth;

        System.out.println("📱 Screen Size: " + screenWidth + " x " + screenHeight);
        System.out.println("🖼️ " + elementName + " Position:");
        System.out.println("   - X: " + elementLocation.getX() + " (" + String.format("%.2f", xRatio * 100) + "%)");
        System.out.println("   - Y: " + elementLocation.getY() + " (" + String.format("%.2f", yRatio * 100) + "%)");
        System.out.println("   - Width: " + elementSize.getWidth() + " (" + String.format("%.2f", widthRatio * 100) + "%)");
    }

    // To verify the icon didn't overlap
    public static void validateNoOverlap(MobileElement element1, MobileElement element2, String description) {
        Rectangle rect1 = element1.getRect();
        Rectangle rect2 = element2.getRect();

        boolean isOverlapping = rect1.x < rect2.x + rect2.width &&
                rect1.x + rect1.width > rect2.x &&
                rect1.y < rect2.y + rect2.height &&
                rect1.height + rect1.y > rect2.y;

        if (isOverlapping) {
            throw new AssertionError("❌ " + description + " — Elements are overlapping.");
        } else if (ENABLE_DEBUG_LOGS) {
            System.out.println("✅ " + description + " — No overlap detected.");
        }
    }

    // Validate Icon Load Time
    public static void validateIconLoadTime(AppiumDriver<?> driver, MobileElement element, long maxExpectedLoadTimeMs) {
        long startTime = System.currentTimeMillis();

        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(element));

        long endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;

        if (ENABLE_DEBUG_LOGS) {
            System.out.println("⏱ Centenary icon loaded in " + loadTime + " ms");
        }

        if (loadTime > maxExpectedLoadTimeMs) {
            throw new AssertionError("❌ Centenary icon took too long to load: " + loadTime + " ms");
        } else if (ENABLE_DEBUG_LOGS) {
            System.out.println("✅ Centenary icon loaded within acceptable time.");
        }
    }

    public static void rotateScreenLandscape() {
        DriverManager.getDriver().rotate(ScreenOrientation.LANDSCAPE);
    }

    public static void tapElement(MobileElement element, String description) {
        try {
            if (ENABLE_DEBUG_LOGS) {
                System.out.println("Tapping on " + description);
            }
            element.click();
            if (ENABLE_DEBUG_LOGS) {
                System.out.println("Tapped on " + description);
            }
            ExtentReportLogger.logInfo("Clicked on " + description);
        } catch (Exception e) {
            ExtentReportLogger.logFail("Exception occurred when tapping on - " + description, e);
        }

    }

    // Verifying the icon Position
    public static void iconAspectRatio(MobileElement element, String elementName, double expectedAspectRatio, double tolerance) {
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        if (height == 0) {
            throw new AssertionError("❌ Height of " + elementName + " is zero, cannot calculate aspect ratio.");
        }

        double actualAspectRatio = (double) width / height;

        if (ENABLE_DEBUG_LOGS) {
            System.out.println("🔍 " + elementName + " — Width: " + width + ", Height: " + height);
            System.out.println("📐 " + elementName + " — Actual Aspect Ratio: " + String.format("%.2f", actualAspectRatio));
        }

        if (Math.abs(actualAspectRatio - expectedAspectRatio) > tolerance) {
            throw new AssertionError("❌ " + elementName + " aspect ratio mismatch. Expected: " +
                    expectedAspectRatio + ", Actual: " + String.format("%.2f", actualAspectRatio));
        }
    }


    public static void smoothverticalScroll() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        int startX = size.width / 2;

        new TouchAction<>(DriverManager.getDriver())
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    //Verify the sections are in descending order
    public static boolean elementsOrderDescending(String xpath, String regexPattern) {
        Set<Integer> uniqueOrder = new LinkedHashSet<>(); // maintains insertion order
        Pattern pattern = Pattern.compile(regexPattern);
        int previousSize = 0;

        while (true) {
            List<MobileElement> items = DriverManager.getDriver().findElements(By.xpath(xpath));
            for (MobileElement item : items) {
                String label = item.getAttribute("label");
                System.out.println("Section Title: " + label);
                Matcher matcher = pattern.matcher(label);
                if (matcher.find()) {
                    uniqueOrder.add(Integer.parseInt(matcher.group(1)));
                }
            }

            // Scroll and check if new elements loaded
            smoothverticalScroll();
            if (uniqueOrder.size() == previousSize) {
                break; // no new items loaded, end scrolling
            }
            previousSize = uniqueOrder.size();
        }

        List<Integer> actualOrder = new ArrayList<>(uniqueOrder);
        List<Integer> expectedOrder = new ArrayList<>(actualOrder);
        expectedOrder.sort(Collections.reverseOrder());

        System.out.println("Actual Order: " + actualOrder);
        System.out.println("Expected Order: " + expectedOrder);
        if (actualOrder.equals(expectedOrder)) {
            System.out.println("The Game is in order");
        }
        return actualOrder.equals(expectedOrder);
    }


    // Screenshots
    public static void takeScreenshot(String filename) {
        File src = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("screenshots/" + filename + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // NOTE: This method currently works only for mobile gameplay.
    // This is because we are unable to select the required element on other platforms.

    public static void tapLeftOrRightOfCard(String cardXpath, boolean tapLeft) {
        try {
            MobileElement card = DriverManager.getDriver().findElement(By.xpath(cardXpath));
            Rectangle rect = card.getRect();

            int centerY = rect.getY() + (rect.getHeight() / 2);
            int tapX = tapLeft ? rect.getX() - 60 : rect.getX() + rect.getWidth() + 60;

            new TouchAction<>(DriverManager.getDriver())
                    .tap(PointOption.point(tapX, centerY))
                    .perform();

            if (ENABLE_DEBUG_LOGS) {
                System.out.println("Tapped " + (tapLeft ? "left" : "right") + " '+' icon at: (" + tapX + ", " + centerY + ")");
            }
        } catch (Exception e) {
            if (ENABLE_DEBUG_LOGS) {
                System.out.println("Failed to tap '+' icon: " + e.getMessage());
            }
        }
    }


    //Making the device - Offline
    public static void setDeviceOffline(String sessionId, String username, String accessKey) {
        try {
            String url = "https://mobile-api.lambdatest.com/mobile-automation/api/v1/sessions/"
                    + sessionId + "/update_network";

            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            post.setHeader("Content-Type", "application/json");
            String auth = username + ":" + accessKey;
            String encodedAuth = Base64.getEncoder()
                    .encodeToString(auth.getBytes(StandardCharsets.UTF_8));
            post.setHeader("Authorization", "Basic " + encodedAuth);

            String jsonBody = "{\"mode\": \"offline\"}";
            post.setEntity(new StringEntity(jsonBody));

            HttpResponse response = client.execute(post);
            if (ENABLE_DEBUG_LOGS) {
                System.out.println("Offline Mode Triggered. Status: "
                        + response.getStatusLine().getStatusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Make Device - Online
    public static void setDeviceOnline(String sessionId, String username, String accessKey) {
        try {
            String url = "https://mobile-api.lambdatest.com/mobile-automation/api/v1/sessions/"
                    + sessionId + "/update_network";

            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            post.setHeader("Content-Type", "application/json");

            String auth = username + ":" + accessKey;
            String encodedAuth = Base64.getEncoder()
                    .encodeToString(auth.getBytes(StandardCharsets.UTF_8));
            post.setHeader("Authorization", "Basic " + encodedAuth);

            String jsonBody = "{\"mode\": \"online\"}";
            post.setEntity(new StringEntity(jsonBody));

            HttpResponse response = client.execute(post);
            if (ENABLE_DEBUG_LOGS) {
                System.out.println("Online Mode Triggered. Status: "
                        + response.getStatusLine().getStatusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForVisibility(MobileElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickable(MobileElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void dismissAllAlerts(int maxAlerts, int waitPerAlertInSeconds) {
        int count = 0;
        while (count < maxAlerts) {
            try {
                WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), waitPerAlertInSeconds);
                wait.until(ExpectedConditions.alertIsPresent());
                Alert alert = DriverManager.getDriver().switchTo().alert();
                if (ENABLE_DEBUG_LOGS) {
                    System.out.println("Alert " + (count + 1) + " Found (Dismiss): " + alert.getText());
                }
                alert.dismiss();
                count++;
            } catch (TimeoutException e) {
                if (ENABLE_DEBUG_LOGS) {
                    System.out.println("No more alerts found within " + waitPerAlertInSeconds + " seconds.");
                }
                break;
            } catch (Exception e) {
                if (ENABLE_DEBUG_LOGS) {
                    System.out.println("Exception while dismissing alert: " + e.getMessage());
                }
                break;
            }
        }
    }

    public static void acceptAllAlerts(int maxAlerts, int waitPerAlertInSeconds) {
        int count = 0;
        while (count < maxAlerts) {
            try {
                WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), waitPerAlertInSeconds);
                wait.until(ExpectedConditions.alertIsPresent());
                Alert alert = DriverManager.getDriver().switchTo().alert();
                if (ENABLE_DEBUG_LOGS) {
                    System.out.println("Alert " + (count + 1) + " Found (Accept): " + alert.getText());
                }
                alert.accept();
                count++;
            } catch (TimeoutException e) {
                if (ENABLE_DEBUG_LOGS) {
                    System.out.println("No more alerts found within " + waitPerAlertInSeconds + " seconds.");
                }
                break;
            } catch (Exception e) {
                if (ENABLE_DEBUG_LOGS) {
                    System.out.println("Exception while accepting alert: " + e.getMessage());
                }
                break;
            }
        }
    }

    public static boolean isElementVisible(MobileElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean verifyElementPresent(MobileElement element, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.isDisplayed();
            ExtentReportLogger.logPass("The element " + elementName + " is present");
            return true;
        } catch (Exception e) {
            ExtentReportLogger.logFail("The element " + elementName + " is not present", e);
            return false;
        }
    }

    public static boolean verifyElementPresentAndClick(MobileElement element, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.isDisplayed();
            ExtentReportLogger.logPass("The element " + elementName + " is present");
            element.click();
            ExtentReportLogger.logPass("Clicked on the element " + elementName);
            return true;
        } catch (Exception e) {
            ExtentReportLogger.logFail("The element " + elementName + " is not present", e);
            return false;
        }
    }

    public static void killAndRelaunchApp(String bundleId) {
        DriverManager.getDriver().terminateApp(bundleId);
        waitingFor(2000); // allow app to close fully
        DriverManager.getDriver().activateApp(bundleId);
    }

    public static void tapLeftOfElement(MobileElement element, int offsetInPixels) {
        try {
            Rectangle rect = element.getRect();

            int tapX = rect.getX() - offsetInPixels;
            int tapY = rect.getY() + (rect.getHeight() / 2); // Middle of the element vertically

            TouchAction<?> action = new TouchAction<>(DriverManager.getDriver());
            action.tap(PointOption.point(tapX, tapY)).perform();

            System.out.println("✅ Tapped left of the element at: (" + tapX + ", " + tapY + ")");
        } catch (Exception e) {
            System.err.println("❌ Failed to tap near element: " + e.getMessage());
        }
    }

    public static void scrollUntilElementVisible(MobileElement element) {
        AppiumDriver<?> driver = (AppiumDriver<?>) DriverManager.getDriver();
        if (driver == null || element == null) {
            throw new IllegalArgumentException("Driver or element cannot be null.");
        }

        String previousPageSource = "";
        while (true) {
            try {
                if (element.isDisplayed()) {
                    System.out.println("✅ Element is now visible.");
                    return;
                }
            } catch (Exception e) {
                // Ignore if not visible yet
            }

            // Detect end of content (no change in pageSource)
            String currentPageSource = driver.getPageSource();
            if (currentPageSource.equals(previousPageSource)) {
                throw new NoSuchElementException("❌ Element not found after full scroll.");
            }
            previousPageSource = currentPageSource;

            // 🟡 Perform gentle scroll directly here
            Dimension size = driver.manage().window().getSize();
            int startX = size.getWidth() / 2;
            int startY = (int) (size.getHeight() * 0.6);
            int endY = (int) (size.getHeight() * 0.4);

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1)
                    .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                    .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                    .addAction(new Pause(finger, Duration.ofMillis(200)))
                    .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), startX, endY))
                    .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Collections.singletonList(swipe));

            try {
                Thread.sleep(3000); // Give UI time to update
            } catch (InterruptedException ignored) {
            }
        }
    }

    public static void swipeLeftToRight(MobileElement element) {

        int startX = element.getLocation().getX() + 10;
        int endX = startX + element.getSize().getWidth() - 20;
        int y = element.getLocation().getY() + (element.getSize().getHeight() / 2);
        new TouchAction<>(DriverManager.getDriver())
                .press(PointOption.point(startX, y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .moveTo(PointOption.point(endX, y))
                .release()
                .perform();
    }

    //Util Methods Added by Satish A
    public static void scrollToElementAndClick(MobileElement element, String elementName) {
        scrollUntilElementVisible(element);
        click(element, elementName);
    }

    public static boolean isElementEnabled(MobileElement element, String elementName) {
        try {
            Boolean isEnabled = false;
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
            wait.until(ExpectedConditions.visibilityOf(element));
            isEnabled = element.isEnabled();
            ExtentReportLogger.logPass("The element " + elementName + " is enabled");
            return isEnabled;
        } catch (Exception e) {
            ExtentReportLogger.logFail("The element " + elementName + " is not enabled", e);
            return false;
        }
    }

    public static boolean isElementDisabled(MobileElement element, String elementName) {
        try {
            Boolean isDisabled = false;
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
            wait.until(ExpectedConditions.visibilityOf(element));
            isDisabled = !element.isEnabled();
            ExtentReportLogger.logPass("The element " + elementName + " is disabled");
            return isDisabled;
        } catch (Exception e) {
            ExtentReportLogger.logFail("The element " + elementName + " is not disabled", e);
            return false;
        }
    }

    public static void waitingFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Sleep interrupted: " + e.getMessage());
        }
    }

    public static void scrollUp() {
        AppiumDriver<?> driver = (AppiumDriver<?>) DriverManager.getDriver();
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = (int) (size.getHeight() * 0.6);
        int endY = (int) (size.getHeight() * 0.4);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(200)))
                .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), startX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
        System.out.println("Scrolled up");
        try {
            Thread.sleep(3000); // Give UI time to update
        } catch (InterruptedException ignored) {
        }
    }

    public static void scrollDown() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.7); // Start higher
        int endY = (int) (size.height * 0.3);   // Scroll downward

        new TouchAction<>(DriverManager.getDriver())
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
        System.out.println("Scrolled down");
    }

    public void Swipe(String direction, int count) {
        AppiumDriver<?> driver = (AppiumDriver<?>) DriverManager.getDriver();
        TouchAction<?> touchAction = new TouchAction<>(driver);
        String dire = direction;
        try {
            if (dire.equalsIgnoreCase("LEFT")) {

                for (int i = 0; i < count; i++) {
                    Dimension size = driver.manage().window().getSize();
                    int startx = (int) (size.width * 0.5);
                    int endx = (int) (size.width * 0.1);
                    int starty = size.height / 2;
                    touchAction.press(PointOption.point(startx, starty))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                            .moveTo(PointOption.point(endx, starty)).release().perform();
                    ExtentReportLogger.logInfo("Swiping screen in " + " " + dire + " direction" + " " + (i + 1) + " times");
                    Thread.sleep(5000);
                }

            } else if (dire.equalsIgnoreCase("RIGHT")) {

                for (int j = 0; j < count; j++) {
                    Dimension size = driver.manage().window().getSize();
                    int endx = (int) (size.width * 0.8);
                    int startx = (int) (size.width * 0.20);
                    if (size.height > 2000) {
                        int starty = (int) (size.height / 2);
                        touchAction.press(PointOption.point(startx, starty))
                                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                                .moveTo(PointOption.point(endx, starty)).release().perform();
                    } else {
                        int starty = (int) (size.height / 1.5);
                        touchAction.press(PointOption.point(startx, starty))
                                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                                .moveTo(PointOption.point(endx, starty)).release().perform();
                    }
                    ExtentReportLogger.logInfo("Swiping screen in " + " " + dire + " direction" + " " + (j + 1) + " times");
                    Thread.sleep(5000);
                }

            } else if (dire.equalsIgnoreCase("UP")) {

                for (int j = 0; j < count; j++) {
                    Dimension size = driver.manage().window().getSize();
                    System.out.println("size : " + size);
                    int starty = (int) (size.height * 0.75);// 0.8
                    int endy = (int) (size.height * 0.09);// 0.2
                    int startx = size.width / 2;
                    touchAction.press(PointOption.point(startx, starty))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                            .moveTo(PointOption.point(startx, endy)).release().perform();
                    ExtentReportLogger.logInfo("Swiping screen in " + " " + dire + " direction" + " " + (j + 1) + " times");
                    Thread.sleep(1000);;
                }

            } else if (dire.equalsIgnoreCase("DOWN")) {

                for (int j = 0; j < count; j++) {

                    Dimension size = driver.manage().window().getSize();
                    int starty = (int) (size.height * 0.85);
                    int endy = (int) (size.height * 0.2);
                    int startx = size.width / 2;
                    touchAction.press(PointOption.point(startx, endy))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                            .moveTo(PointOption.point(startx, starty)).release().perform();
                    ExtentReportLogger.logInfo("Swiping screen in " + " " + dire + " direction" + " " + (j + 1) + " times");
                    Thread.sleep(3000);
                }

            }

        } catch (Exception e) {
            ExtentReportLogger.logFail("Swiping failed ",e);

        }

    }

    public boolean JSClick(MobileElement element, String text) {
        JavascriptExecutor js = null;
        try {
            js.executeScript("arguments[0].click();", element);
            ExtentReportLogger.logPass(text + " is clicked");
            return true;
        } catch (Exception e) {
            ExtentReportLogger.logFail(text + " is not clicked", e);
            return false;
        }
    }

    public void scrollDownHoldingElement(WebElement element) {
        AppiumDriver<?> driver = (AppiumDriver<?>) DriverManager.getDriver();
        // Create a finger input
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        // Get element location
        int centerX = element.getLocation().getX() + (element.getSize().getWidth() / 2);
        int centerY = element.getLocation().getY() + (element.getSize().getHeight() / 2);

        // Define the action sequence
        Sequence swipe = new Sequence(finger, 1);

        // Move finger to element
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY));

        // Press down (touch & hold)
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        // Move down (drag/scroll)
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), centerX, centerY + 500));

        // Release finger
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform action
        driver.perform(Arrays.asList(swipe));
    }

    public static void longPressElement(MobileElement element, int durationInSeconds, String elementName) {
        try {
            new TouchAction<>(DriverManager.getDriver())
                    .longPress(PointOption.point(element.getCenter()))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(durationInSeconds)))
                    .release()
                    .perform();

            ExtentReportLogger.logInfo("Long pressed on " + elementName + " for " + durationInSeconds + " seconds");
        } catch (Exception e) {
            ExtentReportLogger.logFail("Failed to long press on " + elementName, e);
        }
    }

    public void enterCharactersInTextBox(MobileElement textBox, int length) {
        // Generate string with required length
        String testData = new String(new char[length]).replace("\0", "A");

        // Clear and enter the generated text
        textBox.clear();
        textBox.sendKeys(testData);
    }

    public static void scrollALittle(String direction) {
        Dimension size = DriverManager.getDriver().manage().window().getSize();

        int startX, startY, endX, endY;

        switch (direction.toLowerCase()) {
            case "up":
                startX = size.getWidth() / 2;
                startY = (int) (size.getHeight() * 0.7);
                endX = startX;
                endY = (int) (size.getHeight() * 0.3);
                break;

            case "down":
                startX = size.getWidth() / 2;
                startY = (int) (size.getHeight() * 0.3);
                endX = startX;
                endY = (int) (size.getHeight() * 0.7);
                break;

            case "left":
                startY = size.getHeight() / 2;
                startX = (int) (size.getWidth() * 0.7);
                endY = startY;
                endX = (int) (size.getWidth() * 0.3);
                break;

            case "right":
                startY = size.getHeight() / 2;
                startX = (int) (size.getWidth() * 0.3);
                endY = startY;
                endX = (int) (size.getWidth() * 0.7);
                break;

            default:
                throw new IllegalArgumentException("Invalid direction: " + direction +
                        ". Use up, down, left, or right.");
        }

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        DriverManager.getDriver().perform(Collections.singletonList(sequence));
    }




}









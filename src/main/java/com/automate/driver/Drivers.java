package com.automate.driver;

import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public final class Drivers {

    private Drivers() {}

    // ================= Local iOS ==================
    public static AppiumDriver<MobileElement> createLocalIOSDriver(
            String deviceName, String platformVersion, String udid,
            String app, String bundleId, int port) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        caps.setCapability(MobileCapabilityType.UDID, udid);
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);

        // Decide dynamically
        if (app != null && !app.isEmpty()) {
            caps.setCapability(MobileCapabilityType.APP, app); // install ipa
            System.out.println("✅ Launching app from IPA: " + app);
        } else if (bundleId != null && !bundleId.isEmpty()) {
            caps.setCapability("bundleId", bundleId); // launch installed app
            System.out.println("✅ Launching installed app with bundleId: " + bundleId);
        } else {
            throw new RuntimeException("❌ No app (.ipa) or bundleId provided for iOS!");
        }

        IOSDriver<MobileElement> driver = new IOSDriver<>(new URL(buildAppiumUrl(port)), caps);
        System.out.println("✅ iOS Driver session created: " + driver.getSessionId());
        return driver;
    }

    // ================= Local Android ==================
    public static AppiumDriver<MobileElement> createLocalAndroidDriver(
            String deviceName, String platformVersion, String udid,
            String app, String appPackage, String appActivity, int port) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        caps.setCapability(MobileCapabilityType.UDID, udid);
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);
        caps.setCapability("adbExecTimeout", 60000);

        // Decide dynamically
        if (app != null && !app.isEmpty()) {
            caps.setCapability(MobileCapabilityType.APP, app); // install apk
            System.out.println("✅ Launching app from APK: " + app);
        } else if (appPackage != null && !appPackage.isEmpty() && appActivity != null && !appActivity.isEmpty()) {
            caps.setCapability("appPackage", appPackage);
            caps.setCapability("appActivity", appActivity);
            System.out.println("✅ Launching installed app with appPackage: " + appPackage + " and appActivity: " + appActivity);
        } else {
            throw new RuntimeException("❌ No app (.apk) or appPackage/appActivity provided for Android!");
        }

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL(buildAppiumUrl(port)), caps);
        System.out.println("✅ Android Driver session created: " + driver.getSessionId());
        return driver;
    }

    // ================= LambdaTest iOS ==================
    public static AppiumDriver<MobileElement> createLambdaTestIOSDriver(
            String deviceName, String platformVersion,
            String app, String appName, String ltUser, String ltKey) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        caps.setCapability("isRealMobile", true);
        caps.setCapability(MobileCapabilityType.APP, app);
        caps.setCapability("build", "TNY_Test_Final");
        caps.setCapability("name", appName);

        IOSDriver<MobileElement> driver = new IOSDriver<>(
                new URL("https://" + ltUser + ":" + ltKey + "@mobile-hub.lambdatest.com/wd/hub"), caps);

        System.out.println("✅ LambdaTest iOS session created: " + driver.getSessionId());
        return driver;
    }

    // ================= LambdaTest Android ==================
    public static AppiumDriver<MobileElement> createLambdaTestAndroidDriver(
            String deviceName, String platformVersion,
            String app, String appName, String ltUser, String ltKey) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability("isRealMobile", true);
        caps.setCapability(MobileCapabilityType.APP, app);
        caps.setCapability("build", "TNY_Test_Final");
        caps.setCapability("name", appName);

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(
                new URL("https://" + ltUser + ":" + ltKey + "@mobile-hub.lambdatest.com/wd/hub"), caps);

        System.out.println("✅ LambdaTest Android session created: " + driver.getSessionId());
        return driver;
    }

    private static String buildAppiumUrl(int port) {
        return "http://127.0.0.1:" + port + "/wd/hub";
    }
}

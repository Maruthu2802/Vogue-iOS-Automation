package com.automate.driver.Factory;

import com.automate.driver.Drivers;
import com.automate.driver.Manager.DriverManager;
import com.automate.enums.MobilePlatformName;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public final class Driverfactory {

    private Driverfactory() {}

    public static void initializeDriver(String executionType,
                                        MobilePlatformName platform,
                                        String deviceName,
                                        String platformVersion,
                                        String udid,
                                        String app,
                                        String appPackage,
                                        String appActivity,
                                        String bundleId,
                                        String appName,
                                        String ltUser,
                                        String ltKey,
                                        int port) throws Exception {

        AppiumDriver<MobileElement> driver;

        if ("local".equalsIgnoreCase(executionType)) {
            if (platform == MobilePlatformName.iOS) {
                // iOS → decide ipa vs bundleId
                driver = Drivers.createLocalIOSDriver(deviceName, platformVersion, udid, app, bundleId, port);
            } else {
                // Android → decide apk vs appPackage/appActivity
                driver = Drivers.createLocalAndroidDriver(deviceName, platformVersion, udid, app,
                        appPackage, appActivity, port);
            }
        } else { // LambdaTest
            if (platform == MobilePlatformName.iOS) {
                driver = Drivers.createLambdaTestIOSDriver(deviceName, platformVersion,
                        app, appName, ltUser, ltKey);
            } else {
                driver = Drivers.createLambdaTestAndroidDriver(deviceName, platformVersion,
                        app, appName, ltUser, ltKey);
            }
        }

        DriverManager.setAppiumDriver(driver);
    }

    public static void quitDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}

package com.automate.reports;

import java.net.InetAddress;
import java.util.Objects;

import com.automate.appConstants.Frameworkcontants;
import com.automate.driver.Manager.DeviceManager;
import com.automate.driver.Manager.PlatformManager;
import com.automate.enums.CategoryType;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReportManager {

    private static final ExtentSparkReporter extentSparkReporter =
            new ExtentSparkReporter(Frameworkcontants.getExtentReportPath());
    private static final ThreadLocal<ExtentTest> threadLocalExtentTest = new ThreadLocal<>();
    private static ExtentReports extentReports;
    private static InetAddress ip;
    private static String hostname;

    private ExtentReportManager() {}

    /**
     * Initialize Extent Report
     */
    public static void initExtentReport() {
        try {
            if (Objects.isNull(extentReports)) {
                extentReports = new ExtentReports();
                extentReports.attachReporter(extentSparkReporter);
                ip = InetAddress.getLocalHost();
                hostname = ip.getHostName();

                extentReports.setSystemInfo("Host Name", hostname);
                extentReports.setSystemInfo("Environment", "TNY Mobile Automation - Appium");
                extentReports.setSystemInfo("User Name", System.getProperty("user.name"));

                extentSparkReporter.config().setDocumentTitle("Automation Test Report");
                extentSparkReporter.config().setReportName("Mobile Automation Results");
                extentSparkReporter.config().setTheme(Theme.DARK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createTest(String testCaseName) {
        ExtentTest test = extentReports.createTest(testCaseName);
        setExtentTest(test);

        // Automatically add device + platform if available
        String platform = PlatformManager.getPlatformName();
        String device = DeviceManager.getDeviceName();

        if (platform != null || device != null) {
            test.assignDevice(buildDeviceString(platform, device));
        }
    }

    public static void flushExtentReport() {
        if (Objects.nonNull(extentReports)) {
            extentReports.flush();
        }
    }

    public static ExtentTest getExtentTest() {
        return threadLocalExtentTest.get();
    }

    private static void setExtentTest(ExtentTest test) {
        threadLocalExtentTest.set(test);
    }

    static void unload() {
        threadLocalExtentTest.remove();
    }

    public static void addAuthors(String[] authors) {
        for (String author : authors) {
            getExtentTest().assignAuthor(author);
        }
    }

    public static void addCategories(CategoryType[] categories) {
        for (CategoryType category : categories) {
            getExtentTest().assignCategory(category.toString());
        }
    }

    public static void addDevice(String deviceName, String platformName) {
        getExtentTest().assignDevice(buildDeviceString(platformName, deviceName));
    }

    private static String buildDeviceString(String platform, String device) {
        StringBuilder sb = new StringBuilder();
        if (platform != null) sb.append(platform);
        if (platform != null && device != null) sb.append(" - ");
        if (device != null) sb.append(device);
        return sb.toString();
    }

    // Optional: Add screenshot
    public static void addScreenshot(String base64Screenshot) {
        try {
            getExtentTest().addScreenCaptureFromBase64String(base64Screenshot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void addDevices() {
        String platform = PlatformManager.getPlatformName();
        String device = DeviceManager.getDeviceName();

        if (platform != null && device != null) {
            getExtentTest().assignDevice(platform + " - " + device);
        } else if (platform != null) {
            getExtentTest().assignDevice(platform);
        } else if (device != null) {
            getExtentTest().assignDevice(device);
        } else {
            getExtentTest().assignDevice("Unknown Device");
        }
    }

    
}

package Base;

import org.testng.annotations.*;
import com.automate.driver.Drivers;
import com.automate.driver.Manager.*;
import com.automate.enums.MobilePlatformName;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Baseclass {

    private int port;

    @Parameters({
            "executionType", "platform", "deviceName", "platformVersion",
            "udid", "app", "appPackage", "appActivity", "bundleId",
            "ltUser", "ltKey", "appName", "port"
    })
    @BeforeMethod(alwaysRun = true)
    public void setUp(String executionType, String platform, String deviceName, String platformVersion,
                      @Optional("") String udid, @Optional("") String app,
                      @Optional("") String appPackage, @Optional("") String appActivity,
                      @Optional("") String bundleId, @Optional("") String ltUser,
                      @Optional("") String ltKey, @Optional("") String appName,
                      @Optional("4725") String portParam) throws Exception {

        this.port = Integer.parseInt(portParam);
        MobilePlatformName mp = MobilePlatformName.valueOf(platform);

        AppiumDriver<MobileElement> driver;

        if ("local".equalsIgnoreCase(executionType)) {
            AppiumServerManager.startServer(port);

            if (mp == MobilePlatformName.iOS) {
                driver = Drivers.createLocalIOSDriver(deviceName, platformVersion, udid, app, bundleId, port);
            } else {
                driver = Drivers.createLocalAndroidDriver(deviceName, platformVersion, udid, app, appPackage, appActivity, port);
            }
        } else { // LambdaTest
            if (mp == MobilePlatformName.iOS) {
                driver = Drivers.createLambdaTestIOSDriver(deviceName, platformVersion, app, appName, ltUser, ltKey);
            } else {
                driver = Drivers.createLambdaTestAndroidDriver(deviceName, platformVersion, app, appName, ltUser, ltKey);
            }
        }

        DriverManager.setAppiumDriver(driver);
        DeviceManager.setDeviceName(String.valueOf(driver.getCapabilities().getCapability("deviceName")));
        PlatformManager.setPlatformName(String.valueOf(driver.getCapabilities().getCapability("platformName")));
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        if (DriverManager.getDriver() != null) {
//            DriverManager.getDriver().quit();
//        }
//        DriverManager.unload();
//        DeviceManager.unload();
//        PlatformManager.unload();
//        ExecutionManager.unload();
//        AppiumServerManager.stopServer();
//        System.out.println("✅ Test finished, driver & server cleaned up");
//    }
    
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (DriverManager.getDriver() != null) {
            try {
                // Close app explicitly (works for iOS + Android)
                Object bundleId = DriverManager.getDriver().getCapabilities().getCapability("bundleId");
                Object appPackage = DriverManager.getDriver().getCapabilities().getCapability("appPackage");

                if (bundleId != null) {
                    DriverManager.getDriver().terminateApp(bundleId.toString());
                } else if (appPackage != null) {
                    DriverManager.getDriver().terminateApp(appPackage.toString());
                }
            } catch (Exception e) {
                System.out.println("⚠️ Failed to terminate app: " + e.getMessage());
            } finally {
                // Quit the session
                DriverManager.getDriver().quit();
            }
        }

        // Cleanup managers
        DriverManager.unload();
        DeviceManager.unload();
        PlatformManager.unload();
        ExecutionManager.unload();
        AppiumServerManager.stopServer();

        System.out.println("✅ Test finished, app closed, driver & server cleaned up");
    }

    
    
}

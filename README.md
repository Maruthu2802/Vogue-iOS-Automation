<<<<<<< HEAD
# Vogue-iOS-Automation
Automation of Vogue App
=======
# TNY iOS Automation

A comprehensive iOS mobile automation testing framework for The New Yorker app using Appium, TestNG, and Java.

## 📱 Overview

This project provides automated testing capabilities for The New Yorker iOS application, focusing on critical user flows including:
- First Time User Experience (FTUE) validation
- Sign-in and authentication flows
- My Library screen functionality
- Play Tab screen validation
- Subscription and paywall interactions

## 🛠️ Technology Stack

- **Java 11** - Programming language
- **Maven** - Build and dependency management
- **Appium 7.4.1** - Mobile automation framework
- **TestNG 7.6.0** - Testing framework
- **Selenium 3.141.59** - WebDriver support
- **ExtentReports 5.0.9** - Test reporting
- **LambdaTest** - Cloud testing platform

## 📁 Project Structure

```
TNY_iOS_Automation/
├── src/
│   ├── main/java/com/automate/
│   │   ├── appConstants/          # Application constants
│   │   ├── customannotations/     # Custom test annotations
│   │   ├── driver/                # Driver management
│   │   │   ├── Factory/           # Driver factory pattern
│   │   │   └── Manager/           # Driver managers
│   │   ├── enums/                 # Enumerations
│   │   ├── listeners/             # TestNG listeners
│   │   ├── pages/                 # Page Object Model classes
│   │   │   └── screenActions/     # Common screen actions
│   │   └── reports/               # Extent reporting
│   └── test/java/
│       ├── Base/                  # Base test class
│       └── com/Tests/             # Test classes
├── test-output/                   # TestNG reports
├── testng.xml                     # TestNG configuration
└── pom.xml                        # Maven configuration
```

## 🚀 Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6+
- Xcode (for iOS Simulator)
- Appium Server
- LambdaTest account (for cloud execution)

### Installation

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd TNY_iOS_Automation
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

3. **Set up environment variables:**
   ```bash
   export LT_USERNAME="your_lambdatest_username"
   export LT_ACCESS_KEY="your_lambdatest_access_key"
   ```

## ⚙️ Configuration

### TestNG Configuration (testng.xml)

The project uses TestNG for test execution with the following key parameters:

- **platformName**: iOS
- **platformVersion**: 17 (configurable)
- **deviceName**: iPhone 15 Pro (configurable)
- **emulator**: yes/no
- **app**: LambdaTest app identifier
- **name**: Application name

### Device Configuration

Tests are configured to run on:
- **Default Device**: iPhone 15 Pro
- **iOS Version**: 17.x
- **Execution**: LambdaTest cloud platform

## 🧪 Test Scenarios

### FTUE Screen Validation Tests
- **ftuescreensigninflow**: Validates the complete sign-in flow from FTUE screen
- **ftuescreenfieldvalidation**: Validates all UI elements on FTUE screen

### My Library Screen Tests
- Library content validation
- User interaction testing

### Play Tab Screen Tests
- Media playback functionality
- UI component validation

## 🏃‍♂️ Running Tests

### Run All Tests
```bash
mvn test
```

### Run Specific Test Suite
```bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
```

### Run with Custom Parameters
```bash
mvn test -DplatformVersion=17.5 -DdeviceName="iPhone 15"
```

## 📊 Test Reporting

The framework generates comprehensive test reports using:

1. **TestNG Reports**: Located in `test-output/` directory
2. **ExtentReports**: Enhanced HTML reports with screenshots
3. **Console Logs**: Real-time test execution logs

### Viewing Reports
- Open `test-output/index.html` for TestNG reports
- ExtentReports available in the reports directory

## 🏗️ Framework Architecture

### Page Object Model (POM)
- **Page Classes**: Located in `src/main/java/com/automate/pages/`
- **Screen Actions**: Common actions in `screenActions/ScreenActions.java`
- **Element Locators**: Using `@iOSXCUITFindBy` annotations

### Driver Management
- **DriverManager**: Thread-safe driver management
- **DriverFactory**: Factory pattern for driver initialization
- **Platform Support**: iOS-focused with extensible architecture

### Test Base Class
- **Baseclass**: Handles setup and teardown
- **Parameter Injection**: TestNG parameter support
- **Driver Lifecycle**: Automatic driver management

## 🔧 Key Features

- **Cross-device Testing**: Support for multiple iOS devices and versions
- **Cloud Integration**: LambdaTest cloud execution
- **Parallel Execution**: TestNG parallel test support
- **Custom Annotations**: Framework-specific test categorization
- **Robust Reporting**: Multi-level reporting with screenshots
- **Element Synchronization**: Smart waits and element handling

## 📝 Test Data Management

Test credentials and data are managed through:
- Environment variables for sensitive data
- TestNG parameters for test configuration
- Constants classes for application-specific data

## 🐛 Troubleshooting

### Common Issues

1. **Driver Initialization Failures**
   - Verify LambdaTest credentials
   - Check app identifier validity
   - Ensure device availability

2. **Element Not Found**
   - Verify element locators
   - Check app version compatibility
   - Review timing/synchronization

3. **Test Execution Failures**
   - Check TestNG configuration
   - Verify Maven dependencies
   - Review test data validity

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Implement changes with tests
4. Submit a pull request

## 📄 License

This project is proprietary to Condé Nast and The New Yorker.

## 📞 Support

For technical support or questions:
- Create an issue in the repository
- Contact the automation team
- Review existing documentation

---

**Note**: This framework is specifically designed for The New Yorker iOS application testing and requires appropriate access credentials and permissions.
>>>>>>> f70d7d2 (Initial commit)

package com.automate.listeners;

import com.automate.customannotations.FrameworkAnnotation;
import com.automate.reports.ExtentReportLogger;
import com.automate.reports.ExtentReportManager;
import org.testng.*;
import org.testng.annotations.ITestAnnotation;
import utils.RetryAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Listeners implements ITestListener, ISuiteListener, IAnnotationTransformer {

  @Override
  public void onStart(ISuite suite) {
    ExtentReportManager.initExtentReport();
  }

  @Override
  public void onTestStart(ITestResult result) {
    ExtentReportManager.createTest(result.getMethod().getMethodName());

    FrameworkAnnotation annotation = result.getMethod()
            .getConstructorOrMethod()
            .getMethod()
            .getAnnotation(FrameworkAnnotation.class);

    if (annotation != null) {
      ExtentReportManager.addAuthors(annotation.author());
      ExtentReportManager.addCategories(annotation.category());
    }

    // ✅ Add platform + device automatically from managers
    ExtentReportManager.addDevices();

    ExtentReportLogger.logInfo("Test - <b>" + result.getMethod().getMethodName() + "</b> is started");
  }

  @Override
  public void transform(ITestAnnotation annotation, Class testClass,
                        Constructor testConstructor, Method testMethod) {
    // Attach RetryAnalyzer to all test methods
    annotation.setRetryAnalyzer(RetryAnalyzer.class);
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    ExtentReportLogger.logPass("Test - <b>" + result.getMethod().getMethodName() + "</b> is passed");
  }

  @Override
  public void onTestFailure(ITestResult result) {
    ExtentReportLogger.logFail("Test - <b>" + result.getMethod().getMethodName() + "</b> is failed", result.getThrowable());
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    ExtentReportLogger.logSkip("Test - <b>" + result.getMethod().getMethodName() + "</b> is skipped");
  }

  @Override
  public void onFinish(ISuite suite) {
    ExtentReportManager.flushExtentReport();
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // No implementation
  }

  @Override
  public void onStart(ITestContext iTestContext) {
    // No implementation
  }

  @Override
  public void onFinish(ITestContext iTestContext) {
    // No implementation
  }
}

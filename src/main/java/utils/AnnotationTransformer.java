package utils;

import org.testng.IAnnotationTransformer;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer, IHookable {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        // Force attach RetryAnalyzer for all test methods
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        // Run the test method
        callBack.runTestMethod(testResult);

        // Clear old failures if test finally passed after retry
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            testResult.setThrowable(null);
        }
    }
}

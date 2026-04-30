package utils;

import com.aventstack.extentreports.*;

import org.openqa.selenium.WebDriver;
import org.testng.*;

import base.BaseTest;

public class ExtentListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail("Test Failed: " + result.getThrowable());

        // Capture screenshot
        WebDriver driver = ((BaseTest) result.getInstance()).driver;

        String path = ScreenshotUtil.capture(driver, result.getMethod().getMethodName());

        test.addScreenCaptureFromPath(path);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
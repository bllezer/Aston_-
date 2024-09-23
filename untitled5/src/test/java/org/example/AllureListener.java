package org.example;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import io.qameta.allure.Allure;

public class AllureListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.addAttachment("Screenshot", "image/png", "png", (byte[]) driver.getScreenshotAs(OutputType.BYTES));
    }
}
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;

public class AllureListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.addAttachment("Screenshot", "image/png", "png", takeScreenshot());
        Allure.step("Test failed", Status.FAILED);
    }

    private byte[] takeScreenshot() {
        // Реализация метода для создания скриншота
    }
}
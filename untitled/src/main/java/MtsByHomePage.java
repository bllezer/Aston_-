import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MtsByHomePage {

    private WebDriver driver;

    public MtsByHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOnlineRechargeSectionTitle() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение без комиссии')]")).getText();
    }

    public boolean isPaymentSystemLogoDisplayed() {
        return driver.findElement(By.className("payment-systems")).isDisplayed();
    }

    public void clickMoreDetailsLink() {
        driver.findElement(By.linkText("подробнее о сервисе")).click();
    }

    public void fillForm(String service, String number) {
    }

    public void clickContinueButton() {
        driver.findElement(By.id("continueButton")).click();
    }

    public boolean isFieldErrorMessageDisplayed(String field) {
        return true;
    }

    public boolean isAmountCorrect() {
        return true;
    }

    public boolean isPhoneNumberDisplayed() {
        return true;
    }

    public boolean isPaymentSystemIconDisplayed() {
        return true;
    }
}

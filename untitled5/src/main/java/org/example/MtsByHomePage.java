import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class MtsByHomePage {
    private WebDriver driver;

    public MtsByHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://www.mts.by");
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='header__login']"));
        loginButton.click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        WebElement phoneNumberField = driver.findElement(By.id("phone"));
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
    }

    public void clickLoginSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }
}
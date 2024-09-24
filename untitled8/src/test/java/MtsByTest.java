import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MtsByTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testOnlineRechargeBlock() {
        // Проверить название блока
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение без комиссии')]"));
        Assert.assertEquals(blockTitle.getText(), "Онлайн пополнение без комиссии");

        // Проверить наличие логотипов платежных систем
        WebElement paymentSystems = driver.findElement(By.xpath("//div[@class='payment-systems']"));
        Assert.assertTrue(paymentSystems.isDisplayed());

        // Проверить работу ссылки "подробнее о сервисе"
        WebElement moreDetailsLink = driver.findElement(By.linkText("подробнее о сервисе"));
        moreDetailsLink.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/online-payment");

        // Заполнить поля и проверить работу кнопки "Продолжить"
        WebElement serviceInput = driver.findElement(By.id("service"));
        serviceInput.sendKeys("Услуги связи");

        WebElement numberInput = driver.findElement(By.id("number"));
        numberInput.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

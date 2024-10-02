import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MtsByTest {

    private WebDriver driver;
    private MtsByHomePage mtsByHomePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        mtsByHomePage = new MtsByHomePage(driver);
    }

    @Test
    public void testOnlineRechargeSection() {
        // проверить название блока
        Assert.assertEquals(mtsByHomePage.getOnlineRechargeSectionTitle(), "Онлайн пополнение без комиссии");

        // проверить наличие логотипов платежных систем
        Assert.assertTrue(mtsByHomePage.isPaymentSystemLogoDisplayed());

        // проверить работу ссылки "подробнее о сервисе"
        mtsByHomePage.clickMoreDetailsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/more-details");

        // заполнить поля и проверить работу кнопки "Продолжить"
        mtsByHomePage.fillForm("Услуги связи", "297777777");
        mtsByHomePage.clickContinueButton();
        Assert.assertTrue(mtsByHomePage.isFieldErrorMessageDisplayed("Услуги связи"));

        // проверить надписи в незаполненных полях каждого варианта услуг
        Assert.assertTrue(mtsByHomePage.isFieldErrorMessageDisplayed("Домашний интернет"));
        Assert.assertTrue(mtsByHomePage.isFieldErrorMessageDisplayed("рассрочка"));
        Assert.assertTrue(mtsByHomePage.isFieldErrorMessageDisplayed("задолженность"));

        // заполнить поля для Услуги связи и проверить корректность отображения суммы
        mtsByHomePage.fillForm("Услуги связи", "297777777");
        mtsByHomePage.clickContinueButton();
        Assert.assertTrue(mtsByHomePage.isAmountCorrect());
        Assert.assertTrue(mtsByHomePage.isPhoneNumberDisplayed());
        Assert.assertTrue(mtsByHomePage.isPaymentSystemIconDisplayed());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

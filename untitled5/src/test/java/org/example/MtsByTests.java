import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MtsByTests {

    private WebDriver driver;
    private MtsByHomePage mtsHomePage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        mtsHomePage = new MtsByHomePage(driver);
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testOnlineRechargeBlock() {
        @Listeners(AllureListener.class)
        public class YourTestClass {
            // проверить название блока
        assert mtsHomePage.getOnlineRechargeBlockTitle().

            equals("Онлайн пополнение без комиссии");

            // проверить наличие логотипов платежных систем
        assert mtsHomePage.getPaymentSystemLogos().

            size() >0;

            // проверить работу ссылки "подробнее о сервисе"
        assert mtsHomePage.clickMoreDetailsLink();

            // заполнить поля и проверить работу кнопки "Продолжить"
        mtsHomePage.fillPhoneNumber("297777777");
        mtsHomePage.choosePaymentService("Услуги связи");
        assert mtsHomePage.clickContinueButton();

            // проверить надписи в незаполненных полях каждого варианта оплаты услуг
        assert mtsHomePage.checkEmptyFieldsMessages();

            // заполнить поля для услуги связи
        mtsHomePage.fillServiceDetails();
        assert mtsHomePage.clickContinueButton();

            // проверить корректность отображения суммы, номера телефона и других элементов
        assert mtsHomePage.checkPaymentDetails();
        }
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
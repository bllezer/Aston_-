import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MtsByTests {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver_chrome", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testOnlineRechargeBlock() {
        WebElement onlineRechargeBlock = driver.findElement(By.xpath("//div[@class='online-recharge']"));
        Assert.assertTrue(onlineRechargeBlock.isDisplayed(), "Online Recharge block is not displayed");


        WebElement blockTitle = onlineRechargeBlock.findElement(By.xpath(".//h2"));
        Assert.assertEquals(blockTitle.getText(), "Онлайн пополнение без комиссии", "Block title is incorrect");


        WebElement paymentSystems = onlineRechargeBlock.findElement(By.xpath(".//div[@class='payment-systems']"));
        Assert.assertTrue(paymentSystems.isDisplayed(), "Payment systems logos are not displayed");


        WebElement learnMoreLink = onlineRechargeBlock.findElement(By.xpath(".//a[contains(text(),'подробнее о сервисе')]"));
        Assert.assertTrue(learnMoreLink.isDisplayed(), "Learn more link is not displayed");
        learnMoreLink.click();

        WebElement servicesInput = driver.findElement(By.xpath("//input[@name='service']"));
        servicesInput.sendKeys("Услуги связи");
        WebElement numberInput = driver.findElement(By.xpath("//input[@name='number']"));
        numberInput.sendKeys("297777777");
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
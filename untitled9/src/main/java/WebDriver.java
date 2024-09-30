import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "путь_к_драйверу_chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
    }
}
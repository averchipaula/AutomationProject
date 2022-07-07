package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    private WebDriver Driver;

    public void initiateDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        Driver = new ChromeDriver(chromeOptions);
        Driver.get("http://demo.automationtesting.in/Index.html");
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public WebDriver getDriver() {
        return Driver;
    }

}
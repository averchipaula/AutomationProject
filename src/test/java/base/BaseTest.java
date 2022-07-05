package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver Driver;

    public void initiateDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        Driver = new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/Index.html");
        Driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return Driver;
    }

}
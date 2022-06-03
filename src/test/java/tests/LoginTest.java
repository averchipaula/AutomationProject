package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {


    public WebDriver Driver;
    @Test
    public void MetodaLogin(){

        // Setam driverul de chrome
        System.setProperty("webdriver.chrome.driver" , "src/test/resources/driver/chromedriver");

        // Deschidem un browser the chrome
        Driver=new ChromeDriver();

        //Accesam un URL
        Driver.get("http://demo.automationtesting.in/Index.html");

        //Identificam butonul "Sign In" ID CLASS LINK VALUE XPATH CSS
        WebElement signInElement=Driver.findElement(By.id("btn1"));
        signInElement.click();
        // Identificam butonul de email
        WebElement EmailElement=Driver.findElement(By.xpath(
                "//input[@placeholder='Password']"));
        String EmailValue="abc@yahoo.com";
        EmailElement.sendKeys(EmailValue);

        WebElement PasswordElement=Driver.findElement
                (By.xpath("//input[@placeholder='Password']"));
        String PasswordValue="parola";
        PasswordElement.sendKeys(PasswordValue);

        WebElement EnterElement=Driver.findElement(By.id("enterbtn"));
        EnterElement.click();
    }
}

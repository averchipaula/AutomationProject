package tests;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
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

        // Deschidem un browser chrome
        Driver=new ChromeDriver();


        //Accesam un URL
        Driver.get("http://demo.automationtesting.in/Index.html");

        //Maximize page
        Driver.manage().window().maximize();

        //Identificam butonul "Sign In" ID CLASS LINK VALUE XPATH CSS
        WebElement signInElement=Driver.findElement(By.id("btn1"));
        signInElement.click();

        // Identificam butonul de email
        WebElement EmailElement=Driver.findElement(By.xpath(
                "//input[@placeholder='Password']"));
        String EmailValue="abc@yahoo.com";
        EmailElement.sendKeys(EmailValue);

        //Identificam butonul password

        WebElement PasswordElement=Driver.findElement
                (By.xpath("//input[@placeholder='Password']"));
        String PasswordValue="parola";
        PasswordElement.sendKeys(PasswordValue);

        //Click pe enter
        WebElement EnterElement=Driver.findElement(By.id("enterbtn"));
        EnterElement.click();

        //Validam pagina de login
        String expectedPage="SignIn";
        String actualPage=Driver.getTitle();
        Assert.assertEquals("The expected page was not displayed", expectedPage, actualPage); //polimorfism static

        //Validam mesaj de eroare
        WebElement messageElement = Driver.findElement(By.id("errormsg"));
        String expectedError= "Invalid User Name or PassWord";
        String actualError= messageElement.getText() ;//returneaza textu pe baza id
        Assert.assertEquals("Mesaj",expectedError, actualError);


        //Inchidem Pagina
        //Dif intre close si quit : close inchide cate un tab, iar quit toata pagina
        //Daca ai un sigur test nu este nici o diferenta
       // Driver.close();
        Driver.quit();


    }
}

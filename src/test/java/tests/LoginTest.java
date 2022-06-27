package tests;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import base.BaseTest;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.IndexPage;
import pages.LogInPage;

public class LoginTest extends BaseTest {



    @Test
    public void MetodaLogin(){

        ElementMethods elementMethods = new ElementMethods(Driver);
        PageMethods pageMethods = new PageMethods(Driver);

        IndexPage indexPage = new IndexPage(Driver);
        indexPage.clickSignIn();

        LogInPage loginPage = new LogInPage(Driver);
        loginPage.loginInvalidProcess("SignIn","email@proba.com","Proba123#","Invalid User Name or PassWord");

        // Setam driverul de chrome
        // Deschidem un browser chrome
        //Accesam un URL
        //Maximize page

        //Identificam butonul "Sign In" ID CLASS LINK VALUE XPATH CSS
       // WebElement signInElement=Driver.findElement(By.id("btn1"));
        //signInElement.click();
       // elementMethods.clickElement(signInElement);


        // Identificam butonul de email
        //WebElement EmailElement=Driver.findElement(By.xpath(
             //   "//input[@placeholder='Password']"));
        //String EmailValue="abc@yahoo.com";
        //EmailElement.sendKeys(EmailValue);

        //Identificam butonul password

       // WebElement PasswordElement=Driver.findElement(By.xpath("//input[@placeholder='Password']"));
       // String PasswordValue="parola";
       // PasswordElement.sendKeys(PasswordValue);

        //Click pe enter
       // WebElement EnterElement=Driver.findElement(By.id("enterbtn"));
        //EnterElement.click();
       // elementMethods.clickElement(EnterElement);

        //Validam pagina de login
       // String expectedPage="SignIn";
       // String actualPage=Driver.getTitle();
       // Assert.assertEquals("The expected page was not displayed", expectedPage, actualPage); //polimorfism static

        //Validam mesaj de eroare
       // WebElement messageElement = Driver.findElement(By.id("errormsg"));
       // String expectedError= "Invalid User Name or PassWord";
      //  String actualError= messageElement.getText() ;//returneaza textu pe baza id
       // Assert.assertEquals("Mesaj",expectedError, actualError);


        //Inchidem Pagina
        //Dif intre close si quit : close inchide cate un tab, iar quit toata pagina
        //Daca ai un sigur test nu este nici o diferenta
       // Driver.close();



    }
}

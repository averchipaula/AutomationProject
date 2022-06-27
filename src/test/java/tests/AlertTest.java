package tests;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AlertTest extends BaseTest {


    public AlertTest() {
    }

    @Test
    public void registerTest(){

        ElementMethods elementMethods = new ElementMethods(Driver);
        AlertMethods alertMethods= new AlertMethods(Driver);
        PageMethods pageMethods=new PageMethods(Driver);


        WebElement skipSignInElement=Driver.findElement(By.id("btn2"));
        //skipSignInElement.click();
        elementMethods.clickElement(skipSignInElement);

        String expectedPage= "Register";
        //String actualPage= Driver.getTitle();
       // assertTrue("The expected page was not diplayed", expectedPage.equals(actualPage));
        pageMethods.validateTitlePage(expectedPage);

        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        //Actions action = new Actions(Driver);
        //action.moveToElement(switchElement).build().perform();
         elementMethods.hoverElement(switchElement);

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts']"));
        //alertsElement.click();
        elementMethods.clickElement(alertsElement);

        //Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
        pageMethods.navigateToURL("http://demo.automationtesting.in/Alerts.html");


        List<WebElement> alertList = Driver.findElements(By.cssSelector(".analystic"));
        alertList.get(0).click();
        WebElement simpleAlertElement = Driver.findElement(By.xpath("//button[@class= 'btn btn-danger']"));
        simpleAlertElement.click();
        //Alert simpleAlert = Driver.switchTo().alert();
        //simpleAlert.accept();
        alertMethods.acceptAlert();

        alertList.get(1).click();
        WebElement alertButtonElement = Driver.findElement(By.xpath("//button[@class= 'btn btn-primary']"));
        alertButtonElement.click();
       // Alert dismissAlert = Driver.switchTo().alert();
       // dismissAlert.dismiss();
        alertMethods.cancelAlert();

        WebElement cancelMessageElement= Driver.findElement(By.id("demo"));
        String expectedMessage ="You Pressed Cancel";
        //String actualMessage= cancelMessageElement.getText();
        //Assert.assertEquals("The same message", expectedMessage, actualMessage);
        elementMethods.validateElementText(cancelMessageElement,expectedMessage);

        alertList.get(2).click();
        WebElement promptElement= Driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        promptElement.click();
        //Alert promptAlert = Driver.switchTo().alert();
        String alertValue="Paula";
       // promptAlert.sendKeys(alertValue);
       // promptAlert.accept();
        alertMethods.fillAcceptAlert(alertValue);


        WebElement textBoxElement= Driver.findElement(By.id("demo1"));
        String expectedtextBox ="Hello "+alertValue+" How are you today";
       // String actualtextBox= textBoxElement.getText();
       // Assert.assertEquals("The same message", expectedtextBox, actualtextBox);
        elementMethods.validateElementText(textBoxElement,expectedtextBox);








































        //Driver.switchTo().defaultContent();
        //Driver.switchTo().parentFrame();




        //Driver.getWindowHandles().forEach(tab->Driver.switchTo().window(tab));
        //WebElement windowsElement = Driver.findElement(By.xpath("//a[text()='Windows']"));
        //windowsElement.click();





        //WebElement framesElement = Driver.findElement(By.xpath("//a[text()='Frames']"));
        //framesElement.click();
        //. =clasa diez=id




    }
}









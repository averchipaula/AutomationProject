package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AlertTest extends BaseTest {


    @Test
    public void registerTest(){



        WebElement skipSignInElement=Driver.findElement(By.id("btn2"));
        skipSignInElement.click();
        String expectedPage= "Register";
        String actualPage= Driver.getTitle();
        assertTrue("The expected page was not diplayed", expectedPage.equals(actualPage));

        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();

        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertList = Driver.findElements(By.cssSelector(".analystic"));
        alertList.get(0).click();
        WebElement simpleAlertElement = Driver.findElement(By.xpath("//button[@class= 'btn btn-danger']"));
        simpleAlertElement.click();
        Alert simpleAlert = Driver.switchTo().alert();
        simpleAlert.accept();

        alertList.get(1).click();
        WebElement alertButtonElement = Driver.findElement(By.xpath("//button[@class= 'btn btn-primary']"));
        alertButtonElement.click();
        Alert dismissAlert = Driver.switchTo().alert();
        dismissAlert.dismiss();

        WebElement cancelMessageElement= Driver.findElement(By.id("demo"));
        String expectedMessage ="You Pressed Cancel";
        String actualMessage= cancelMessageElement.getText();
        Assert.assertEquals("The same message", expectedMessage, actualMessage);

        alertList.get(2).click();
        WebElement promptElement= Driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        promptElement.click();
        Alert promptAlert = Driver.switchTo().alert();
        String alertValue="Paula";
        promptAlert.sendKeys(alertValue);
        promptAlert.accept();

        WebElement textBoxElement= Driver.findElement(By.id("demo1"));
        String expectedtextBox ="Hello "+alertValue+" How are you today";
        String actualtextBox= textBoxElement.getText();
        Assert.assertEquals("The same message", expectedtextBox, actualtextBox);




        //WebElement simpleAlertElement = Driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
        //simpleAlertElement.click();

        //Driver.findElement(By.xpath("//button[@class= 'btn btn-danger']")).click();
        //Alert simpleAlert = Driver.switchTo().alert();
        //simpleAlert.accept();


        //WebElement alertButtonElement = Driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
        //alertButtonElement.click();
        //Driver.findElement(By.xpath("//button[@class= 'btn btn-primary']")).click();
        //Alert dismissAlert = Driver.switchTo().alert();
        //String alertText = dismissAlert.getText();
        //System.out.println("Alert text is " + alertText);
       // dismissAlert.dismiss();


       // WebElement promptAlertElement= Driver.findElement(By.xpath("//a[text()='Alert with Textbox '] "));
        //promptAlertElement.click();
       // Driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
       // Alert promptAlert = Driver.switchTo().alert();
       // String promptText = promptAlert.getText();
       // System.out.println("Prompt text is " +promptText);
       // promptAlert.sendKeys("Test");
       // promptAlert.accept();



































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









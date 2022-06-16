package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class WindowsTest extends BaseTest {

    @Test
    public void windowsTest() {
        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
        skipSignInElement.click();
        String expectedPage = "Register";
        String actualPage = Driver.getTitle();
        assertTrue("The expected page was not diplayed", expectedPage.equals(actualPage));

        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Windows']"));
        alertsElement.click();

        Driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsList = Driver.findElements(By.xpath("//a[@class='analystic']"));

        windowsList.get(0).click();
        WebElement newTabElement = Driver.findElement(By.cssSelector("#Tabbed>a>button"));
        newTabElement.click();

        List<String> TabList = new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(TabList.get(1)); // ma mut pe al 2-lea tab
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(TabList.get(0));
        System.out.println(Driver.getTitle());



        windowsList.get(1).click();
        WebElement newSeparateElement = Driver.findElement(By.cssSelector("#Separate>button"));
        newSeparateElement.click();

        List<String> WindowList =new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(WindowList.get(1)); //
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(WindowList.get(0));
        System.out.println(Driver.getTitle());


       windowsList.get(2).click();
       WebElement separateMultipleElement = Driver.findElement(By.cssSelector("#Multiple>button"));
       separateMultipleElement.click();

       List<String> MultList =new ArrayList<>(Driver.getWindowHandles());
       Driver.switchTo().window(MultList.get(2));
       System.out.println(Driver.getTitle());
       Driver.close();
       Driver.switchTo().window(MultList.get(1));
       System.out.println(Driver.getTitle());
       Driver.close();
       Driver.switchTo().window(MultList.get(0));
       System.out.println(Driver.getTitle());










      //  Driver.getWindowHandles();
       // Driver.switchTo().defaultContent();


    }
}




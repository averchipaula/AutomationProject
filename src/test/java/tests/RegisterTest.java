package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest {

     public WebDriver Driver;

     @Test

     public void registerTest() {
          System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
          Driver = new ChromeDriver();
          Driver.get("http://demo.automationtesting.in/Index.html");
          Driver.manage().window().maximize();

          WebElement signInElement = Driver.findElement(By.id("btn2"));
          signInElement.click();

          String expectedPage = "Register";
          String actualPage = Driver.getTitle();
          Assert.assertTrue("The expected page was not displayed", expectedPage.equals(actualPage));

          WebElement firstNameElement = Driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
          String nameValue = "Paula";
          firstNameElement.sendKeys(nameValue);

          WebElement lastNameElement = Driver.findElement(By.xpath("//input[@ng-model='LastName']"));
          String lastValue = "Averchi";
          lastNameElement.sendKeys(lastValue);

          WebElement adressElement = Driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
          String addressValue = "Cluj Napoca, Taietura Turcului";
          adressElement.sendKeys(addressValue);

          WebElement emailElement = Driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
          String emailValue = "paula@gmail.com";
          emailElement.sendKeys(emailValue);

          WebElement phoneElement = Driver.findElement(By.cssSelector("input[ng-model='Phone']"));
          String phoneValue = "0752 615 007";
          phoneElement.sendKeys(phoneValue);

          WebElement genderElement = Driver.findElement(By.cssSelector("input[value='FeMale']"));
          genderElement.click();

          WebElement hobbiefirstElement = Driver.findElement(By.id("checkbox1"));
          hobbiefirstElement.click();

          WebElement hobbiesecondElement = Driver.findElement(By.id("checkbox2"));
          hobbiesecondElement.click();

          WebElement hobbielastElement = Driver.findElement(By.id("checkbox3"));
          hobbielastElement.click();

          JavascriptExecutor js = (JavascriptExecutor) Driver;
          js.executeScript("window.scrollBy(0,250)", "");

          WebElement languageElement = Driver.findElement(By.id("msdd"));
          languageElement.click();
          List<WebElement> languageOptions = Driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
          Integer index = 0;
          while (index < languageOptions.size()) {
               if (languageOptions.get(index).getText().equals("English")) {
                    languageOptions.get(index).click();
                    break;
               }
               index++;
          }

          genderElement.click();

          WebElement countryElement=Driver.findElement(By.xpath("//span[@role='combobox']"));
          countryElement.click();

          WebElement clickCountryElement = Driver.findElement(By.id("select2-country-container"));

          WebElement selectCountryElement =Driver.findElement(By.xpath("//input[@role='textbox']"));
          selectCountryElement.sendKeys("Denmark");
          selectCountryElement.sendKeys(Keys.ENTER);


          WebElement skillsElement = Driver.findElement(By.id("Skills"));
          Select skillsDropdown = new Select(skillsElement);
          skillsDropdown.selectByVisibleText("APIs");


          WebElement yearElement = Driver.findElement(By.id("yearbox"));
          yearElement.click();
          Select yearDropdown= new Select(yearElement);
          yearDropdown.selectByValue("1991");

          WebElement monthElement = Driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
          monthElement.click();
          Select monthDropdown= new Select(monthElement);
          monthDropdown.selectByVisibleText("March");

          WebElement dayElement = Driver.findElement(By.id("daybox"));
          Select dayDropdown = new Select(dayElement);
          dayDropdown.selectByValue("31");

          WebElement passwordElement = Driver.findElement(By.id("firstpassword"));
          String PasswordValue="parola";
          passwordElement.sendKeys(PasswordValue);

          WebElement confPassElement= Driver.findElement(By.id("secondpassword"));
          String confPassValue="parola";
          confPassElement.sendKeys(confPassValue);


          WebElement imageElement = Driver.findElement(By.id("imagetrgt"));
          imageElement.click();

          WebElement chooseFileElement = Driver.findElement(By.xpath("//input['margin-top: " +
                  "10px!important;']"));
          chooseFileElement.sendKeys("IMG_1484 2.JPG");



          Driver.quit();


     }

}


























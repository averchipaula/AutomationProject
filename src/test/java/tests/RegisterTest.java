package tests;

import HelpMethods.ElementMethods;
import base.BaseTest;
import org.checkerframework.checker.units.qual.m;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest extends BaseTest {



     @Test

     public void registerTest() {

          ElementMethods elementMethods = new ElementMethods(Driver);


          WebElement signInElement = Driver.findElement(By.id("btn2"));
          elementMethods.clickElement(signInElement);

          String expectedPage = "Register";
          String actualPage = Driver.getTitle();
          Assert.assertTrue("The expected page was not displayed", expectedPage.equals(actualPage));

          WebElement firstNameElement = Driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
          String nameValue = "Paula";
          //firstNameElement.sendKeys(nameValue);
          elementMethods.fillElement(firstNameElement,nameValue);

          WebElement lastNameElement = Driver.findElement(By.xpath("//input[@ng-model='LastName']"));
          String lastValue = "Averchi";
          //lastNameElement.sendKeys(lastValue);
          elementMethods.fillElement(lastNameElement,lastValue);

          WebElement adressElement = Driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
          String addressValue = "Cluj Napoca, Taietura Turcului";
          //adressElement.sendKeys(addressValue);
          elementMethods.fillElement(adressElement,addressValue);

          WebElement emailElement = Driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
          String emailValue = "paula@gmail.com";
          //emailElement.sendKeys(emailValue);
          elementMethods.fillElement(emailElement,emailValue);

          WebElement phoneElement = Driver.findElement(By.cssSelector("input[ng-model='Phone']"));
          String phoneValue = "0752 615 007";
          //phoneElement.sendKeys(phoneValue);
          elementMethods.fillElement(phoneElement,phoneValue);

          WebElement genderElement = Driver.findElement(By.cssSelector("input[value='FeMale']"));
          //genderElement.click();
          elementMethods.clickElement(genderElement);

          WebElement hobbiefirstElement = Driver.findElement(By.id("checkbox1"));
          //hobbiefirstElement.click();
          elementMethods.clickElement(hobbiefirstElement);

          WebElement hobbiesecondElement = Driver.findElement(By.id("checkbox2"));
         // hobbiesecondElement.click();
          elementMethods.clickElement(hobbiesecondElement);

          WebElement hobbielastElement = Driver.findElement(By.id("checkbox3"));
          //hobbielastElement.click();
          elementMethods.clickElement(hobbielastElement);

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

          //genderElement.click();
          elementMethods.clickElement(genderElement);


          WebElement clickCountryElement = Driver.findElement(By.xpath("//span[@role='combobox']"));
         // clickCountryElement.click();
          elementMethods.clickElement(clickCountryElement);

         // WebElement countryDDElement = Driver.findElement(By.cssSelector("span[class='select2-selection select2-selection--single']"));
         // countryDDElement.click();
         // WebElement countryElement = Driver.findElement(By.cssSelector("input[class='select2-search__field']"));
         // String countryfieldInput = "Japan";
        //  countryElement.sendKeys(countryfieldInput);
        //  countryElement.sendKeys(Keys.ENTER);                    // In cazu asta se poate cu for sau while ca la Languages


          WebElement skillsElement = Driver.findElement(By.id("Skills"));
         // Select skillsDropdown = new Select(skillsElement);
          //skillsDropdown.selectByVisibleText("APIs");
          elementMethods.selectTextElement(skillsElement,"Java");


          WebElement yearElement = Driver.findElement(By.id("yearbox"));
          //yearElement.click();
          Select yearDropdown= new Select(yearElement);
          yearDropdown.selectByVisibleText("1991");
          elementMethods.selectValueElement(yearElement,"1952");

          WebElement monthElement = Driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
          //monthElement.click();
          Select monthDropdown= new Select(monthElement);
          monthDropdown.selectByVisibleText("March");
          elementMethods.selectValueElement(monthElement,"March");

          WebElement dayElement = Driver.findElement(By.id("daybox"));
          Select dayDropdown = new Select(dayElement);
          dayDropdown.selectByVisibleText("31");
          elementMethods.selectValueElement(dayElement,"31");

          WebElement passwordElement = Driver.findElement(By.id("firstpassword"));
          String PasswordValue="parola";
         // passwordElement.sendKeys(PasswordValue);
          elementMethods.fillElement(passwordElement,PasswordValue);

          WebElement confPassElement= Driver.findElement(By.id("secondpassword"));
          String confPassValue="parola";
          //confPassElement.sendKeys(confPassValue);
          elementMethods.fillElement(confPassElement,confPassValue);


          WebElement imageElement = Driver.findElement(By.id("imagetrgt"));
          //imageElement.click();
          elementMethods.clickElement(imageElement);

          WebElement chooseFileElement = Driver.findElement(By.xpath("//input['margin-top: " +
                  "10px!important;']"));
          chooseFileElement.sendKeys("IMG_1484 2.JPG");






     }

}


























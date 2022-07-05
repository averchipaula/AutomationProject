package tests;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import base.BaseTest;
import org.checkerframework.checker.units.qual.m;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.IndexPage;
import pages.RegisterPage;

import java.util.List;

public class RegisterTest extends BaseTest {

     @Test
     public void registerTest() {

          IndexPage indexPage = new IndexPage(getDriver());
          indexPage.clickSkipSignIn();

          RegisterPage registerPage = new RegisterPage(getDriver());
          registerPage.registerValid("FirstNameTest","LastNameTest","address 1",
                  "1234567890", "test@test.com", "English", "Australia",
                  "Java", "1995", "June", "20", "Proba123@",
                  "Proba123@",
                  "/Users/paula/IdeaProjects/AutomationFramework/src/test/resources/IMG_14842.JPG");

     }
}


























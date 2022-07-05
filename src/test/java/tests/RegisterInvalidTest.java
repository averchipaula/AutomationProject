package tests;

import base.BaseTest;
import org.junit.Test;
import pages.IndexPage;
import pages.RegisterPage;

public class RegisterInvalidTest extends BaseTest {

     @Test
     public void registerTest() {

          IndexPage indexPage = new IndexPage(getDriver());
          indexPage.clickSkipSignIn();

          RegisterPage registerPage = new RegisterPage(getDriver());
          registerPage.registerInvalidMandatoryFields("address 1",
                  "English", "Australia",
                  "Java", "1995", "June", "20", "Proba123@",
                  "Proba123@",
                  "/Users/paula/IdeaProjects/AutomationFramework/src/test/resources/IMG_14842.JPG");

     }
}


























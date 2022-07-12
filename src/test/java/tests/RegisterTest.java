package tests;

import base.Hooks;
import objects.RegisterObject;
import org.junit.Test;
import pages.IndexPage;
import pages.RegisterPage;

public class RegisterTest extends Hooks {

     @Test
     public void registerTest(){
          RegisterObject registerdata = new RegisterObject(testData);

          IndexPage indexPage = new IndexPage(getDriver());
          indexPage.clickSkipSignIn();

          RegisterPage registerPage = new RegisterPage(getDriver());
          registerPage.registerValid(registerdata);














         // registerPage.registerValid("FirstNameTest","LastNameTest","address 1",
               //   "1234567890", "test@test.com", "English", "Australia",
              //    "Java", "1995", "June", "20", "Proba123@",
               //   "Proba123@",
               //   "/Users/paula/IdeaProjects/AutomationFramework/src/test/resources/IMG_14842.JPG");


     }
}


























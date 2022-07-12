package tests;

import base.Hooks;
import objects.AlertObject;
import objects.FrameObject;
import org.junit.Test;
import pages.AlertPage;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;

public class FrameTest extends Hooks {

    @Test
    public void registerTest() {
        FrameObject framedata = new FrameObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFramePage();

        FramePage framePage = new FramePage(getDriver());
        framePage.singleFrameprocess(framedata);


    }

}

package pages;

import objects.FrameObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{


    public FramePage(WebDriver driver) {
        super(driver);
        pageMethods.waitForUrl("Frames");

    }

    @FindBy(css=".nav-tabs>li>a")
    private List<WebElement> FrameOptions;
    @FindBy(css="input[type='text']")
    private WebElement inputText;

    public void singleFrameprocess(FrameObject frameData){

        elementMethods.waitForElement(FrameOptions.get(0));
        elementMethods.clickElement(FrameOptions.get(0));
        frameMethods.switchFramebyValue("singleframe");
        elementMethods.fillElement(inputText, frameData.getSingleiFrame());
        frameMethods.switchtoDefaultFrame();

    }



}

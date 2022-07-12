package pages;

import HelpMethods.ElementMethods;
import objects.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver){
        super(driver);
        pageMethods.waitForSpecificPage("Alerts");
    }

    @FindBy(css = ".analystic")
    private List<WebElement> alertOptions;
    @FindBy(css = "button[onclick='alertbox()']")
    private WebElement alertaOkButton;
    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement alertOkCancelButton;
    @FindBy(id = "demo")
    private WebElement alertOkCancelMessage;
    @FindBy(css = "button[class='btn btn-info']")
    private WebElement alertaTextButton;
    @FindBy(id = "demo1")
    private WebElement alertaTextMessage;

    public void dealAlertOk(){
        elementMethods.clickElement(alertOptions.get(0));
        elementMethods.clickElement(alertaOkButton);
        alertMethods.acceptAlert();
    }

    public void dealAlertOkCancel(AlertObject AlertData){
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(alertOkCancelButton);
        alertMethods.cancelAlert();
        elementMethods.validateElementText(alertOkCancelMessage,AlertData.getAlertmessage());
    }

    public void dealAlertInput(AlertObject AlertData){
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(alertaTextButton);
        alertMethods.fillAcceptAlert(AlertData.getAlerttext());
        String expectValue="Hello "+AlertData.getAlerttext()+" How are you today";
        elementMethods.validateElementText(alertaTextMessage,expectValue);
    }


}
package pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class LogInPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public LogInPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='E mail']")
    private WebElement emailElement;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterElement;
    @FindBy(id = "errormsg")
    private WebElement errorMessageElement;

    public void loginInvalidProcess(LoginObject loginData){
        pageMethods.validateTitlePage(loginData.getLoginPage());
        elementMethods.fillElement(emailElement, loginData.getEmail());
        elementMethods.fillElement(passwordElement, loginData.getPassword());
        elementMethods.clickElement(enterElement);
        elementMethods.validateElementText(errorMessageElement, loginData.getErrorMessage());
    }
}
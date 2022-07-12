package pages;

import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertMethods alertMethods;
    public TabMethods tabMethods;
    public FrameMethods frameMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
        alertMethods = new AlertMethods(this.driver);
        tabMethods = new TabMethods(this.driver);
        frameMethods=new FrameMethods(this.driver);
        PageFactory.initElements(driver, this);


    }

}


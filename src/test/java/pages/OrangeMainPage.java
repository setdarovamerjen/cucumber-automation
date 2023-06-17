package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OrangeMainPage {
    public OrangeMainPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//ul[@class='oxd-main-menu']/li")
    public List<WebElement> menuButtons;

}

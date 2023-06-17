package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeLoginPage {

    public OrangeLoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "username")
    public WebElement usernameInput;

    @FindBy (name = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//div/button")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@name='username']/../../span")
    public WebElement requiredTextUsername;

    @FindBy (xpath = "//input[@name='password']/../../span")
    public WebElement reqiredTextPassword;
}

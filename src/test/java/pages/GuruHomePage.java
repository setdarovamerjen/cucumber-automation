
package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruHomePage {

    public GuruHomePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //li/a/b[1]
    @FindBy(xpath = "//li/a/b[1]")
    public WebElement seleniumDropdown;


    @FindBy(linkText = "Agile Project")
    public WebElement agileProjectLink;

    @FindBy(linkText = "Bank Project")
    public WebElement bankProjectLink;

    @FindBy(linkText = "Payment Gateway Project")
    public WebElement paymentGatewayProjectLink;

    @FindBy(linkText = "Telecom Project")
    public WebElement telecomProjectLink;

    @FindBy(linkText = "Insurance Project")
    public WebElement insuranceProjectLink;

    @FindBy(linkText = "New Tours")
    public WebElement newToursLink;

}

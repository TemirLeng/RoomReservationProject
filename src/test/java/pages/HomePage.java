package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "hunt")
    public WebElement huntLink;

    @FindBy(linkText = "map")
    public WebElement mapLink;

    @FindBy(linkText = "schedule")
    public WebElement scheduleLink;

    @FindBy(xpath = "//a[@class='navbar-link']")
    public WebElement my;

    @FindBy(linkText = "self")
    public WebElement self;

    @FindBy(linkText = "team")
    public WebElement team;

    @FindBy(linkText = "sign out")
    public WebElement signOut;

    @FindBy(xpath = "//div[@class='container']//h1")
    public WebElement location;
}

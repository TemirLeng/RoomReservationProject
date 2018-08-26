package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;

    @FindBy(xpath = "//a[@class='navbar-link']")
    public WebElement my;

    @FindBy(xpath = "//a[@routerlink='/me']")
    public WebElement self;

}

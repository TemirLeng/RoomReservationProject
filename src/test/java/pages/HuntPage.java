package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HuntPage {

    public HuntPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='date']")
    public WebElement date;

    @FindBy(xpath = "//select[@id='timelineStart']")
    public WebElement fromHour;

    @FindBy(xpath = "//select[@id='timelineFinish']")
    public WebElement toHour;

    @FindBy(xpath = "//fa[@name='search']")
    public WebElement search;

    @FindBy(xpath = "(//button[@type='submit'])[5]")
    public WebElement amazon;
    
    @FindBy(xpath = "(//div[@class='card-footer-item'])[3]")
    public WebElement microsoft;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement confirm;
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement confirm;

    @FindBy(xpath = "//div[@class='container']//h1")
    public WebElement freeSpotsMsg;

    @FindBy(xpath = "//button[@class='button is-transparent is-white']")
    public List<WebElement> bookBtns;
}

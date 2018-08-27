package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchedulePage {

    public SchedulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table[@class='card table is-fullwidth is-transparent borderless']//td[@class='conference ng-star-inserted']")
    public WebElement reservationPart;

    @FindBy(xpath = "//div[@class='media-content']//p[contains(text(),'reservator')]//preceding-sibling::p")
    public WebElement name;

    @FindBy(xpath = "//div[@class='media-content']//p[contains(text(),'date')]//preceding-sibling::p")
    public WebElement date;

    @FindBy(xpath = "//button[@class='button is-danger']")
    public WebElement cancelConferenceBtn;


    @FindBy(xpath = "//div[@class='container']//h1")
    public WebElement scheduleTxt;


}

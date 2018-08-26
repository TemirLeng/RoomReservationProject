package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchedulePage {

    public SchedulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='card is-transparent']/table//tr[12]//td[6]")
    public WebElement reservationPart;

    @FindBy(xpath = "((//div[@class='media-content'])[4]//p)[1]")
    public WebElement name;

    @FindBy(xpath = "((//div[@class='media-content'])[5]//p)[1]")
    public WebElement date;


}

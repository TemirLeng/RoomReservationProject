package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeamPage {

   public TeamPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindAll(@FindBy(xpath = "//div[@class='media-content']//p[contains(text(),'name')]/preceding-sibling::p"))
    public List<WebElement> nameBoxes;

}

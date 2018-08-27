package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage;
import pages.SignInPage;
import pages.TeamPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.DBUtils;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class SPA1743_steps {

    Homepage homeP = new Homepage();
    TeamPage teamP = new TeamPage();
    SignInPage signP = new SignInPage();

    @Given("{string} is on the sign in page")
    public void is_on_the_sign_in_page(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitForPageToLoad(3);
    }

    @When("{string} sign in using {string} and {string}")
    public void sign_in_using_and(String user, String username, String password) {
        signP.userName.sendKeys(username);
        signP.password.sendKeys(password);
        signP.signInButton.click();
    }

    @When("{string} hovers over on my button and chooses team")
    public void hovers_over_on_my_button_and_chooses_team(String user) {
        BrowserUtils.waitFor(3);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(homeP.my).perform();
        BrowserUtils.waitFor(3);
        action.moveToElement(homeP.team).perform();
        homeP.team.click();
    }

    @Then("{string} should be able to see {string}")
    public void should_be_able_to_see(String user, String output) {

        BrowserUtils.waitFor(3);

        String query = "";

        List<String> names = new ArrayList<String>();

        for(WebElement nameBox:teamP.nameBoxes){
            names.add(nameBox.getText());
        }

        BrowserUtils.waitFor(3);

        if(user.equals("teacher")) {
            query = "select users.firstname||' '||users.lastname as firstname_and_lastname from users where users.firstname='Ned';";
        }else {
            query = "SELECT users.firstname||' '||lastname as fullname FROM users JOIN team ON users.team_id = team.id WHERE team.name = 'Hibernate';";
        }



        if(user.equals("teacher")){
            Assert.assertEquals(DBUtils.getQueryResultMap(query).get(0).get("firstname_and_lastname"), output);
        }else{
            Assert.assertTrue(output.contains(DBUtils.getQueryResultMap(query).get(0).get("firstname_and_lastname").toString()));
            Assert.assertTrue(output.contains(DBUtils.getQueryResultMap(query).get(1).get("firstname_and_lastname").toString()));
            Assert.assertTrue(output.contains(DBUtils.getQueryResultMap(query).get(2).get("firstname_and_lastname").toString()));
            Assert.assertTrue(output.contains(DBUtils.getQueryResultMap(query).get(3).get("firstname_and_lastname").toString()));
        }



    }
}

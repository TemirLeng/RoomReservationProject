package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.HuntPage;
import pages.SchedulePage;
import pages.SignInPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.DBUtils;
import utilities.Driver;

public class SPA1803_steps {

    HomePage homeP = new HomePage();
    SignInPage signInP = new SignInPage();
    HuntPage huntP = new HuntPage();
    SchedulePage scheduleP = new SchedulePage();

    @Given("user is on the sign in page")
    public void user_is_on_the_sign_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user sign in using email {string} and password {string}")
    public void user_sign_in_using_email_and_password(String userName, String password) {
        signInP.userName.sendKeys(userName);
        signInP.password.sendKeys(password);
        signInP.signInButton.click();
    }

    @When("user clicks on hunt to make reservation")
    public void user_clicks_on_hunt_to_make_reservation() {
        BrowserUtils.waitFor(2);
        homeP.huntLink.click();
    }

    @Then("user chooses desired date {string} and time from {string} to {string} then clicks search button")
    public void user_chooses_desired_date_and_time_from_to_then_clicks_search_button(String date, String fromHour, String toHour) {
        BrowserUtils.waitFor(1);
        huntP.date.sendKeys(date);
        BrowserUtils.waitFor(2);
        Select s=new Select(huntP.fromHour);
        s.selectByVisibleText(fromHour);
        BrowserUtils.waitFor(2);
        s=new Select(huntP.toHour);
        s.selectByVisibleText(toHour);
        huntP.search.click();

    }

    @Then("user clicks on book to reserve for {string} room")
    public void user_clicks_on_book_to_reserve_for_room(String string) {
        BrowserUtils.waitFor(2);
            huntP.amazon.click();
    }

    @Then("user clicks on confirm button to reserve the room")
    public void user_clicks_on_confirm_button_to_reserve_the_room() {
            huntP.confirm.click();
    }

    @Then("user's info should match database with name {string} and date {string} on schedule page" )
    public void user_s_info_should_match_database_with_name_and_date(String name, String date) {
        BrowserUtils.waitFor(2);

        // clicking reserved time on room "amazon"
        scheduleP.reservationPart.click();

        // create a connection with DataBase
        DBUtils.createConnection();

        // Getting the unique fullname and date from DataBase
        String query= "select users.firstname||' '||users.lastname as firstname_and_lastname,conference.date from users " +
                "join conference on users.id=conference.reservator_id " +
                "where users.firstname='Kanya' and conference.date = '2018-" + date.replace("/","-") + "';";

        // Getting the fullname and date from Database
        String dataBaseName = DBUtils.getColumnData(query, "firstname_and_lastname").get(0).toString();
        String dataBaseDate = DBUtils.getColumnData(query,"date").get(0).toString().replace("-","/");

        // Getting the fullname and date from UI
        String UI_name = scheduleP.name.getText();
        String UI_date = scheduleP.date.getText();

        // verifying fullname and date from UI with DataBase
        Assert.assertEquals(dataBaseName,UI_name);
        Assert.assertEquals(UI_date,dataBaseDate.replace("2018/0",""));

        BrowserUtils.waitFor(1);
        scheduleP.cancelConferenceBtn.click();

        // Killing the connection with DB
        DBUtils.destroy();
    }

}

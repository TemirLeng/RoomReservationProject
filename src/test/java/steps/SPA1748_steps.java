package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.SchedulePage;
import utilities.BrowserUtils;

import javax.swing.*;

public class SPA1748_steps {

    HomePage homeP = new HomePage();
    SchedulePage scheduleP = new SchedulePage();

    @Then("user clicks on the schedule link")
    public void user_clicks_on_the_schedule_link() {
        BrowserUtils.waitFor(1);
        homeP.scheduleLink.click();
    }

    @Then("verify the {string} is displayed")
    public void verify_the_is_displayed(String expectedTxt) {
        BrowserUtils.waitFor(1);
        String actualTxt = scheduleP.scheduleTxt.getText();

        Assert.assertEquals("User is not in Schedule Page", expectedTxt, actualTxt);
    }
}

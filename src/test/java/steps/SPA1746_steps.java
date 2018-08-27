package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Homepage;
import pages.HuntPage;
import utilities.BrowserUtils;

public class SPA1746_steps {

    Homepage homeP = new Homepage();
    HuntPage huntP = new HuntPage();

    @Then("verify {string} is displayed")
    public void verify_is_displayed(String freeSpotMsg) {
        BrowserUtils.waitFor(1);
        String actualMsg = huntP.freeSpotsMsg.getText();

        Assert.assertEquals("Free spots Message is not displayed", freeSpotMsg, actualMsg);
    }

    @Then("verify {string} links displayed in every room")
    public void verify_links_displayed_in_every_room(String book) {

        for(int i = 0; i < huntP.bookBtns.size(); i++) {
            String actualLinks = huntP.bookBtns.get(i).getText();
            Assert.assertEquals("It's not a book", book, actualLinks);
        }
    }
}

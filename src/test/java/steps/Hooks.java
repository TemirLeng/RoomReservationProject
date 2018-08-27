package steps;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.concurrent.TimeUnit;


public class Hooks {

    @Before
    public void setUp() {
       Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @After
    public void tearDown(Scenario scenario) {
        // only takes a screenshot if the scenario fails
        if (scenario.isFailed()) {
            // taking a screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // adding the screenshot to the report
            scenario.embed(screenshot, "image/png");
        }

        Driver.closeDriver();
    }

}

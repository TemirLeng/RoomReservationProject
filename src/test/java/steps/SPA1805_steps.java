package steps;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import pages.HuntPage;
import pages.SchedulePage;
import pages.SignInPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SPA1805_steps {
	
	SignInPage sip = new SignInPage();
	Homepage hp = new Homepage();
	HuntPage hntP = new HuntPage();
	SchedulePage sp = new SchedulePage();
	
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@Given("user login using email {string} and password {string}")
	public void user_login_using_email_and_password(String username, String password) {
		hp.userName.sendKeys(username);
		hp.password.sendKeys(password);
	    
	}

	@Given("user clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() {
		hp.signInButton.click();
	    
	}

	@When("user clicks on hunt to make reservation")
	public void user_clicks_on_hunt_to_make_reservation() {
		BrowserUtils.waitFor(2);
	    sip.Hunt.click();
	}

	@When("user chooses {string} as the desired date and from hour {string} till {string}")
	public void user_chooses_as_the_desired_date_and_from_hour_till(String date, String fromTime, String toTime) {
	    
		BrowserUtils.waitFor(2);
	  hntP.date.sendKeys(date);
	  hntP.fromHour.sendKeys(fromTime);
	  hntP.toHour.sendKeys(toTime);
	  hntP.search.click();
	 
		
	}

	@Then("user clicks on book for microsoft room")
	public void user_clicks_on_book_for_microsoft_room() {
		BrowserUtils.waitFor(1);
		hntP.microsoft.click();
	    
	}

	@Then("booking confirmation page displayed")
	public void booking_confirmation_page_displayed() {
		Assert.assertTrue(sp.confirmationMessage.isDisplayed());
	   
	}

	@Then("user {string}")
	public void user(String message) {
		BrowserUtils.waitFor(1);
		JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
		js.executeScript("arguments[0].click();" , sp.confirmationMessage);
		assertEquals(sp.confirmationMessage.getText(), message ,"message did not match" );
		
		BrowserUtils.waitFor(2);
		sp.deleteBooking.click();
		BrowserUtils.waitFor(2);
		sp.cancelConferenceBtn.click();
	   
	}



}

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

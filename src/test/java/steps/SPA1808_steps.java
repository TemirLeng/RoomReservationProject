package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Then;
import pages.SignInPage;
import utilities.Driver;

public class SPA1808_steps {
	
	SignInPage sp = new SignInPage();
	
	
	@Then("verify message {string} is displayed")
	public void verify_message_is_displayed(String message) {
		
		JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
		js.executeScript("arguments[0].click();" , sp.message);
		assertEquals(sp.message.getText(), message ,"message did not match" );
	    
	}

}

package steps;

import static org.testng.Assert.assertEquals;

import cucumber.api.java.en.When;
import pages.HomePage;
import pages.SignInPage;
import utilities.BrowserUtils;

public class SPA1806_steps {
	
	SignInPage sp = new SignInPage();
	HomePage hm = new HomePage();
	
	@When("user enters email {string} and {string}")
	public void user_enters_email_and(String username, String password) {
	    sp.userName.sendKeys(username);
	    sp.password.sendKeys(password);
	    sp.signInButton.click();
	}

	@When("verify {string} IL is displayed")
	public void verify_IL_is_displayed(String location) {
		BrowserUtils.waitFor(2);
		System.out.println(hm.location.getText());
		System.out.println(location);
		assertEquals( hm.location.getText(), location , "Location is not correct: ");
	    
	}

}

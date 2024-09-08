package stepdefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FacebookPage;

public class FbStepDefination {

	FacebookPage fb= new FacebookPage();
	
	@Given("^user is on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		fb.OpenBrowser();
		fb.OpenWebpage();
	}
	
	@When("^Title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
	   String expectedTitle = title;
	   String actualTitle = "Facebook - log in or sign up";
	   Assert.assertEquals(expectedTitle, actualTitle);
}
	
	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password)  {
		fb.EnterCredentials(email, password);
	}
	@Then("^User get error for email$")
	public void user_get_error_for_email() throws Throwable {
		String expectedErr = "Find your account and log in.";
		String actualErr = fb.readErr();
		Assert.assertEquals(expectedErr, actualErr);
	}
		
	@Then("^User quit$")
	public void user_quit() throws Throwable {
	  // fb.CloseBrowser();
	}
}

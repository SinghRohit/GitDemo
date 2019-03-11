package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.loginPage;
import resources.base;

public class stepDefinations extends base{
	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_Chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on login link in home page to land on secure sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
	}

	@When("^USer enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
        
		// Write code here that turns the phrase above into concrete actions
		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPwd().sendKeys(password);
		lp.SubmitData().click();
		//log.info("login done");
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
        driver.close();
        driver = null;
    }

}

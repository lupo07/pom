package cucumber.integration;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.engine.DriverSet;
import page.gaccess.GmailPage;
import page.gaccess.GoogleAccessPageFactory;

public class AccessGStepDef {
	WebDriver driver;
	String baseURL = "http://www.google.com";
	String browser = "chrome";
	DriverSet ds;
	GoogleAccessPageFactory gapf;
	GmailPage gmp;
	AccessCucumberFunctions acf;
	private static final Logger log = LogManager.getLogger(AccessGStepDef.class.getName());

	@Before
	public void setUp() {
		ds = new DriverSet(browser);
		driver = ds.driverReturn();
		driver.get(baseURL);
		gapf = new GoogleAccessPageFactory(driver);
		gmp = new GmailPage(driver);
		log.info("The Suite is Started");
		acf = new AccessCucumberFunctions();
	}

	@Given("^I have a google account (.*?)$")
	public void I_have_a_google_account(String account) {
		acf.setAccount(account);
	}

	@And("^I have the password (.*?)$")
	public void I_have_the_password(String password) {
		acf.setPassword(password);
	}

	@When("^I try to access$")
	public void I_try_to_access() {
		gapf.clickSignInButton();

	}

	@Then("^I should be able to enter to my account$")
	public void I_should_be_able_to_enter_to_my_account() {
		gmp.gmailLogo();
		gmp.fillUserName(acf.getAccount());
		gmp.clickNextButton();
		gmp.fillPassword(acf.getPassword());
		gmp.clickPassNextButton();
	}

	@Then("^I should be able to get the proper error(.*?)$")
	public void I_should_be_able_to_get_the_proper_error(String error) {
		acf.setError(error);
	}

	@And("^The color should be (.*?)$")
	public void The_color_should_be(String color) {
		acf.setColor(color);
		gmp.gmailLogo();
		gmp.fillUserName(acf.getAccount());
		gmp.clickNextButton();
		

//		if (acf.getAccount() != null&& acf.getPassword()!=null) {
//			gmp.fillPassword(acf.getPassword());
//			gmp.clickPassNextButton();
//		}

		 assertEquals(acf.getError(), gmp.getErrorMessage());
		 log.info("Expected error message is: "+ acf.getError()+" Actual Error Message is: " + gmp.getErrorMessage());
		
		 assertEquals(acf.getColor(), gmp.getErrorColor());
		 log.info("Expected error color is: "+ acf.getColor()+" Actual Color Message is: " + gmp.getErrorColor());

		 driver.quit();
	}

}

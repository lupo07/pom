package page.gaccess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.engine.ConfigReader;
import framework.engine.ExplicitWaits;
import framework.engine.Constants;

/***
 * 
 * Here are located all the Elements and methods for Gmail page
 * 
 */

public class GmailPage {
	WebDriver driver;
	ExplicitWaits exwt;
	ConfigReader config = new ConfigReader();
	private static final Logger log = LogManager.getLogger(GmailPage.class.getName());

	/***
	 * Elements
	 */

	@FindBy(id = "headingText")
	WebElement gmailHeadingText;

	@FindBy(id = "logo")
	WebElement gmailLogo;

	@FindBy(xpath = "//input[@type='email']")
	WebElement userName;

	@FindBy(id = "identifierNext")
	WebElement nextButton;

	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordInput;

	@FindBy(id = "passwordNext")
	WebElement nextPassButton;

	/**
	 * Constructor
	 * 
	 * @param driver
	 */

	public GmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		exwt = new ExplicitWaits(driver);
	}

	/**
	 * Methods
	 */

	public void gmailHeadingText() {
		Assert.assertTrue(exwt.waitForElement(gmailHeadingText, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("Banner is displayed");
	}

	public void gmailLogo() {
		Assert.assertTrue(exwt.waitForElement(gmailLogo, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("Gmail logo is displayed");
	}

	public void fillUserName() {
		Assert.assertTrue(exwt.waitForElement(userName, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("User name request is displayed");
		userName.sendKeys(config.getUserName());
		log.info("User " + config.getUserName() + " was sent");
	}

	public void fillUserName(String username) {
		Assert.assertTrue(exwt.waitForElement(userName, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("User name request is displayed");
		userName.sendKeys(username);
		log.info("User " + username + " was sent");
	}
	
	public void clickNextButton() {
		Assert.assertTrue(exwt.waitForElement(nextButton, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("Next button is displayed");
		nextButton.click();
		log.info("Click on Next Button");
	}

	public void fillPassword() {
		Assert.assertTrue(exwt.waitForElement(passwordInput, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("Password input is displayed");
		passwordInput.sendKeys(config.getPasswordEmail());
		log.info("Password for the user " + config.getUserName() + " was sent");
	}

	public void fillPassword(String password) {
		Assert.assertTrue(exwt.waitForElement(passwordInput, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("Password input is displayed");
		passwordInput.sendKeys(password);
		log.info("Password for the user " + password + " was sent");
	}
	
	public void clickPassNextButton() {
		Assert.assertTrue(exwt.waitForElement(nextPassButton, Constants.EXPLICIT_WAIT_GMAIL_PAGE));
		log.info("Next Password Button is displayed");
		nextPassButton.click();
		log.info("Click on Next Password Button");
	}

}

package page.gaccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import framework.engine.ExplicitWaits;
import framework.engine.Constants;


/***
 * 
 * Here are located all the Elements and functions for Google main page
 * 
 */

public class GoogleAccessPageFactory {
	WebDriver driver;
	ExplicitWaits exwt;
	private static final Logger log = LogManager.getLogger(GoogleAccessPageFactory.class.getName());

	/***
	 * Elements
	 */

	@FindBy(id = "gb_70")
	WebElement siginButtonGoogle;

	@FindBy(id = "gs_htif0")
	WebElement searchTextBoxGoogle;

	@FindBy(xpath = "//a[text()='Gmail']")
	WebElement gmailHeader;

	@FindBy(xpath = "//input[@name='btnK']")
	WebElement gSearchButton;

	@FindBy(xpath = "//input[@name='btnI']")
	WebElement gLuckyButton;

	@FindBy(xpath = "//a[@class='gb_b gb_cc']")
	WebElement appsLogo;

	@FindBy(xpath = "//a[@id='gb36']")
	WebElement youtubeLogo;
	
	/**
	 * Constructor
	 * 
	 * @param driver
	 */
	
	public GoogleAccessPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		exwt = new ExplicitWaits(driver);
	}

	/**
	 * Methods
	 */

	public void clickSignInButton() {
		Assert.assertTrue(exwt.waitForElement(siginButtonGoogle, Constants.EXPLICIT_WAIT_GOOGLE_ACCESS_PAGE));
		siginButtonGoogle.click();
		log.info("Click on  sign in button");
	}

	public void clickGmailHeader() {
		Assert.assertTrue(exwt.waitForElement(gmailHeader, Constants.EXPLICIT_WAIT_GOOGLE_ACCESS_PAGE));
		gmailHeader.click();
		log.info("Click on  gmail header");
	}

	public void clickGSearchButtom() {
		Assert.assertTrue(exwt.waitForElement(gSearchButton, Constants.EXPLICIT_WAIT_GOOGLE_ACCESS_PAGE));
		gSearchButton.click();
		log.info("Click on Google search");
	}

	public void clickGLuckyButtom() {
		Assert.assertTrue(exwt.waitForElement(gLuckyButton, Constants.EXPLICIT_WAIT_GOOGLE_ACCESS_PAGE));
		gLuckyButton.click();
		log.info("Click on Feeling lucky button");
	}

	public void clickAppsLogo() {
		Assert.assertTrue(exwt.waitForElement(appsLogo, Constants.EXPLICIT_WAIT_GOOGLE_ACCESS_PAGE));
		appsLogo.click();
		log.info("Click on Apps Logo");
	}

	public void clickYoutubeLogo() {
		Assert.assertTrue(exwt.waitForElement(youtubeLogo, Constants.EXPLICIT_WAIT_GOOGLE_ACCESS_PAGE));
		youtubeLogo.click();
		log.info("Click on Youtube Logo");
	}

}
package page.gaccess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.engine.ExplicitWaits;


public class GmailPage {
	WebDriver driver;
	ExplicitWaits exwt = new ExplicitWaits(driver);
	private static final Logger log = LogManager.getLogger(GmailPage.class.getName());
	
	@FindBy(xpath = "//div[@class='hero__image hero_home__image scroll-target']")
	WebElement gmailBanner;
	
	@FindBy(id = "logo")
	WebElement gmailLogo;
	
	
	
	public GmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void GmailBannerDisplayed() {
		Assert.assertTrue(exwt.waitForElement(gmailBanner,5));
		log.info("Banner is displayed");
	}

	public void GmailLogo() {
		Assert.assertTrue(exwt.waitForElement(gmailLogo,5));	
		log.info("Gmail logo is displayed");
	}
	
}

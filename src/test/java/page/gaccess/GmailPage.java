package page.gaccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.engine.ExplicitWaits;

public class GmailPage {
	WebDriver driver;
	ExplicitWaits exwt = new ExplicitWaits(driver);
	
	@FindBy(xpath = "//div[@class='hero__image hero_home__image scroll-target']")
	WebElement gmailBanner;
	
	@FindBy(id = "logo")
	WebElement gmailLogo;
	
	
	
	public GmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void GmailBannerDisplayed() {
		exwt.waitForElement(gmailBanner, 5);
	}

	public void GmailLogo() {
		exwt.waitForElement(gmailLogo, 5);
	}
	
}

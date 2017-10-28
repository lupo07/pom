package suite;

import org.testng.annotations.Test;

import framework.engine.DriverSet;
import page.gaccess.GoogleAccessPageFactory;
import page.gaccess.GmailPage;

import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;


public class Regression  {
	WebDriver driver;
	String browser = "firefox";
	DriverSet ds = new DriverSet(driver, browser);
	private static final Logger log = LogManager.getLogger(Regression.class.getName());
	GoogleAccessPageFactory gapf;
	GmailPage gmp;
	

	@BeforeClass
	@Parameters({ "baseURL" })
	public void setUp(String baseURL) {
		driver = ds.driverReturn();
		driver.get(baseURL);
		gapf = new GoogleAccessPageFactory(driver);
		gmp = new GmailPage(driver);

	}
	
	

	@Test
	public void LoginTest() {
		gapf.clickGmailHeader();
		gmp.GmailLogo();
		gmp.GmailBannerDisplayed();
	}

	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}

package suite;

import org.testng.annotations.Test;

import framework.engine.DriverSet;
import framework.engine.ExcelReader;
import page.gaccess.GoogleAccessPageFactory;
import page.gaccess.YoutubePage;
import page.gaccess.GmailPage;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

//import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
//import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;


public class Regression  {
	WebDriver driver;
	String baseURL; 
	String browser = "chrome";
	DriverSet ds = new DriverSet(browser);
	GoogleAccessPageFactory gapf;
	GmailPage gmp;
	YoutubePage ytp;
	private static final Logger log = LogManager.getLogger(Regression.class.getName());

	

	@BeforeClass
	@Parameters({ "baseURL"})
	public void setUp(String baseURL) {
		driver = ds.driverReturn();
		driver.get(baseURL);
		gapf = new GoogleAccessPageFactory(driver);
		gmp = new GmailPage(driver);
		ytp = new YoutubePage(driver);
		this.baseURL=baseURL;
		log.info("The Suite is Started");
	}

//	@BeforeMethod
//	public void testSet(Method method) {
//		log.info("                                                   ");
//		log.info("***************************************************");
//		log.info("The Test "+ method.getName()+" has started");
//		log.info("***************************************************");
//		log.info("                                                   ");
//	}
	
//	@DataProvider(name = "loginData")
//	public Object[][] dataProvider() {
//		Object[][] testData = ExcelReader.getTestData("Invalid_Login");
//		return testData;
//	}
	
	@Test
	public void GmailAccessTest() {
		log.info("The test Started");
		gapf.clickGmailHeader();
		gmp.gmailLogo();
		gmp.gmailHeadingText();				
	}
	
	@Test
	public void YoutubeAccessTest() {
		driver.get(baseURL);
		log.info("The test Started");
		gapf.clickAppsLogo();
		gapf.clickYoutubeLogo();
		ytp.clickYoutubeSignIn();
		gmp.gmailLogo();
		gmp.fillUserName();
		gmp.clickNextButton();
		gmp.fillPassword();
		gmp.clickPassNextButton();
		ytp.clickUpload();
		ytp.clickSelectFiles();
	}
	
	
//	@Test(dataProvider="loginData")
//	public void testUsingExcel(String username, String password) throws Exception {
//		driver.get(baseURL);
//		log.info("The test Started");
//		gapf.clickAppsLogo();
//		gapf.clickYoutubeLogo();
//		ytp.clickYoutubeSignIn();
//		gmp.gmailLogo();
//		gmp.fillUserName(username);
//		gmp.clickNextButton();
//		gmp.fillPassword(password);
//		gmp.clickPassNextButton();
//		
//	}
	
	
	
//	@AfterMethod
//	public void testClosure(Method method, ITestResult result) {
//		log.info("                                                   ");
//		log.info("***************************************************");
//		log.info("The test has "+ result.getStatus());
//		log.info("***************************************************");
//		log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
//		log.info("***************************************************");
//		log.info("The Test "+ method.getName()+" has being completed");
//		log.info("***************************************************");
//		log.info("                                                   ");
//	}

	@AfterClass
	public void cleanUp() {
		log.info("The Suite is completed");
		driver.quit();
	}

}

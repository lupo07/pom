package suite;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import framework.engine.DriverSet;
import page.gaccess.GoogleAccessPageFactory;

public class TCuno {
	WebDriver driver;
	String browser = "firefox";
	DriverSet ds = new DriverSet(driver, browser);
	GoogleAccessPageFactory gapf;
	
	@Before
	public void setUp() throws Exception {
		String baseURL = "http://www.google.com";
		driver=ds.driverReturn();		
		driver.get(baseURL);
		gapf =new GoogleAccessPageFactory(driver);		
	}

	@Test
	public void test() {
		gapf.clickSignInButton();	
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
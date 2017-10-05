package framework.engine;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	WebDriver driver;
	
	
	public ExplicitWaits(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement waitForElement(WebElement webEl, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for max:: " + timeout + " seconds for element to be available");
			
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(
					ExpectedConditions.visibilityOf(webEl));
			System.out.println("Element appeared on the web page");	
		
		} catch(Exception e) {
			System.out.println("Element not appeared on the web page");
		}
		return element;
	}

}

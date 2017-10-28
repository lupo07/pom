package framework.engine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	WebDriver driver;
	private static final Logger log = LogManager.getLogger(ExplicitWaits.class.getName());

	public ExplicitWaits(WebDriver driver) {
		this.driver = driver;
	}

	public boolean waitForElement(WebElement webEl, int timeout) {
		if (webEl != null) {

			try {
				log.info("Waiting for max:: " + timeout + " seconds for element to be available");

				WebDriverWait wait = new WebDriverWait(driver, timeout);

				wait.until(ExpectedConditions.visibilityOf(webEl));
				System.out.println("Element is present");
				log.info("Element is present");
				return true;

			} catch (Exception e) {
				log.debug("Element is not present " + e);
				return false;
			}
		} else
			log.error("Element is null");
		return false;

	}

}

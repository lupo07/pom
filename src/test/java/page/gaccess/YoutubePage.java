package page.gaccess;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import framework.engine.ExplicitWaits;
import framework.engine.Constants;
import framework.engine.RobotKeys;

public class YoutubePage {
	WebDriver driver;
	ExplicitWaits exwt;
	Actions actions;
	RobotKeys robot;
	private static final Logger log = LogManager.getLogger(YoutubePage.class.getName());

	/***
	 * Elements
	 */

	@FindBy(xpath = "//yt-formatted-string[@id='text'][@class='style-scope ytd-button-renderer style-brand']")
	WebElement youtubeSignIn;

	@FindBy(id = "logo")
	WebElement gmailLogo;

	@FindBy(xpath = "//a[@href='/upload']")
	WebElement youtubeUpload;

	@FindBy(xpath = "//div[@id='start-upload-button-single']/button")
	WebElement selectFilesToUpload;

	@FindBy(xpath = "//input[@type='file'][@style='opacity: 0; font-size: 157px; height: 157px; position: absolute; right: 0px; top: 0px;']")
	WebElement selectFilesToUploadClick;

	@FindBy(xpath = "//span[@class='yt-uix-button-content'][text()='Add more videos']")
	WebElement addMoreVidsButton;

	/**
	 * Constructor
	 * 
	 * @param driver
	 */

	public YoutubePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		exwt = new ExplicitWaits(driver);
		actions = new Actions(driver);
		robot = new RobotKeys();
	}

	/**
	 * Methods
	 */

	public void clickYoutubeSignIn() {
		Assert.assertTrue(exwt.waitForElement(youtubeSignIn, Constants.EXPLICIT_WAIT_YOUTUBE_PAGE));
		log.info("Youtube Sign In is displayed");
		youtubeSignIn.click();
		log.info("Click on Youtube Sign in");
	}

	public void gmailLogo() {
		Assert.assertTrue(exwt.waitForElement(gmailLogo, Constants.EXPLICIT_WAIT_YOUTUBE_PAGE));
		log.info("Gmail logo is displayed");
	}

	public void clickUpload() {
		Assert.assertTrue(exwt.waitForElement(youtubeUpload, Constants.EXPLICIT_WAIT_YOUTUBE_PAGE));
		log.info("Youtube Upload is displayed");
		youtubeUpload.click();
		log.info("Click on Youtube Upload");
	}

	public void clickSelectFiles() throws Exception {
		Assert.assertTrue(exwt.waitForElement(selectFilesToUpload, Constants.EXPLICIT_WAIT_YOUTUBE_PAGE));
		log.info("Select files to upload button is displayed");
		actions.moveToElement(selectFilesToUploadClick).click().perform();
		log.info("Click Select files to upload button");
		Thread.sleep(5000);
	}

	public void sendVideotoUploadPath() {
		getFilesListToUpload();
		robot.pasteKeys();
		robot.enterKeys();
	}

	public void getFilesListToUpload() {
		File folder = new File(Constants.VIDEO_FILE_PATH);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				String pvid = Constants.VIDEO_FILE_PATH + listOfFiles[i].getName();

				StringSelection ss = new StringSelection(pvid);

				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

				System.out.println("File " + listOfFiles[i].getName());
				// add to list
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}

	}

	public void clickAddMoreVideos() {
		Assert.assertTrue(exwt.waitForElement(addMoreVidsButton, Constants.EXPLICIT_WAIT_YOUTUBE_PAGE));
		log.info("Add more videos button is displayed");
		addMoreVidsButton.click();
		log.info("Add more videos button");
	}

}

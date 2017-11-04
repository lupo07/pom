package framework.engine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties pro;

	public ConfigReader() {

		try {
			File src = new File("./ConfigGmailPage.properties");

			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);

		} catch (Exception e) {

			System.out.println("Exception is ==" + e.getMessage());
		}
	}

	/**
	 * Login User
	 * 
	 * @return
	 */

	public String getUserName() {

		return pro.getProperty("UserName");

	}

	public String getPasswordEmail() {

		return pro.getProperty("PasswordEmail");

	}


}

package com.pankanis.servicecloudcrm.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * This Class defines the Appium driver in the project, loads properties file
 * and has other commonly used methods
 * 
 * @author ronit.joardar
 *
 */
public class Utility {

	public AppiumDriver<MobileElement> driver;
	public Logger logger;
	public String avdName, app_path, excel_path, deviceName, platformName, platformVersion, emaulatorName, browserName,
			appActivity, appPackage, localURL;
	public Dimension dimensions;

	/**
	 * loads all the data from properties file in their assigned String variable
	 * 
	 * @throws Exception
	 */
	public Utility() throws Exception {

		File file = new File(System.getProperty("user.dir") + "/src/main/resources/Properties/config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties config = new Properties();
		config.load(fis);
		this.app_path = config.getProperty("app_path");
		this.excel_path = config.getProperty("excel_path");
		this.deviceName = config.getProperty("deviceName");
		this.platformName = config.getProperty("platformName");
		this.platformVersion = config.getProperty("platformVersion");
		this.emaulatorName = config.getProperty("emaulatorName");
		this.appActivity = config.getProperty("appActivity");
		this.appPackage = config.getProperty("appPackage");
		this.localURL = config.getProperty("localURL");
		this.browserName = config.getProperty("browserName");
		this.avdName = config.getProperty("avdName");

	}

	/**
	 * This methods Captures Sreenshots with Timestamp
	 * 
	 * @param driver
	 * @param sc_name
	 * @throws Exception
	 */

	public void captureScreenshot(WebDriver driver, String sc_name) throws Exception {
		String timeStamp = new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,
				new File(System.getProperty("user.dir") + "//Screenshots//" + sc_name + "_" + timeStamp + ".png"));

	}

	/**
	 * Vertical scrolls to the bottom of the page
	 * 
	 * @param driver
	 */
	public void verticalScroll(AppiumDriver<MobileElement> driver) {

		this.driver = driver;
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		driver.executeScript("mobile: scroll", params);

	}

	/**
	 * Instantiates the logger class
	 * 
	 * @param className
	 */

	public void initiateLogger(String className) {
		// Here we need to create logger instance so we need to pass Class name
		// for
		// which we want to create log file in my case className will take the
		// test classname
		logger = Logger.getLogger(className);

		// configure log4j properties file
		File log4jfile = new File("./src/main/resources/Properties/log4j.properties");
		PropertyConfigurator.configure(log4jfile.getAbsolutePath());
	}
}

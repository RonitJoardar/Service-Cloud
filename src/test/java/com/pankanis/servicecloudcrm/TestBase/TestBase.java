package com.pankanis.servicecloudcrm.TestBase;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import com.pankanis.servicecloudcrm.ScreenLibrary.MiscChecks;
import com.pankanis.servicecloudcrm.ScreenLibrary.OpportunitiesAdd;
import com.pankanis.servicecloudcrm.ScreenLibrary.OpportunitiesTask;
import com.pankanis.servicecloudcrm.ScreenLibrary.OrganizationAddNew;
import com.pankanis.servicecloudcrm.ScreenLibrary.OrganizationContacts;
import com.pankanis.servicecloudcrm.ScreenLibrary.OrganizationIncident;
import com.pankanis.servicecloudcrm.ScreenLibrary.OrganizationTask;
import com.pankanis.servicecloudcrm.ScreenLibrary.SubscribeOpportunities;
import com.pankanis.servicecloudcrm.ScreenLibrary.SubscribeOrganizations;
import com.pankanis.servicecloudcrm.Utilities.ExcelReader;
import com.pankanis.servicecloudcrm.Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * This Class acts as the base class for every test. It instantiated all the
 * page element classes. Starts and Stops appium server Before and After a
 * TesSuite Creates and terminates device sessions before and after every test
 * method
 * 
 * @author ronit.joardar
 *
 */
public class TestBase extends ExcelReader {

	public OpportunitiesAdd oppadd;
	public OpportunitiesTask opptask;
	public OrganizationAddNew orgaddnew;
	public OrganizationContacts orgcontact;
	public OrganizationIncident orgincident;
	public OrganizationTask orgtask;
	public SubscribeOpportunities subopp;
	public SubscribeOrganizations suborg;
	public MiscChecks misc;
	public AppiumServer _appiumServer;
	public DesiredCapabilities capabilities;
	public AppiumDriverLocalService appiumDriverLocalService;

	public TestBase() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static OS executionOS = OS.ANDROID;

	public enum OS {
		ANDROID, IOS
	}

	/**
	 * Loads add opportunities page elements
	 * 
	 * @throws Exception
	 */
	public void loadOpportunitiesAddElements() throws Exception {
		oppadd = new OpportunitiesAdd(driver);
	}

	/**
	 * Loads opportunities task page elements
	 * 
	 * @throws Exception
	 */
	public void loadOpportunitiesTaskElements() throws Exception {
		opptask = new OpportunitiesTask(driver);
	}

	/**
	 * Loads add organization page elements
	 * 
	 * @throws Exception
	 */
	public void loadOrganizationAddNewElements() throws Exception {
		orgaddnew = new OrganizationAddNew(driver);
	}

	/**
	 * Loads add organization contacts page elements
	 * 
	 * @throws Exception
	 */
	public void loadOrganizationContactsElements() throws Exception {
		orgcontact = new OrganizationContacts(driver);
	}

	/**
	 * Loads add organization incident page elements
	 * 
	 * @throws Exception
	 */
	public void loadOrganizationIncidentElements() throws Exception {
		orgincident = new OrganizationIncident(driver);
	}

	/**
	 * Loads add organization task page elements
	 * 
	 * @throws Exception
	 */
	public void loadOrganizationTaskElements() throws Exception {
		orgtask = new OrganizationTask(driver);
	}

	/**
	 * Loads subscribe opportunities page elements
	 * 
	 * @throws Exception
	 */
	public void loadSubscribeOpportunitiesElements() throws Exception {
		subopp = new SubscribeOpportunities(driver);
	}

	/**
	 * Loads subscribe organizations page elements
	 * 
	 * @throws Exception
	 */
	public void loadSubscribeOrganizationsElements() throws Exception {
		suborg = new SubscribeOrganizations(driver);
	}

	/**
	 * Loads subscribe miscellaneous page elements
	 * 
	 * @throws Exception
	 */
	public void loadMiscChecksElements() throws Exception {
		misc = new MiscChecks(driver);
	}

	/**
	 * Vertical scrolls to the element specifies in Hashmap object
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public void verticalScrollToElement(AppiumDriver<MobileElement> driver) throws Exception {

		MobileElement health = driver
				.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Subscribe Opportunities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		this.driver = driver;
		String id = ((MobileElement) health).getId();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "down");
		params.put("element", id);
		js.executeScript("mobile: scroll", params);

	}

	/**
	 * Loads Android or IOS device based on the value specified in the
	 * executionOS enum Runs before every test method
	 * 
	 * @throws Exception
	 */

	@BeforeMethod
	public void setup() throws Exception {

		switch (executionOS) {
		case ANDROID:
			// Create Object of DesiredCapability class
			capabilities = new DesiredCapabilities();

			// Set the avd name
			// capabilities.setCapability("avd", avdName);

			// Set the device Name- You can change based on your requirement
			capabilities.setCapability("deviceName", deviceName);

			// Set the platform name- This will ramain same
			capabilities.setCapability("platformName", platformName);

			// This the version- it is important so change it if required
			capabilities.setCapability("platformVersion", platformVersion);

			// capabilities.setCapability("automationName", "Appium");

			// set the browser in Emulator
			capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);

			capabilities.setCapability("appPackage", "com.pankanis.servicecloud");

			capabilities.setCapability("appActivity", "com.pankanis.servicecloudcrm.activities.MainActivity");
			// capabilities.setCapability(MobileCapabilityType.APP,
			// "/Users/ronit.joardar/Documents/ServiceCloud-Android-1.0.apk");

			// pass the capability object and start the session

			driver = new AndroidDriver<MobileElement>(new URL(localURL), capabilities);

			// Open any web application which you want to Test

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Thread.sleep(10000);
			 MobileElement loginBtn=(AndroidElement)
					  driver.findElement(By.xpath(
					  "//android.widget.Button[@text='Login']")); 
			 loginBtn.click();
			  for (int i = 0; i < 1; i++) {
			 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			  if(( driver.findElement(By.xpath(
					  "//android.widget.Button[@text='Allow']")).isDisplayed()))
					  {
			  driver.findElement(By.xpath(
			  "//android.widget.Button[@text='Allow']")).click();
			  driver.findElement(By.xpath(
					  "//android.widget.Button[@text='OK']")).click();
		  
					  }
			  else
				  {
				  break;
				  }}
			 
			Thread.sleep(10000);

			break;
		case IOS:

			String app_path = System.getProperty("user.dir")
					+ "/Applications/OracleServiceCloud-iOS-OracleServiceCloud-1.0.0.ipa";
			File app = new File(app_path);
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "White iPad");
			capabilities.setCapability("platformName", "IOS");
			capabilities.setCapability("platformVersion", "10.2.1");
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "ios");
			capabilities.setCapability("automationName", "XCUITest");
			capabilities.setCapability("noReset", true);
			// capabilities.setCapability("fullReset", true);
			capabilities.setCapability("bundleId", "com.pankanis.apps.osc");
			capabilities.setCapability("xcodeConfigFile",
					"/Users/ronit.joardar/Documents/workspace/ServiceCloudAndroid/appium.xcconfig");
			capabilities.setCapability("udid", "5584d1445eaaef59daaa5c3de97189d8dbe0bde1");
			capabilities.setCapability("updatedWDABundleId", "com.pankanis.demos.WebDriverAgentRunner");
			capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

			IOSElement login = (IOSElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Login']"));
			login.click();
			Thread.sleep(5000);
			break;
		}

	}

	/**
	 * Takes and screenshot of failed test cases and quits the driver session
	 * Runs after every test
	 * 
	 * @param result
	 * @throws Exception
	 */
	@AfterMethod
	public void tear(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {
			captureScreenshot(driver, result.getName());
			System.out.println("Screenshot taken");
		}
		driver.quit();
	}

	/**
	 * Reads data from Excel file based on the sheet name specified in the the
	 * test case data provider method
	 * 
	 * @param testcase
	 * @return
	 * @throws Exception
	 */
	public Object[][] dataProvider(String testcase) throws Exception {
		filePath = System.getProperty("user.dir") + excel_path;
		System.out.println("filepath" + filePath);
		readExcel(filePath);
		int rowNum = getRowCount(testcase);
		int colNum = getCoulumnCount(testcase);

		Object getData[][] = new Object[rowNum - 1][colNum];
		for (int i = 2; i <= rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				getData[i - 2][j] = getCellData(testcase, j, i);
			}
		}
		return getData;
	}

	/**
	 * Starts Appium server runs before test suite
	 * 
	 * @throws Exception
	 */
	@BeforeTest
	public void startAppiumServer() throws Exception {

	/*	ServerArguments serverArguments = new ServerArguments();

		serverArguments.setArgument("--address", "127.0.0.1");

		serverArguments.setArgument("--no-reset", true);

		serverArguments.setArgument("--local-timezone", true);
		_appiumServer = new AppiumServer(new File("/Applications/Appium.app/Contents/Resources/node/bin/node"),
				new File(
						"/Applications/AppiumDesktop.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"),
				serverArguments);
		_appiumServer.startServer();*/
		
		AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
        appiumDriverLocalService = builder.build();
        appiumDriverLocalService.start();

	}

	/**
	 * Stops appium server runs after test suite
	 */
	@AfterTest
	public void test() {
		//_appiumServer.stopServer();
		
		appiumDriverLocalService.stop();
	}

}

package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.TestBase.TestBase;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import junit.framework.Assert;

/**
 * Test scenarios for miscellaneous checks
 * 
 * @author ronit.joardar
 *
 */
public class TS9_MiscChecks extends TestBase {

	public TS9_MiscChecks() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test method to check analytics
	 * 
	 * @throws Exception
	 */
	@Test
	public void analyticsCheck() throws Exception {
		loadMiscChecksElements();
		misc.analyticsIconClick();

	}

	public void syncCheck() throws Exception {
		loadMiscChecksElements();
		misc.syncIconClick();
	}

	public void knowledgeBaseCheck() throws Exception {
		loadMiscChecksElements();
		misc.knowledgebaseIconClick();
		misc.knowledgebaseSelect();

	}

	public void settingsCheck() throws Exception {
		loadMiscChecksElements();
		misc.settingsIcon();
	}

	public void audioTaskCheck() throws Exception {
		loadMiscChecksElements();
		misc.audiotaskIcon();
	}

	public void productScannerCheck() throws Exception {
		loadMiscChecksElements();
		misc.productscannerIcon();
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
	}

	/**
	 * Test method to check DMS, and Card reader in IOS Test method to check
	 * sync, knowledge base , settings and product scanner in Android
	 * 
	 * @throws Exception
	 */
	@Test
	public void MiscTests() throws Exception {
		loadMiscChecksElements();
		if (executionOS.equals(OS.IOS)) {
			verticalScrollToElement(driver);
			dmsIconCheck();
			// healthdataIconCheck();
			cardreaderIconCheck();

		} else if (executionOS.equals(OS.ANDROID)) {
			syncCheck();
			settingsCheck();
			productScannerCheck();
			knowledgeBaseCheck();

		}
	}

	public void dmsIconCheck() throws Exception {
		misc.dmsIcon();
	}

	/**
	 * Test method to check health data in IOS
	 * 
	 * @throws Exception
	 */
	@Test(dependsOnMethods = "MiscTests")
	public void healthdataIconCheck() throws Exception {
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
			loadMiscChecksElements();
			misc.healthdataIcon();
		}
	}

	public void cardreaderIconCheck() throws Exception {
		loadMiscChecksElements();
		misc.cardreaderIcon();
	}
}

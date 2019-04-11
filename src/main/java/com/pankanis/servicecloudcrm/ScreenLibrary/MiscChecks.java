package com.pankanis.servicecloudcrm.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pankanis.servicecloudcrm.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;


/**
 * Defines all the Miscellaneous Mobile Elements and methods to perform actions on them
 * @author ronit.joardar
 *
 */
public class MiscChecks extends TestBase {

	/**
	 * Initialize PageFactory for Miscellaneous page elements
	 * @param driver
	 * @throws Exception
	 */
	public MiscChecks(AppiumDriver<MobileElement> driver) throws Exception {
		 this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver, 2,
	                TimeUnit.SECONDS), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Analytics']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Analytics']")
	MobileElement analyticsIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sync']")
	MobileElement syncIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Knowledge Base']")
	MobileElement knowledgebaseIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	MobileElement settingsIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Audio Task']")
	MobileElement audiotaskIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Product Scanner']")
	MobileElement productscannerIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	MobileElement knowledgebaseOne;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']")
	MobileElement knowledgebaseTwo;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='2']")
	MobileElement knowledgebaseThree;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Back']")
	MobileElement backbtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='DMS']")
	MobileElement dms;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='CardReader']")
	MobileElement cardreader;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='HealthData']")
	MobileElement healthdata;
	
	public void analyticsIconClick()
	{
		analyticsIcon.click();
	}
	public void syncIconClick()
	{
		syncIcon.click();
		backbtn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	public void knowledgebaseIconClick() throws Exception
	{
		knowledgebaseIcon.click();
		Thread.sleep(10000);
		
	}
	public void knowledgebaseSelect()
	{
		knowledgebaseOne.click();
		backbtn.click();
		
	}
	public void settingsIcon()
	{
		settingsIcon.click();
		backbtn.click();
		
	}
	public void audiotaskIcon()
	{
		audiotaskIcon.click();
		backbtn.click();
		
	}
	public void productscannerIcon()
	{
		productscannerIcon.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	public void dmsIcon()
	{
		dms.click();
		backbtn.click();
		
	}
	public void cardreaderIcon()
	{
		cardreader.click();
		backbtn.click();
		
	}
	public void healthdataIcon()
	{if(executionOS.equals(OS.IOS))
	{
		healthdata.click();
		backbtn.click();
		
	}
	else
	{
	Assert.assertTrue(true);
	
		}
	}
	
}

package com.pankanis.servicecloudcrm.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.pankanis.servicecloudcrm.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
/**
 * Defines all the Mobile Elements for subscribing Opportunities and methods to perform actions on them
 * @author ronit.joardar
 *
 */
public class SubscribeOpportunities extends TestBase{
	
	public SubscribeOpportunities(AppiumDriver<MobileElement> driver) throws Exception {
		 this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver, 2,
	                TimeUnit.SECONDS), this);
	}
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Subscribe Opportunities']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Subscribe Opportunities']")
	public MobileElement subscribeIcon;
	
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[@index='0']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]")
	public MobileElement subscribeOne;
	
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[2]")
	public MobileElement subscribeTwo;
	
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[@index='2']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[3]")
	public MobileElement subscribeThree;
	
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[@index='3']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[4]")
	public MobileElement subscribeFour;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@content-desc='Download']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Share']")
	public MobileElement subscribeDownload;
	
	@AndroidFindBy(xpath ="//android.widget.CheckedTextView[@text='Task']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Task']")
	public MobileElement subscribeSubEntitytask;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text='OK']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement subscribeSubEntityOk;
	
	public void subscribeIconClick() throws Exception
	{
		subscribeIcon.click();
		Thread.sleep(3000);
	}
	public void subscribeOrgSelect()
	{
		subscribeOne.click();
		subscribeTwo.click();
		subscribeThree.click();
		subscribeFour.click();
	}
	public void subscribeDownloadClick()
	{
		subscribeDownload.click();
	
	}
	public void subscribeSunEntitySelect()
	{ 
		subscribeSubEntitytask.click();
		
	}
	public void subscribeSubEntityOk()
	{
		subscribeSubEntityOk.click();
	
	}

}

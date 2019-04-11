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
 * Defines all the Mobile Elements for adding and editing a new Organization Incident and methods to perform actions on them
 * @author ronit.joardar
 *
 */
public class OrganizationIncident extends TestBase{

	public OrganizationIncident(AppiumDriver<MobileElement> driver) throws Exception {
		 this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver, 2,
	                TimeUnit.SECONDS), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Organizations']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Organizations']")
	public MobileElement orgIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]")
	public MobileElement orgName;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]")
	public MobileElement incidentName;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Edit']")
	public MobileElement editIncidentBtn;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Incidents\"));")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Incidents']")
	public MobileElement orgIncident;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Add']")
	public MobileElement addIncident;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Name']")
	public MobileElement addIncidentName;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Subject']")
	public MobileElement addIncidentSubject;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.Button[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Select Status']")
	public MobileElement addIncidentStatus;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@value='Waiting']")
	public MobileElement addIncidentStatusSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Save']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement savebtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	public MobileElement okbtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeToolbar/XCUIElementTypeButton[@name='Done']")
	MobileElement keyboardDone;
	
	public void orgIconClick() throws Exception
	{
		orgIcon.click();
		Thread.sleep(5000);
	}
	public void orgNameClick()
	{
		orgName.click();
	}
	public void orgIncidentClick() throws Exception
	{
		orgIncident.click();
		Thread.sleep(3000);
	}
	public void incidentNameClick()
	{
		incidentName.click();
	}
	public void editIncidentBtnClick()
	{
		editIncidentBtn.click();
	}
	public void addIncidentBtnClick()
	{
		addIncident.click();
	}
	public void addIncidentName(String name)
	{
		addIncidentName.sendKeys(name);
	}
	public void addIncidentSubject(String subject)
	{
		addIncidentSubject.sendKeys(subject);
	}
	public void selectIncidentStatus()
	{
		addIncidentStatus.click();
		addIncidentStatusSelect.click();
		if(executionOS.equals(OS.IOS))
		{
		savebtn();
		}
	}
	public void savebtn()
	{
		savebtn.click();
	}
	public void okbtn()
	{
		okbtn.click();
	}
	public void keyboardDone()
	{
		keyboardDone.click();
	}
}


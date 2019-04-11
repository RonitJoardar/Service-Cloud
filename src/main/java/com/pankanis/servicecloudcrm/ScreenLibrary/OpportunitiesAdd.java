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
 * Defines all the Mobile Elements for adding and editing a new Opportunity and methods to perform actions on them
 * @author ronit.joardar
 *
 */
public class OpportunitiesAdd extends TestBase  {

	public OpportunitiesAdd(AppiumDriver<MobileElement> driver) throws Exception {
		 this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver, 2,
	                TimeUnit.SECONDS), this);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Opportunities']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Opportunities']")
	MobileElement oppIcon;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Add']")
	MobileElement OppBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]")
	public MobileElement oppName;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='3']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Edit']")
	MobileElement OppCreateEditBtn;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.EditText[1]")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Name']")
	MobileElement addOppName;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.Button[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Select Organization']")
	public MobileElement addOppOrganization;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@value='Oscorp']")
	public MobileElement addOppOrgSelect;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.Button[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Select Status']")
	public MobileElement addOppStatus;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@value='Lead']")
	public MobileElement addOppStatusSelect;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[4]/android.widget.EditText[1]")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Summary']")
	MobileElement addOppSummary;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Save']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement savebtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	public MobileElement okbtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeToolbar/XCUIElementTypeButton[@name='Done']")
	MobileElement keyboardDone;
	
	public void oppIconClick()
	{
		oppIcon.click();
	}
	
	public void oppBtnClick()
	{
		OppBtn.click();
	}
	
	public void oppNameClick()
	{
		oppName.click();
	}
	
	public void oppCreateEditBtnClick()
	{
		OppCreateEditBtn.click();
	}
	
	public void addOppName(String name)
	{
		addOppName.sendKeys(name);
	}
	
	public void addOppSummary(String summary)
	{
		addOppSummary.sendKeys(summary);
	}
	
	public void addOppOrganization()
	{
		addOppOrganization.click();
	}
	
	public void addOppOrgSelect()
	{
		addOppOrgSelect.click();
		if(executionOS.equals(OS.IOS))
		{
			savebtn.click();
		}
	}
	
	public void addOppStatusSelect()
	{
		addOppStatus.click();
		addOppStatusSelect.click();
		if(executionOS.equals(OS.IOS))
		{
			savebtn.click();
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
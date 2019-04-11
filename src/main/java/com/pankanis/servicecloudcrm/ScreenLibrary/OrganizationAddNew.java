package com.pankanis.servicecloudcrm.ScreenLibrary;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.pankanis.servicecloudcrm.TestBase.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
/**
 * Defines all the Mobile Elements for adding and editing a new Organization and methods to perform actions on them
 * @author ronit.joardar
 *
 */
public class OrganizationAddNew extends TestBase{

	public OrganizationAddNew(AppiumDriver<MobileElement> driver) throws Exception {
		 this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver, 2,
	                TimeUnit.SECONDS), this);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Organizations']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Organizations']")
	public MobileElement orgIcon;
	
	@AndroidFindBy(xpath="//android.support.v7.app.ActionBar.Tab[2]")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Sub']")
	public MobileElement orgSub;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]")
	public MobileElement orgName;
	
	@AndroidFindBy(xpath="//android.support.v7.app.ActionBar.Tab[3]")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='ALL']")
	public MobileElement orgAll;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Add']")
	MobileElement addOrgBtn;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='3']")
	MobileElement createOrgBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Create Organization']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='ALL']")
	MobileElement createOrgPane;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.EditText[1]")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Name']")
	MobileElement createOrgName;
	
	@iOSFindBy(xpath="//XCUIElementTypeToolbar/XCUIElementTypeButton[@name='Done']")
	MobileElement keyboardDone;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Edit']")
	MobileElement iOSEditOrg;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.EditText[1]")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Number Of Employees']")
	MobileElement createOrgEmpNumber;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.EditText[1]")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Street']")
	MobileElement createOrgStreet;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.EditText[1]")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter City']")
	MobileElement createOrgCity;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.EditText[1]")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Postal Code']")
	MobileElement createOrgPost;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Save']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement savebtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	public MobileElement okbtn;
	
	
	
	public void orgIconClick()
	{
		orgIcon.click();
	}
	public void orgNameClick()
	{
		orgName.click();
	}
	public void orgSubClick()
	{
		orgSub.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void orgAllClick() throws Exception
	{
		orgAll.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void keyboardDone()
	{
		keyboardDone.click();
	}
	public void addOrgBtnClick() throws Exception
	{
		addOrgBtn.click();
		Thread.sleep(2000);
	}
	public void iOSEditOrg()
	{
		iOSEditOrg.click();
	}
	public void createOrgBtnClick()
	{
		createOrgBtn.click();
	}
	public void createOrgPaneClick()
	{
		createOrgPane.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	public void createOrgName(String orgname)
	{
		createOrgName.sendKeys(orgname);
	}
	public void createOrgEmpNumber(String org_emp_number)
	{
		createOrgEmpNumber.sendKeys(org_emp_number);
	}
	public void createOrgStreet(String org_street)
	{
		createOrgStreet.sendKeys(org_street);
	}
	public void createOrgCity(String org_city)
	{
		createOrgCity.sendKeys(org_city);
	}
	public void createOrgPost(String org_post)
	{
		createOrgPost.sendKeys(org_post);
	}
	public void savebtnClick()
	{
		savebtn.click();
	}
	public void okbtnClick()
	{
		okbtn.click();
	}
}

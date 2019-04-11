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
 * Defines all the Mobile Elements for adding and editing a new Organization Contact and methods to perform actions on them
 * @author ronit.joardar
 *
 */
public class OrganizationContacts extends TestBase{
	
	public OrganizationContacts(AppiumDriver<MobileElement> driver) throws Exception {
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
	public MobileElement contactName;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Edit']")
	public MobileElement editContactBtn;

	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Contacts\"));")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Contacts']")
	public MobileElement orgContact;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Add']")
	public MobileElement addContactBtn;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter First Name']")
	public MobileElement addContactFirstName;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Last Name']")
	public MobileElement addContactLastName;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Email']")
	public MobileElement addContactEmail;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[4]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Phone']")
	public MobileElement addContactPhone;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='New Contact']")
	public MobileElement addContactHeader;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Street']")
	public MobileElement addContactStreet;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter City']")
	public MobileElement addContactCity;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Postal Code']")
	public MobileElement addContactPost;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Save']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement savebtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	public MobileElement okbtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeToolbar/XCUIElementTypeButton[@name='Done']")
	MobileElement keyboardDone;
	
	public void orgIconClick()
	{
		orgIcon.click();
	}
	public void keyboardDone()
	{
		keyboardDone.click();
	}
	public void orgNameClick()
	{
		orgName.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	public void contactNameClick()
	{
		contactName.click();
	}
	public void editContactBtnClick()
	{
		editContactBtn.click();
	}
	public void orgContactClick()
	{
		orgContact.click();
	}
	public void addContactBtnClick()
	{
		addContactBtn.click();
	}
	public void addContactFirstName(String firstname)
	{
		addContactFirstName.sendKeys(firstname);
	}
	public void addContactLastName(String lastname)
	{
		addContactLastName.sendKeys(lastname);
	}
	public void addContactEmail(String email)
	{
		addContactEmail.sendKeys(email);
	}
	public void addContactPhone(String phone)
	{
		addContactPhone.sendKeys(phone);
	}
	public void addContactHeader()
	{
		addContactHeader.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	public void addContactStreet(String street)
	{
		addContactStreet.sendKeys(street);
	}
	public void addContactCity(String city)
	{
		addContactCity.sendKeys(city);
	}
	public void addContactPost(String post)
	{
		addContactPost.sendKeys(post);
	}
	public void savebtn()
	{
		savebtn.click();
	}
	public void okbtn()
	{
		okbtn.click();
	}
	
	

}

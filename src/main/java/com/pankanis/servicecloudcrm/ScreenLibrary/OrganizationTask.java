package com.pankanis.servicecloudcrm.ScreenLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.pankanis.servicecloudcrm.TestBase.TestBase;
import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
/**
 * Defines all the Mobile Elements for adding and editing a new Organization Task and methods to perform actions on them
 * @author ronit.joardar
 *
 */
public class OrganizationTask extends TestBase{


	public OrganizationTask(AppiumDriver<MobileElement> driver) throws Exception {
		 this.driver = driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver, 2,
	                TimeUnit.SECONDS), this);
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Organizations']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Organizations']")
	public MobileElement orgIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]")
	public MobileElement taskName;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Edit']")
	public MobileElement editTaskBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]")
	public MobileElement orgName;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Tasks\"));")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Tasks']")
	public MobileElement orgTask;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Add']")
	public MobileElement addNewTaskBtn;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Name']")
	public MobileElement addTaskName;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[3]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Percent Complete']")
	public MobileElement addTaskPercent;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.Button[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Select Status']")
	public MobileElement addTaskStatus;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@value='Waiting']")
	public MobileElement addtaskStatusSelect;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[4]/android.widget.EditText[@index='1']")
	@iOSFindBy(xpath="//XCUIElementTypeTextView[@value='Enter Due date']")
	public MobileElement addTaskDueDate;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public MobileElement addTaskDueDateSelect;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Save']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement savebtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	public MobileElement okbtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeToolbar/XCUIElementTypeButton[@name='Done']")
	MobileElement keyboardDone;
	
	public void orgIconClick() throws InterruptedException
	{
		orgIcon.click();
		Thread.sleep(3000);
	}
	public void taskNameClick()
	{
		taskName.click();
	}
	public void editTaskBtnClick()
	{
		editTaskBtn.click();
	}
	public void orgNameClick() throws Exception
	{
		orgName.click();
		Thread.sleep(3000);
	}
	public void orgTaskClick()
	{
		orgTask.click();
	}
	public void addNewTaskBtnClick()
	{
		addNewTaskBtn.click();
	}
	public void addTaskName(String name)
	{
		addTaskName.sendKeys(name);
	}
	public void addTaskPercent(String percent)
	{
		addTaskPercent.sendKeys(percent);
	}
	public void selectTaskStatus()
	{
		addTaskStatus.click();
		addtaskStatusSelect.click();
		if(executionOS.equals(OS.IOS))
		{
		savebtn();
		}
	}
	public void addTaskDueDate()
	{
		addTaskDueDate.click();
		if(executionOS.equals(OS.ANDROID))
		{
		addTaskDueDateSelect.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		addTaskDueDateSelect.click();
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

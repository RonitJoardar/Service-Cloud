package com.pankanis.servicecloudcrm.dataprovider;

import org.testng.annotations.DataProvider;

import com.pankanis.servicecloudcrm.TestBase.TestBase;
import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
/**
 * Contains Data Provider method for passing data while Adding a new Organization Task and a Method to pass text data to the text fields on the add Organization Task screen
 * @author ronit.joardar
 *
 */
public class OrganizationTaskDataProvider extends TestBase{

	public OrganizationTaskDataProvider() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addOrgTaskData(String name, String percent) throws Exception
	{
		loadOrganizationTaskElements();
		orgtask.addTaskName(name);
		if(executionOS.equals(OS.IOS))
		{
			orgtask.keyboardDone();
		}
		orgtask.addTaskPercent(percent);
		if(executionOS.equals(OS.IOS))
		{
			orgtask.keyboardDone();
		}
	}
	
	@DataProvider
	public Object[][] organizationTaskDataProvider() throws Exception
	{
		Object data[][] = dataProvider("OrganizationTask");
		return data;
	}
}

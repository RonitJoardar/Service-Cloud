package com.pankanis.servicecloudcrm.dataprovider;

import org.testng.annotations.DataProvider;

import com.pankanis.servicecloudcrm.TestBase.TestBase;
import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
/**
 * Contains Data Provider method for passing data while Adding a new Opportunity Task and a Method to pass text data to the text fields on the add Opportunity Task screen
 * @author ronit.joardar
 *
 */
public class OpportunitiesTaskDataProvider extends TestBase{

	public OpportunitiesTaskDataProvider() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addOppTaskData(String name, String percent) throws Exception
	{
		loadOpportunitiesTaskElements();
		opptask.addTaskName(name);
		if(executionOS.equals(OS.IOS))
		{
			opptask.keyboardDone();
		}
		opptask.addTaskPercent(percent);
		if(executionOS.equals(OS.IOS))
		{
			opptask.keyboardDone();
		}
	}
	
	@DataProvider
	public Object[][] opportunitiesTaskDataProvider() throws Exception
	{
		Object data[][] = dataProvider("OpportunitiesTask");
		return data;
	}
}

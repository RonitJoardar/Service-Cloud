package com.pankanis.servicecloudcrm.dataprovider;

import org.testng.annotations.DataProvider;

import com.pankanis.servicecloudcrm.TestBase.TestBase;
import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
/**
 * Contains Data Provider method for passing data while Adding a new Organization Incident and a Method to pass text data to the text fields on the add Organization Incident screen
 * @author ronit.joardar
 *
 */
public class OrganizationIncidentDataProvider extends TestBase {
	
	public OrganizationIncidentDataProvider() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void organizationIncidentData(String name, String subject) throws Exception
	{
		loadOrganizationIncidentElements();
		orgincident.addIncidentName(name);
		if(executionOS.equals(OS.IOS))
		{
			orgincident.keyboardDone();
		}
		orgincident.addIncidentSubject(subject);
		if(executionOS.equals(OS.IOS))
		{
			orgincident.keyboardDone();
		}
	}
	
	@DataProvider
	public Object[][] organizationIncidentDataProvider() throws Exception
	{
		Object data[][] = dataProvider("OrganizationIncident");
		return data;
	}

}

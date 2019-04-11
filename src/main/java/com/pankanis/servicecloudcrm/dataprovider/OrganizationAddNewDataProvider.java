package com.pankanis.servicecloudcrm.dataprovider;

import org.testng.annotations.DataProvider;

import com.pankanis.servicecloudcrm.TestBase.TestBase;
/**
 * Contains Data Provider method for passing data while Adding a new Organization and a Method to pass text data to the text fields on the add Organization screen
 * @author ronit.joardar
 *
 */
public class OrganizationAddNewDataProvider extends TestBase {

	
	public OrganizationAddNewDataProvider() throws Exception {
		super();
		
	}

	public void organizationAddNewData(String orgname, String org_emp_number, String org_street, String org_city, String org_post) throws Exception
	{
		
		orgaddnew.createOrgName(orgname);
		if(executionOS.equals(OS.IOS))
		{
			orgaddnew.keyboardDone();
		}
		orgaddnew.createOrgEmpNumber(org_emp_number);
		
		if(executionOS.equals(OS.ANDROID))
		{
			orgaddnew.createOrgPaneClick();
		}
		
		if(executionOS.equals(OS.IOS))
		{
			orgaddnew.keyboardDone();
		}
		orgaddnew.createOrgStreet(org_street);
		if(executionOS.equals(OS.IOS))
		{
			orgaddnew.keyboardDone();
		}
		orgaddnew.createOrgCity(org_city);
		if(executionOS.equals(OS.IOS))
		{
			orgaddnew.keyboardDone();
		}
		orgaddnew.createOrgPost(org_post);
	}
	
	@DataProvider
	public Object[][] organizationAddNewDataProvider() throws Exception
	{
		Object data[][] = dataProvider("OrganizationAddNew");
		return data;
	}
}

package com.pankanis.servicecloudcrm.dataprovider;

import org.testng.annotations.DataProvider;

import com.pankanis.servicecloudcrm.TestBase.TestBase;
import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
/**
 * Contains Data Provider method for passing data while Adding a new Organization Contact and a Method to pass text data to the text fields on the add Organization Contact screen
 * @author ronit.joardar
 *
 */
public class OrganizationContactsDataProvider extends TestBase{
	
	public OrganizationContactsDataProvider() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void organizationContactsData(String firstname, String lastname, String email, String phone, String street, String city,String post) throws Exception
	{
		loadOrganizationContactsElements();
		orgcontact.addContactFirstName(firstname);
		if(executionOS.equals(OS.IOS))
		{
			orgcontact.keyboardDone();
		}
		orgcontact.addContactLastName(lastname);
		if(executionOS.equals(OS.IOS))
		{
			orgcontact.keyboardDone();
		}
		orgcontact.addContactEmail(email);
		if(executionOS.equals(OS.IOS))
		{
			orgcontact.keyboardDone();
		}
		orgcontact.addContactPhone(phone);
		if(executionOS.equals(OS.IOS))
		{
			orgcontact.keyboardDone();
		}
		if(executionOS.equals(OS.ANDROID))
		{
			orgcontact.addContactHeader();
		}
		
		orgcontact.addContactStreet(street);
		if(executionOS.equals(OS.IOS))
		{
			orgcontact.keyboardDone();
		}
		orgcontact.addContactCity(city);
		orgcontact.addContactPost(post);
	}
	
	@DataProvider
	public Object[][] organizationContactsDataProvider() throws Exception
	{
		Object data[][] = dataProvider("OrganizationContacts");
		return data;
	}
}

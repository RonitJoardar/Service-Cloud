package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.dataprovider.OrganizationContactsDataProvider;

public class TS2_OrganizationAddContact extends OrganizationContactsDataProvider {

	public TS2_OrganizationAddContact() throws Exception {
		super();

	}

	/**
	 * Test method to add a new organization contact from My Tab
	 * 
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phone
	 * @param street
	 * @param city
	 * @param post
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationContactsDataProvider", priority = 0)
	public void addOrganizationContactFromMy(String firstname, String lastname, String email, String phone,
			String street, String city, String post) throws Exception {
		loadOrganizationContactsElements();
		orgcontact.orgIconClick();
		try
		{
		if(orgcontact.orgName.isDisplayed())
		{
		
		orgcontact.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgcontact.orgContactClick();
		orgcontact.addContactBtnClick();
		organizationContactsData(firstname, lastname, email, phone, street, city, post);
		orgcontact.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			orgcontact.okbtn();
		}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * Test method to add a new organization contact from Sub Tab
	 * 
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phone
	 * @param street
	 * @param city
	 * @param post
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationContactsDataProvider")
	public void addOrganizationContactFromSub(String firstname, String lastname, String email, String phone,
			String street, String city, String post) throws Exception {

		loadOrganizationContactsElements();
		loadOrganizationAddNewElements();
		orgcontact.orgIconClick();
		orgaddnew.orgSubClick();
		try {
			if (orgcontact.orgName.isDisplayed()) {
				orgcontact.orgNameClick();
				if (executionOS.equals(OS.IOS)) {
					verticalScroll(driver);
				}
				orgcontact.orgContactClick();
				orgcontact.addContactBtnClick();
				organizationContactsData(firstname, lastname, email, phone, street, city, post);
				orgcontact.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					orgcontact.okbtn();
				}
			}
		} catch (Exception e) {
			System.out.println("Contact is not present in sub \n");
		}
	}

	/**
	 * Test method to add a new organization contact from All Tab
	 * 
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phone
	 * @param street
	 * @param city
	 * @param post
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationContactsDataProvider")
	public void addOrganizationContactFromAll(String firstname, String lastname, String email, String phone,
			String street, String city, String post) throws Exception {
		loadOrganizationContactsElements();
		loadOrganizationAddNewElements();
		orgcontact.orgIconClick();
		orgaddnew.orgAllClick();
		try
		{
		if(orgcontact.orgName.isDisplayed())
		{
		orgcontact.orgNameClick();
		Thread.sleep(2000);
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgcontact.orgContactClick();
		orgcontact.addContactBtnClick();
		organizationContactsData(firstname, lastname, email, phone, street, city, post);
		orgcontact.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			orgcontact.okbtn();
		}
		}
		}
		catch(Exception e)
		{
			System.out.println("No Organizations present");
		}
	}

	/**
	 * Test method to edit a new organization contact from My Tab
	 * 
	 * @throws Exception
	 */
	@Test(dependsOnMethods="addOrganizationContactFromMy")
	public void editOrganizationContactFromMy() throws Exception {
		loadOrganizationContactsElements();
		orgcontact.orgIconClick();
		orgcontact.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgcontact.orgContactClick();
		try {

			if (orgcontact.contactName.isDisplayed()) {
				orgcontact.contactNameClick();
				orgcontact.editContactBtnClick();
				orgcontact.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					orgcontact.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Contacts Present");

		}
	}

	/**
	 * Test method to edit a new organization contact from sub Tab
	 * 
	 * @throws Exception
	 */
	@Test(dependsOnMethods="addOrganizationContactFromSub")
	public void editOrganizationContactFromSub() throws Exception {
		loadOrganizationContactsElements();
		loadOrganizationAddNewElements();
		orgcontact.orgIconClick();
		orgaddnew.orgSubClick();
		try {
		orgcontact.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgcontact.orgContactClick();
		

			if (orgcontact.contactName.isDisplayed()) {
				orgcontact.contactNameClick();
				orgcontact.editContactBtnClick();
				orgcontact.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					orgcontact.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Contacts Present");

		}

	}

	/**
	 * Test method to edit a new organization contact from All Tab
	 * 
	 * @throws Exception
	 */
	@Test(dependsOnMethods="addOrganizationContactFromAll")
	public void editOrganizationContactFromAll() throws Exception {
		loadOrganizationContactsElements();
		loadOrganizationAddNewElements();
		orgcontact.orgIconClick();
		orgaddnew.orgAllClick();
		orgcontact.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgcontact.orgContactClick();
		try {

			if (orgcontact.contactName.isDisplayed()) {
				orgcontact.contactNameClick();
				orgcontact.editContactBtnClick();
				orgcontact.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					orgcontact.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Contacts Present");

		}

	}
}

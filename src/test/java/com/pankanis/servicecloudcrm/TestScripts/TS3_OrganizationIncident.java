package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
import com.pankanis.servicecloudcrm.dataprovider.OrganizationIncidentDataProvider;

public class TS3_OrganizationIncident extends OrganizationIncidentDataProvider{

	public TS3_OrganizationIncident() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Test method to add a new organization incident from My Tab
	 * @param name
	 * @param subject
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationIncidentDataProvider", priority = 0)
	public void addOrganizationIncidentFromMy(String name, String subject) throws Exception {
		loadOrganizationIncidentElements();
		orgincident.orgIconClick();
		orgincident.orgNameClick();
		if(executionOS.equals(OS.IOS))
		{
		verticalScroll(driver);
		}
		orgincident.orgIncidentClick();
		orgincident.addIncidentBtnClick();
		organizationIncidentData(name, subject);
		orgincident.selectIncidentStatus();
		orgincident.savebtn();
		if(executionOS.equals(OS.ANDROID))
		{
			orgincident.okbtn();
		}

	}
/**
 * Test method to add a new organization incident from Sub Tab
 * @param name
 * @param subject
 * @throws Exception
 */
	@Test(dataProvider = "organizationIncidentDataProvider")
	public void addOrganizationIncidentFromSub(String name, String subject) throws Exception {
	
		loadOrganizationAddNewElements();
		loadOrganizationIncidentElements();
		orgincident.orgIconClick();
		orgaddnew.orgSubClick();
		try {
		orgincident.orgNameClick();
		if(executionOS.equals(OS.IOS))
		{
		verticalScroll(driver);
		}
		orgincident.orgIncidentClick();
		orgincident.addIncidentBtnClick();
		organizationIncidentData(name, subject);
		orgincident.selectIncidentStatus();
		orgincident.savebtn();
		if(executionOS.equals(OS.ANDROID))
		{
			orgincident.okbtn();
		}}
		catch(Exception e)
		{
			System.out.println("No Organization/Incident Present");
		}
	}
/**
 * Test method to add a new organization incident from All Tab
 * @param name
 * @param subject
 * @throws Exception
 */
	@Test(dataProvider = "organizationIncidentDataProvider")
	public void addOrganizationIncidentFromAll(String name, String subject) throws Exception {
		
		loadOrganizationAddNewElements();
		loadOrganizationIncidentElements();
		orgincident.orgIconClick();
		orgaddnew.orgAllClick();
		orgincident.orgNameClick();
		if(executionOS.equals(OS.IOS))
		{
		verticalScroll(driver);
		}
		orgincident.orgIncidentClick();
		orgincident.addIncidentBtnClick();
		organizationIncidentData(name, subject);
		orgincident.selectIncidentStatus();
		orgincident.savebtn();
		if(executionOS.equals(OS.ANDROID))
		{
			orgincident.okbtn();
		}

	}
/**
 * Test method to Edit a new organization incident from My Tab
 * @throws Exception
 */
	@Test
	public void editOrganizationIncidentFromMy() throws Exception {
		loadOrganizationIncidentElements();
		orgincident.orgIconClick();
		orgincident.orgNameClick();
		if(executionOS.equals(OS.IOS))
		{
		verticalScroll(driver);
		}
		orgincident.orgIncidentClick();
		try {

			if (orgincident.incidentName.isDisplayed()) {
				orgincident.incidentNameClick();
				orgincident.editIncidentBtnClick();
				orgincident.savebtn();
				if(executionOS.equals(OS.ANDROID))
				{
					orgincident.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Incidents Present");

		}
	}
/**
 * Test method to Edit a new organization incident from sub Tab
 * @throws Exception
 */
	@Test
	public void editOrganizationIncidentFromSub() throws Exception {
		loadOrganizationIncidentElements();
		loadOrganizationAddNewElements();
		orgincident.orgIconClick();
		orgaddnew.orgSubClick();
		try {

		orgincident.orgNameClick();
		if(executionOS.equals(OS.IOS))
		{
		verticalScroll(driver);
		}
		orgincident.orgIncidentClick();
		
			if (orgincident.incidentName.isDisplayed()) {
				orgincident.incidentNameClick();
				orgincident.editIncidentBtnClick();
				orgincident.savebtn();
				if(executionOS.equals(OS.ANDROID))
				{
					orgincident.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Incidents Present");

		}

	}
/**
 * Test method to Edit a new organization incident from All Tab
 * @throws Exception
 */
	@Test
	public void editOrganizationIncidentFromAll() throws Exception {
		loadOrganizationAddNewElements();
		loadOrganizationIncidentElements();
		orgincident.orgIconClick();
		orgaddnew.orgAllClick();
		orgincident.orgNameClick();
		if(executionOS.equals(OS.IOS))
		{
		verticalScroll(driver);
		}
		orgincident.orgIncidentClick();
		try {

			if (orgincident.incidentName.isDisplayed()) {
				orgincident.incidentNameClick();
				orgincident.editIncidentBtnClick();
				orgincident.savebtn();
				if(executionOS.equals(OS.ANDROID))
				{
					orgincident.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Incidents Present");

		}

	}
}

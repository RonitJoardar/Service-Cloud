package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.ScreenLibrary.OrganizationAddNew;
import com.pankanis.servicecloudcrm.dataprovider.OrganizationAddNewDataProvider;

public class TS1_OrganizationAdd extends OrganizationAddNewDataProvider {
	public TS1_OrganizationAdd() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test method to add a new organization from My Tab
	 * 
	 * @param orgname
	 * @param org_emp_number
	 * @param org_street
	 * @param org_city
	 * @param org_post
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationAddNewDataProvider", priority = 0)
	public void addNewOrganizationFromMy(String orgname, String org_emp_number, String org_street, String org_city,
			String org_post) throws Exception {
		loadOrganizationAddNewElements();
		orgaddnew.orgIconClick();
		orgaddnew.addOrgBtnClick();
		if (executionOS.equals(OS.ANDROID)) {
			orgaddnew.createOrgBtnClick();
		}
		organizationAddNewData(orgname, org_emp_number, org_street, org_city, org_post);
		orgaddnew.savebtnClick();
		if (executionOS.equals(OS.ANDROID)) {
			orgaddnew.okbtnClick();
		}
	}

	/**
	 * Test method to add a new organization from All Tab
	 * 
	 * @param orgname
	 * @param org_emp_number
	 * @param org_street
	 * @param org_city
	 * @param org_post
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationAddNewDataProvider")
	public void addNewOrganizationFromAll(String orgname, String org_emp_number, String org_street, String org_city,
			String org_post) throws Exception {
		loadOrganizationAddNewElements();
		orgaddnew.orgIconClick();
		orgaddnew.orgAllClick();
		orgaddnew.addOrgBtnClick();
		if (executionOS.equals(OS.ANDROID)) {
			orgaddnew.createOrgBtnClick();
		}
		organizationAddNewData(orgname, org_emp_number, org_street, org_city, org_post);
		orgaddnew.savebtnClick();
		if (executionOS.equals(OS.ANDROID)) {
			orgaddnew.okbtnClick();
		}

	}

	/**
	 * Test method to edit a new organization from All Tab
	 * 
	 * @throws Exception
	 */
	@Test(dependsOnMethods="addNewOrganizationFromAll")
	public void editOrganizationFromAll() throws Exception {

		loadOrganizationAddNewElements();
		orgaddnew.orgIconClick();
		orgaddnew.orgAllClick();
		try {

			if (orgaddnew.orgName.isDisplayed()) {
				orgaddnew.orgNameClick();
				if (executionOS.equals(OS.ANDROID)) {
					orgaddnew.addOrgBtnClick();
					orgaddnew.createOrgBtnClick();
				} else {
					orgaddnew.iOSEditOrg();
				}
				orgaddnew.savebtnClick();
				if (executionOS.equals(OS.ANDROID)) {
					orgaddnew.okbtnClick();
				}

			}
		} catch (Exception e) {

			System.out.println("No Organizations Present");

		}
	}

	/**
	 * Test method to edit a new organization from My Tab
	 * 
	 * @throws Exception
	 */
	@Test(dependsOnMethods="addNewOrganizationFromMy")
	public void editOrganizationFromMy() throws Exception {

		loadOrganizationAddNewElements();
		orgaddnew.orgIconClick();
		try {

			if (orgaddnew.orgName.isDisplayed()) {
				orgaddnew.orgNameClick();
				if (executionOS.equals(OS.ANDROID)) {
					orgaddnew.addOrgBtnClick();
					orgaddnew.createOrgBtnClick();
				} else {
					orgaddnew.iOSEditOrg();
				}
				orgaddnew.savebtnClick();
				if (executionOS.equals(OS.ANDROID)) {
					orgaddnew.okbtnClick();
				}

			}
		} catch (Exception e) {

			System.out.println("No Organizations Present");

		}

	}
}

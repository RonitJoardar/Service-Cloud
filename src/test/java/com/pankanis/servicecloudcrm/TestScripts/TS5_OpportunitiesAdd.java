package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
import com.pankanis.servicecloudcrm.dataprovider.OpportunitiesAddDataProvider;

public class TS5_OpportunitiesAdd extends OpportunitiesAddDataProvider {

	public TS5_OpportunitiesAdd() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test method to add a new Opportunity from My Tab
	 * 
	 * @param name
	 * @param summary
	 * @throws Exception
	 */
	@Test(dataProvider = "opportunitiesAddDataProvider", priority = 0)
	public void addNewOpportunityFromMy(String name, String summary) throws Exception {
		loadOpportunitiesAddElements();
		oppadd.oppIconClick();
		oppadd.oppBtnClick();
		if (executionOS.equals(OS.ANDROID)) {
			oppadd.oppCreateEditBtnClick();

		}
		addOpportunities(name, summary);
		oppadd.addOppOrganization();
		oppadd.addOppOrgSelect();
		oppadd.addOppStatusSelect();
		oppadd.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			oppadd.okbtn();
		}
	}

	/**
	 * Test method to add a new Opportunity from all Tab
	 * 
	 * @param name
	 * @param summary
	 * @throws Exception
	 */

	@Test(dataProvider = "opportunitiesAddDataProvider")
	public void addNewOpportunityFromAll(String name, String summary) throws Exception {
		loadOrganizationAddNewElements();
		loadOpportunitiesAddElements();
		oppadd.oppIconClick();
		orgaddnew.orgAllClick();
		oppadd.oppBtnClick();
		if (executionOS.equals(OS.ANDROID)) {
			oppadd.oppCreateEditBtnClick();

		}
		addOpportunities(name, summary);
		oppadd.addOppOrganization();
		oppadd.addOppOrgSelect();
		oppadd.addOppStatusSelect();
		oppadd.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			oppadd.okbtn();
		}
	}

	/**
	 * Test method to edit a new Opportunity from all Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOpportunityFromAll() throws Exception {

		loadOrganizationAddNewElements();
		loadOpportunitiesAddElements();
		oppadd.oppIconClick();
		orgaddnew.orgAllClick();
		try {

			if (oppadd.oppName.isDisplayed()) {
				oppadd.oppNameClick();
				if (executionOS.equals(OS.ANDROID)) {
					oppadd.oppBtnClick();
				}
				oppadd.oppCreateEditBtnClick();
				oppadd.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					oppadd.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Oppotunities Present");

		}
	}

	/**
	 * Test method to edit a new Opportunity from My Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOrganizationFromMy() throws Exception {

		loadOpportunitiesAddElements();
		loadOrganizationAddNewElements();
		orgaddnew.orgIconClick();
		try {

			if (oppadd.oppName.isDisplayed()) {
				oppadd.oppNameClick();
				if (executionOS.equals(OS.ANDROID)) {
					oppadd.oppBtnClick();
				}
				oppadd.oppCreateEditBtnClick();
				oppadd.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					oppadd.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Oppotunities Present");

		}

	}
}

package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
import com.pankanis.servicecloudcrm.dataprovider.OpportunitiesTaskDataProvider;

public class TS6_OpportunitiesTask extends OpportunitiesTaskDataProvider {

	public TS6_OpportunitiesTask() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test method to add a new Opportunity task from My Tab
	 * 
	 * @param name
	 * @param percent
	 * @throws Exception
	 */
	@Test(dataProvider = "opportunitiesTaskDataProvider", priority = 0)
	public void addOpportinitiesTaskFromMy(String name, String percent) throws Exception {
		loadOpportunitiesTaskElements();
		opptask.oppIconClick();
		opptask.oppName();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		opptask.oppTaskClick();
		opptask.addOppTaskBtn();
		addOppTaskData(name, percent);
		opptask.selectTaskStatus();
		opptask.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			opptask.okbtn();
		}

	}

	/**
	 * Test method to add a new Opportunity task from sub Tab
	 * 
	 * @param name
	 * @param percent
	 * @throws Exception
	 */
	@Test(dataProvider = "opportunitiesTaskDataProvider")
	public void addOpportinitiesTaskFromSub(String name, String percent) throws Exception {

		loadOrganizationAddNewElements();
		loadOpportunitiesTaskElements();
		opptask.oppIconClick();
		orgaddnew.orgSubClick();
		try
		{
		opptask.oppName();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		opptask.oppTaskClick();
		opptask.addOppTaskBtn();
		addOppTaskData(name, percent);
		opptask.selectTaskStatus();
		opptask.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			opptask.okbtn();
		}
		}
		catch(Exception e)
		{
			System.out.println("No Opportunity/Task Present");
		}
	}

	/**
	 * Test method to add a new Opportunity task from All Tab
	 * 
	 * @param name
	 * @param percent
	 * @throws Exception
	 */
	@Test(dataProvider = "opportunitiesTaskDataProvider")
	public void addOpportinitiesTaskFromAll(String name, String percent) throws Exception {

		loadOrganizationAddNewElements();
		loadOpportunitiesTaskElements();
		opptask.oppIconClick();
		orgaddnew.orgAllClick();
		opptask.oppName();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		opptask.oppTaskClick();
		opptask.addOppTaskBtn();
		addOppTaskData(name, percent);
		opptask.selectTaskStatus();
		opptask.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			opptask.okbtn();
		}
	}

	/**
	 * Test method to edit a new Opportunity task from My Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOpportunitiesTaskFromMy() throws Exception {
		loadOpportunitiesTaskElements();
		opptask.oppIconClick();
		opptask.oppName();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		opptask.oppTaskClick();
		try {

			if (opptask.oppTaskName.isDisplayed()) {
				opptask.oppTaskName();
				opptask.editOppTaskBtn();
				opptask.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					opptask.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Tasks Present");

		}
	}

	/**
	 * Test method to edit a new Opportunity task from sub Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOpportunitiesTaskFromSub() throws Exception {

		loadOrganizationAddNewElements();
		loadOpportunitiesTaskElements();
		opptask.oppIconClick();
		orgaddnew.orgSubClick();
		try {

		opptask.oppName();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		opptask.oppTaskClick();
		
			if (opptask.oppTaskName.isDisplayed()) {
				opptask.oppTaskName();
				opptask.editOppTaskBtn();
				opptask.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					opptask.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Tasks Present");

		}
	}

	/**
	 * Test method to edit a new Opportunity task from AllåÏ Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOpportunitiesTaskFromAll() throws Exception {
		loadOrganizationAddNewElements();
		loadOpportunitiesTaskElements();
		opptask.oppIconClick();
		orgaddnew.orgAllClick();
		opptask.oppName();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		opptask.oppTaskClick();
		try {

			if (opptask.oppTaskName.isDisplayed()) {
				opptask.oppTaskName();
				opptask.editOppTaskBtn();
				opptask.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					opptask.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Tasks Present");

		}

	}
}

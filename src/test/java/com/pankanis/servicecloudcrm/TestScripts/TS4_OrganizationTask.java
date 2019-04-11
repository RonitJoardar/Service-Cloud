package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
import com.pankanis.servicecloudcrm.dataprovider.OrganizationTaskDataProvider;

public class TS4_OrganizationTask extends OrganizationTaskDataProvider {

	public TS4_OrganizationTask() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test method to add a new organization task from My Tab
	 * 
	 * @param name
	 * @param percent
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationTaskDataProvider", priority = 0)
	public void addOrganizationTaskFromMy(String name, String percent) throws Exception {
		loadOrganizationTaskElements();
		orgtask.orgIconClick();
		orgtask.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgtask.orgTaskClick();
		orgtask.addNewTaskBtnClick();
		addOrgTaskData(name, percent);
		orgtask.selectTaskStatus();
		if (executionOS.equals(OS.IOS)) {
			orgtask.addTaskDueDate();

			orgtask.keyboardDone();
		}
		orgtask.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			orgtask.okbtn();
		}

	}

	/**
	 * Test method to add a new organization task from Sub Tab
	 * 
	 * @param name
	 * @param percent
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationTaskDataProvider")
	public void addOrganizationTaskFromSub(String name, String percent) throws Exception {

		loadOrganizationAddNewElements();
		loadOrganizationTaskElements();
		orgtask.orgIconClick();
		orgaddnew.orgSubClick();
		try {

		orgtask.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgtask.orgTaskClick();
		orgtask.addNewTaskBtnClick();
		addOrgTaskData(name, percent);
		orgtask.selectTaskStatus();
		
		if (executionOS.equals(OS.IOS)) {
			orgtask.addTaskDueDate();
			orgtask.keyboardDone();
		}
		orgtask.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			orgtask.okbtn();
		}
		}
		catch(Exception e)
		{
			System.out.println("No Organization/Task Present");
		}
	}

	/**
	 * Test method to add a new organization task from All Tab
	 * 
	 * @param name
	 * @param percent
	 * @throws Exception
	 */
	@Test(dataProvider = "organizationTaskDataProvider")
	public void addOrganizationTaskFromAll(String name, String percent) throws Exception {

		loadOrganizationAddNewElements();
		loadOrganizationTaskElements();
		orgtask.orgIconClick();
		orgaddnew.orgAllClick();
		orgtask.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgtask.orgTaskClick();
		orgtask.addNewTaskBtnClick();
		addOrgTaskData(name, percent);
		orgtask.selectTaskStatus();
		if (executionOS.equals(OS.IOS)) {
			orgtask.addTaskDueDate();

			orgtask.keyboardDone();
		}
		orgtask.savebtn();
		if (executionOS.equals(OS.ANDROID)) {
			orgtask.okbtn();
		}
	}

	/**
	 * Test method to edit a organization task from My Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOrganizationTaskFromMy() throws Exception {
		loadOrganizationTaskElements();
		orgtask.orgIconClick();
		orgtask.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgtask.orgTaskClick();
		try {

			if (orgtask.taskName.isDisplayed()) {
				orgtask.taskNameClick();
				orgtask.editTaskBtnClick();
				orgtask.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					orgtask.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Tasks Present");

		}
	}

	/**
	 * Test method to edit a organization task from Sub Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOrganizationTaskFromSub() throws Exception {

		loadOrganizationAddNewElements();
		loadOrganizationTaskElements();
		orgtask.orgIconClick();
		orgaddnew.orgSubClick();
		try {

		orgtask.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgtask.orgTaskClick();

			if (orgtask.taskName.isDisplayed()) {
				orgtask.taskNameClick();
				orgtask.editTaskBtnClick();
				orgtask.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					orgtask.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Tasks Present");

		}

	}

	/**
	 * Test method to edit a organization task from All Tab
	 * 
	 * @throws Exception
	 */
	@Test
	public void editOrganizationTaskFromAll() throws Exception {
		loadOrganizationAddNewElements();
		loadOrganizationTaskElements();
		orgtask.orgIconClick();
		orgaddnew.orgAllClick();
		orgtask.orgNameClick();
		if (executionOS.equals(OS.IOS)) {
			verticalScroll(driver);
		}
		orgtask.orgTaskClick();
		try {

			if (orgtask.taskName.isDisplayed()) {
				orgtask.taskNameClick();
				orgtask.editTaskBtnClick();
				orgtask.savebtn();
				if (executionOS.equals(OS.ANDROID)) {
					orgtask.okbtn();
				}
			}

		} catch (Exception e) {

			System.out.println("No Tasks Present");

		}

	}
}

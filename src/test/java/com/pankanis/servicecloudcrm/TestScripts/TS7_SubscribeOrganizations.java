package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.TestBase.TestBase;

import org.testng.annotations.Test;

public class TS7_SubscribeOrganizations extends TestBase {

	public TS7_SubscribeOrganizations() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test method to subscribe organizations
	 * 
	 * @throws Exception
	 */
	@Test
	public void subscribeOrganizations() throws Exception {
		loadSubscribeOrganizationsElements();
		suborg.subscribeIconClick();
		suborg.subscribeOrgSelect();
		suborg.subscribeDownloadClick();
		suborg.subscribeSunEntitySelect();
		suborg.subscribeSubEntityOk();
	}

}

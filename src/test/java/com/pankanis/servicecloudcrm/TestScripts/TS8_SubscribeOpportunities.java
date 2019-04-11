package com.pankanis.servicecloudcrm.TestScripts;

import org.testng.annotations.Test;

import com.pankanis.servicecloudcrm.TestBase.TestBase;

import org.testng.annotations.Test;

public class TS8_SubscribeOpportunities extends TestBase {
	public TS8_SubscribeOpportunities() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Test method to subscribe opportunities
	 * 
	 * @throws Exception
	 */
	@Test
	public void subscribeOpportunities() throws Exception {
		loadSubscribeOpportunitiesElements();
		subopp.subscribeIconClick();
		subopp.subscribeOrgSelect();
		subopp.subscribeDownloadClick();
		subopp.subscribeSunEntitySelect();
		subopp.subscribeSubEntityOk();
	}

}

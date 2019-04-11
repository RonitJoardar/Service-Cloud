package com.pankanis.servicecloudcrm.dataprovider;

import org.testng.annotations.DataProvider;


import com.pankanis.servicecloudcrm.TestBase.TestBase;
import com.pankanis.servicecloudcrm.TestBase.TestBase.OS;
/**
 * Contains Data Provider method for passing data while Adding a new Opportunity and a Method to pass text data to the text fields on the add Opportunity screen
 * @author ronit.joardar
 *
 */
public class OpportunitiesAddDataProvider extends TestBase {
	
	public OpportunitiesAddDataProvider() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addOpportunities(String name, String summary) throws Exception
	{
		
		loadOpportunitiesAddElements();
		oppadd.addOppName(name);
		if(executionOS.equals(OS.IOS))
		{
			oppadd.keyboardDone();
		}
		oppadd.addOppSummary(summary);
		if(executionOS.equals(OS.IOS))
		{
			oppadd.keyboardDone();
		}
		
	}
	
	@DataProvider
	public Object[][] opportunitiesAddDataProvider() throws Exception
	{
		Object[][] data=dataProvider("OpportunitiesAdd");
		return data;
		
	}
}

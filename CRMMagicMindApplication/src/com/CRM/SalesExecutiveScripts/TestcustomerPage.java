package com.CRM.SalesExecutiveScripts;

import org.testng.annotations.Test;

import com.CRM.SalesExecutivePages.CustomerPage;
import com.CRM.SalesExecutivePages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestcustomerPage extends BaseTest {
	
	@Test
	public void addcustomer()
	{
		LoginPage se=new LoginPage(driver);
		se.clickloginpage();
		
		
		CustomerPage  sp=new CustomerPage(driver);
		sp.clicksom();
		sp.clickPackageType();
		sp.clickpackageList();
		
		driver.switchTo().frame(0);
		sp.last();
		driver.switchTo().defaultContent();
		
		sp.ClickCurrencycode();
		sp.clickSubmit();
	}

	
	 
}

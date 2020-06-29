package com.CRM.AMScripts;

import org.testng.annotations.Test;

import com.CRM.AMPages.FinanacePage;
import com.CRM.AMPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestFinancePage extends BaseTest {
	
	@Test
	public void FinancePageTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		FinanacePage fp=new FinanacePage(driver);
		
		//For Add Invoice
//		fp.clickFinance();
//		fp.clickAddInvoice();;
//		fp.clickcustomerName();
//		fp.clickSearchCustomerName();
//		
		//For MyInvoice
		fp.clickMyInvoice();
	}

}

package com.CRM.SalesManagerScripts;

import org.testng.annotations.Test;

import com.CRM.SalesManagerPages.CustomerPage;
import com.CRM.SalesManagerPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestCustomerPage extends BaseTest {
	
	@Test
	public void CustomerPageTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		CustomerPage cp=new CustomerPage(driver);
		cp.clickCustomer();
		//cp.clickMyCustomer();
		//cp.clickNotification();
		//cp.clickMessage();
		//cp.ClickRecord();
		cp.clickAllCustomer();
	}

}

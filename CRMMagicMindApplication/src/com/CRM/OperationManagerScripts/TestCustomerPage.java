package com.CRM.OperationManagerScripts;

import org.testng.annotations.Test;

import com.CRM.OperationManagerPages.CustomerPage;
import com.CRM.OperationManagerPages.LoginPage;
import com.CRM.generics.BaseTest;
import com.CRM.generics.FwUtils;

public class TestCustomerPage extends BaseTest {
	
	
	@Test
	public void CustomerPageTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		
		CustomerPage cp=new CustomerPage(driver);
		cp.clickcustomer();
		
		cp.clickAllCustomer();
		
	}

}

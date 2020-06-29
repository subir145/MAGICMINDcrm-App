package com.CRM.SalesHeadScripts;

import org.testng.annotations.Test;

import com.CRM.SalesHeadPages.AssignedCustomerPage;
import com.CRM.SalesHeadPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestAssignedcustomerPage extends BaseTest {
	
	@Test
	public void assigned()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		AssignedCustomerPage   ap= new AssignedCustomerPage(driver);
		ap.clickcustomer();
		ap.clickAssignedcustomer();
		ap.clickviewCustomer();
	
	}

}

package com.CRM.ADMINscripts;

import org.testng.annotations.Test;

import com.CRM.ADMINpages.CustomerPage;
import com.CRM.ADMINpages.LoginPage;

import com.CRM.generics.BaseTest;

public class TestCustomer extends BaseTest {
	
	@Test
	public void CustomeTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		CustomerPage cp=new CustomerPage(driver);
		cp.ClickCustomer();
		Thread.sleep(2000);
		cp.ClickUnassignedCustomer();
		cp.clickAction();
		Thread.sleep(2000);
		cp.ClickAssignTo();
		cp.clickSearchAssignTo();
		driver.switchTo().frame(0);
		cp.ClickComment();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	    cp.ClickSubmit();
		
		
		
	}

}

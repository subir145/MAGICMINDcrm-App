package com.CRM.ADMINscripts;

import org.testng.annotations.Test;

import com.CRM.ADMINpages.LoginPage;
import com.CRM.ADMINpages.UsersPage;
import com.CRM.generics.BaseTest;

public class TestUsers extends BaseTest {
	
	@Test
	public void UsersTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		UsersPage up=new UsersPage(driver);
		up.ClickUsers();
	}

}

package com.CRM.ADMINscripts;

import org.testng.annotations.Test;

import com.CRM.ADMINpages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLogin extends BaseTest {
	
	@Test
	public void LoginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
	}

}

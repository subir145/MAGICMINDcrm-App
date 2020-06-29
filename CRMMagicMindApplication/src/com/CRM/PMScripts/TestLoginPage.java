package com.CRM.PMScripts;

import org.testng.annotations.Test;

import com.CRM.PMPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	
	@Test
	public void LoginPageTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
	}

}

package com.CRM.PMmarketingScripts;

import org.testng.annotations.Test;

import com.CRM.PMmarketingPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	
	@Test
	public void loginPageTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
	}

}

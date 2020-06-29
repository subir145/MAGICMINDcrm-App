package com.CRM.SalesQualityScripts;

import org.testng.annotations.Test;

import com.CRM.SalesQualityPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	
	@Test
	public void LoginPageQuality()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
	}

}

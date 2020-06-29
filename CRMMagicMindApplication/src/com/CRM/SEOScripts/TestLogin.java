package com.CRM.SEOScripts;

import org.testng.annotations.Test;

import com.CRM.SEOPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLogin extends BaseTest {
	
	@Test
	public void LoginTest()
	{
			LoginPage lp=new LoginPage(driver);
			lp.clickloginpage();
	}

}

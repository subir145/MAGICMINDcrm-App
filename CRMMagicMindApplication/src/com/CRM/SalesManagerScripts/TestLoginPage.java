package com.CRM.SalesManagerScripts;

import org.testng.annotations.Test;

import com.CRM.SalesManagerPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	
	@Test
	public void LoginPageTest()
	{
	   LoginPage lp=new LoginPage(driver);
	   lp.clickloginpage();
	}

}

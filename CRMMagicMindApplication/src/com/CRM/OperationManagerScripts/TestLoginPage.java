package com.CRM.OperationManagerScripts;

import org.testng.annotations.Test;

import com.CRM.OperationManagerPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	
	@Test
	public void LoginPageTest()
	{
		LoginPage   lp= new LoginPage(driver);
		lp.clickloginpage();
	}

}

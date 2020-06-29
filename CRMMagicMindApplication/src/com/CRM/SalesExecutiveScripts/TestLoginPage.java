package com.CRM.SalesExecutiveScripts;

import org.testng.annotations.Test;

import com.CRM.SalesExecutivePages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	
	 @Test
	 public void seLogin()
	 {
		 //String un= FwUtils.read_xl_data(XL_DATA_PATH,"LoginPage",1,0);
		// String pw= FwUtils.read_xl_data(XL_DATA_PATH,"LoginPage",1,1);
		 
		 
		 LoginPage se=new LoginPage(driver);
		 se.clickloginpage();
	 }

}

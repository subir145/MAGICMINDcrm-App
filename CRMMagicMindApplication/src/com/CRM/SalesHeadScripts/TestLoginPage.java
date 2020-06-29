package com.CRM.SalesHeadScripts;

import org.testng.annotations.Test;

import com.CRM.SalesHeadPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	
	 @Test
	 public void seLogin()
	 {
		 //String un= FwUtils.read_xl_data(XL_DATA_PATH,"LoginPage",1,0);
		// String pw= FwUtils.read_xl_data(XL_DATA_PATH,"LoginPage",1,1);
		 
		 
		LoginPage  lp=new LoginPage(driver);
		lp.clickloginpage();
	 }

}

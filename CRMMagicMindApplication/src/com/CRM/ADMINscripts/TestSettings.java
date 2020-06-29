package com.CRM.ADMINscripts;

import org.testng.annotations.Test;

import com.CRM.ADMINpages.LoginPage;
import com.CRM.ADMINpages.SettingsPage;
import com.CRM.generics.BaseTest;

public class TestSettings extends BaseTest {
	
	@Test
	public void SettingsTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		SettingsPage sp=new SettingsPage(driver);
//		sp.ClickSettings();
//		sp.ClickManageRole();
//		sp.ClickAdmin();
//		
		//For Services
//		sp.ClickSettings();
//		sp.ClickServices();
//		sp.ClickAddPackage();
		
		//For TargetManagement
		sp.ClickSettings();
		sp.clickTargetManagement();
	}

}

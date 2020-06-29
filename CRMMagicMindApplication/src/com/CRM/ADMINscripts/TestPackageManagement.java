package com.CRM.ADMINscripts;

import org.testng.annotations.Test;

import com.CRM.ADMINpages.LoginPage;
import com.CRM.ADMINpages.PackageManagementPage;
import com.CRM.generics.BaseTest;

public class TestPackageManagement extends BaseTest {
	
	@Test
	public void PackageManagementTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		PackageManagementPage pm=new PackageManagementPage(driver);
		pm.ClickPackageManagement();
//		pm.ClickPackage();
//		pm.clickActionView();
//		Thread.sleep(2000);
//		pm.clickClose();
		pm.ClickPackageServices();
		pm.ClickStarupPackage();
		Thread.sleep(2000);
		pm.ClickWritePackage();
		pm.clickStartActionplan();
		pm.WriteStartActionPlan();
		Thread.sleep(2000);
		pm.ClickSubmit();
	}

}

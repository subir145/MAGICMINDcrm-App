package com.CRM.SalesManagerScripts;

import org.testng.annotations.Test;

import com.CRM.SalesManagerPages.BusinessPage;
import com.CRM.SalesManagerPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest {
	
	@Test
	public void BusinessPageTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		BusinessPage bp= new BusinessPage(driver);
		bp.clickBusiness();
		bp.ClickAcceptedBusiness();
		//bp.clickAssignName();
		//bp.clickSearchAssignName();
		//Thread.sleep(2000);
		bp.clickViewBusiness();
	}

}

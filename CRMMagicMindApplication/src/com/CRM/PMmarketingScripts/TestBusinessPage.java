package com.CRM.PMmarketingScripts;

import org.testng.annotations.Test;

import com.CRM.PMmarketingPages.BusinessPage;
import com.CRM.PMmarketingPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest {
	
	@Test
	public void BusinessPageTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		BusinessPage bp=new BusinessPage(driver);
		bp.clickBusiness();
		bp.clickProjectAssignedToMe();
		//bp.clickUsers();
	}

}

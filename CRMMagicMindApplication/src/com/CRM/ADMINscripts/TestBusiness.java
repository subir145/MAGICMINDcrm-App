package com.CRM.ADMINscripts;

import org.testng.annotations.Test;

import com.CRM.ADMINpages.BusinessPage;
import com.CRM.ADMINpages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusiness extends BaseTest {
	
	@Test
	public void BusinessTest()
	{
       LoginPage lp=new LoginPage(driver);
       lp.clickloginpage();
       
       
       BusinessPage bp=new BusinessPage(driver);
       bp.clickBusiness();
       bp.clickAllBusiness();
       bp.clickAction();
	}

}

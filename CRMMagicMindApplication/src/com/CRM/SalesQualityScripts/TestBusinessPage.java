package com.CRM.SalesQualityScripts;

import org.testng.annotations.Test;

import com.CRM.SalesQualityPages.BusinessPage;
import com.CRM.SalesQualityPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest {
	
	 @Test
	 public void BusinessPageTest() throws InterruptedException
	 {
		 LoginPage lp=new LoginPage(driver);
			lp.clickloginpage();
			
			
			BusinessPage bp=new BusinessPage(driver);
			bp.clickBusinessPage();
			bp.clickAllBusiness();
			bp.ClickChangestatus();
			Thread.sleep(2000);
			bp.clickstatus();
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			bp.ClickAssignTo();
			driver.switchTo().frame(0);
			bp.ClickDesc();
			driver.switchTo().defaultContent();
			bp.clickSubmit();
			
	 }

}

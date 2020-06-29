package com.CRM.AMScripts;

import org.testng.annotations.Test;

import com.CRM.AMPages.BusinessPage;
import com.CRM.AMPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest  {
	
	@Test
	public void BusinessPageTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		//For Add Business
		BusinessPage bp=new BusinessPage(driver);
//		bp.clicksbmt();
//		bp.clickcust();
//		bp.clickcustomername();
//		bp.clickpckgtype();
//		bp.clickStartDate();
//		bp.ClickEndDate();
//		driver.switchTo().frame(0);
//		bp.last();
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		bp.clicksubmit();
		
		//For My Business
		//bp.clickBusinesspage();
		
		//For BusinessAssignedToMe
		bp.clickBusinessAssignedToMe();
		
	}

}

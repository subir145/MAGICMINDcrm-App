package com.CRM.PMScripts;

import org.testng.annotations.Test;

import com.CRM.PMPages.BusinessPage;
import com.CRM.PMPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest {
	
	@Test
	public void BusinessPageTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		BusinessPage bp=new BusinessPage(driver);
		bp.clickBusiness();
		bp.clickBusinessAssignedToMe();
		bp.clickAction();
		bp.clickMilestone();
		Thread.sleep(2000);
		bp.clickPurpose();
		bp.clickDeliveryDate();
		bp.clickStatus();
		bp.clickSearchStatus();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		bp.clickdesc();
		driver.switchTo().defaultContent();
		bp.clickSubmit();
	}

}

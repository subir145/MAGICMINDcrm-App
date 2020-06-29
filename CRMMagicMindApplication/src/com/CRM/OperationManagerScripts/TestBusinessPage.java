package com.CRM.OperationManagerScripts;

import org.testng.annotations.Test;

import com.CRM.OperationManagerPages.BusinessPage;
import com.CRM.OperationManagerPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest {
	
	@Test
	public void BusinessPageTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		BusinessPage bp=new BusinessPage(driver);
		bp.clickBusiness();
		bp.clickAllBusiness();
		
		//For Approved status
//		bp.clickstatus();
//		Thread.sleep(2000);
//		bp.clickInnerStatus();
//		Thread.sleep(2000);
//		bp.clickSlider();
//		driver.switchTo().frame(0);
//		bp.clickDesc();
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		bp.clickSubmit();
//		
		
		//For Rejected Status
		
		bp.clickRejected();
		bp.clickRejectstatus();
		Thread.sleep(2000);
		bp.clickChangeRejectStatus();
		bp.clickAss();
		bp.clickParticularAssignTo();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		bp.clickCommentSection();
		driver.switchTo().defaultContent();
		bp.clickRejectedPageSubmit();

	}

}

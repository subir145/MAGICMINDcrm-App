package com.CRM.DEVELOPERscripts;

import org.testng.annotations.Test;

import com.CRM.DEVELOPERpages.LoginPage;
import com.CRM.DEVELOPERpages.TaskPage;
import com.CRM.generics.BaseTest;

public class TestTask extends BaseTest {
	
	@Test
	public void TaskTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		TaskPage tp=new TaskPage(driver);
		tp.clickTask();
		tp.clickTaskAssignedToMe();
		tp.clickAction();
		Thread.sleep(2000);
		tp.clickChangeStatus();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		tp.clickDesc();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		tp.clickRangeSlider(driver);
		
		tp.clickAddComment();
	}

}

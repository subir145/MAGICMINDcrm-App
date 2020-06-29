package com.CRM.PMScripts;

import org.testng.annotations.Test;

import com.CRM.PMPages.LoginPage;
import com.CRM.PMPages.TaskPage;
import com.CRM.generics.BaseTest;

public class TestTask extends BaseTest {
	
	@Test
	public void TaskTest() throws InterruptedException
	{
		LoginPage lp =new LoginPage(driver);
		lp.clickloginpage();
		
		TaskPage tp=new TaskPage(driver);
//		tp.clickTask();
//		tp.clickAddTask();
//		tp.clickBusinessName();
//		tp.clickSearchBusinessName();
//		tp.clickProjectName();
//		tp.clickSearchProjectName();
//		tp.clickTitle();
//		tp.clickStatus();
//		tp.clicksearchstatus();
//		driver.switchTo().frame(0);
//		tp.clickDesc();
//		driver.switchTo().defaultContent();
//	    Thread.sleep(2000);
//	    tp.clickStartDate();
//	    tp.clickEndDate();
//	    tp.clickAssignTo();
//	    Thread.sleep(2000);
//	    tp.clickSearchAssignTo();
//	    Thread.sleep(2000);
//	    tp.clickpriority();
//	    tp.clickSubmit();
		
		//For My task
//		tp.clickTask();
//		tp.clickMyTask();
//		tp.ClickViewTask();
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		tp.clickdesc();
//		driver.switchTo().defaultContent();
//		tp.clickAddComment();
//		
		//For TaskBoard
		tp.clickTask();
		tp.clickTaskBoard();
	}

}

package com.CRM.SEOScripts;

import org.testng.annotations.Test;

import com.CRM.SEOPages.LoginPage;
import com.CRM.SEOPages.TaskPage;
import com.CRM.generics.BaseTest;

public class TestTask extends BaseTest {
	
	@Test
	public void TaskTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		TaskPage tp=new TaskPage(driver);
		tp.clickTask();
		tp.clickTaskAssignedToMe();
		
			
		
	}

}

package com.CRM.SalesHeadScripts;

import org.testng.annotations.Test;

import com.CRM.SalesExecutivePages.CallBackDetails;
import com.CRM.SalesExecutivePages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestCallBackDetails extends BaseTest {
	
	@Test
	public void TestCallBack()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		CallBackDetails  cb=new CallBackDetails(driver);
		
		//For add callback
		
//		cb.addcallBack();
//		driver.switchTo().frame(0);
//		cb.ClickDesc();
//		driver.switchTo().defaultContent();
//		cb.clicksubmit();
		
		
		//For view callback
		
		cb.clickViewcallback();
	}

}

package com.CRM.SalesQualityScripts;

import org.testng.annotations.Test;

import com.CRM.SalesQualityPages.CallDetailsPage;
import com.CRM.SalesQualityPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestCallDetails extends BaseTest {
	
	@Test
	public void callDetailsBack()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		CallDetailsPage  cb=new CallDetailsPage(driver);
		
		//For add callback
		
//		cb.addcallBack();
//		driver.switchTo().frame(0);
//		cb.ClickDesc();
//		driver.switchTo().defaultContent();
//		cb.clicksubmit();
//		
		
		//For view callback
		
		cb.clickViewcallback();
	}

	}
	
	



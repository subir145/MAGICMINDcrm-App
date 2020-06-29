package com.CRM.SalesHeadScripts;

import org.testng.annotations.Test;

import com.CRM.SalesHeadPages.BusinessPage;
import com.CRM.SalesHeadPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest
{
	
	@Test
	public void businessPage()
	{
		LoginPage  lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		BusinessPage  sb=new BusinessPage(driver);
		sb.clicksbmt();	
		sb.clickcust();
		sb.clickcustomername();
		sb.clickpckgtype();
		
		driver.switchTo().frame(0);
		sb.last();
		driver.switchTo().defaultContent();
		
		sb.clicksubmit();
	}

}

package com.CRM.SalesExecutiveScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.CRM.SalesExecutivePages.BusinessPage;
import com.CRM.SalesExecutivePages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestBusinessPage extends BaseTest {
	
	
	@Test
	public void BsnsPage()
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

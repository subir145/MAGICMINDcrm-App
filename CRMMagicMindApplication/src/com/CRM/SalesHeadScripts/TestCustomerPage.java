package com.CRM.SalesHeadScripts;

import org.testng.annotations.Test;

import com.CRM.SalesHeadPages.CustomerPage;
import com.CRM.SalesHeadPages.LoginPage;
import com.CRM.generics.BaseTest;



public class TestCustomerPage extends BaseTest {
	
	@Test
	public void customerclick()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		CustomerPage  sp=new CustomerPage(driver);
		sp.clicksom();
		sp.clickPackageType();
		sp.clickpackageList();
		
		driver.switchTo().frame(0);
		sp.last();
		driver.switchTo().defaultContent();
		
		sp.ClickCurrencycode();
		sp.clickSubmit();
	}

}

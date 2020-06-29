package com.CRM.AMScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.CRM.AMPages.CustomerPage;
import com.CRM.AMPages.LoginPage;
import com.CRM.generics.BaseTest;

public class TestCustomerPage extends BaseTest {
	@Test
	public void CustomerPageTest() 
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		CustomerPage cp=new CustomerPage(driver);
		//For Add Customer
 		cp.clicksom();
		cp.clickPackageType();
		cp.clickpackageList();
		driver.switchTo().frame(0);
		cp.last();
		driver.switchTo().defaultContent();
		cp.chooseFile();
		cp.ClickCurrencycode();
		cp.clickSubmit();
		
		
		//For My Customer
		//cp.clickMyCustomer();
		
		
		//For AllCustomer
		//cp.clickAllCustomer();
	}

}

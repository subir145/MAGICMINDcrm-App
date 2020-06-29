package com.CRM.ADMINscripts;

import org.testng.annotations.Test;

import com.CRM.ADMINpages.LoginPage;
import com.CRM.ADMINpages.MailPage;
import com.CRM.generics.BaseTest;

public class TestMail extends BaseTest {
	
	@Test
	public void MailTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		MailPage mp=new MailPage(driver);
//		mp.clickMail();
//		mp.clickActionView();
//		Thread.sleep(2000);
//		mp.ClickClose();
		
		
		//For Action Click
		mp.clickMail();
		mp.clickActionEdit();
	}

}

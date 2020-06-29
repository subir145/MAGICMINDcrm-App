package com.CRM.SalesExecutiveScripts;

import org.testng.annotations.Test;

import com.CRM.SalesExecutivePages.LoginPage;
import com.CRM.SalesExecutivePages.TicketPage;
import com.CRM.generics.BaseTest;

public class TestTicket extends BaseTest {
	
	@Test
	public void TicketVerify() throws InterruptedException
	
{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		TicketPage Tp=new TicketPage(driver);

		Tp.clickonTicket();
		
		//For add Ticket
		
	Tp.clickaddticket();
		
		
		driver.switchTo().frame(0);
		
		Tp.clickdesc();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		Tp.clickassSubmit();
		
		
		//For createdByme
		
		
//		Tp.clickcreatedByMe();
//		//Tp.clickViewTicket();
//		Tp.clickEditTicket();
//		
//		Tp.clickStatus();
	}

}

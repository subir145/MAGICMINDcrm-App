package com.CRM.SalesHeadScripts;

import org.testng.annotations.Test;

import com.CRM.SalesHeadPages.LoginPage;
import com.CRM.SalesHeadPages.TicketPage;
import com.CRM.generics.BaseTest;

public class TestTicket extends BaseTest {
	
	@Test
	public void shTicket()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		TicketPage Tp = new TicketPage(driver);

		Tp.clickonTicket();
		
		//For add Ticket
//		
//		Tp.clickaddticket();
//		
//		
//	driver.switchTo().frame(0);
//		
//		Tp.clickdesc();
//		driver.switchTo().defaultContent();
//		
//		Tp.clickassSubmit();
//		
		
		//For createdByme
		
	
	Tp.clickcreatedByMe();
	//Tp.clickViewTicket();
		Tp.clickEditTicket();
	
	Tp.clickStatus();
	}
	}



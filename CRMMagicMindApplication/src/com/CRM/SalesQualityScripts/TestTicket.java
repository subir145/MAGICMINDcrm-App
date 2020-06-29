package com.CRM.SalesQualityScripts;

import org.testng.annotations.Test;

import com.CRM.SalesQualityPages.LoginPage;
import com.CRM.SalesQualityPages.TicketPage;
import com.CRM.generics.BaseTest;

public class TestTicket extends BaseTest {
	
	@Test
	public void TicketTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		TicketPage Tp = new TicketPage(driver);

		Tp.clickonTicket();
		
		//For add Ticket
		
		Tp.clickaddticket();
		Thread.sleep(2000);
		Tp.clickTicketsubject();
		Thread.sleep(2000);
		Tp.clickBusinessName();
		
		
	driver.switchTo().frame(0);
		
		Tp.clickdesc();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		Tp.clickassSubmit();
	
		
		Tp.clicksubmit();
		
		//For createdByme
		
	
	//Tp.clickcreatedByMe();
	//Tp.clickViewTicket();
		//Tp.clickEditTicket();
	
	//Tp.clickStatus();
	}
	}



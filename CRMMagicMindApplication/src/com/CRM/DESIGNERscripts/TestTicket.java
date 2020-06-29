package com.CRM.DESIGNERscripts;

import org.testng.annotations.Test;

import com.CRM.DESIGNERpages.LoginPage;
import com.CRM.DESIGNERpages.TicketPage;
import com.CRM.generics.BaseTest;

public class TestTicket extends BaseTest {
	
	@Test
	public void TicketTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		
		TicketPage tp=new TicketPage(driver);
//		tp.clickonTicket();
//		tp.clickaddticket();
//		tp.ClickBusinessName();
//		tp.SearchBusinessName();
//		
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		tp.clickdesc();
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		tp.clickassSubmit();
//		
		
		
		//For createdByme
		//tp.clickonTicket();
	
		//tp.clickcreatedByMe();
//		tp.clickViewStatus();
//		tp.clickReassign();
//		tp.clickSearchReAssign();
//		driver.switchTo().frame(0);
//		tp.clickdesc();
//		driver.switchTo().defaultContent();
//		tp.clickReAssignAnother();
		
		
		//For AssignedToMe
		
		tp.clickonTicket();
		Thread.sleep(2000);
		tp.clickAssignToMe();
		
		
		//For Users
		//tp.clickUsers();
		
	//}
	}

}

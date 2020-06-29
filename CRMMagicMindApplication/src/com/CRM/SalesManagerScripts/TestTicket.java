package com.CRM.SalesManagerScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.CRM.SalesManagerPages.LoginPage;
import com.CRM.SalesManagerPages.TicketPage;
import com.CRM.generics.BaseTest;

public class TestTicket extends BaseTest {
	
	 @Test
	 public void TicketTest() throws IOException, InterruptedException
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.clickloginpage();
		 
		 TicketPage tp=new TicketPage(driver);
		 tp.clickonTicket();
		 tp.clickaddticket();
		 driver.switchTo().frame(0);
		 tp.clickdesc();
		 driver.switchTo().defaultContent();
		
		 tp.clickassSubmit();
		 Thread.sleep(2000);
		 tp.clickUploadFile(driver);
		 
		 tp.clickAddTicketSubmit();
	 }

}

package com.CRM.PMScripts;

import org.testng.annotations.Test;

import com.CRM.PMPages.LoginPage;
import com.CRM.PMPages.MilestonePage;
import com.CRM.generics.BaseTest;

public class TestMilstone extends BaseTest {
	
	
	@Test
	public void MilestoneTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		MilestonePage mp=new MilestonePage(driver);
		mp.clickMilestone();
		mp.clickMilestoneList();
	}

}

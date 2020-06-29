package com.CRM.PMmarketingScripts;

import org.testng.annotations.Test;

import com.CRM.PMmarketingPages.LoginPage;
import com.CRM.PMmarketingPages.UserPage;
import com.CRM.generics.BaseTest;

public class TestUserPage extends BaseTest{
	
	
	@Test
	public void UserPageTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickloginpage();
		
		UserPage up=new UserPage(driver);
		up.clickUsers();

}
}

package com.CRM.ADMINpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class UsersPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Users')]")
	private WebElement Users;
	
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickUsers()
	{
		Users.click();
	}

}

package com.CRM.ADMINpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class SettingsPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),' Settings')]")
	private WebElement Settings;
	
	@FindBy(xpath="//a[contains(text(),'Manage Role')]")
	private WebElement ManageRole;
	
	@FindBy(xpath="//tr[2]/td[5]/input")
	private WebElement Admin;
	
	
	@FindBy(xpath="//a[contains(text(),'Services')]")
	private WebElement Services;
	
	@FindBy(xpath="//tr[2]/td[3]/a[1]")
	private WebElement AddPackage;
	
	@FindBy(xpath="//a[contains(text(),'Target Management')]")
	private WebElement TargetManagement;
	
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickSettings()
	{
		Settings.click();
	}
	
	public void ClickManageRole()
	{
		ManageRole.click();
	}
	public void ClickAdmin()
	{
		Admin.click();
	}
	
	public void ClickServices()
	{
		Services.click();
	}
	public void ClickAddPackage()
	{
		AddPackage.click();
	}
	public void clickTargetManagement()
	{
		TargetManagement.click();
	}
	
	

}

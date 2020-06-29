package com.CRM.SalesManagerPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class BusinessPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Business')]")
	private  WebElement Business;
	
	@FindBy(xpath="//a[contains(text(),'Accepted Business')]")
	private WebElement AcceptedBusiness;
	
	@FindBy(xpath="(//tr[1])[2]/td[5]")
	private WebElement AssignName;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement SearchAssignName;
	
	@FindBy(xpath="//tr[2]/td[6]/a[@class='btn btn-lg p-0']")
	private WebElement ViewBusiness;
	
	
	
	
	
	public BusinessPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickBusiness()
	{
		Business.click();
	}
	
	public void ClickAcceptedBusiness()
	{
		AcceptedBusiness.click();
	}
	public void clickAssignName()
	{
		AssignName.click();
	}
	
	public void clickSearchAssignName()
	{
		SearchAssignName.sendKeys("Account",Keys.ENTER);
	}
	
	public void clickViewBusiness()
	{
		ViewBusiness.click();
	}

}

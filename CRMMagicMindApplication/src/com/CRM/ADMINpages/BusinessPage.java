package com.CRM.ADMINpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class BusinessPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Business')]")
	private WebElement Business;
	
	@FindBy(xpath="//a[contains(text(),'All Business')]")
	private WebElement AllBusiness;
	
	@FindBy(xpath="//tr[2]/td[6]/a")
	private WebElement Action;
	
	
	public BusinessPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickBusiness()
	{
		Business.click();
	}
	
	public void clickAllBusiness()
	{
		AllBusiness.click();
	}
	
	public void clickAction()
	{
		Action.click();
	}

}

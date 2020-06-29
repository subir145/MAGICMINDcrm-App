package com.CRM.OperationManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class CustomerPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[text()='Customer']")
	private WebElement customer;
	
	@FindBy(xpath="//a[contains(text(),'All Customer')]")
	private WebElement AllCustomer;
	
	
	
	
	
	
	public CustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickcustomer()
	{
		customer.click();
	}
	
	public void clickAllCustomer()
	{
		AllCustomer.click();
	}

}

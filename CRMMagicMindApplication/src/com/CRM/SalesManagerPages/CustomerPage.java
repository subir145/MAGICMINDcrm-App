package com.CRM.SalesManagerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class CustomerPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Customer')]")
	private WebElement Customer;
	
	@FindBy(xpath="//a[contains(text(),'My Customer')]")
	private WebElement MyCustomer;
	
	@FindBy(xpath="//a[contains(text(),'All Customer')]")
	private WebElement AllCustomer;
	
	@FindBy(xpath="(//li[contains(@class,'dropdown dropdown-notification nav-item')])[1]")
	private WebElement Notification;
	
	@FindBy(xpath="(//li[contains(@class,'dropdown dropdown-notification nav-item')])[2]")
	private WebElement Message;
	
	@FindBy(xpath="(//li[contains(@class,'dropdown dropdown-notification nav-item')])[3]")
	private WebElement Record;
	
	
	
	
	
	public CustomerPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickCustomer()
	{
		Customer.click();
	}
	
	public void clickMyCustomer()
	{
		MyCustomer.click();
	}
	public void clickAllCustomer()
	{
		AllCustomer.click();
	}
	public void clickNotification()
	{
		Notification.click();
	}
	public void clickMessage()
	{
		Message.click();
	}
	
	public void ClickRecord()
	{
		Record.click();
	}

}

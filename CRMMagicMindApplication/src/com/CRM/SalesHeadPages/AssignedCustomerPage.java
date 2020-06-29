package com.CRM.SalesHeadPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class AssignedCustomerPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Customer')]")
	private WebElement customer;
	
	@FindBy(xpath="//a[contains(text(),'Assigned Customer')]")
	private WebElement Assignedcustomer;
	
	@FindBy(xpath="(//a[contains(@class,'btn btn-lg p-0')])[1]")
	private WebElement viewCustomer;
	
	
	public AssignedCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickcustomer()
	{
		customer.click();
	}
	
	public void clickAssignedcustomer()
	{
		Assignedcustomer.click();
	}
	
	public void clickviewCustomer()
	{
		viewCustomer.click();
	}
	
	

}

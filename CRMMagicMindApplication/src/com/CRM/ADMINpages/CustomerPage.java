package com.CRM.ADMINpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class CustomerPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Customer')]")
	private WebElement Customer;
	
	@FindBy(xpath="//a[contains(text(),'All Customer')]")
	private WebElement AllCustomer;
	
	@FindBy(xpath="//a[contains(text(),'Unassigned Customer')]")
	private WebElement UnassignedCustomer;
	
	@FindBy(xpath="//tr[2]/td[6]/a")
	private WebElement Action;
	
	@FindBy(xpath="//span[contains(@class,'select2-selection select2-selection--single')]")
	private WebElement AssignTo;
	
	@FindBy(xpath="//ul[contains(@id,'select2-assignmentList-results')]/li[2]")
	private WebElement SearchAssignTo;
	
	 @FindBy(id="tinymce")
	 private WebElement Comment;
	 
	 @FindBy(xpath="//button[contains(text(),'Submit')]")
	 private WebElement Submit;
	
	
	public CustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCustomer()
	{
		Customer.click();
	}
	
	public void ClickAllCustomer()
	{
		AllCustomer.click();
	}
	
	public void ClickUnassignedCustomer()
	{
		UnassignedCustomer.click();
	}
	
	public void clickAction()
	{
		Action.click();
	}
   public void ClickAssignTo()
   {
	   AssignTo.click(); 
   }
   
   public void clickSearchAssignTo()
   {
	   SearchAssignTo.click();
   }
   public void ClickComment()
   {
	   Comment.sendKeys("The project is assigned to sales Head");
   }
   
   public void ClickSubmit()
   {
	   Submit.click();
   }
}

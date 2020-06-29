package com.CRM.SalesExecutivePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class CallBackDetails extends  WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Callback Details')]")
	private WebElement callbackDetails;
	
	@FindBy(xpath="//a[contains(text(),'Add Call')]")
	private WebElement AddCallBack;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[1]")
	private WebElement customer;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement SearchCustomer;
	
	//@FindBy(xpath="//span[contains(@class,'select2-selection select2-selection--single')]")
	//private WebElement Business;
	
	 @FindBy(id="datepicker_start")
	 private WebElement CallbackDate;
	 
	 @FindBy(id="subject")
	 private WebElement purpose;
	 
	 @FindBy(id="tinymce")
		private WebElement Desc;
	 
	 @FindBy(xpath="//button[contains(text(),'Submit')]")
	 private WebElement submit;
	 
	 @FindBy(xpath="//a[contains(text(),'View Callback')]")
	 private WebElement viewCallBack;
	
	
	public CallBackDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addcallBack()
	{
		callbackDetails.click();
		AddCallBack.click();
		//SelectVisible(customer,"subir kumar[abc@gmail.com]");
		customer.click();
		SearchCustomer.sendKeys("subir kumar",Keys.ENTER);
		CallbackDate.click();
		CallbackDate.sendKeys("01:05  02/09/2020");
		purpose.sendKeys(" Query");
		
	}
	
	public void ClickDesc()
	{
		Desc.sendKeys("After 6.00pm you can call");
		
	}
	public void clicksubmit()
	{
		submit.click();
	}
	
	public void clickViewcallback()
	{
		callbackDetails.click();
		viewCallBack.click();
	}

}

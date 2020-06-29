package com.CRM.AMPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class FinanacePage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Finance')]")
	private WebElement Finance;
	
	@FindBy(xpath="//a[contains(text(),'          Add Invoice')]")
	private WebElement AddInvoice;
	
	@FindBy(xpath="//span[contains(@class,'select2-selection select2-selection--single')]")
	private WebElement CustomerName;
	
	@FindBy(xpath="(//input[contains(@class,'select2-search__field')])[2]")
	private WebElement SearchCustomerName;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[2]")
	private WebElement BusinessName;
	
	@FindBy(xpath="(//input[contains(@class,'select2-search__field')])[2]")
	private WebElement SearchBusinessName;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[3]")
	private WebElement PackageName;
	
	@FindBy(xpath="(//input[contains(@class,'select2-search__field')])[2]")
	private WebElement SearchPackage;
	
	@FindBy(xpath="//a[contains(text(),'          My Invoice')]")
	private WebElement MyInvoice;
	
	
	public FinanacePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickFinance()
	{
		Finance.click();
	}
	public void clickAddInvoice()
	{
		AddInvoice.click();
	}
	public void clickcustomerName()
	{
		CustomerName.click();
	}
	public void clickSearchCustomerName()
	{
		SearchCustomerName.sendKeys("subir",Keys.ENTER);
	}
	
	public void clickBusinessName()
	{
		BusinessName.click();
	}
	public void clickSearchBusinessName()
	{
		SearchBusinessName.sendKeys("Test",Keys.ENTER);
	}
	public void clickPackage()
	{
		PackageName.click();
	}
	public void clickSearchPackage()
	{
		SearchPackage.sendKeys("Basic",Keys.ENTER);
	}
	public void clickMyInvoice()
	{
		Finance.click();
		MyInvoice.click();
	}
	

}

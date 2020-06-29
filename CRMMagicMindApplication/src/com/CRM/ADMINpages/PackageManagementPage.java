package com.CRM.ADMINpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class PackageManagementPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),' Package Management')]")
	private WebElement PackageManagement;
	
	@FindBy(xpath="(//a[contains(text(),'Package')])[1]")
	private WebElement Package;
	
	@FindBy(xpath="//tr[2]/td[4]/a[1]")
	private WebElement ActionView;
	
	@FindBy(xpath="(//button[contains(text(),'Close')])[2]")
	private WebElement Close;
	
	@FindBy(xpath="(//a[contains(text(),'Package')])[2]")
	private WebElement PackageServices;
	
	@FindBy(xpath="//tr[2]/td[2]/label/span")
	private WebElement StarupPackage;
	
	@FindBy(xpath="//tr[2]/td[2]/input")
	private  WebElement WritePackage;
	
	@FindBy(xpath="//tr[11]/td[2]/label/span")
	private WebElement StartActionPlan;
	
	@FindBy(xpath="//tr[11]/td[2]/input")
	private WebElement WriteActionPlan;
	
	@FindBy(xpath="(//input[contains(@class,'btn btn-sm btn-info permission_check')])[1]")
	private WebElement SubmitOne;
	
	public PackageManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickPackageManagement()
	{
		PackageManagement.click();
	}
	public void ClickPackage()
	{
		Package.click();
	}
	public void clickActionView()
	{
		ActionView.click();
	}
	public void clickClose()
	{
		Close.click();
	}
    public void ClickPackageServices()
    {
    	PackageServices.click();
    }
    public void ClickStarupPackage()
    {
    	StarupPackage.click();
    }
    public void ClickWritePackage()
    {
    	WritePackage.sendKeys("Basic Pack");
    }
    public void clickStartActionplan()
    {
    	StartActionPlan.click();
    }
    public void WriteStartActionPlan()
    {
    	WriteActionPlan.sendKeys("Basic pack");
    }
    public void ClickSubmit()
    {
    	SubmitOne.click();
    }
}

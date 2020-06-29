package com.CRM.AMPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class BusinessPage extends WebDriverUtils  {
	
	@FindBy(xpath="//span[text()='Business']")
	private WebElement business;
	
	@FindBy(xpath="//a[text()='Add Business']")
	private WebElement addbusiness;
	
	
	
	
	@FindBy(xpath="(//span[@class='selection'])[1]/span[1]")
	private WebElement cust;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement searchbox;

	@FindBy(id="business_name")
	private WebElement bsnsnm;
	
	@FindBy(name="signup_amount")
	private WebElement sgnupamnt;
	
	@FindBy(id="country0")
	private WebElement pckgtype;
	
	@FindBy(xpath="//input[contains(@name,'start_date')]")
	private WebElement StartDate;
	
	@FindBy(xpath="//input[contains(@name,'end_date')]")
	private WebElement EndDate;
	
	@FindBy(xpath="//iframe")
	private WebElement desc;
	
	@FindBy(id="tinymce")
	private WebElement wrte;
	
	
	@FindBy(id="customFile")
	private WebElement upload;
	
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[contains(text(),'My Business')]")
	private WebElement MyBusiness;
	
	@FindBy(xpath="//a[contains(text(),'Business(Assigned to me)')]")
	private WebElement BusinessAssignedToMe;
	
	
	public BusinessPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicksbmt()
	{
		business.click();
		addbusiness.click();
		
	}
	
	public void clickcust()
	{
		//Select sel=new Select(cust);
		//sel.selectByVisibleText("Subir Sarkar[subirkumar1994@gmail.com]");
		
		cust.click();
		searchbox.sendKeys("Subir Sarkar",Keys.ENTER);
		
	}
	
	public void clickcustomername()
	{
		bsnsnm.sendKeys("Marketing");
		sgnupamnt.sendKeys("2000");
		
	}
	
	public void clickpckgtype()
	{
		SelectIndex(pckgtype, 1);
		//Select sel1=new Select(pckgtype);
		//sel1.selectByIndex(1);
	}
	
	public void clickStartDate()
	{
		StartDate.sendKeys("06/10/2020");
	}
	
	public void ClickEndDate()
	{
		EndDate.sendKeys("06/12/2020");
	}
	
	
		
	public void last()
	{

		wrte.sendKeys("I am assigned the business");
		
	
		}
	
//	public void clickUpload()
//	{
//		String filepath="E://gobu//gobu photo";
//		upload.sendKeys(filepath);
//	}
	public void clicksubmit()
	{
		submit.click();
	}
	
	public void clickBusinesspage()
	{
		business.click();
		MyBusiness.click();
	}
	
	public void clickBusinessAssignedToMe()
	{
		business.click();
		BusinessAssignedToMe.click();
	}
	
	

}

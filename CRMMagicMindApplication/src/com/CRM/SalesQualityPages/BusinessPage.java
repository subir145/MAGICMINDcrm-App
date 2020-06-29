package com.CRM.SalesQualityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CRM.generics.WebDriverUtils;

public class BusinessPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[text()='Business']")
	private WebElement BusinessPage;
	
	@FindBy(xpath="//a[contains(text(),'All Business')]")
	private WebElement AllBusiness;
	
	@FindBy(xpath="(//i[contains(@class,'fa fa-pencil info')])[2]")
	private WebElement changestatus;
	
	@FindBy(xpath="(//select[contains(@class,'form-control inputtext select2 select2-hidden-accessible')])[1]/option[text()='Approve']")
	private WebElement status;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement searchstatus;
	
	@FindBy(xpath="//select[contains(@id,'assignmentList')]/option[contains(text(),'Operation Manager[ tanushriroul95@gmail.com ]')]")
	private WebElement AssignTo;
	
	@FindBy(id="tinymce")
	private WebElement Desc;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
//	
//	@FindBy()
//	private WebElement x;
//	
	
	public BusinessPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickBusinessPage()
	{
		BusinessPage.click();
	}
	
	public void clickAllBusiness()
	{
		AllBusiness.click();
	}
	
	public void ClickChangestatus()
	{
		changestatus.click();
	}
	
	public void clickstatus()
	{
	   //SelectIndex(status, 1);
		status.click();
		
//		Select sel=new Select(status);
//		sel.selectByVisibleText("Approve");
	}
	
	public void ClickAssignTo()
	{
		//Select sel=new Select(AssignTo);
		//sel.selectByIndex(1);
		//SelectIndex(AssignTo, 0);
		AssignTo.click();
	}
	public void ClickDesc()
	{
		Desc.sendKeys("Not Assigned ");
	}
	public void clickSubmit()
	{
		submit.click();
	}
	

}

package com.CRM.OperationManagerPages;

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
	
	@FindBy(xpath="//tr[1]/td[5]/a[contains(@class,'btn btn-sm f-12 businessStausChange')]")
	private WebElement status;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[1]")
	private WebElement InnerStatus;
	
	@FindBy(xpath="(//ul[contains(@id,'select2-limenu-results')])/li[2]")
	private WebElement InnerStatusOne;
	
	@FindBy(xpath="(//span[contains(@class,'slider round')])[1]")
	private WebElement slider;
	
	@FindBy(id="tinymce")
	private WebElement desc;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submit;
	
	@FindBy(xpath="//a[contains(text(),'Rejected')]")
	private WebElement Rejected;
	
	@FindBy(xpath="//tr[1]/td[5]/a[contains(@class,'btn btn-sm f-12 businessStausChange')]")
	private WebElement RejectStatus;
	
	@FindBy(xpath="(//ul[contains(@id,'select2-limenu-results')])/li[1]")
	private WebElement changeRejectstatus;
	

	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[2]")
	private WebElement AssignTo;
	
	@FindBy(xpath="//ul[contains(@id,'select2-assignmentList-results')]/li[2]")
	private WebElement ParticularAssignTo;
	
	
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
	
	public void clickstatus()
	{
		status.click();
	}
	
	public void clickInnerStatus()
	{
		InnerStatus.click();
		InnerStatusOne.click();
	}
	
	public void clickSlider()
	{
		slider.click();
	}
	
	public void clickDesc()
	{
		
		desc.sendKeys("The Assignment is rejected");
	}
	public void clickSubmit()
	{
		submit.click();
	}
	public void clickRejected()
	{
		Rejected.click();
	}
	
	public void clickRejectstatus()
	{
		RejectStatus.click();
	}
	public void clickChangeRejectStatus()
	{
		InnerStatus.click();
		changeRejectstatus.click();	
	}
	
	public void clickAss()
	{
		AssignTo.click();
	}
	public void clickParticularAssignTo()
	{
		ParticularAssignTo.click();
	}
	public void clickCommentSection()
	{
		desc.sendKeys("Re assign project Accepted");
	}
	public void clickRejectedPageSubmit()
	{
		submit.click();
	}

}

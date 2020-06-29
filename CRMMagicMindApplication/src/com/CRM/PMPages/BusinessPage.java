package com.CRM.PMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class BusinessPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),'Business')]")
	private WebElement Business;
	
	@FindBy(xpath="//a[contains(text(),'Project(Assigned to me)')]")
	private WebElement BusinessAssignedToMe;
	
	@FindBy(xpath="(//tr[1])[2]//i[contains(@class,'fa fa-ellipsis-h text-info')]")
	private WebElement Action;
	
	@FindBy(xpath="//div[contains(@class,'dropdown-menu arrow show')]/a[5]")
	private WebElement Milestone;
	
	@FindBy(xpath="(//input[contains(@class,'form-control inputtext')])[3]")
	private WebElement Purpose;
	
	@FindBy(xpath="(//input[contains(@class,'form-control inputtext')])[4]")
	private WebElement DeliveryDate;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[4]")
	private WebElement Status;
	
	@FindBy(xpath="//ul[contains(@id,'select2-mlstatuslst-results')]/li[3]")
	private WebElement SearchStatus;
	
	@FindBy(xpath="//body[contains(@id,'tinymce')]")
	private WebElement wrte;
	
	@FindBy(xpath="(//button[contains(text(),'Submit')])[2]")
	private WebElement Submit;
	
	public BusinessPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickBusiness()
	{
		Business.click();
	}
	public void clickBusinessAssignedToMe()
	{
		BusinessAssignedToMe.click();
	}
	public void clickAction()
	{
		Action.click();
	}
	public void clickMilestone()
	{
		Milestone.click();
	}
	public void clickPurpose()
	{
		Purpose.sendKeys("For End Of the deal");
	}
	public void clickDeliveryDate()
	{
		DeliveryDate.sendKeys("01:00 06/17/2020");
	}
	public void clickStatus()
	{
		Status.click();
	}
	public void clickSearchStatus()
	{
		SearchStatus.click();
	}
	public void clickdesc()
	{
		wrte.sendKeys("The project is completed");
	}
	public void clickSubmit()
	{
		Submit.click();
	}

}

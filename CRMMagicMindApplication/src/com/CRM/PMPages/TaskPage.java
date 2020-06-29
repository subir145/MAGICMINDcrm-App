package com.CRM.PMPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class TaskPage extends WebDriverUtils {
	
	@FindBy(xpath="//span[contains(text(),' Task')]")
	private WebElement Task;
	
	@FindBy(xpath="//a[contains(text(),'Add Task')]")
	private WebElement AddTask;
	
	@FindBy(xpath="//span[contains(@class,'select2-selection select2-selection--single')]")
	private WebElement BusinessName;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement SearchBusinessName;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[2]")
	private WebElement ProjectName;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement SearchProjectName;
	
	@FindBy(xpath="(//input[contains(@class,'form-control inputtext')])[1]")
	private WebElement title;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[3]")
	private WebElement status;
	
	@FindBy(xpath="//ul[contains(@id,'select2-status-results')]/li[6]")
	private WebElement searchstatus;
	
	@FindBy(xpath="//body[contains(@id,'tinymce')]")
	private WebElement wrte;
	
	@FindBy(xpath="(//input[contains(@class,'form-control inputtext')])[2]")
	private WebElement startDate;
	
	@FindBy(xpath="(//input[contains(@class,'form-control inputtext')])[3]")
	private WebElement EndDate;
	
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[4]")
	private WebElement AssignTo;
	
	@FindBy(xpath="//input[contains(@class,'select2-search__field')]")
	private WebElement SearchAssignTo;
	
	
	@FindBy(xpath="(//div[contains(@class,'form-group col-lg-3 col-sm-3')])[4]/div[1]")
	private WebElement Priority;
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement Submit;
	
	@FindBy(xpath="//a[contains(text(),'My Task')]")
	private WebElement MyTask;
	
	@FindBy(xpath="(//tr[1])[2]/td[8]/a[1]")
	private WebElement ViewTask;
	
	@FindBy(id="tinymce")
	private WebElement desc;
	
	@FindBy(xpath="//input[contains(@id,'commentSubmit')]")
	private WebElement AddComment;
	
	@FindBy(xpath="//a[contains(text(),'Task Board')]")
	private WebElement TaskBoard;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTask()
	{
		Task.click();
	}
	public void clickAddTask()
	{
		AddTask.click();
	}
	public void clickBusinessName()
	{
		BusinessName.click();
	}
	public void clickSearchBusinessName()
	{
		SearchBusinessName.sendKeys("Business",Keys.ENTER);
	}
	public void clickProjectName()
	{
		ProjectName.click();
	}
	public void clickSearchProjectName()
	{
		SearchProjectName.sendKeys("Basic Ecommerce",Keys.ENTER);
	}
	public void clickTitle()
	{
		title.sendKeys("Marketing Site");
	}
	public void clickStatus()
	{
		status.click();
	}
	public void clicksearchstatus()
	{
		searchstatus.click();
	}
    public void clickDesc()
    {
    	wrte.sendKeys("Try to solve every Problem");
    }
    public void clickStartDate()
    {
    	startDate.sendKeys("06/19/2020");
    }
    public void clickEndDate()
    {
    	EndDate.sendKeys("06/25/2020");
    }
    public void clickAssignTo()
    {
    	AssignTo.click();
    }
    public void clickSearchAssignTo()
    {
    	SearchAssignTo.sendKeys("Develo",Keys.ENTER);
    }
    public void clickpriority()
    {
    	Priority.click();
    }
    public void clickSubmit()
    {
    	Submit.click();
    }
    public void clickMyTask()
    {
    	MyTask.click();
    }
    public void ClickViewTask()
    {
    	ViewTask.click();
    }
    public void clickdesc()
    {
    	desc.sendKeys("The Project is closed");
    }
    public void clickAddComment()
    {
    	AddComment.click();
    }
    public void clickTaskBoard()
    {
    	TaskBoard.click();
    }
}

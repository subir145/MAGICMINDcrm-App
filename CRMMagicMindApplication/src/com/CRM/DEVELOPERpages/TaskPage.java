package com.CRM.DEVELOPERpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CRM.generics.WebDriverUtils;

public class TaskPage extends WebDriverUtils {
	
	@FindBy(xpath=" //span[contains(text(),'Task')]")
	private WebElement Task;
	
	@FindBy(xpath=" //a[contains(text(),'Task(Assign to me)')]")
	private WebElement TaskAssignedToMe;
	
	@FindBy(xpath="(//tr[1])[2]/td[7]/a")
	private WebElement Action;
	
	@FindBy(xpath="//select[contains(@id,'taskstatuslist')]/option[4]")
	private WebElement ChangeStatus;
	
	@FindBy(id="tinymce")
	private WebElement desc;
	
	@FindBy(xpath="//input[contains(@id,'rangeInput')]")
	private WebElement Slider;
	
	@FindBy(id="commentSubmit")
	private WebElement AddComment;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTask()
	{
		Task.click();
	}
	
	public void clickTaskAssignedToMe()
	{
		TaskAssignedToMe.click();
	}
	public void clickAction()
	{
		Action.click();
	}
	public void clickChangeStatus()
	{
		//Select sel=new Select(ChangeStatus);
		//sel.selectByVisibleText("Completed");
		ChangeStatus.click();
	}
	public void clickDesc()
	{
		desc.sendKeys("The task is completed");
	}
	public void clickRangeSlider(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(Slider).dragAndDropBy(Slider, 50, 0).perform();
	}
	public void clickAddComment()
	{
		AddComment.click();
	}

}

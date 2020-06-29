package com.CRM.SEOPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.generics.WebDriverUtils;

public class TaskPage extends WebDriverUtils {
	
	@FindBy(xpath=" //span[contains(text(),'Task')]")
	private WebElement Task;
	
	@FindBy(xpath="//a[contains(text(),'Task(Assign to me)')]")
	private WebElement TaskAssignedToMe;
	
	
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

}
